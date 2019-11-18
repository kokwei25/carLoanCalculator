package com.example.carloancalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCal.setOnClickListener {
            val carPrice = inputCarPrice.text.toString().toDouble()
            val payment = inputDownPayment.text.toString().toDouble()
            val loanPeriod = inputLoanPeriod.text.toString().toDouble()
            val interestrate = inputInterest.text.toString().toDouble()

            val loan :Double = carPrice - payment
            val interest :Double = loan * interestrate/100 *loanPeriod
            val repayment :Double = (loan + interest) / loanPeriod / 12

            txtCarLoan.text = "Car Loan : RM %.2f".format(loan)
            txtInterest.text = "Interest : RM %.2f".format(interest)
            txtRepayment.text = "Monthly Repayment : RM %.2f".format(repayment)
        }

    }
}

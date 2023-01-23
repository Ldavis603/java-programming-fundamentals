package com.davis.loan;

public class SimpleCarLoanPaymentCalculator {
    public static void main(String[] args) {

        //Initialize Values
        //Set the initial car loan to $20000
        //Set the initial loan length to 3 years
        //Set the interest rate to 3% on the loan
        //Set the initial down payment to $3000

        int carLoan = 20000;
        int loanLength = 3;
        double interestRate =3.0;
        int downPayment = 3000;

        //Validation
    if(loanLength <= 0) {
        System.out.println("Invalid! Your loan length cannot be less than 0.");
    } if(interestRate <= 0) {
        System.out.println("Invalid! Your interest rate cannot be less than 0");
    } if(downPayment > carLoan) {
        System.out.println("Invalid down payment amount!");
    }


       //Paid in full condition

        if(downPayment == carLoan) {
            System.out.println("Car loan is paid in full");
        }

        //Remaining balance
        int remainingBalance = carLoan - downPayment;
        System.out.println("Remaining balance = " + remainingBalance);

        //Calculate from years to months
        int months = loanLength * 12;
        System.out.println("Loan length in months = " + months);

        //Monthly payments without interest
        int monthlyBalance = remainingBalance/months;
        System.out.println("Monthly payments without interest = " + monthlyBalance );

        //Interest to be paid each month
        double monthlyInterest = monthlyBalance * interestRate/100;
        System.out.println("Monthly interest payments = " + monthlyInterest);

        //Interest amount plus monthly payment without interest
        double monthlyPayment = monthlyBalance + monthlyInterest;
        //Print monthly Payment
        System.out.println("Monthly payment = " + monthlyPayment);
    }
}

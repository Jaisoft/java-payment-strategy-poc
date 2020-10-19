package com.jaisoft;

public class PaymentStrategy {

    double creditCardPay(double amount){

        double serviceCharge = 5.00;
        double creditCardFee = 10.00;

        return amount + serviceCharge + creditCardFee; 

    } 

    double cashPay(double amount){
        double serviceCharge = 5.00;
        return amount + serviceCharge;
    } 
    
}

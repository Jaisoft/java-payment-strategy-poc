package com.jaisoft;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       

        OldWayPaymentStrategy cash = new CashPaymentStrategy();

        OldWayPaymentStrategy creditcard = new CreditCardStrategy();

        PaymentStrategy paymentStrategy = new PaymentStrategy();

        System.out.println( "Pagar con metalico utilizando OldWayPaymentStrategy!" + cash.pay(50.80) );

        System.out.println( "Pagar con tarjeta utilizando OldWayPaymentStrategy!" + creditcard.pay(50.80) );


        System.out.println( "Pagar con metalico PaymentStrategy !" + paymentStrategy.creditCardPay(50.80) );

        System.out.println( "Pagar con tarjeta PaymentStrategy!" + paymentStrategy.cashPay(50.80) );
    }
}

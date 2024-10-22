package com.javatechie.solid.isp;

import java.util.Date;

public class GooglePay implements UPIPayments,CashBackManager {

    public void payMoney() {

    }

    public void getScratchCard() {

    }

    public void getCashBackAsCreditBalance() {
        System.out.println("we are inside the getCashBackAsCreditBalance, our current date is  " + java.time.LocalDate.now());
      //this features is there in gpay
    }
    public static void getCashBackAsCreditBalanceS() {
        System.out.println("we are inside the Static getCashBackAsCreditBalance, our current date is  " + java.time.LocalDate.now());
        //this features is there in gpay
    }
    public static void main(String[] args) {
        GooglePay googlePay = new GooglePay();
        googlePay.getScratchCard();
        googlePay.getCashBackAsCreditBalance();
        GooglePay.getCashBackAsCreditBalanceS();


    }
}

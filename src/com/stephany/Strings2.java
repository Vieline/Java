package com.stephany;

public class Strings2 {
    public static void main(String[] args) {
        String mpesa = "NBS12MTPK Confirmed, Ksh 600.00 sent to Tom Matata +25466523832 on 28/02/19 at 6.10PM. Your new M_PESA balance is Ksh.3400. Transaction cost Ksh 15.00";

    int pos_ksh = mpesa.indexOf("Ksh");
    int pos_sent = mpesa.indexOf("sent");
    String amount = mpesa.substring(pos_ksh,pos_sent);
        System.out.println(amount);

     int pos_on = mpesa.indexOf(" on ")+3;
     int pos_at = mpesa. indexOf(" at ");
     String date = mpesa.substring(pos_on, pos_at);
        System.out.println(date);

     int pos_is = mpesa.indexOf(" is ")+3;
     int pos_Transaction = mpesa.indexOf("Transaction")-2;
     String balance = mpesa.substring(pos_is, pos_Transaction);
        System.out.println(balance);
    }
}

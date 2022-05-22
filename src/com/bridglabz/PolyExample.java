package com.bridglabz;

 class PolyExample {
    void bankInterest(){
        System.out.println("Interest is "+ 0);
    }
}
 class Icici extends PolyExample{
     void bankInterest() {
         System.out.println("Interest is "+ 7);
     }
 }
 class BankOfBaroda extends PolyExample{
     void bankInterest() {
         System.out.println("Interest is "+ 9);
     }
 }
 class Main{
     public static void main(String[] args) {
         PolyExample polly = new BankOfBaroda();
         polly.bankInterest();
     }
 }


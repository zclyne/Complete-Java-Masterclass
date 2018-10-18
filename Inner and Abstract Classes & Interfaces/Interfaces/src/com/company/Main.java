package com.company;

public class Main {
    public static void main(String[] args) {
        // ITelephone timsPhone = new ITelephone(123456); // invalid because ITelephone is an interface, not a class
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        // we can define the actual type to be the type of the interface
        // and this is usually a better way
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilePhone(24565);
        // notice here that we assigned a MobilePhone instance to timsPhone, which is ITelephone
        // here we see the advantage of using interface as the type
        // timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();
        timsPhone.powerOn();
        timsPhone.callPhone(24565);
        timsPhone.answer();
    }
}

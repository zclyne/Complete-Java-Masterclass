package com.company;

public class ExtendedPassword extends Password {
    private int decrytedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decrytedPassword = password;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("Saving password " + this.decrytedPassword);
//    }
}

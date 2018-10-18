package com.company;

// the interface defines the methods that must be implemented
// actually, we don't need to state a method as public or private
// because it is useless
public interface ITelephone {
    void powerOn(); // this is called a 'signature'
    // the codes goes into the class that inherits this interface
    // we don't define the actual code itself
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}

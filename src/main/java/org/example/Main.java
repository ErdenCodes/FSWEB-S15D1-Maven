package org.example;

import org.example.mobile.Contact;
import org.example.mobile.mobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       Grocery grocery = new Grocery();
        grocery.startGrocery();

        mobilePhone mobilePhone = new mobilePhone("2585656" , new ArrayList()) ;
       mobilePhone.addNewContact(new Contact("Emrah" , "563315233"));
        mobilePhone.addNewContact(new Contact("izzet" , "563315233"));
        mobilePhone.addNewContact(new Contact("Ali" , "563315233"));
        mobilePhone.addNewContact(new Contact("Salih" , null));


        mobilePhone.printContacts();
    }



}

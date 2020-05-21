package com.developia.SpringBootWebApp;


import java.util.ArrayList;
import java.util.List;

public class ContactBusiness {
    public List<Contact> getContactList(){
        List <Contact> listContact = new ArrayList<>();

        listContact.add(new Contact("Viktor Hugo","viktor.hugo@gmail.com","France"));
        listContact.add(new Contact("Miguel de Cervantes","miguel.cervantes@gmail.com","Spain"));
        listContact.add(new Contact("Michail Dostoevski","mikhail.dostoevski@gmail.com","Russia"));
        listContact.add(new Contact("Jack London","jack.london@gmail.com","USA"));

        return listContact;
    }
}

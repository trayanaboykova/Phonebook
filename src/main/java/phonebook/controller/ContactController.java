package phonebook.controller;

import org.springframework.stereotype.Controller;
import phonebook.entity.Contact;

import java.util.List;

@Controller
public class ContactController {
    private List<Contact> contacts;

    public ContactController(List<Contact> contacts) {
        this.contacts = contacts;
    }
}

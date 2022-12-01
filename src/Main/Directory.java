package Main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Directory {
    private final ArrayList<Contact> contacts = new ArrayList<>();
    private final static String path = "data.txt";

    public ArrayList<Contact> getContacts() {
        return this.contacts;
    }
    public boolean addContact(Contact contact){
        return contacts.add(contact);
    }
    public boolean deleteContact(Contact contact) {
        return contacts.remove(contact);
    }
    public List<Contact> searchContactsbyName(String query) {
        var found = new ArrayList<Contact>();
        for (var contact : contacts) {
            if (contact.matchbyName(query)) {
                found.add(contact);
            }
        }
        return found;
    }
    public List<Contact> searchContactsbyPhoneNumber(String query){
        var found = new ArrayList<Contact>();
        for (var contact : contacts) {
            if (contact.matchbyPhoneNumber(query)) {
                found.add(contact);
            }
        }
        return found;
    }
    public void writetoFile()  throws IOException{
        BufferedWriter ous = new BufferedWriter(new FileWriter(path));
        for (var contact : this.getContacts()) {
            ous.write(String.valueOf((contact)).concat("\n"));
        }
        ous.close();
    }
}

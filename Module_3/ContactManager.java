import java.util.*;

public class ContactManager {
    public static void main(String[] args) {
        HashMap<String, Contact> contacts = new HashMap<>();

     
        contacts.put("Ada Lovelace",
                new Contact("Ada Lovelace", "+1 617 555 0101"));

        contacts.put("Ashley Smith",
                new Contact("Ashley Smith", "+1 212 555 0102"));

        contacts.put("John Doe",
                new Contact("John Doe", "+1 555 555 0103"));

        contacts.put("Jane Doe",
                new Contact("Jane Doe", "+1 202 555 0104"));

        contacts.put("Matthew Johnson",
                new Contact("Matthew Johnson", "+1 555 555 0105"));

       
        Contact foundContact = contacts.get("Ada Lovelace");

        if (foundContact == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println(foundContact);
        }

        Contact missingContact = contacts.get("Isamar Rodriguez");

        if (missingContact == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println(foundContact);
        }
    
        ArrayList<Contact> sorted =
                new ArrayList<>(contacts.values());

        sorted.sort(
                (a, b) -> a.getName().compareTo(b.getName())
        );

        System.out.println("=== All Contacts ===");

        for (Contact contact : sorted) {
            System.out.println(contact);
        }
    }
}
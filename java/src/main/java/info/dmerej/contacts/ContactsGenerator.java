package info.dmerej.contacts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ContactsGenerator {
  public Stream<Contact> generateContacts(int count) {
    List<Contact> contacts = new ArrayList<>();
    for (int i = 1; i <= count; i++) {
      contacts.add(new Contact("CUSTOM", "email-" + i + "@tld"));
    }
    return contacts.stream();
  }
}

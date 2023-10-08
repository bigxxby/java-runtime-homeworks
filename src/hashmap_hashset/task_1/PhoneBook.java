package hashmap_hashset;

import java.util.*;

public class PhoneBook {

    private HashMap<String, List<Contact>> contacts; /// Класс контакт К - Класс стринг (группа в который находится контант) -В.

    public PhoneBook(HashMap<String, List<Contact>> contacts) {
        this.contacts = contacts;
    }

    public void addContactToGroup(String groupname, Contact contact) {
        if (this.contacts.containsKey(groupname)) {
            ArrayList arrayList = (ArrayList) contacts.get(groupname);
            this.contacts.remove(groupname);
            this.contacts.put(groupname, addArr(contact, arrayList));
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(contact);
            this.contacts.put(groupname, arrayList);

        }

    }

    public void removeFromGroupContact(String groupname, Contact contact) {
        if (this.contacts.containsKey(groupname)) {
            if (this.contacts.get(groupname).contains(contact)) {
                ArrayList arrayList = (ArrayList) contacts.get(groupname);
                this.contacts.remove(groupname);
                this.contacts.put(groupname, delArr(contact, arrayList));
            } else {
                System.out.println("Такого контакта в этой Группе не существует");
            }
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(contact);
            this.contacts.put(groupname, arrayList);

        }

    }

    public void showPhonebook() {


        for (Map.Entry c : this.contacts.entrySet()) {

            System.out.println(c.getKey().toString() + " " + c.getValue());
        }
    }
    public void findContact(Contact contact) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<Contact>> c: this.contacts.entrySet()) {
            for (Contact list: c.getValue()) {
                if (list.equals(contact)){
                arrayList.add(c.getKey());
                }

            }

        }

        System.out.println(contact.getName() + " Находится в группе " + arrayList);


    }



    private ArrayList addArr(Contact contact, ArrayList<Contact> contacts) {


        contacts.add(contact);

        return contacts;

    }

    private ArrayList delArr(Contact contact, ArrayList<Contact> contacts) {


        contacts.remove(contact);

        return contacts;

    }

}

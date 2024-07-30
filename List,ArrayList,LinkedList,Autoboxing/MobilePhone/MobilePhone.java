import java.util.ArrayList;
public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber=myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact)==-1) {
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if(findContact(oldContact)>=0){
            myContacts.set(myContacts.indexOf(oldContact),newContact);
            return true;
        }
        else {
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        if(findContact(contact)>=0){
            myContacts.remove(contact);
            return true;
        }
        else {
            return false;
        }
    }

    private int findContact(Contact contact){
        return findContact(contact.getName());
    }

    private int findContact(String name){
        for(int i=0;i<myContacts.size();i++){
            if(myContacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name){
        if(findContact(name)>=0){
            int index = findContact(name);
            return myContacts.get(index);
        }
        else{
            return null;
        }
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i=0;i<myContacts.size();i++){
            System.out.printf("%d. %s -> %s",i+1,myContacts.get(i).getName(),myContacts.get(i).getPhoneNumber());
        }
    }
}

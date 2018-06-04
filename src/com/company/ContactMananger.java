package com.company;

public class ContactMananger {
    
    Contact[] friends;
    int friendsNumbers;
    
    ContactMananger(){
        friendsNumbers = 0;
        friends = new Contact[500];
    }

    void addContact(Contact contact){
        friends[friendsNumbers] = contact;
        friendsNumbers++;
    }

    String searchContact(String name){
        for(int i = 0; i < friendsNumbers; i++){
            if (name.equals(friends[i].name)){
                return friends[i].name;
            }
        }
        return null;
    }
}

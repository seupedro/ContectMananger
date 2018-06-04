package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ContactMananger mananger = new ContactMananger();

        Contact leticia = new Contact();
        leticia.email = "leite.llp@gmail.com";
        leticia.name = "Leticia";
        leticia.phone = "961197806";

        Contact pedro = new Contact();
        pedro.name = "Pedro";
        pedro.email = "hartmnn.p@gmail.com";
        pedro.phone = "961197806";

        Contact pai = new Contact();
        pai.name = "Ricardo";
        pai.email = "rsricarsan@gmail.com";
        pai.phone = "961607778";

        /* Adding multiples contacts using array */
        Contact[] contactArray = {leticia, pai, pedro};
        for (int i = 0; i < contactArray.length; i++){
            mananger.addContact(contactArray[i]);
            System.out.println(contactArray[i].name + " added");
        }

        /* Fetching by name */
        System.out.println(mananger.searchContact("Ricardo"));
    }
}

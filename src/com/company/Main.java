package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ContactMananger mananger = new ContactMananger();

        String[/*row*/][/*column*/] contacts = {
                /* Names */
                {"Leticia", "Ricardo", "Pedro"},
                /* Emails */
                {"leite.llp@gmail.com", "rsricarsan@gmail.com", "hartmnn.p@gmail.com"},
                /* Phone */
                {"961197806", "961607778", "968702002"}
        };

         /**
          * Each column in a row: i,j
          * System.out.println(contacts[i][j] + " " + i + "," + j);
          *
          * Each row in a column
          * System.out.println(contacts[j][i] + " " + j + "," + i);
          *
          * */

        /* Adding contacts using array 2D loop */
        for (int i = 0; i < contacts.length; i++){
            //System.out.print("row i: " + i + "\n");
            System.out.println("---------");
            for (int j = 0; j < contacts[i].length; j++){
                /* Each row in a column */
                Contact cont = new Contact();
                cont.name = contacts[j][i];
                System.out.println(j + "," + i + " " + contacts[j][i]);
                j++;

                cont.email = contacts[j][i];
                System.out.println(j + "," + i + " " + contacts[j][i]);
                j++;

                cont.phone = contacts[j][i];
                System.out.println(j + "," + i + " " + contacts[j][i]);

                mananger.addContact(cont);
            }
        }

        /* Fetching by name */
        System.out.println(mananger.searchContact("Ricardo"));
    }
}

package com.ironyard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<InventoryItem> items = new ArrayList<>(); //to store inventory items
    public static Scanner scanner = new Scanner (System.in); //to receive user input


    //from user input, creates new item in the appropriate category
    static InventoryItem createItem (String name, int quantity, String category){

            if (category.contains("Dairy")) {
                Dairy object = new Dairy(name, quantity);
                return object;

            } else if (category.contains("Bakery")) {
                Bakery object = new Bakery(name, quantity);
                return object;

            } else if (category.contains("Deli")) {
                Deli object = new Deli(name, quantity);
                return object;

            } else if (category.contains("Frozen")) {
                Frozen object = new Frozen(name, quantity);
                return object;

            } else if (category.contains("FoodStorage")) {
                FoodStorage object = new FoodStorage(name, quantity);
                return object;

            }else {
                System.out.println("Invalid Category Number");
            }

        return null; //returns an object using the correct category class (or throws and error for an invalid category name).
    }

    public static void main(String[] args) {

        //begin while loop
        while(true){

            //DISPLAY TO USER
            System.out.println("Options: ");
            System.out.println("[1] Add an inventory item");
            System.out.println("[2] Remove inventory item");
            System.out.println("[3] Update an inventory item quantity");
            System.out.println("[4] List inventory items");

            String option = scanner.nextLine(); //receive user input

            //ADD AN INVENTORY ITEM
            if(option.equals("1")){
                System.out.println("Add an inventory item: ");
                String name = scanner.nextLine();



                System.out.println("Enter the item category number: [1]Dairy, [2]Bakery, [3]Deli, [4]Frozen, [5]Food Storage");
                String category = scanner.nextLine();

                if(category.contains("1")){
                    category = "Dairy";

                } else if(category.contains("2")){
                    category = "Bakery";

                } else if(category.contains("3")){
                    category = "Deli";

                } else if(category.contains("4")){
                    category = "Frozen";

                } else if(category.contains("5")){
                    category = "FoodStorage";

                } else {
                    System.out.println("Invalid Category Number.  Please return to 'Options.'");
                    System.out.println("");
                    continue;

                }



                System.out.println("Enter inventory item quantity: ");
                int quantity = Integer.parseInt(scanner.nextLine());   //take string from user and turn into an int

                items.add(createItem(name, quantity, category));
            }//end "if" loop

            //REMOVE AN INVENTORY ITEM
            else if (option.equals("2")){
                System.out.println("Enter the number of the item you want to remove:");
                int itemNum = Integer.parseInt(scanner.nextLine());

                items.remove(itemNum - 1);
            }

            //UPDATE INVENTORY QUANTITY
            else if(option.equals("3")){
                System.out.println("Enter the number of the item you would like to update: ");
                int itemNum = Integer.parseInt(scanner.nextLine());

                InventoryItem item = items.get(itemNum -1);

                System.out.println("Enter the new quantity:");
                int itemQuan = Integer.parseInt(scanner.nextLine());

                item.quantity = itemQuan;
            }

            //LIST INVENTORY ITEMS
            else if(option.equals("4")){
                int i = 1;
                for(InventoryItem item : items){

                    System.out.printf("%d.  Item:  %s  /  Category: %s  /  Quantity: %s\n", i, item.name, item.category, item.quantity);
                    i++;
                }
            }

            //IF ANYTHING OTHER THAN 1, 2, 3 OR 4 ARE ENTERED
            else {
                System.out.println("Invalid Option"); //end and loops to the top
            }

        }//end while loop

    }//end main()

}//end public class main
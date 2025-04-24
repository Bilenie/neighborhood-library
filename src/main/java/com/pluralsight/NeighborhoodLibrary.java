package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    // We instantiate an object called books.In this case it's array/list of items.
    // Did the Scanner outside main using static.So shared by all methods in the class.
    //Thus keeping the main method clean.
    static NeighborhoodLibraryBlueprint[] books = {
            new NeighborhoodLibraryBlueprint(1, "12345", "Ready Player 1"),
            new NeighborhoodLibraryBlueprint(2, "23456", "Jurassic Park"),
            new NeighborhoodLibraryBlueprint(3, "789254", "Alice in Wonderland"),
            new NeighborhoodLibraryBlueprint(4, "633578", "To Kill a Mocking Bird"),
            new NeighborhoodLibraryBlueprint(5, "99955585", "Ready Player 2"),
            new NeighborhoodLibraryBlueprint(6, "12345", "The Spirit of Jezebel"),
            new NeighborhoodLibraryBlueprint(7, "23456", "Destroying the Spirit of Rejection"),
            new NeighborhoodLibraryBlueprint(8, "789254", "Unmasking the Jezebel Spirit"),
            new NeighborhoodLibraryBlueprint(9, "633578", "The Bait of Satan"),
            new NeighborhoodLibraryBlueprint(10, "99955585", "Advanced Prayers That Shake Heaven and Earth"),
            new NeighborhoodLibraryBlueprint(11, "12345", "The Purpose Driven Life"),
            new NeighborhoodLibraryBlueprint(12, "23456", "Battlefield of the Mind"),
            new NeighborhoodLibraryBlueprint(13, "789254", "Fervent"),
            new NeighborhoodLibraryBlueprint(14, "633578", "He Came to Set the Captives Free"),
            new NeighborhoodLibraryBlueprint(15, "99955585", "God's Generals"),
            new NeighborhoodLibraryBlueprint(16, "12345", "I Saw Heaven"),
            new NeighborhoodLibraryBlueprint(17, "23456", "The Second Coming of the New Age"),
            new NeighborhoodLibraryBlueprint(18, "789254", "Angels, Demons, and the Nephilim series"),
            new NeighborhoodLibraryBlueprint(19, "633578", "Light Your Fire:"),
            new NeighborhoodLibraryBlueprint(20, "99955585", "The Ahab Spirit: The Cause of the Jezebel Spirit")

    };
    static Scanner myScanner = new Scanner(System.in);

    //Create a main method
    public static void main(String[] args) {
        while (true) {

            //we invoke the method created to display all the question for the users
            String actualChoice = homeScreenDisplay();

            //Based on the response from the user we create a statement for every choice.

            //If user chooses (A)
            if (actualChoice.equalsIgnoreCase("A")) {
                //show the available book(ID,ISBN,TITLE)
                showAvailableBooks();
            }
            //If user choose (B)
            else if (actualChoice.equalsIgnoreCase("B")) {
                showCheckedOutBooks();
            }
            //If user choose (C) exit from the Library
            else if (actualChoice.equalsIgnoreCase("C")) {
                System.out.println("Goodbye!");
                return;
            } else {
                System.out.println("Invalid option. Try again.");
            }
        }
    }

    //Create a method for viewing available books.This displays the welcome message and menu

    static String homeScreenDisplay() {

        System.out.println("Welcome to Bilenie’s Library App !!!");
        System.out.print("What would you like to do?  Select A,B,or C.\n");
        System.out.print("A)Available Book\n");
        System.out.print("B)Checked out Books \n");
        System.out.print("C)Exit the Library\n");

        return myScanner.nextLine(); // Return user's menu choice
    }

    // This method shows all books that are available (not checked out)
    static void showAvailableBooks() {
        System.out.println("\n Available Books:");
        for (int i = 0; i < books.length; i++) {
            if (!books[i].isCheckedOut()) {
                System.out.println("ID: " + books[i].getId() + ", ISBN: " + books[i].getIsbn() + ", Title: " + books[i].getTitle());
            }
        }

        // Ask user if they want to check out a book

        System.out.println("\nWould you like to check out a book? (Y/N)");
        String answer = myScanner.nextLine(); // get user's yes/no input and store it in a variable.

        // If user says yes

        if (answer.equalsIgnoreCase("Y")) {
            System.out.print("Enter the ID of the book you want to check out: \n");
            int bookId = myScanner.nextInt();


            myScanner.nextLine(); // clear buffer

            System.out.print("Enter your name: ");
            String name = myScanner.nextLine();

            for (int i = 0; i < books.length; i++) {
                if (books[i].getId() == bookId && !books[i].isCheckedOut()) {
                    books[i].checkedOut(name);
                    System.out.println(books[i].getTitle() + " checked out to " + name);
                    return;
                }
            }

            System.out.println(" Book not available or ID not found.");
        }
    }

    //if not available will show the checked out book. This method shows books that are currently checked out.
    static void showCheckedOutBooks() {
        try {
            System.out.println("\nChecked Out Books:");
            for (int i = 0; i < books.length; i++) {
                if (books[i].isCheckedOut()) {
                    System.out.println("ID: " + books[i].getId() + ", ISBN: " + books[i].getIsbn() + ", Title: " + books[i].getTitle() +
                            ", Checked Out To: " + books[i].getCheckedOutTo());
                }
            }
            System.out.println("\nPress C to check in a book or X to go back:");
            String input = myScanner.nextLine();

            if (input.equalsIgnoreCase("C")) {
                System.out.print("Enter the ID of the book to check in: ");
                int bookId = myScanner.nextInt();
                myScanner.nextLine(); // clear buffer

                for (int i = 0; i < books.length; i++) {
                    if (books[i].getId() == bookId && books[i].isCheckedOut()) {
                        books[i].checkIn();
                        System.out.println("Book checked in.");
                        return;
                    }
                }

                System.out.println(" Book not found or not currently checked out.");
            }
        } catch (Exception e) {
            System.out.println("Error Occur!!!" + e.getMessage());
        }

    }

}

//****************************************************************************

//we are going to use for loop  to go through each item/books i=0 , i<books.length,i++
//-1 will not be found but if we put 0 it will return the first book
// return -1;
//we are going to wrap everything in the while loop because we want it to keep asking
//based on the answer make a case so we use switch(fancy if statement ).
//        switch (actualChoice) {
//            case "A":
//
//
//        }
//  NeighborhoodLibrary[] library = new NeighborhoodLibrary[carCount];

//*****************************************************************************


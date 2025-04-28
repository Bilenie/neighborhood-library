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

        //we invoke the method created to display all the question for the users
        while (true) {
            homeScreenDisplay();
            String actualChoice = myScanner.nextLine();
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
                System.exit(0);  // Properly exit the program
            } else {
                System.out.println("Invalid option. Try again.");
                continue;
            }
        }

    }

    //Create a method for viewing available books.This displays the welcome message and menu

    public static void homeScreenDisplay() {
        System.out.println("Welcome to Bilenie’s Library App !!!");
        System.out.print("What would you like to do?  Select A,B,or C.\n");
        System.out.print("A)Available Book\n");
        System.out.print("B)Checked out Books \n");
        System.out.print("C)Exit the Library\n");
    }

    // This method shows all books that are available (not checked out)
    public static void showAvailableBooks() {
        try {
            System.out.println("\n Available Books:");
            for (int i = 0; i < books.length; i++) {
                if (!books[i].isCheckedOut()) {
                    System.out.println("ID: " + books[i].getId() + ", ISBN: " + books[i].getIsbn() + ", Title: " + books[i].getTitle());
                }
            }
            // Ask user if they want to check out a book
            System.out.println("\nWould you like to check out a book?\n Y) to Check out \n N) to exit )");

            String answer = myScanner.nextLine(); // get user's yes/no input and store it in a variable.

            // If user says yes
            if (answer.equalsIgnoreCase("Y")) {
                System.out.print("Enter the ID of the book you want to check out: \n");
                int bookId = Integer.parseInt(myScanner.nextLine()); // safer than nextInt()

                for (int i = 0; i < books.length; i++) {
                    if (books[i].getId() == bookId) {
                        System.out.print("Enter your name: ");
                        String name = myScanner.nextLine();
                        System.out.println(books[i].getTitle() + " checked out to " + name);
                    } else if (books[i].getId() != bookId) {
                        System.out.println(" Book not available or ID not found.");
                    }
                }
            }

        } catch (Exception e) {
            System.out.println("Error found" + e.getMessage());
        }
    }

    //if not available will show the checked out book. This method shows books that are currently checked out.
    static void showCheckedOutBooks() {
        try {
            System.out.println("\nChecked Out Books:");
            boolean anyCheckedOut = false;
            for (int i = 0; i < books.length; i++) {
                if (books[i].isCheckedOut()) {
                    System.out.println("ID: " + books[i].getId() + ", ISBN: " + books[i].getIsbn() + ", Title: " + books[i].getTitle() +
                            ", Checked Out To: " + books[i].getCheckedOutTo());
                    anyCheckedOut = true;
                }
            }

            if (!anyCheckedOut) {
                System.out.println("No books are currently checked out.");
            }

            System.out.println("\nPress C to check in a book or\n X to go back:");
            String input = myScanner.nextLine();

            if (input.equalsIgnoreCase("C")) {
                System.out.print("Enter the ID of the book to check in: ");

                int searchBookId = myScanner.nextInt();

                myScanner.nextLine(); // clear buffer
                boolean found = false;
                for (int i = 0; i < books.length; i++) {
                    if (books[i].getId() == searchBookId) {
                        books[i].checkIn();
                        System.out.println(books[i].getTitle() + "Book checked in successfully.");
                        found = true;
                        break;
                    } else {
                        System.out.println(" Book not found or not currently checked out.");//I need to fix this because its in a repetition.
                    }
                }
            } else if (input.equalsIgnoreCase("X")) {

            }
        } catch (Exception e) {
            System.out.println("Error Occur!!!" + e.getMessage());
        }

    }

}

# neighborhood-library
# Neighborhood Library

A simple Java console application that simulates a community library system based on the honor system. This project allows neighbors to check out and check in books by entering their name. The application keeps track of which books are available and who currently has them.

## Project Objective

Build an application for your neighborhood that:
- Helps track books available for borrowing.
- Records the name of the person who checks out each book.
- Updates the book's status when it's returned.

## Features

- Book class with:
  - Attributes: `id`, `isbn`, `title`, `isCheckedOut`, `checkedOutTo`
  - Methods:
    - `checkOut(String name)` – updates the checkout status and stores the borrower's name.
    - `checkIn()` – resets the status when a book is returned.
- An array to hold an inventory of at least 20 books
- Real-time book checkout and check-in system via console
- Uses getters, setters, and constructors to manage book data


##Tools and Technologies
Java

Git and GitHub

Command Line / GitBash

IntelliJ IDEA

##Directory Structure


##How to Run
Clone the repository:

bash
Copy
Edit
git clone https://github.com/your-username/neighborhood-library.git
Open the project in IntelliJ IDEA or any Java IDE.

Run Main.java to start the application.

Follow prompts to check out or return books.

##Notes
Code was committed and pushed regularly during development.

All book data is hardcoded in an array as required.

Designed and planned using notes prior to coding.

##Author
Bilenie Tilahun
GitHub: https://github.com/your-username
Location: Garland, TX

package com.pluralsight;

public class NeighborhoodLibraryBlueprint {
// Declare the attributes or feature of  the library .
//It's private so that we can protect our information
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

//Generate a constructor to set the requirement or initialize the attribute/variables.

    public NeighborhoodLibraryBlueprint(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }
//Create a method for checkOut and CheckIn
    public void checkedOut(String name){
        this.isCheckedOut = true;
        this.checkedOutTo = name;
    }
    public void checkIn(){
    this.isCheckedOut = false;
    this.checkedOutTo = "";
    }

    //    Generate getter and setter for the attribute of this class
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return this.isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return this.checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
}

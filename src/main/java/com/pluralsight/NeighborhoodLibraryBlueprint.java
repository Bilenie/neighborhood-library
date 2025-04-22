package com.pluralsight;

public class NeighborhoodLibraryBlueprint {

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
        this.isCheckedOut = true;
        this.checkedOutTo = "";
    }
//Create a method for checkOut and CheckIn
    public String checkedOut(String name){
        return name;
    }
//    public void String checkIn(){
//        System.out.println();
//    }

    //    Generate getter and setter for the attribute of this class
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }


}

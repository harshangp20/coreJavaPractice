package com.example;

import java.util.Scanner;

class library{
    public int books = 50;
    public int adding_books;
    public int stock_of_books;
    public int issue_books;
    public int return_books;
    public int available_books;

    public int add_book(){
        System.out.println("How many books Do you want to add: ");
        Scanner Books = new Scanner(System.in);
        adding_books = Books.nextInt();
        books = books + adding_books;
        System.out.println("Books has been added......" +"The total books are: " + books);
        return books;
    }
    public int issue_book(){
        System.out.print("Enter How Many books Do you want issue:  ");
        Scanner i1 = new Scanner(System.in);
        issue_books = i1.nextInt();
        if (books < issue_books){
            System.out.println("Books Are not Available!.......");
        }
        else {
            while (stock_of_books == issue_books) {
                stock_of_books = 0;
                System.out.println("All Books are issued!!!");
            }
            System.out.println("Books Are Issued");
            stock_of_books = books - issue_books;
        }
        System.out.println("The remaining books Are: " + stock_of_books);
        return stock_of_books;
    }
    public int return_book(){
        System.out.print("Enter The issued Books which you want return :");
        Scanner r1 = new Scanner(System.in);
        return_books = r1.nextInt();
        stock_of_books = stock_of_books + return_books;
        System.out.println("Books has been returned!......");
        return return_books;
    }
    public int available_books(){
        if (books >0 ){
            System.out.println("Books Are Available!.......");
        }
        else {
            System.out.println("Books are not available");
        }
        return available_books;
    }
}
public class Exe_4_library {
    public static void main(String[] args) {
        library l1 = new library();
        l1.available_books();
        System.out.println("Welcome to the library");
        System.out.println("Type AB for add books,IS for issue a book,RB for Return a book");
        String xyz;
        Scanner sc = new Scanner(System.in);
        xyz = sc.next();
        switch (xyz) {
            case "AB" : l1.add_book();
            case "IS" : l1.issue_book();
            case "RB" : l1.return_book();
            default : System.out.println("Thanks For Choosing US!......");
        }
    }
}

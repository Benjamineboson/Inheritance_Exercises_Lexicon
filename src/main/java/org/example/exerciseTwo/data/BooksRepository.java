package org.example.exerciseTwo.data;

import org.example.exerciseTwo.model.Book;
import org.example.exerciseTwo.model.Category;
import org.example.exerciseTwo.model.ChildBook;

public class BooksRepository {
    private Book[] childBookArray = new Book[0];
    private Book[] adultBookArray = new Book[0];


    public Book[] getChildBooks() {
        return childBookArray;
    }

    public Book[] getAdultBooks() {
        return adultBookArray;
    }

    public Book loan(Book book) {
        if (book.getCategory().equals(Category.NOT_LOANABLE)){
            System.out.println("This book can't be borrowed.");
            return book;
        }
        if (book.getCategory().equals(Category.CHILD)){
            Book[] newArray = new Book[childBookArray.length+1];
            for (int i = 0; i < childBookArray.length ; i++) {
                newArray[i] = childBookArray[i];
            }
            newArray[newArray.length-1] = book;
            childBookArray = newArray;
        }else{
            Book[] newArray = new Book[adultBookArray.length+1];
            for (int i = 0; i < adultBookArray.length ; i++) {
                newArray[i] = adultBookArray[i];
            }
            newArray[newArray.length-1] = book;
            adultBookArray = newArray;
        }
        return book;
    }
}

package org.example.exerciseTwo.model;

import org.example.exerciseTwo.data.BooksRepository;
import org.example.exerciseTwo.data.Loanable;

public class AdultBook extends Book implements Loanable {

    private BooksRepository booksRepository = new BooksRepository();

    public AdultBook(String title, String author, int year) {
        super(title, author, year, Category.ADULT);
    }

    public AdultBook(String title, String author, int pages, int year, String theme) {
        super(title, author, pages, year, Category.ADULT, theme);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Title: "+this.getTitle()+
                "\nAuthor: "+this.getAuthor()+
                "\nPublishing year: "+this.getYear()+
                "\nCategory: "+this.getCategory()+
                "\nTheme: "+this.getTheme()+
                "\nPages: "+this.getPages());
        return sb.toString();
    }

    @Override
    public void loan() {
        System.out.println("This is book is loanable");
    }
}

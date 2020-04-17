package org.example.exerciseTwo.model;

public class ReferenceBook extends Book{


    public ReferenceBook(String title, String author, int year) {
        super(title, author, year, Category.NOT_LOANABLE);
    }

    public ReferenceBook(String title, String author, int pages, int year,  String theme) {
        super(title, author, pages, year, Category.NOT_LOANABLE, theme);
    }

    public void loan() {
        System.out.println("This book is not loanable");
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
}

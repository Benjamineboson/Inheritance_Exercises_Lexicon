package org.example.exerciseTwo.model;

import java.util.Set;
//
public class Book {

    private String title;
    private String author;
    private int pages;
    private int year;
    private String theme;
    private Category category;

    public Book(String title, String author, int year, Category category) {
        this.title = title;
        this.author = author;
        this.pages = 100;
        this.year = year;
        this.category = category;
    }

    public Book(String title, String author, int pages, int year, Category category, String theme) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
        this.category = category;
        this.theme = theme;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", pages=").append(pages);
        sb.append(", year=").append(year);
        sb.append(", category='").append(category).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

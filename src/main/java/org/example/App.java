package org.example;

import org.example.exerciseOne.model.Car;
import org.example.exerciseOne.model.Motorcycle;
import org.example.exerciseOne.model.Truck;
import org.example.exerciseTwo.data.Loanable;
import org.example.exerciseTwo.model.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

//        ExerciseOne

        Car car = new Car(1,"s","s",5,5);
        Truck truck = new Truck(2,"s","s",5.0,80);
        Motorcycle motorcycle = new Motorcycle(3,"s","s","sport");

        car.drive();
        truck.drive();
        motorcycle.drive();

//        Exercise Three

        //a
        ChildBook book1 = new ChildBook("LOTR","JRR. Tolkien",2398213,1948,"Fantasy");
        ChildBook book2 = new ChildBook("THING","Dunno",1920);
        AdultBook aBook = new AdultBook("Scary","SomeGuy",2020);
        ReferenceBook rBook = new ReferenceBook("OCA","SOME GUY",2020);
        Book[] bookArr = {book1,book2,aBook,rBook};


        //b
        for (int i = 0; i < bookArr.length ; i++) {
            if (bookArr[i] instanceof Loanable) System.out.println(bookArr[i]);
        }

        //c
        for (int i = 0; i < bookArr.length ; i++) {
            if (bookArr[i].getCategory().equals(Category.NOT_LOANABLE)) System.out.println(bookArr[i]);
        }

        //d
        for (int i = 0; i < bookArr.length ; i++) {
            if (bookArr[i].getCategory().equals(Category.CHILD)) System.out.println(bookArr[i]);
        }

        //e
        for (int i = 0; i < bookArr.length ; i++) {
            if (bookArr[i].getCategory().equals(Category.ADULT)) System.out.println(bookArr[i]);
        }


    }
}

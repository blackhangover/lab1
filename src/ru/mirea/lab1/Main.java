package ru.mirea.lab1;
import java.lang.System;
public class Main
{
    public static void main(String[] args)
    {
        Dog g1 = new Dog();
        Book b1 = new Book();
        Ball l1 = new Ball(16);
        System.out.println(g1.toString());
        System.out.println(b1.toString());
        System.out.println(l1.toString());
    }
}

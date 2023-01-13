package com.driver;

public class Main {
    public static void main(String args[])
    {
        RWOnly a = new RWOnly();
        a.setX(5);
        System.out.print(a.getX());
    }
  
}
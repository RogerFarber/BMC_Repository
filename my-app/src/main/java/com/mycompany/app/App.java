package com.mycompany.app;

/**
 * Hello worl
 *
 */

public class App 
{
    public String SomeString() {
        return "Hello World!";
    }
    public static void main( String[] args )
    {
        App myApp = new App();
        System.out.println(myApp.SomeString());
    }
}

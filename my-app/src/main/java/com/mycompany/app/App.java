package com.mycompany.app;

/**
 * Hello world!
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

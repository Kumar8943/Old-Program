package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1
{
    public static void main (String[] args)
    {
         
        // array of size 4.
        int[] arr = new int[4];
         
        try
        {
           // int i = arr[4];
        	String s =null;
        	s.toUpperCase();
                 
            // this statement will never execute
            // as exception is raised by above statement
            System.out.println("Inside try block");
        }
         
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Exception caught in catch block");
        }
        /*catch(NullPointerException e) {
        	System.out.println("Exception caught in null pointer catch block");
        }*/
         
        finally
        {
            System.out.println("finally block executed");
        }
         
        // rest program will be executed
        System.out.println("Outside try-catch-finally clause");
    }
}






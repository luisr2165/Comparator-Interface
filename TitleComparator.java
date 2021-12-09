package com.mycompany.hw5;
import java.util.Comparator;

/*
 
Author: Luis Reynoso
 
Date: 05/18/21

Purpose: Compare titles of Book objects in the main method with the Comparator interface and method. 

 */


public class TitleComparator implements Comparator<Book> {
    
    /*
   
        Purpose: Order Book objects by title in descending order.
        Parameters: Book objects.
        Return: Smallest Book object.
        
     */
    
    @Override
    public int compare(Book bOne, Book bTwo){
        return bTwo.getTitle().compareTo(bOne.getTitle());
    }
}

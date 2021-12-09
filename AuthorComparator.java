package com.mycompany.hw5;
import java.util.Comparator;

/*
 
Author: Luis Reynoso
 
Date: 05/18/21

Purpose: Compare authors of Book objects in the main method with the Comparator interface and method. 

 */


public class AuthorComparator implements Comparator<Book>{
    
    /*
   
        Purpose: Order Book objects by author name in ascending order.
        Parameters: Book objects.
        Return: Largest Book object.
        
     */
    
    @Override
        public int compare(Book bOne, Book bTwo){
        return bOne.getAuthor().compareTo(bTwo.getAuthor());
    }
    
}

package com.mycompany.hw5;
import java.util.Comparator;

/*
 
Author: Luis Reynoso
 
Date: 05/18/21

Purpose: Compare prices and page numbers of Book objects in the main method with the Comparator interface and method. 

 */

public class PriceComparator implements Comparator<Book> {
    
    /*
   
        Purpose: Order Book objects by price and page number in ascending order.
        Parameters: Book objects.
        Return: Largest Book object.
        
     */
    
    @Override
    public int compare(Book bOne, Book bTwo) {
        int tmp = bOne.getPrice() - bTwo.getPrice();
        if(tmp == 0) {
            tmp = bOne.getNumPages() - bTwo.getNumPages();
        }
        return tmp;
    }
}

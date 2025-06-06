package com.alejandro;

public class Test{
    public static void main(String[] args) {
    FinalFinch fitzgerald = new FinalFinch(); // Instantiates a Finch object to control the Finch
    
    fitzgerald.navigate(); // Calls the navigate() method to navigate the maze

    fitzgerald.stopAll();
    fitzgerald.disconnect();
  }
}
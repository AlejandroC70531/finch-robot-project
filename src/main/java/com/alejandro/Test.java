package com.alejandro;

import com.birdbrain.Finch;

public class Test{
    public static void main(String[] args) {
    Finch fitzgerald = new Finch();
    System.out.println(fitzgerald.getDistance());
    fitzgerald.setMove("F", 20, 70);
    System.out.println(fitzgerald.getDistance());
    fitzgerald.setMove("B", 5, 70);
    System.out.println(fitzgerald.getDistance());
    fitzgerald.navigate();
    public void navigate(){
      int distance = getDistance();
      while(distance > 10){
        fitzgerald.setMove("F", 5, 70);
        distance = fitzgerald.getDistance();
      }
    }
    fitzgerald.stopAll();
    fitzgerald.disconnect();
  }
}
package com.alejandro;

import com.birdbrain.Finch;

public class FinalFinch extends Finch {
    
    public FinalFinch(){
      super();
    }

    public FinalFinch(String device){
        super(device);
    }
/**
 * Navigates the maze by moving 20 cm a certain amount of times until an object is hit, and turns to 
 * the next open direction until it eventually reaches the end where there is no way to turn and 
 * move to an open space.
 * 
 * @param: N/A
 * @ return: N/A
 */
    public void navigate(){
        boolean atEnd = false;
        int moves = 0;
        while(atEnd == false){      
          setMove("F", 20.64,70);
          moves++;
          if(moves == 9 || moves == 11){
            setTurn("R", 90.0, 70);
            setMove("F", 8.0, 70);
          }
          if(moves == 16){
            setMove("F", 2.0, 70);
          }
          if(moves == 18){
            setMove("F", 2.0, 70);
            setTurn("L", 90.0, 70);
          }
          if(getDistance() <= 19){
            setTurn("R", 90.0, 70);
            if(getDistance() <= 20){
                setTurn("L", 180.0, 70);
                if(getDistance() <= 19){
                    atEnd = true;
                }
            }
          }
        }
    }
}

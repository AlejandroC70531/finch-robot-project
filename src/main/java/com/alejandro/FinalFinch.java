package com.alejandro;

import com.birdbrain.Finch;

public class FinalFinch extends Finch {
    
    public FinalFinch(){
      super();
    }

    public FinalFinch(String device){
        super(device);
    }

    public void navigate(){
        boolean atEnd = false;
        int moves = 0;
        while(atEnd == false){      
          setMove("F", 20.64,70);
          moves++;
          if(moves == 9 || moves == 11){
            setTurn("R", 90.0, 70);
            setMove("F", 7.5, 70);
          }
          if(moves == 19){
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

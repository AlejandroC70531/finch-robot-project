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
        while(atEnd == false){      
         int distance = 0;
          setMove("F", 21,70);
          distance += 20;
          if(distance >= 120){
            setTurn("R", 90.0, 70);
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

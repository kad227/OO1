package Zoo;

import java.lang.Math;

public class Cat extends Feline{

    public void makeNoise(){
        this.getName();
        //from https://dzone.com/articles/random-number-generation-in-java
        double x = (int)(Math.random()*((2-1)+1))+ 1;

        if(x == 1){
            System.out.println(" 'Meow!'");
        }
        else if(x == 2){
            System.out.println(" 'Mooooooooooo!'");
        }

        else{
            throw new IllegalArgumentException("Check x");
            }








    }
}

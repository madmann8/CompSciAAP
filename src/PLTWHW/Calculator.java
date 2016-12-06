package PLTWHW;

import Cards.Main;

/**
 * Created by madmann on 12/5/16.
 */
public class Calculator {
    Double width;
    Double height;


    public Calculator(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    public Double getCrossArea () {
        return width*height;
    }

    public Double getI(){
        return (width*((height*height*height)))/12;
    }

    public Double getBeamDeflection () {
        return (250*(Math.pow(144,3)))/(48*1510000*getI());
    }

    public void print() {
        System.out.printf("Dimensions: %fx%f",width,height);
        System.out.println("");
        System.out.printf("Area: %f",getCrossArea());
        System.out.println("");
        System.out.printf("Moment of Intertia: %f ",getI());
        System.out.println("");
        System.out.printf("Beam Deflection: %f",getBeamDeflection());
        System.out.println("");
        System.out.println("");
    }

}

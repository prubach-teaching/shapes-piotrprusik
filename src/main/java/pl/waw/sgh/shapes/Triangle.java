package pl.waw.sgh.shapes;

public class Triangle extends Shape implements PerimeterCalculation {

    public Triangle (double a, double b, double c) {
        super(a, b, c);    
    }

    public double calcSurface(); {
        // calculating surface using side lenghts only
        double HP = (this.parA + this.parB + this.parC) / 2; //half of the perimeter
        return Math.sqrt((HP)*(HP-this.parA)*(HP-this.parB)*(HP-this.parC));
    }
    
    public double calcPerimeter(); {
        return.this.parA+parB+parC;
    }


}

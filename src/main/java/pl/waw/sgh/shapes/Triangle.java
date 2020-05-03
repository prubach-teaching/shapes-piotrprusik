package pl.waw.sgh.shapes;

public class Triangle extends Shape implements PerimeterCalculation {

    public Triangle (double a, double b, double c) {
        super(a, b, c);
    }

    public double calcSurface(); {
        double HP = (this.parA + this.parB + this.parC) / 2;
        return Math.sqrt((HP)*(HP-this.parA)*(HP-this.parB)*(HP-this.parC));
    }
    
    public double calcPerimeter(); {
        return.this.parA+parB+parC;
    }


}

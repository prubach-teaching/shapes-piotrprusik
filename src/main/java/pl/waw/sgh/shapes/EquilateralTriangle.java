package pl.waw.sgh.shapes;

public class EquilateralTriangle extends Shape implements PerimeterCalculation {

    public EquilateralTriangle (double a) {
        super(a, a, a);
    }

    public double calcSurface(); {
    // calculating surface using side lenghts only
        double HP = (this.parA + this.parA + this.parA) / 2; //half of the perimeter
        return Math.sqrt((HP)*(HP-this.parA)*3);
    }

    public double calcPerimeter(); {
        return.this.parA*3;
    }

    
}

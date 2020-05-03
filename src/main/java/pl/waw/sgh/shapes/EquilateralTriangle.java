package pl.waw.sgh.shapes;

public class EquilateralTriangle extends Shape implements PerimeterCalculation {

    public EquilateralTriangle (double a) {
        super(a);
    }

    public double calcSurface(); {
        double HP = (this.parA + this.parA + this.parA) / 2;
        return Math.sqrt((HP)*(HP-this.parA)*3);
    }

    public double calcPerimeter(); {
        return.this.parA*3;
    }

    
}

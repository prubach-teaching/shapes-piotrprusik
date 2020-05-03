package pl.waw.sgh.shapes;

public class Square extends Shape implements PerimeterCalculation {

    public Square = new Square(double a)
    {
        super(a);
    }

    public double calcSurface() {
        return this.parA*parA;
    }

    public double calcPerimeter() {
        return this.parA*4;
    }

}

package pl.waw.sgh.shapes;

public abstract class Shape implements Comparable<Shape> {
    protected double parA;
    protected double parB;
    protected double parC;

//    public Shape() {
//    }

    public Shape(double a, double b, double c) {
        setParams(a, b, c);
    }

    public void setParams(double parA, double b, double c) {
        System.out.println("Changing parameters parA from: " + this.parA + " to: " + parA);
        this.parA = parA;
        parB = b;
        parC = c;
    }

    public abstract double calcSurface();
//    {
//        return -1;
//    }
    

    @Override
    public int compareTo(Shape otherShape) {
        Double thisSurface = Double.valueOf(this.calcSurface());
        Double otherSurface = Double.valueOf(otherShape.calcSurface());
        return thisSurface.compareTo(otherSurface);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " ["+ parA + ", " + parB + ", " + parC + "]";
    }
}

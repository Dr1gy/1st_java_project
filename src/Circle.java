public class Circle {
    private double r;

    public Circle(double r){
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getS(){
        double s = Math.PI * r * r;
        return s;
    }

    public double getP(){
        double p = Math.PI * 2 * r;
        return p;
    }
}

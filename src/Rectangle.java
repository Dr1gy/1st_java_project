public class Rectangle {
    private double a, b, s, p;

    public double geta() {
        return a;
    }
    public double getb() {
        return b;
    }
    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double getS(){
        s = a * b;
        return s;
    }

    public double getP(){
        p = a + b + a + b;
        return p;
    }
}

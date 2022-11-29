public class Tringle {
    private double a, b, c, s, p;

    public double geta() {
        return a;
    }
    public double getb() {
        return b;
    }
    public double getc() {
        return c;
    }

    public Tringle(double a, double b , double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getS(){
        double PP = getP() / 2;
        s = Math.sqrt(PP * (PP - a) * (PP - b) * (PP - c));
        return s;
    }

    public double getP(){
        p = a + b + c;
        return p;
    }
}


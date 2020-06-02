package theme_4;

public class Task3 {
    private double a;
    private double b;
    private double c;

    public Task3(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void changeNumbers(){
       if(this.a > this.b && this.b > this.c){
           setA(this.a * 2);
           setB(this.b * 2);
           setC(this.c * 2);
       } else {
           setA(Math.abs(this.a));
           setB(Math.abs(this.b));
           setC(Math.abs(this.c));
       }
    }
}

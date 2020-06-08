package by.epamtc.aladzyin.theme_4;

public class Task7 {
    private double d;

    public Task7(double d) {
        this.d = d;
    }

    public double getReversedNumber(){
        int first = (int) d;
        int second = (int) Math.round(d % first * 1000) ;
        double res = ((double) first/1000) + second;
        return res;
    }
}

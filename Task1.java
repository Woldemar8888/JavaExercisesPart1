package by.epamtc.aladzyin.theme_4;

public class Task1 {

    static double getResult( double a, double b, double c){

        if (a == 0){
            return Double.POSITIVE_INFINITY;
        }

        return (b + Math.sqrt(b * b + 4 * a * c)) /
                (2 * a ) -
                a * a * a * c +
                Math.pow(b, -2);
    }
}

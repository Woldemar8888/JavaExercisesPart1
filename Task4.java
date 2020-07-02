package by.epamtc.aladzyin.theme_4;

public class Task4 {
    public static double getFunctionValue(double x){

        double functionValue;

        if(x <= 13){
            functionValue = -(Math.pow(x, 3)) + 9;
        }

        functionValue = -(3 / (x + 1));

        return functionValue;
    }
}

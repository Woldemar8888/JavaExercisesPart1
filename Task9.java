package by.epamtc.aladzyin.theme_4;

public class Task9 {
    private int number;

    public Task9(int number) {
        this.number = number;
    }

    private int getSumOfDigits(int num){
        int sumOfDigits = 0;

        for(int j =0; j <= num; j++){
           sumOfDigits += j;
        }

        return sumOfDigits;
    }

    public long getMultipliedSums(){
        long multipliedSums = 1;

        for(int i = 2; i <= number; i++){
            multipliedSums *= getSumOfDigits(i);
        }

        return multipliedSums;
    }
}

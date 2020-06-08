package by.epamtc.aladzyin.theme_4;

public class Task9 {
    private int number;

    public Task9(int number) {
        this.number = number;
    }

    private int getSumOfDigits(int num){
        int sum = 0;

        for(int j =0; j <= num; j++){
           sum += j;
        }

        return sum;
    }

    public long getMultipliedSums(){
        long result = 1;

        for(int i = 2; i <= number; i++){
            result *= getSumOfDigits(i);
        }

        return result;
    }
}

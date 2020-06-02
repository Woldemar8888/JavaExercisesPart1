package theme_4;

public class Task6 {
    private int startValue;
    private int stepValue;


    public Task6(int startValue, int stepValue) {
        this.startValue = startValue;
        this.stepValue = stepValue;
    }

    public int getSumInt(int n){
        return  (2 * startValue + stepValue * (n - 1)) * n / 2;
    }

    public long getSumLong(long n){
        return  (2 * startValue + stepValue * (n - 1)) * n / 2;
    }
}

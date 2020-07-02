package by.epamtc.aladzyin.theme_4;

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

    public int checkMaxForInt(){
        int prev = startValue;
        int last = startValue;
        int n =1;

        while ( last >= prev) {
            last =  (2 * startValue + stepValue * (n - 1)) * n / 2;

                if(last > 0){
                    n++;
                    prev = last;
                }else n--;
        }

        return n;
    }

    public long checkMaxForLong(){
        long prev = startValue;
        long last = startValue;
        long n =1;

        while ( last >= prev) {
            last =  (2 * startValue + stepValue * (n - 1)) * n / 2;

            if(last > 0){
                n++;
                prev = last;
            }else n--;
        }

        return n;
    }
}

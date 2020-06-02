package theme_4;

import java.util.ArrayList;

public class Task8 {
    private int startValue;
    private int endValue;
    private int step;

    public Task8(int startValue, int endValue, int step) {
        this.startValue = startValue;
        this.endValue = endValue;
        this.step = step;
    }

    public ArrayList getResult(){
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = startValue; i <= endValue; i += step){

            int y;

            if(i == 15){
                y = (i + 5) * 2;  //set 'c' = 5
            }else{
                y = (i - 5) + 6;
            }

            result.add(y);
        }

        return result;
    }
}

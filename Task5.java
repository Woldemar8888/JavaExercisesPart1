package by.epamtc.aladzyin.theme_4;

public class Task5 {
    private int num;
    private int FirstDigit;
    private int SecondDigit;
    private int ThirdDigit;

    public Task5(int num) {
        this.num = num;
        FirstDigit = num/100;
        SecondDigit = (num - FirstDigit * 100) / 10 ;
        ThirdDigit = num % 10;
    }


    public int getSumOfDigits(){
        return FirstDigit + SecondDigit + ThirdDigit;
    }

    public int getMultipliedDigits(){
        return FirstDigit * SecondDigit * ThirdDigit;
    }

    public int getChangedNum(){
        return SecondDigit * 100 + FirstDigit * 10 + ThirdDigit;
    }

    public int getChangedFourDigitsNum(){
        return ThirdDigit * 1000 + FirstDigit * 100 + SecondDigit * 10 + ThirdDigit;
    }
}

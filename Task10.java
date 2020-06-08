package by.epamtc.aladzyin.theme_4;

import java.util.Scanner;

public class Task10 {

    private boolean endOfInput = false;
    private boolean isIncrease = true;
    private boolean hasTheSame = false;
    private boolean isAlternating = true;
    private int countOfDigits;
    private int countOfInfo = 1;
    private int last;


    public void inputValues(){
        Scanner in = new Scanner(System.in);

        while ( !endOfInput){

            System.out.print("Input a number: ");
            if(in.hasNextInt()){
                int num = in.nextInt();

                if(num == 0){
                    endOfInput = true;
                    break;
                }

                fillInfo(num);

                System.out.printf("Your number: %d \n", num);
                countOfDigits++;

            } else {
                System.out.println("Incorrect type");
                inputValues();
            }
        }

        in.close();

        if(countOfInfo > 0) getInfo();
        countOfInfo--;
    }

    private void fillInfo(int num){
        if(countOfDigits >=1){
            if(num <= last){
                isIncrease = false;
            }
            if(num ==last) {
                hasTheSame = true;
            }
            if((num > 0 && last > 0) || (num < 0 && last < 0)){
                isAlternating = false;
            }
        }

        if(countOfDigits >= 0){
            last = num;
        }
    }

    private void getInfo(){
        if(countOfDigits < 2){
            System.out.println("There are not enough numbers for statistic");
        }else {
            System.out.println('\n'+ "isIncrease = " + isIncrease + '\n' +
                                    "hasTheSame = " + hasTheSame + '\n' +
                                    "isAlternating = "+ isAlternating
            );
        }
    }
}

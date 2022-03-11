package Week1;

public class DivideWithoutOperator {

    /*
    2. Numbers - Divide without / operator
        Write a method that can divide two numbers without using division operator.
     */

    public static void divide(int num1, int num2){
        int division =0;
        while(num1 >= num2){
            num1 = num1-num2;
            division+=1;
        }
        System.out.println("Division = "+division);
    }
}

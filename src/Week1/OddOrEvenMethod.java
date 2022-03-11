package Week1;

public class OddOrEvenMethod {

    /*
    1. Numbers - odd & even
        Write  a method which can identifies given number is even or odd
        EX:
        identify(5) ->  "Odd"
        identify(6) ->  "Even"
     */
    public static void identify(int number){
        if(number%2==0){
            System.out.println(number+ " is even number");
        }else {
            System.out.println(number+ " is odd number");
        }
    }


}

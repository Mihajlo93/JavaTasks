package Week1;

public class Finra {
    /*
    . Numbers - FINRA
     Write a method which prints out the numbers from 1 to 30
     but for numbers which are a multiple of 3, print "FIN" instead of the number and
    for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */

    public static void Finra(int number) {
        if (number >= 1 && number <= 30) {
            if (number % 3 == 0 && number%5==0) {
                System.out.println("FINRA");
            }else if(number%3 ==0 && number%5!=0){
                System.out.println("FIN");
            }else if(number%3!=0 && number%5==0){
                System.out.println("RA");
            }else {
                System.out.println(number+ " is not divisible with 3 or 5");
            }
        }else {
            System.out.println("Please input number between 1 and 30");
        }
    }
}
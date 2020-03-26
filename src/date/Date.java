
package date;
import  java.util.Scanner;

public class Date {

    public static void main(String[] args) {
        int income;
        int age;
        double cute;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please tell me, how old are you?");
        age = input.nextInt();
        System.out.println("Please tell me, how much do you make?");
        income = input.nextInt();
        System.out.println("Please tell me, how handsome are you?");
        cute = input.nextInt();
        
        if (age <= 25) {
            System.out.println("Sorry, you are too young.");
        }else if(age >= 45){
            System.out.println("Sorry, you are too old.");
        }else if(income <= 15000){
            if(cute >=8.3){
                System.out.println("You are poor, but handsome, so you can date my daughter.");
            }else
                System.out.println("Sorry, you are poor.");
        }else if (cute <=8.3){
            if(income >= 15000){
                System.out.println("You are not that handsome, but you are rich, so you can date my daughter.");
            }else
            System.out.println("Sorry, you are not that handsome.");
        }else{
            System.out.println("Nice, you can date my daughter.");
        }
    }
    
}

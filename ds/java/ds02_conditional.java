import java.util.Scanner;

public class ds02_conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your  age");
        // int age = sc.nextInt();

        // if(age > 18){
        //     System.out.println("you are adult");
        // }
        // else{
        //     System.out.println("you are minor");
        // }




        // System.out.println("Enter a number");
        // int num = sc.nextInt();
        // if(num % 2 == 0){
        //     System.out.println("number is even");
        // }
        // else{
        //     System.out.println("number is odd");
        // }




        // System.out.println("Enter a value of a");
        // int a = sc.nextInt();
        // System.out.println("Enter a value of b");
        // int b = sc.nextInt();

        // if(a == b){
        //     System.out.println("Equal");
        // } 
        // else{
        //     if(a > b){
        //         System.out.println("a is greater");
        //     }
        //     else{
        //         System.out.println("b is greater");
        //     }
        // }



        // System.out.println("Enter a value of a");
        // int a = sc.nextInt();
        // System.out.println("Enter a value of b");
        // int b = sc.nextInt();

        // if(a == b){
        //     System.out.println("Equal");
        // }
        // else if(a > b){
        //     System.out.println("a is greater");
        // }
        // else{
        //     System.out.println("b is greater");
        // }


        
        // System.out.println("Enter a button");
        // int button = sc.nextInt();

        // if(button == 1){
        //     System.out.println("Hello");
        // }
        // else if(button == 2){
        //     System.out.println("Namaste");
        // }
        // else if(button == 3){
        //     System.out.println("Bonjour");
        // }
        // else{
        //     System.out.println("Invalid");
        // }




        System.out.println("Enter a button");
        int button = sc.nextInt();

        switch(button){
            case 1 : System.out.println("Hello");
            break;

            case 2 : System.out.println("Namaste");
            break;

            case 3 : System.out.println("Bonjour");
            break;

            default : System.out.println("Invalid");
        }
    }
}

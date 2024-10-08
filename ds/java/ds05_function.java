
import java.util.Scanner;


// import java.util.Scanner;

// public class ds05_function {

//     public static void printMyName(String name){
//         System.out.println(name);
//         return;
//     }
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         String name = sc.next();

//         printMyName(name);   // call the function
//     }
// }





// public class ds05_function {
//     public static int calculateMulti(int a, int b){
//         int multiply = a * b;
//         return multiply;


//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a value of a");
//         int a = sc.nextInt();
//         System.out.println("Enter a value of b");
//         int b = sc.nextInt();
        
//         int multiply = calculateMulti(a,b);
//         System.out.println(multiply);
        
//     }
// }



// public class ds05_function {
//     public static int calculateMulti(int a, int b){
//         return a * b;


//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a value of a");
//         int a = sc.nextInt();
//         System.out.println("Enter a value of b");
//         int b = sc.nextInt();
        
//         // int multiply = calculateMulti(a,b);
//         // System.out.println(multiply);

//         System.out.println(calculateMulti(a, b));
        
//     }
// }



// public class ds05_function {
//     public static int factorial(int n){
        //    if(n < 0){
            // System.out.println("invalid number");
        //    }
//         else if(n == 0 || n == 1){
//             return 1;
//         }
//         else{
//             return n * factorial(n-1);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();

//         System.out.println("factorial of number is: " + factorial(n));
//     }
// }




public class ds05_function {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void printFibonacciSeries(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        System.out.println("Fibonacci series up to " + n + " is:");
        printFibonacciSeries(n);
    }
}

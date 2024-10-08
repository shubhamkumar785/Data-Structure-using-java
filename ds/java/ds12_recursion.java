

// public class ds12_recursion {
//     public static void printNumber(int n){
//         if(n == 0){
//             return;
//         }
//         System.out.println(n);
//         printNumber(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         printNumber(n);
//     }
// }




//   print number from 1 to 5


// public class  ds12_recursion{
//     public static void printNumber(int n){
//         if(n == 6){
//             return;
//         }
//         System.out.println(n);
//         printNumber(n+1);
//     }
//     public static void main(String[] args) {
//         int n = 1;
//         printNumber(n);
//     }
// }





//   print sum of first n natural numbers

// public class ds12_recursion{
//     public static void printSum(int i, int n, int sum){
//         if(i == n){
//             sum += i;
//             System.out.println(sum);
//             return;
//         }
//         sum += i;
//         printSum(i+1, n, sum);
//     }
//     public static void main(String[] args) {
//         printSum(1, 5, 0);
//     }
// }





//  print factorial of a number

// public class ds12_recursion{
//     public static int factorial(int n){
//         if(n == 0 || n == 1){
//             return 1;
//         }
//         else{
//             return n* factorial(n-1);
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println(factorial(5));
//     }
// }



//  print the fibinacci series till nth term


// public class ds12_recursion{
//     public static int fibonacci(int n){
//         if(n == 0){
//             return 0;
//         }
//         else if(n == 1){
//             return 1;
//         }
//         else{
//             return fibonacci(n-1) + fibonacci(n-2);
//         }

//     }
//     public static void printFibonacci(int n){
//         for(int i=0; i<n; i++){
//             System.out.println(fibonacci(i));
//         }
//     }


//     public static void main(String[] args) {
//         printFibonacci(10);
//     }
// }



// print x^n (stack height = n)

// public class ds12_recursion{
//     public static int power(int x, int n){
//         if(n == 0){
//             return 1;
//         }
//         else{
//             return x * power(x, n - 1);
//         }
//     }
//     public static void main(String[] args) {
//         int x = 5;
//         int n = 2;
//         System.out.println(power(x, n));
//     }
// }




//  print x^n (stack height = logn)


public class ds12_recursion{
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }
        else if ( n % 2 == 0){
            int halfPower = power(x, n/2);
            return halfPower * halfPower;
        }
        else{
            return x * power(x, n-1);
        }
    }
    public static void main(String[] args) {
        int x = 5;
        int n = 2;
        System.out.println(power(x, n));
    }
}
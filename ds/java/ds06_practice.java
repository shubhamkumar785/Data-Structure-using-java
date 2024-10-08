import java.util.Scanner;

//  Q1 enter 3 number from user & make a function to print their average

// public class ds06_practice {
//     public static int averageNum(int a, int b, int c){
//         int average = (a + b + c)/3;
//         return average;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number 1");
//         int a = sc.nextInt();
//         System.out.println("Enter a number 2");
//         int b = sc.nextInt();
//         System.out.println("Enter a number 3");
//         int c = sc.nextInt();

//         int average = averageNum(a,b,c);
//         System.out.println(average);
//     }
// }




//  Q2. write a function to print the sum of all odd numbers from 1 to n.

// public class ds06_practice {
//     public static int oddNumber(int n){
//         int sum = 0;
//         for(int i=0; i<=n; i += 2){
//             sum += i;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n = sc.nextInt();
        
//         int sum = oddNumber(n);
//         System.out.println(sum);
//     }
// }



//  Q3. write a function which takes in 2 numbers and returns the greater of those two.

// public class ds06_practice {
//     public static void greatestNum(int a, int b){
//         if(a > b){
//             System.out.println("a is greater than b");
//         }
//         else if(a < b){
//             System.out.println("b is greater than a");
//         }
//         else{
//             System.out.println("a and b are equal");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a value of a");
//         int a = sc.nextInt();
//         System.out.println("Enter a value of b");
//         int b = sc.nextInt();

//         greatestNum(a, b);
//     }
// }




//   Q4. write a function that takes in the radius as input and return the circumference of a circle.


// public class ds06_practice {
//     public static double circumCircle(int radius){
//         double circumference = 2 * Math.PI * radius;
//         return circumference;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a radius");
//         int radius = sc.nextInt();

//         double circumference = circumCircle(radius);
//         System.out.println(circumference);
//     }
// }



//  Q5. write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is elifible to vote.


// public class ds06_practice {
//     public static void ageVote(int age){
//         if(age > 18){
//             System.out.println("you are eligible to vote");
//         }
//         else{
//             System.out.println("you are not eligible");
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         ageVote(age);
        
//     }
// }




//  Q10. fibonacci series



public class ds06_practice{
    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    public static void fibonacciSeries(int n){
        for(int i=0; i<n; i++){
            System.out.print(fibonacci(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner("System.in");
        System.out.println("Enter a number");
        int n = sc.nextInt();

        fibonacciSeries(n);
    }
}
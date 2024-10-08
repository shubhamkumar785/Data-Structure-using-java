// Q1. demonstrate a program in java which display  the square of the first ten integer

// public class ds200_mid {
//     public static void main(String[] args) {
//         System.out.println("Square of the first ten integer");
//         for(int i=1; i <=10; i++){
//             int square = i * i;
//             System.out.println("Square of " + i + " is: " + square);
//         }
//     }
// }




//  Q2. construct a class bank where data will be account number, customer name and balance. use display() method to print all the information of particular customer whose balance is less than 5000



// class Bank{
//     private String accountNumber;
//     private double balance;
//     private String accountHolderName;

//     public Bank(String accountNumber, double balance, String accountHolderName){
//         this.accountNumber = accountNumber;
//         this.balance = balance;
//         this.accountHolderName = accountHolderName;
//     }

//     public void display(){
//         if(balance < 5000){
//             System.out.println("Account Number: " + accountNumber);
//             System.out.println("Account Holder Name: " + accountHolderName);
//             System.out.println("Avialaible Balance: " + balance);
//         }
//     }
// }
// public class ds200_mid {
//     public static void main(String[] args) {
//         Bank customer1 = new Bank("123456789", 10000, "Shubham");
//         Bank customer2 = new Bank("987654321", 4500, "golu");
//         Bank customer3 = new Bank("123459876", 5000, "subhanshu");

//         customer1.display();
//         customer2.display();
//         customer3.display();
//     }
// }





//  Q3. build a program to display odd and even number from 1 to n where n = 100 using class and object concept


// class NumberOperation {
//     // Method to print even numbers from 1 to n
//     public void evenNumber(int n) {
//         System.out.println("Even numbers from 1 to " + n + ":");
//         for (int i = 1; i <= n; i++) {
//             if (i % 2 == 0) {
//                 System.out.print(i + " ");
//             }
//         }
//         System.out.println();
//     }

//     // Method to print odd numbers from 1 to n
//     public void oddNumber(int n) {
//         System.out.println("Odd numbers from 1 to " + n + ":");
//         for (int i = 1; i <= n; i++) {
//             if (i % 2 != 0) {
//                 System.out.print(i + " ");
//             }
//         }
//         System.out.println();
//     }
// }

// public class ds200_mid {

//     public static void main(String[] args) {
//         // Create an instance of NumberOperation class
//         NumberOperation No = new NumberOperation();
        
//         // Set the value of n
//         int n = 100;

//         // Display even and odd numbers from 1 to n
//         No.evenNumber(n);
//         No.oddNumber(n);
//     }
// }





// Q1. demonstrate a program in java which display  the square of the first ten integer


// public class ds200_mid {
//     public static void main(String[] args) {
//         for(int i=1; i<=10; i++){
//             System.out.println(i*i);
//         }
//     }
// }




//  Q2. construct a class bank where data will be account number, customer name and balance. use display() method to print all the information of particular customer whose balance is less than 5000


// class Bank{
//     private String accountHolderName;
//     private String accountNumber;
//     private double balance;

//     public Bank(String accountHolderName, String accountNumber, double balance){
//         this.accountHolderName = accountHolderName;
//         this.accountNumber = accountNumber;
//         this.balance = balance;
//     }
//     public void printMyDetails(){
//         if(balance < 5000){
//             System.out.println("Account Holder Name : " + accountHolderName);
//             System.out.println("Account Number : " + accountNumber);
//             System.out.println("Balance : " + balance);
//         }
//     }
// }

// public class ds200_mid {
//     public static void main(String[] args) {
//         Bank obj1 = new Bank("Shubham", "2023286582", 10000);
//         Bank obj2 = new Bank("subhanshu", "2023256828", 4000);

//         obj1.printMyDetails();
//         obj2.printMyDetails();
//     }
// }




//  build a program to display odd and even number from 1 to n where n = 100 using class and object concept


class Number {
    public void printEvenNumber(int n){
        System.out.println("Even numbers from 1 to " + n + ":" );
        for(int i=0; i<=n; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
    public void printOddNumber(int n){
        System.out.println("\nodd number from 1 to " + n + ":");
        for(int i=0; i<=n; i++){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
public class ds200_mid{
    public static void main(String[] args) {
        Number num = new Number();

        num.printEvenNumber(10);
        num.printOddNumber(10);
    }
}

// public class ds04_pattern {

//  q1.

// public static void main(String[] args) {
//     for (int i = 0; i <= 3; i++) {
//         for (int j = 1; j <= 4; j++) {
//             System.out.print("*");
//         }
//         System.out.println("*");
//     }
// }

// q2. hollow rectangle
// public static void main(String[] args) {
// for(int i=1; i<=4; i++){
// for(int j=1; j<=5; j++){
// if(i == 1 || j == 1 || i == 4 || j == 5){
// System.out.print("*");
// }
// else{
// System.out.print(" ");
// }
// }
// System.out.println();
// }

// Q3. half pyramid
// public static void main(String[] args) {
// for(int i=0; i<5; i++){
// for(int j=1; j<=i; j++){
// System.out.print("*");
// }
// System.out.println();
// }
// }

// Q4. inverted half pyramid
// public static void main(String[] args) {
// for(int i=0; i<5; i++){
// for(int j = 4; j > i; j--){
// System.out.print("*");
// }
// System.out.println();
// }
// }

// Q5. inverted half pyramid rotated by 180 degree
// public static void main (String[] args) {
// int n = 4;
// // outer loop
// for(int i=1; i<=n; i++){
// // inner loop -> space print
// for(int j=1; j<=n-i; j++){
// System.out.print(" ");
// }
// // inner loop -> star print
// for(int j=1; j<=i; j++){
// System.out.print("*");
// }
// System.out.println();
// }
// }

// Q6. half pyramid with number
// public static void main(String[] args) {
// int n = 5;
// for(int i=1; i<=n; i++){
// for(int j = 1; j<=i; j++){
// System.out.print(j + " ");
// }
// System.out.println();
// }
// }

// Q7. inverted half pyramid with number

// public static void main(String[] args) {
// int n =5;
// for(int i=1; i<=n; i++){
// for(int j = 1; j<=n-i+1; j++){
// System.out.print(j);
// }
// System.out.println();
// }
// }

// Q8. floyd's triangle
// public static void main(String[] args) {
// int n = 5;
// int number = 1;

// for(int i=1; i<=n; i++){
// for(int j=1; j<=i; j++){
// System.out.print(number+" ");
// number++;
// }
// System.out.println();
// }
// }

// Q9. 0-1 Triangle
// public static void main(String[] args) {
// int n = 5;
// for(int i=1; i<=n; i++){
// for(int j=1; j<=i; j++){
// int sum = i + j;
// if(sum%2 == 0){
// System.out.print("1 ");
// }
// else{
// System.out.print("0 ");
// }
// }
// System.out.println();
// }
// }

// Advanced Pattern Question

// Q 10. Butterfly Pattern
// public static void main(String[] args) {

// }

// }

// pattern - 10

// Q1

// *
// **
// ***
// ****

// class ds04_pattern {
// public static void main(String[] args) {
// for(int i=1; i<=4; i++){
// for(int j=1; j<=i; j++){
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// q2

// ****
// ***
// **
// *

// class ds04_pattern {
// public static void main(String[] args){
// for(int i=3; i>=0; i--){
// for(int j = 0; j<=i; j++){
// System.out.print("*");
// }
// System.out.println();
// }
// }
// }

// Q3

// 1
// 23
// 456
// 78910

// class ds04_pattern {
// public static void main(String[] args) {
// int num = 1;
// for(int i=1; i<=4; i++){
// for(int j=1; j<=i; j++){
// System.out.print(num);
// num++;
// }
// System.out.println();
// }
// }
// }

// Q 4

// a
// bc
// def
// ghij

// class ds04_pattern{
// public static void main(String[] args) {
// char ch = 'a';
// for(int i=1; i<=4; i++){
// for(int j=1; j<=i; j++){
// System.out.print(ch);
// ch++;
// }
// System.out.println();
// }

// }
// }

// Q5

// 1
// 12
// 123
// 1234

// class ds04_pattern{
// public static void main(String[] args) {
// for(int i=1; i<=4; i++){
// for(int j=1; j<=i; j++){
// System.out.print(j);
// }
// System.out.println();
// }
// }
// }

// Q6.

// 1
// 22
// 333
// 4444

// class ds04_pattern{
// public static void main(String[] args) {
// for(int i=1; i<=4; i++){
// for(int j=1; j<=i; j++){
// System.out.print(i);
// }
// System.out.println();
// }
// }
// }

// Q7

// ****
// ****
// ****
// ****

// public class ds04_pattern {
// public static void main(String[] args) {
// for(int i=0; i<=3; i++){
// for(int j=1; j<=4; j++){
// System.out.print("*");
// }
// System.out.println("*");
// }
// }
// }

// Q8

// 1234
// 1234
// 1234
// 1234

// class ds04_pattern{
// public static void main(String[] args) {
// for(int i=1; i<=4; i++){
// for(int j=1; j<=4; j++){
// System.out.print(j);
// }
// System.out.println();
// }
// }
// }

// Q9

// 1
// 2 3
// 4 5 6
// 7 8 9 10

// class ds04_pattern {
// public static void main(String[] args) {
// int number = 1;

// for(int i=1; i<=4; i++){
// for(int j=1; j<=i; j++){
// System.out.print(number+" ");
// number++;
// }
// System.out.println();
// }
// }
// }

// Q10
// abc
// abc
// abc
// abc

class ds04_pattern {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 2; j++) {
                System.out.print("ABC");
            }
            System.out.println();
        }
    }
}

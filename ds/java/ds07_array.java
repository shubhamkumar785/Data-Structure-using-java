
import java.util.Arrays;
import java.util.Scanner;


        // int [] marks = new int[3];
        // marks[0] = 97;
        // marks[1] = 98;
        // marks[2] = 95;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // for(int i=0; i<3; i++){
        //     System.out.println(marks[i]);
        // }

//     }
// }





// public class ds07_array {
//     public static int LinearSearch(int []arr, int target){
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] == target){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int [] array = {10, 20, 30, 40, 50};
//         int target = 40;
//         int result = LinearSearch(array, target);
//         System.out.printf("the element %d at index of %d\n", target, result);

//         if(result != -1){
//             System.out.println("the element are present in array");
//         }
//         else{
//             System.out.println("the element do not present in array");
//         }
//     }
// }








//    2-D array





// public class ds07_array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number of rows");
//         int rows = sc.nextInt();
//         System.out.println("Enter number of column");
//         int column = sc.nextInt();

//         int [][] arr = new int[rows][column];
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<column; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<column; j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }

//     }
// }





//  Q. Take a 2-D matrix as input from the user. Search for a given number x and print the indices at which it occurs.


// public class ds07_array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter number of rows");
//         int rows = sc.nextInt();
//         System.out.println("Enter number of columns");
//         int column = sc.nextInt();

        
//         int [][] arr = new int[rows][column];
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<column; j++){
//                  arr[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Enter the number to search for");
//         int x = sc.nextInt();

//         boolean found = false;
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<column; j++){
//                 if(arr[i][j] == x){
//                     System.out.printf("number %d found at index [%d, %d]%n", x, i, j);
//                     found = true;
//                 }
//             }
//         }
//         if(!found){
//             System.out.println("number are not found");
//         }
//     }
// }






















// take an array as input from the user. search for a given number x and print the index at which it occurs.


// public class ds07_array {
//     public static int LinearSearch(int[] arr, int target){
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] == target){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int [] arr = {10, 20, 30, 40, 50};
//         int target = 40;

//         int result = LinearSearch(arr, target);
//         System.out.printf("The element %d found at index %d\n", target , result);

//         if(result != -1){
//             System.out.println("The element are present in an array");
//         }
//         else{
//             System.out.println("The element are not present in an array");
//         }
//     }
// }














//  binary search 
// public class ds07_array {
//     public static int BinarySearch(int []arr, int target){
//         int left = 0;
//         int right = arr.length-1;

//         while(left <= right){
//             int mid = (left + right)/2;

//             if(arr[mid] == target){
//                 return mid;
//             }
//             else if(arr[mid] < target){
//                 left = mid + 1;
//             }
//             else{
//                 right = mid - 1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int [] arr = {10, 20, 30, 40, 50};
//         int target = 50;

//         int result = BinarySearch(arr, target);
//         System.out.printf("The Element %d found at index %d\n", target, result);

//         if(result != -1){
//             System.out.println("The element are found in an array");
//         }
//         else{
//             System.out.println("The element are not found in an array");
//         }
//     }
// }













//  2- D array

// public class ds07_array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number of rows");
//         int rows = sc.nextInt();
//         System.out.println("Enter a number of columns");
//         int cols = sc.nextInt();

//         int [][] numbers = new int[rows][cols];

//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 numbers[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("ENter a element to search");
//         int x = sc.nextInt();
        
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 if(numbers[i][j] == x){
//                     System.out.println("x found at locations (" + i + ", " + j + ")");
//                 }
//             }
//         }

        
//         // output display
//         // for(int i=0; i<rows; i++){
//         //     for(int j=0; j<cols; j++){
//         //         System.out.print(numbers[i][j] + " ");
//         //     }
//         //     System.out.println();
//         // }
//     }
// }











//  reverse of an array
// public class ds07_array {
//     public static void main(String[] args) {
//         int [] arr = {10, 20, 30, 40, 50};

//         for(int i=arr.length-1; i>=0; i--){
//             System.out.println(arr[i]);
//         }
//     }
// }








//  Input: nums = [2, 7, 11, 15], target = 9
// Output: [0, 1] (since nums[0] + nums[1] = 9
// public class ds07_array {
//     public static int[] twoSums(int [] nums, int target){
//         for(int i=0; i<nums.length; i++){
//             for(int j=i+1; j<nums.length; j++){
//                 if(nums[i] + nums[j] == target){
//                     return new int[] { i, j };
//                 }
//             }
//         }
//         return new int[] {};
//     }
//     public static void main(String[] args) {
//         int [] nums = {2, 7, 11, 15};
//         int target = 9;

//         int[] result = twoSums(nums, target);
//         System.out.println("output : [" + result[0] + ", " + result[1]+"]");
//     }
// }













// public class ds07_array {
//      public static void main(String[] args) {
//         int [] marks = {97, 98, 95};
//         for(int i=0; i<marks.length; i++){
//                 System.out.println(marks[i]);
//         }
//      }
// }




// public class ds07_array {
//         public static int LinearSearch(int [] arr, int target){
//                 for(int i=0; i<arr.length; i++){
//                         if(arr[i] == target){
//                                 return i;
//                         }
//                 }
//                 return -1;
//         }
//         public static void main(String[] args) {
//              int [] arr = {10, 20, 30, 40, 50};
//              int target = 50;  
//              int result = LinearSearch(arr, target);
//              System.out.printf("The Element %d found at index %d\n", target, result);

//              if(result == -1){
//                 System.out.println("The Element not found in an array");
//              }
//              else{
//                 System.out.println("The Element Found in an array");
//              }
//         }
// }





// public class ds07_array {
//         public static int BinarySearch(int [] arr, int target){
//                 int left = 0;
//                 int right = arr.length-1;

//                 while(left <= right){
//                         int mid = (left + right)/2;

//                         if(arr[mid] == target){
//                                 return mid;
//                         }
//                         else if(arr[mid] < target){
//                                 left = mid + 1;
//                         }
//                         else{
//                                 right = mid - 1;
//                         }
//                 }
//                 return -1;
//         }
//         public static void main(String[] args) {
//                 int [] arr = {10, 20, 30, 40, 50};
//                 int target = 50;
//                 int result = BinarySearch(arr, target);
//                 System.out.printf("The Element %d found at index %d\n", target, result);

//                 if(result != -1){
//                         System.out.println("The Element found in an array");
//                 }
//                 else{
//                         System.out.println("The Element not found in an array");
//                 }
//         }
// }




public class ds07_array {
        public static int[] insertElement(int[] arr, int element, int position){
                
                int[] newArr = new int[arr.length + 1];

                for(int i=0; i<position; i++){
                        newArr[i] = arr[i];
                }
                newArr[position] = element;

                for(int i= position; i<arr.length; i++){
                        newArr[i+1] = arr[i];
                }
                return newArr;
        }
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                int[] arr = {1,2,3,5,6};

                System.out.println("Original array: " + Arrays.toString(arr));

                System.out.println("Enter the element to insert: ");
                int element = sc.nextInt();

                System.out.println("Enter the position where you want to insert: ");
                int position = sc.nextInt();

                if(position < 0 || position > arr.length){
                        System.out.println("Invalid position!");
                        return;
                }
                int[] newArr = insertElement(arr, element, position);

                System.out.println("Array after insertion: " + Arrays.toString(newArr));
        }
}
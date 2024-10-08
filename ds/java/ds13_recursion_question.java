

//  Tower Of Hanoi (TOH)

// public class ds13_recursion_question {
//     public static void towerOfHanoi(int n, String sour, String helper, String dest){
//         if(n == 1){
//             System.out.println("Move disk 1 from rod " + sour + " to rod " + dest);
//             return;
//         }
//         towerOfHanoi(n-1, sour, dest, helper);
//         System.out.println("move disk " + n + " from " + sour + " to " + dest);
//         towerOfHanoi(n-1, helper, sour, dest);
//     }
//     public static void main(String[] args) {
//         int n = 3;
//         towerOfHanoi(n, "S", "H", "D");
//     }
// }





//  print a string in reverse "abcd"


// public class ds13_recursion_question{
//     public static void printRev(String s){
//         for(int i = s.length()-1; i >= 0; i--){
//             System.out.print(s.charAt(i));
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         String s = "abcd";
//         printRev(s);
//     }
// }





//  find the 1st & last occurance of an element in String


// public class ds13_recursion_question {
//     public static void element(String s, char ch) {
//         int firstIndex = s.indexOf(ch);
//         int lastIndex = s.lastIndexOf(ch);

//         if (firstIndex == -1) {
//             System.out.println("Character '" + ch + "' not found in the string.");
//         } else {
//             System.out.println("First occurrence of '" + ch + "' is at index: " + firstIndex);
//             System.out.println("Last occurrence of '" + ch + "' is at index: " + lastIndex);
//         }
//     }
//     public static void main(String[] args) {
//         String s = "abaacdaefaah";
//         char ch = 'a'; 
//         element(s, ch);
//     }
// }





//  check if an array is sorted(strictly increasing)


// public class ds13_recursion_question{
//     public static boolean isCorrrect(int []arr){
//         if(arr.length <= 1){
//             return true;
//         }
        
//         for(int i=0; i<arr.length-1; i++){
//             if(arr[i] >= arr[i+1]){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         int [] arr = {1, 2, 3, 4, 5};
//         boolean result =  isCorrrect(arr);
//         System.out.println("array is strictly increasing: " + result);
//     }
// }




//  move all 'x' to the end of the string "axbcxxd"

// public class ds13_recursion_question {
//     public static String move(String s){
//         StringBuilder result = new StringBuilder();

//         int xCount = 0;

//         for(char c : s.toCharArray()){
//             if(c == 'x'){
//                 xCount++;
//             }
//             else{
//                 result.append(c);
//             }
//         }
//         for(int i=0; i<xCount; i++){
//             result.append('x');
//         }
//         return result.toString();
//     }
//     public static void main(String[] args) {
//         String s = "axbcxxd";
//         String result = move(s);
//         System.out.println("Modified string " + result);
//     }
// }




//  remove duplicates in a string "abbccda"

public class ds13_recursion_question{
    public static void main(String[] args) {
        
    }
}
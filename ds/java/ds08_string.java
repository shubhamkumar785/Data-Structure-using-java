
public class ds08_string {
    public static void main(String[] args) {
        // String name = "Shubham";
        // String fullName = "Shubham Kumar";

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("your name is " + name);

        

        //  functions-

        //  Concatenation
        // String firstName = "Shubham";
        // String lastName = "Pathak";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);


        // // length of String
        // System.out.println(fullName.length());


        // // charAt
        // for(int i=0; i<fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }


        //  compare
        // String name1 = "Shubham";
        // String name2 = "Shubham";

        // if(name1.compareTo(name2) == 0){
        //     System.out.println("String are equal");
        // }
        // else{
        //     System.out.println("String are not equal");
        // }



    //    substring
    //    String sentence = "My Name is Shubham";
    //    String name = sentence.substring(11, sentence.length());
    //    System.out.println(name);



















    //  String builder
    // StringBuilder sb = new StringBuilder("Shubham");
    // System.out.println(sb);
 

    //  char at index
    // System.out.println(sb.charAt(0));


    // set char at index
    // sb.setCharAt(0, 'X');
    // System.out.println(sb);


    //  insert at index 
    // sb.insert(0, 'a');
    // System.out.println(sb);


    //  delete at index
    // sb.delete(0,1);
    // System.out.println(sb);


    //  append 
    // sb.append("m");
    // sb.append("x");
    // System.out.println(sb);




        StringBuilder sb = new StringBuilder("hello");

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
    }

}
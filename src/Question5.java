import sun.jvm.hotspot.utilities.ReversePtrs;

public class Question5 {
    public static void main(String[] args) {
        // Write Java program to reverse String?
        //Reverse a string word by word?

        /*Reverse String:
        using Reverse function : StringBuffer
          */

        String word="Hello Techtorial";


        StringBuffer sb = new StringBuffer(word);
        System.out.println(sb.reverse());

        /* Using Reverse Function: StringBuilder
         */
        String word1 =" Hello Techtorial";

        StringBuilder sbu = new StringBuilder(word1);
        System.out.println(sbu.reverse());


        //Without using Reverse Function

        String toReverse = "Hello Monkey";
         // 1 way using charAt();

        String reversed="";
        for(int i = toReverse.length()-1; i>=0; i--) {
            reversed = reversed + toReverse.charAt(i);
        }
        System.out.println("Reversed String is "+reversed);

        // 2 way using to charArray();

        String reversed1="";
        char[] array = toReverse.toCharArray();
        for (int i=array.length-1; i>=0; i--){
            reversed1+=array[i];
        }
        System.out.println("Reversed String is: "+reversed1);

        // 3 way using Substring();

        String reversed2="";
        for(int i = toReverse.length(); i>=1; i--){
            reversed2+=toReverse.substring(i-1, i);
        }
        System.out.println("Reversed String is: "+reversed2);


        //4 way using Java Recursion

       /* public static String reverseString(String str){
            if(str.isEmpty());
            return str;
            //Calling Function Recursively
            return reverseString(str.substring(1)) + str.charAt(0);
        }

        */
        }
    }


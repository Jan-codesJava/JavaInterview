public class Reverse {

    public static void main(String[] args) {

        //Reverse a string word by word

       /* String str = "I love java";
        String reversed = "";
        String[]array = str.split(" ");

        for(int i = array.length - 1; i>=0; i--){
            reversed = reversed + array[i]+" ";
        }
        System.out.println(reversed);  //output: java love I


        */

        //reverse each word in the sentence

        String str = "I love java";
        String reversed ="";
        String[] array = str.split(" ");
        for (int i =0; i<array.length; i++){
            String word="";
            for(int j = array[i].length()-1; j>=0; j--){
                word+=array[i].charAt(j);
            }
            reversed = reversed + word+ " ";
        }
        System.out.println(reversed);  //I evol avaj
    }
}

public class Question4 {
    public static void main(String[] args) {
        //What is return type of split() method?

        //Return type of split() method is String array.
        // We can use for loop or foreach loop to print the values from the array

        String techtorial = "Techtorial interview preparation document.";

        String[] words = techtorial.split(" "); //will split the string with the spaces
        System.out.println(words.length);

        for (String string: words){
            System.out.println(string);
        }
    }
}

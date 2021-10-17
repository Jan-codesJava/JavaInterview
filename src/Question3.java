public class Question3 {
    public static void main(String[] args) {
        //How many alpha characters present in a string?

        String given = "ertwsFADSF::IJ67585498testtest9876544674fhjvg*&(&*^&(&*^)5%^";

        String replaced = given.replaceAll("[^A-Za-z]", "");
        System.out.println(replaced.length());
        //replaceAll method takes the regex as a parameter. Once we use the egex A-Z or a-z finds all the alphabetical characters in the String
        //'^' symbol means 'not'


        // [^A-Za-z] replace all the non alphabetical characters with empty space ""
    }
}

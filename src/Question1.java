public class Question1 {
    public static void main(String[] args) {

        //swap numbers
        int a = 5;
        int b = 10;
        a=a+b; //a=5+10=15
        b=a-b;// b = 15-10=5
        a=a-b; //a=15-5=10
        System.out.println(a);
        System.out.println(b);

        //swap strings
        String x = "Hello";
        String y = "Techtorial";
        x=x+y; //HelloWelcome
        y=x.substring(0,(x).length()-y.length());
        x=x.substring(y.length());
        System.out.println(x);
        System.out.println(y);
    }
}

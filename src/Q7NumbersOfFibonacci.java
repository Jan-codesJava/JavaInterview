public class Q7NumbersOfFibonacci {
    public static void main(String[] args) {

        // write a Java Program to print the first 10 numbers of Fibonacci series

        int a= 0, b=1, c;
        for (int i =0; i <10; i++) {

            System.out.println(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        }
    }


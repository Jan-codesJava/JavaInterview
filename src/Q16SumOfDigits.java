public class Q16SumOfDigits {
    public static void main(String[] args) {

        int number = 4577;
        int originalNum = number;
        int sum = 0;
        //4577 - 457- 45 - 4 -0
        while (number>0){
            sum = sum+(number%10);
            number= number/10;
        }
        System.out.println("The sum of "+originalNum+" is equal to "+sum);
    }
}
//The sum of4577 is equal to 23
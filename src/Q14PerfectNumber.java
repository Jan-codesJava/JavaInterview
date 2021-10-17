public class Q14PerfectNumber {
    public static void main(String[] args) {

        //how to find the perfect number?

        /*
        Perfect number , a positive integer that is equal to the sum of its proper divisors.
        The smallest perfect number is 6, which is the sum of 1,2 & 3.
        Other perfect numbers are 28, 496.
         */

     /*   static boolean isPerfect(int n){
            //to store sum of divisors
            int sum =1;
            //find all divisors and add them
            for (int i = 2; i*i<=n; i++)
            {
                if(n% i==0)
                {
                    if(i*i!=n)
                        sum = sum + i +n/i;
                    else
                        sum = sum+i;
                }
            }
            //if sum of divisors is equal to
            //n, then n is a perfect number

            if( sum == n & n !=1){
                return true};


            }
        }//return false;

      */
    }
}

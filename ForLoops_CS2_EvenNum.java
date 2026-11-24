public class ForLoops_CS2_EvenNum {
    public static void main(String[] args) {
        int i;
        int sum = 0;
        int count = 0;

        for(i = 0; i <= 20; i++) {
            if ( i % 2 == 0) {
                if(i != 0 && i != 20) {
                    sum += i;
                    count++;
                }
            }
        }
        
        int average = sum/count;
        
        int factorial = average;
        for(i = 1; i <= factorial; i++) {
            factorial *= i;
        }        


        System.out.println(sum);
        System.out.println(average);
        System.out.println(factorial);
    }
}

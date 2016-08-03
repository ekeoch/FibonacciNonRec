/**
 * Created by Ekeocha on 8/3/2016.
 */
public class FibonacciNonRecursive {
    public static int getFibonacci(int n){
        if(n <= 1){
            return n;
        }
        int current = 1;
        int prev = 1;
        for(int i = 1; i < n; i++){
            int tmp = current;
            current += prev; //fibonacci series == current + previous value in sequence
            prev = tmp; //update prev
        }
        return current;
    }

    public static void main(String[] args) {
        //Test
        System.out.println(FibonacciNonRecursive.getFibonacci(5));
    }
}

import java.util.*;
public class Main {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        double sum = 0;
        for (int i = 0; i<k+1; i++){
            sum+=n*Math.pow(10,i);
        }
        System.out.println((int)sum);
    }
}

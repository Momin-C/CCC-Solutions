import java.util.*;
public class Main {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int S = input.nextInt();
        int M = input.nextInt();
        int L = input.nextInt();
        if (S+M*2+L*3 >= 10){
            System.out.println("happy");
        }
        else {
            System.out.println("sad");
        }
    }
}

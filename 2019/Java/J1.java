import java.util.*;
public class Main {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int A3 = input.nextInt();
        int A2 = input.nextInt();
        int A1 = input.nextInt();

        int B3 = input.nextInt();
        int B2 = input.nextInt();
        int B1 = input.nextInt();
        if (A3*3 + A2*2 + A1 > B3*3 + B2*2 + B1){
            System.out.println("A");
        }
        else if (A3*3 + A2*2 + A1 == B3*3 + B2*2 + B1) {
            System.out.println("T");
        }
        else{
            System.out.println("B");
        }
    }
}

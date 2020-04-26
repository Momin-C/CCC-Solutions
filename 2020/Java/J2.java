import java.util.*;
public class J2 {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int P = input.nextInt();
        int N = input.nextInt();
        int R = input.nextInt();
        int D = 0;
        for (int i=0; i<=P; D++) {
            i+= N*Math.pow(R,D);
        }
        System.out.println(D-1);
    }
}

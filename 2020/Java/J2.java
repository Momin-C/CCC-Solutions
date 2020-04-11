import java.util.*;
public class J2 {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int P = input.nextInt(); //Max number of infected
        int N = input.nextInt(); //Num of people infected on day 0
        int R = input.nextInt(); //Rate of infection
        int D = 0;
        for (int i=0; i<P;) {
            i+= N*Math.pow(R,D);
            D+=1;
        }
        System.out.println(D-1);
    }
}

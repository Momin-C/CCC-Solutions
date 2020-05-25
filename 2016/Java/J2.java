import java.util.*;
public class Main {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n1, n2, n3, n4;
        int totals [] = new int [4];
        int sumC1 = 0;
        int sumC2 = 0;
        int sumC3 = 0;
        int sumC4 = 0;
        int total = 0;
        for (int i = 0; i<4; i++){
            n1 = input.nextInt();
            n2 = input.nextInt();
            n3 = input.nextInt();
            n4 = input.nextInt();
            totals[i] = (n1+n2+n3+n4);
            sumC1+=n1;
            sumC2+=n2;
            sumC3+=n3;
            sumC4+=n4;
        }
        if (sumC1 == sumC2 && sumC1 == sumC3 && sumC1 == sumC4 && sumC1 == totals[0] && sumC1 == totals[1] && sumC1 == totals[2] && sumC1 == totals[3]){
            System.out.println("magic");
        }
        else {
            System.out.println("not magic");
        }
    }
}

import java.util.*;
public class Main {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        char scores [] = new char [6];
        int wCount = 0;
        for (int i = 0; i<6; i++){
            scores[i] = input.next().charAt(0);
            if (scores[i] == 'W'){
                wCount++;
            }
        }
        if (wCount == 6 || wCount == 5){
            System.out.println(1);
        }
        else if (wCount == 4 || wCount == 3){
            System.out.println(2);
        }
        else if (wCount == 2 || wCount == 1){
            System.out.println(3);
        }
        else{
            System.out.println(-1);
        }
    }
}

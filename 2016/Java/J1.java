import java.util.*;
public class Main {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int wCount = 0;
        for (int i = 0; i<6; i++){
            char game = input.next().charAt(0);
            if (game == 'W'){
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

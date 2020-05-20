import java.util.*;
public class Main {
	public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int D = input.nextInt();
        int patterns = 0;
        if (D > 1440){
            int times = D/1440;
            D-= 1440*times;
            patterns+= 62*times;
        }
        int [] time = {1,2,0,0};
        for (int i = 0; i<D; i++){
            if (time[0] == 1 && time[1] == 2 && time[2] == 5 && time[3] == 9){
                time[0] = 0;
                time[1] = 1;
                time[2] = 0;
                time[3] = 0;
            }
            else if (time[0] == 0 && time[1] == 9 && time[2] == 5 && time[3] == 9){
                time[0] = 1;
                time[1] = 0;
                time[2] = 0;
                time[3] = 0;
            }
            else if (time[2] == 5 && time[3] == 9){
                time[1] +=1;
                time[2] = 0;
                time[3] = 0;
            }
            else if (time[3] == 9){
                time[2] +=1;
                time[3] = 0;
            }
            else{
                time[3]+=1;
            }
            if (time[0] == 0){
                if ((time[1] - time[2]) == (time[2] - time[3])){
                    patterns++;
                }
            }
            else {
                if ((time[0] - time[1]) == (time[1] - time[2]) && (time[1] - time[2]) == (time[2] - time[3])){

                    patterns++;
                }
            }
        }
        System.out.println(patterns);
    }
}

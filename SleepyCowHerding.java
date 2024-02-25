import java.util.Scanner;
import java.util.Arrays;
public class SleepyCowHerding {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] positions = new int[3];
        positions[0] = sc.nextInt();
        positions[1] = sc.nextInt();
        positions[2] = sc.nextInt();
        Arrays.sort(positions);
        int min=0;
        int max=0;
        //comment

        if(positions[2]-positions[1] == 2 || positions[1]- positions[0] == 2){
            min = 1;
        }
        else if(positions[2]-positions[1] == 1 && positions[1]-positions[0] == 1){
            min = 0;
        }else{
            min = 2;
        }
        
        if(positions[2]-positions[1]<=positions[1]-positions[0]){
             while(positions[2]-positions[1] != 1 || positions[1]-positions[0] !=1){
                positions[2] = positions[1];
                positions[1] = positions[1]-1;
                max++;
             }
        } else{
            while(positions[2]-positions[1] != 1 || positions[1]-positions[0] !=1){
                positions[0] = positions[1];
                positions[1] = positions[1]+1;
                max++;
             }
        }
        System.out.println(min);
        System.out.println(max);
        sc.close();

    }
}

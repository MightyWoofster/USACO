import java.util.Scanner;
public class SpeedingTicket {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] limit = new int[100];
        int[] speed = new int[100];
        int n = sc.nextInt();
        int m = sc.nextInt();
        int nCount = 0;
        int mCount = 0;
        for(int i = 0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int a = 0; a<x; a++){
                limit[nCount] = y;
                nCount++;
            }
        }
        for(int i = 0; i<m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int a = 0; a<x; a++){
                speed[mCount] = y;
                mCount++;
            }
        }
        int speeding = 0;
        for(int i = 0; i<100; i++){
            if(speed[i]>limit[i]){
                speeding = Math.max(speeding, speed[i]-limit[i]);
            }
        }
        System.out.println(speeding);
        sc.close();
    }
}

import java.util.Scanner;
import java.util.Arrays;
public class AngryCows {
    static int n;
    static int[] bales;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        bales = new int[n];
        int ans = 0;
        for(int i = 0; i<n; i++){
            bales[i] = sc.nextInt();
        }
        Arrays.sort(bales);
        for(int i = 0; i<n; i++){
            ans = Math.max(ans, explodedNum(i, -1) + explodedNum(i, 1) + 1);
        }
        System.out.println(ans);
        sc.close();

    }
    public static int explodedNum(int start, int direction){
        int radius = 1;
        int prev = start;
        while(true){
            int next = prev;
            while(next+direction>=0 && next+direction<n && Math.abs(bales[next+direction]-bales[prev])<=radius){
                next+=direction;
            }
            if(next == prev){
                break;
            }
            prev=next;
            radius++;
        }
        return Math.abs(prev-start);
    }
    
}

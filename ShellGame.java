import java.util.Scanner;
public class ShellGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numSwaps = sc.nextInt();
        int a;
        int b;
        int g;
        int[] shells = {0, 1, 2};
        int[] count = new int[3];
        for(int i = 0; i<numSwaps; i++){
            a = sc.nextInt()-1;
            b = sc.nextInt()-1;
            g = sc.nextInt()-1;
            int temp = shells[a];
            shells[a] = shells[b];
            shells[b] = temp;
            count[shells[g]]++;
        }
        System.out.println(Math.max(count[2], Math.max(count[0], count[1])));
           
        sc.close();
    }

}
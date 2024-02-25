import java.util.Scanner;
public class SleepyCowSorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] order = new int[n];
        for(int i = 0; i<n; i++){
            order[i] = sc.nextInt();
        }
        int a = 0;
        for(int i = 0; i<n-1; i++){
            if(order[i]<order[i+1]){
                a++;
            }
        }
        if(a == n-1){
            System.out.print(0);
        }
        else{
        int x = n-1;
        while(order[x] > order[x-1]){
            x--;
        }
        System.out.println(x);
        }
        sc.close();

    }
    
}

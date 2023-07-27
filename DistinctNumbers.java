import java.util.HashSet;
import java.util.Scanner;
public class DistinctNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> distinct = new HashSet<Integer>();
        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            distinct.add(sc.nextInt());
        }
        System.out.println(distinct.size());
        sc.close();


    }
}

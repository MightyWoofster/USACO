import java.util.Scanner;
public class PromotionCounting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] before = new int[4];
        int[] after = new int[4];
        int toSilver;
        int toGold;
        int toPlatinum;
        for(int i = 0; i<4; i++){
            before[i] = sc.nextInt();
            after[i] = sc.nextInt();
        }
        toPlatinum = after[3]-before[3];
        before[2] -= toPlatinum;
        toGold = after[2]-before[2];
        before[1] -= toGold;
        toSilver = after[1]-before[1];
        System.out.println(toSilver);
        System.out.println(toGold);
        System.out.println(toPlatinum);
        sc.close();

    }
}

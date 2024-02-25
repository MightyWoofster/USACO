import java.util.Scanner;
public class MixingMilk{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int m1 = sc.nextInt();
        int c2 = sc.nextInt();
        int m2 = sc.nextInt();
        int c3 = sc.nextInt();
        int m3 = sc.nextInt();
        int x;
        int y; 
        int z;
        for(int i = 0; i<3; i++){
            x = Math.min(m1, c2-m2);
            m1-=x;
            m2+=x;
            y = Math.min(m2, c3-m3);
            m2-=y;
            m3+=y;
            z = Math.min(m3, c1-m1);
            m3-=z;
            m1+=z;
        }
        x = Math.min(m1, c2-m2);
        m1-=x;
        m2+=x;
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        sc.close();

    }
}
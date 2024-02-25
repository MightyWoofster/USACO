import java.util.Scanner;
public class SquarePasture{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        int width1 = Math.min(x1, x3);
        int width2 = Math.max(x2, x4);
        int width = width2-width1;
        int length1 = Math.min(y1, y3);
        int length2 = Math.max(y2, y4);
        int length = length2-length1;
        int side = Math.max(width, length);
        System.out.println(side*side);
        sc.close();
    }
}
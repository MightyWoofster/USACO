import java.util.Scanner;
public class BlockedBillboardII{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        int width = 0;
        int height = 0;
        if((y1<y3 || y2>y4) || (x1<x3 && x2>x4)){
            width = x2-x1;
        } else{
            if(x1<x3){
                width = x3-x1;
            }else if(x2>x4){
                width = x2-x4;
            }
        }

        if((x1<x3 || x2>x4) || (y1<y3 && y2>y4)){
            height = y2-y1;
        } else{
            if(y1<y3){
                height = y3-y1;
            } else if(y2>y4){
                width = y2-y4;
            }
        }
        System.out.println(width*height);
        sc.close();
    }
}

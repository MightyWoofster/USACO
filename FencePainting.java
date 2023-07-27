import java.util.Scanner;
public class FencePainting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int jStart = sc.nextInt();
        int jEnd = sc.nextInt();
        int bStart = sc.nextInt();
        int bEnd = sc.nextInt();
        if(bStart>jStart && bStart<jEnd || bEnd>jStart && bEnd<jEnd || jStart>bStart && jStart<bEnd || jEnd>bStart && jEnd<bEnd){
            if(bStart>jStart && bEnd<jEnd){
                System.out.print(jEnd-jStart);
            } else if(jStart>bStart && jEnd<bEnd) {
                System.out.println(bEnd-bStart);
            } else{
                System.out.println(Math.max(jEnd, bEnd) - Math.min(jStart, bStart));
            }
        } else{
            System.out.println((bEnd-bStart) + (jEnd-jStart));
        }
        sc.close();


    }

}
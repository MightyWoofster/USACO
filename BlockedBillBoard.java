import java.util.Scanner;;
public class BlockedBillBoard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int blx1 = sc.nextInt();
        int bly1 = sc.nextInt();
        int trx1 = sc.nextInt();
        int try1 = sc.nextInt();
        int blx2 = sc.nextInt();
        int bly2 = sc.nextInt();
        int trx2 = sc.nextInt();
        int try2 = sc.nextInt();
        int truckblx = sc.nextInt();
        int truckbly = sc.nextInt();
        int trucktrx = sc.nextInt();
        int trucktry= sc.nextInt();
        int area1 = (trx1-blx1) * (try1-bly1);
        int area2 = (trx2-blx2) * (try2-bly2);

        if (trucktrx<=blx1 || truckblx>=trx2 || trucktry <= Math.min(bly1, bly2) || truckbly >= Math.max(try1, try2)){
            System.out.println(area1 + area2);

        }
        else if(trx1<=truckblx || try1<=truckbly || bly1 >= trucktry){
            if(trucktrx<=blx2 || trucktry<=bly2 || truckbly>=try2){
                System.out.println(area1 + area2);
            }else{
                int x = (Math.min(trucktrx, trx2) - Math.max(truckblx, blx2)) * (Math.min(try2, trucktry) - Math.max(truckbly, bly2));
                System.out.println(area1 + (area2 -x));
            }
        }else{
            int z = (Math.min(trucktrx, trx1) - Math.max(truckblx, blx1)) * (Math.min(try1, trucktry) - Math.max(truckbly, bly1));
            if(trucktrx<= blx2 || bly2>=trucktry || try2<=truckbly){
                System.out.println((area1 - z) + area2);
            } else{
                int y = (Math.min(trucktrx, trx2) - Math.max(truckblx, blx2)) * (Math.min(try2, trucktry) - Math.max(truckbly, bly2));
                System.out.println((area1-z) + (area2-y));
            }
        
        }
        sc.close();
    }
    
}

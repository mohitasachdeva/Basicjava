package Basic.java;
import java.util.Scanner;
public class FlipCoin {
    public static void main(String[] args) {
        int head=0;
        int tail=0;
        int count=1;
        double random=0.0;
        System.out.println("Please enter the number : ");
        Scanner n=new Scanner(System.in);
        int flips=n.nextInt();
        while(count <= flips){
            random=Math.random();
            System.out.println(count+" "+random);
            if (random<0.5){
                head++;
                System.out.println(+head);
            }
            else{
                tail++;
                System.out.println(+tail);
            }
            count++;
        }
        System.out.println();
        System.out.println("number of heads" +head);
        System.out.println("number of tails" +tail);

        double headpercent=(double)head/flips*100;
        double tailpercent=(double)tail/flips*100;
        System.out.println("Percentage of head-->" +headpercent);
        System.out.println("Percentage of tail-->" +tailpercent);
    }

}


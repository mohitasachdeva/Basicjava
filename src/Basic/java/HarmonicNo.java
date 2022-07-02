package Basic.java;

public class HarmonicNo {
    public static void main(String[]args){
        int num=2;
        double result=0.0;
        for(int i=num; i>0; i--)
        {
            result=result+(double)1/num;
            System.out.println("result-->" +result);

        }
    }
}

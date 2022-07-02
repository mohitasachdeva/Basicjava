package Basic.java;

public class AlphaBet
{
    public static void main(String[] args)
    {


        char ch = 'a';
        if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i') {
            System.out.println("Alphabet is vowel->" + ch);
        } else {
            System.out.println("alphabet is not vowel->" + ch);
        }
    }
}

import java.math.BigInteger;

public class BigNumberApp {

    public static void main(String[] args) {
        
        BigInteger a = new  BigInteger("10000000000000000000");// 10000000000000000000L;

        BigInteger b = new  BigInteger("10000000000000000000");// 10000000000000000000L;

        BigInteger c = a.add(b);
        System.out.println(c);
        
        BigInteger d = a.multiply(b);
        System.out.println(d);
        
        BigInteger e = a.subtract(b);
        System.out.println(e);
        
        BigInteger f = a.divide(b);
        System.out.println(f);
        
        BigInteger g = a.max(b);
        System.out.println(g);
        
        BigInteger h = a.min(b);
        System.out.println(h);
        
        BigInteger i = a.pow(2);
        System.out.println(i);
    }

}

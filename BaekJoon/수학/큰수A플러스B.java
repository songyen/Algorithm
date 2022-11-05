package 수학;

import java.math.BigInteger;
import java.util.Scanner;

public class 큰수A플러스B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = new BigInteger(sc.next());
        BigInteger b = new BigInteger(sc.next());
        a = a.add(b);
        System.out.println(a);
    }
}

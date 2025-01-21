package day06;

import java.util.Random;

public class RandomEX {
    public static void main(String[] args) {
        Random random = new Random();

        int n1 = random.nextInt(4); //0~3
        for(int i = 1; i < 4; i++){
            System.out.println(n1);
        }

        long l = random.nextLong();
        float f = random.nextFloat();
        double d = random.nextDouble();
        boolean b = random.nextBoolean();

        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(b);

        //Math.random() 의 범위는 0.0 ~ 1.0 사이의 난수가 1개 발생한다.

        int n2 = random.nextInt(101); //0 ~100

        int n3 = random.nextInt(11); // 0 ~10
        System.out.println(n3);

        int n4 = (int) (Math.random() * 45) +1 ; // 0 ~ 44 까지



    }
}

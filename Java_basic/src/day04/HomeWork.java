package day04;

public class HomeWork {
    public static void main(String[] args) {
        First();
        Second();
        Third();
        Fourth();
        Fifth();
        Sixth();
        Seventh();
    }

    public static void First(){
        int x = 10;
        int y = 20;
        int z = (++x) + (y--);
        System.out.println(z);
    }

    public static void Second(){
        int score = 85;
        String result = (!(score>90)) ? "가":"나";
        System.out.println(result);
    }

    public static void Third(){
        int pencils = 534;
        int students = 30;

        int pencilsPerStudent = (pencils/students);
        System.out.println(pencilsPerStudent);

        int pencilsLeft = (pencils % students);
        System.out.println(pencilsLeft);

    }

    public static void Fourth(){
        int value = 356;
        int convertValue = (value/100) * 100;
        System.out.println(convertValue);
    }

    public static void Fifth(){
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area = ((double)(lengthTop + lengthBottom) * height/2);
        System.out.println(area);
    }

    public static void Sixth(){
        int x = 10;
        int y = 5;
        System.out.println((x>7) && (y<=5));
        System.out.println((x%3 == 2) || (y%2 != 1));
    }

    public static void Seventh(){
        double x = 5.0;
        double y = 0.0;
        double z = 5 % y;
        if(Double.isNaN(z)){  //????
            System.out.println("0.0으로 나눌 수 없습니다.");
        } else{
            double result = z + 10;
            System.out.println("결과: " + result);
        }
    }
}

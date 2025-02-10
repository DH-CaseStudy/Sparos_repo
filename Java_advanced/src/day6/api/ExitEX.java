package day6.api;

public class ExitEX {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println(i + " ");
            if(i == 8){
                System.exit(0);
            }
        }
    }
}

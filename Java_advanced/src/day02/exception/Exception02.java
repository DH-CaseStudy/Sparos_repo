package day02.exception;

public class Exception02 {
    public static void main(String[] args) {
        String[] stringarray = {"100", "1oo"};

        for(int i = 0; i < stringarray.length + 1; i++){
            try {
                int value = Integer.parseInt(stringarray[i]);
                System.out.println(value);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e){
                System.out.println("Error : " +e.getMessage());
            }
        }

    }
}

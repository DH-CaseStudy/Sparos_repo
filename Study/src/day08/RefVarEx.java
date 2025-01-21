package day08;

class Phone{
    String bander;

}

public class RefVarEx {
    public static void main(String[] args) {
//        int[] array1;
//
//        array1 = new int[] {1,2,3};
//
//        for(int i = 0; i < array1.length; i++){
//            System.out.println(array1[i]);
//        }
//
//        for(int i : array1){ //향상된 for문
//            System.out.println(i);
//        }

        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = phone2;

        System.out.println(phone1 == phone2);
        System.out.println(phone1 == phone3);
        System.out.println(phone2 == phone3); //phone2과 주소가 같다

        int[] intArray = null;
        if(intArray != null){
            intArray[0] = 5;
        }
    }
}

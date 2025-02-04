package day02.resourceEx;

public class TryWithResourceEx {
    public static void main(String[] args) {
        try(MyResource myResource = new MyResource("A")){
            String data = myResource.read1();
            int value =Integer.parseInt(myResource.read1()); //닫기가 일어나게되는 시점
        }catch (Exception e){
            System.out.println("예외 처리 : " + e.getMessage());
        }

        System.out.println();

        try(MyResource myResource = new MyResource("A")){
            String data = myResource.read2();
            int value =Integer.parseInt(myResource.read2()); //닫기가 일어나게되는 시점
        }catch (Exception e){
            System.out.println("예외 처리 : " + e.getMessage());
        }

        System.out.println();

        MyResource resource1 = new MyResource("A");
        MyResource resource2 = new MyResource("B");

        try(resource1; resource2){
            String data1 = resource1.read1();
            int data2 = Integer.parseInt(resource2.read2());
        } catch (Exception e) {
            System.out.println("try with resources : " + e.getMessage());
        }

    }
}

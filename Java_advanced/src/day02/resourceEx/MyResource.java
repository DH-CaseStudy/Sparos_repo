package day02.resourceEx;

public class MyResource implements AutoCloseable{
    private String name;

    public MyResource(String name) {
        this.name = name;
        System.out.println("[myResource]n(" + name + ") 열기" );
    }

    public String read1(){
        System.out.println("[myResource]n(" + name + ") 읽기" );
        return "200";
    }

    public String read2(){
        System.out.println("[myResource]n(" + name + ") 읽기" );
        return "ABC";
    }

    @Override
    public void close() throws Exception {
        System.out.println("[myResource]n(" + name + ") 닫기" );
    }
}

package day9.lambda.ex02;

public class Person {
    private String name;
    private String job;
    private String contents;
    private String title;

    public void action1(Workable workable) {
        workable.work(name, job);
    }

    public void action2(Speakable speakable) {
        speakable.speak(contents);
    }

    public void action3(Singable singable) {
        singable.sing(title);
    }

    public Person(String name, String job, String contents, String title) {
        this.name = name;
        this.job = job;
        this.contents = contents;
        this.title = title;
    }

    public static void main(String[] args) {
        Person person = new Person("황가람", "가수", "저는 오랜 무명생활로 고생을 했답니다. 여러분 저를 사랑해주셔서 감사합니다.", "반딧불");

        person.action1((name, job) -> {
            System.out.println(name + "은 " + job + "입니다.");
        });

        person.action2((contents) -> {
            System.out.println("\"" + contents + "\"" + " 말합니다.");
        });

        person.action3((title) -> {
            System.out.println("\"" + title + "\"" + " 노래를 부릅니다.");
        });

        Person person2 = new Person("조수미", "오페라가수", "저를 오랫동안 사랑해주셔서 감사합니다", "밤의 아리아");

        person2.action1((name, job) -> {
            System.out.println(name + "은 " + job + "입니다.");
        });

        person2.action2((contents) -> {
            System.out.println("\"" + contents + "\"" + " 말합니다");
        });

        person2.action3((title) -> {
            System.out.println("\"" + title + "\"" + " 노래를 부릅니다.");
        });
    }
}

//홍길동 씨가 프로그래밍을 합니다
//"프로그래밍은 정말 재미있어" 라고 말합니다.

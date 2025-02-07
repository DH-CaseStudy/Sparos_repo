package day05.innerClass.ex06.builderpattern;

public class Hamburger {
    private String bun;
    private String patty;
    private String beverage;

    private boolean cheese;
    private boolean lettuce;
    private boolean tomato;
    private boolean bacon;

    public Hamburger(BurgerBuilder builder) {
        this.bun = builder.bun;
        this.patty = builder.patty;
        this.beverage = builder.beverage;
        this.cheese = builder.cheese;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
        this.bacon = builder.bacon;
    }

    public static class BurgerBuilder{
        private String bun;
        private String patty;
        private String beverage;

        private boolean cheese = false;
        private boolean lettuce = false;
        private boolean tomato = false;
        private boolean bacon = false;
        //선택적 요소를 단계적으로 추가할 수 있도록

        public BurgerBuilder(String bun, String patty, String beverage){
            this.bun = bun;
            this.patty = patty;
            this.beverage = beverage;
        }
        //private BurgerBuilder()



        public BurgerBuilder addCheese(){
            this.cheese = true;
            return this;
        }

        public BurgerBuilder addLettuce(){
            this.lettuce = true;
            return this;
        }

        public BurgerBuilder addTomato(){
            this.tomato = true;
            return this;
        }

        public BurgerBuilder addBacon(){
            this.bacon = true;
            return this;
        }

        public Hamburger build(){
            return new Hamburger(this);//메서드체이닝 기법
        }

        //핵심 최종적으로 BurgerBuilder 객체를 반환하는 메서드를 생성

    }

    @Override
    public String toString() {
        return "Hamburger{" +
                "bun='" + bun + '\'' +
                ", patty='" + patty + '\'' +
                ", beverage='" + beverage + '\'' +
                ", cheese=" + cheese +
                ", lettuce=" + lettuce +
                ", tomato=" + tomato +
                ", bacon=" + bacon +
                '}';
    }
}

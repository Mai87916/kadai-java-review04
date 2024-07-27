package animal;

public class Review04 {

    public static void main(String[] args) {
        Human tanaka = new Human();

        tanaka.setName("田中 太郎");
        tanaka.setAge("25");
        tanaka.setShumi("電車");
        tanaka.say();
        tanaka.think();

        Human suzuki = new Human();
        suzuki.setName("鈴木 次郎");
        suzuki.setAge("30");
        suzuki.setShumi("野球");
        suzuki.say();
        suzuki.think();

        Human sato = new Human();
        sato.setName("佐藤 花子");
        sato.setAge("20");
        sato.setShumi("映画");
        sato.say();
        sato.think();
    }



}

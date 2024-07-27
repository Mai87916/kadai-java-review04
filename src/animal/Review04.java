package animal;

public class Review04 {

    public static void main(String[] args) {
        Animal tanaka = new Animal("田中 太郎", "25");
        Human tanaka01 = new Human("田中 太郎", "25", "電車");
        tanaka.say();
        tanaka01.think();

        Animal suzuki = new Animal("鈴木 次郎", "30");
        Human suzuki01 = new Human("鈴木 次郎", "30", "野球");
        suzuki.say();
        suzuki01.think();

        Animal sato = new Animal("佐藤 花子", "20");
        Human sato01 = new Human("佐藤 花子", "20", "映画");
        sato.say();
        sato01.think();




    }



}

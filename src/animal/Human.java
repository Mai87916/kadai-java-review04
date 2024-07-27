package animal;

public class Human extends Animal implements Thinkable{

    private String shumi;

    public String getShumi() {
        return shumi;
    }

    public void setShumi(String shumi) {
        this.shumi = shumi;
    }

    public Human() {

    }

    public Human(String name, String age, String shumi) {

    }

    @Override
    public void think() {
        System.out.println("私は" + shumi + "について考えています。");
    }


}

package animal;

public class Animal {

    private String name;     // 名前
    private String age;     // 年齢


    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Animal(String name, String age) {
        this.name = name;
        this.age = age;

}

    public void say() {
        System.out.println(name + "です。" + age + "歳です。");
    }






}
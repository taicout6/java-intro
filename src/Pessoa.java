public class Pessoa {
    private String name;

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        this.setName("Tainá");
        return this.name;
    }

    public int getAge() {
        this.setAge(27);
        return this.age;
    }
}

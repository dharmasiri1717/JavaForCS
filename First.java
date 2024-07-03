/**
     * First
 */
public class First {
    int age = 20;
    String name = "Amaya";

    public First(){}

    public First(int age, String name){
        this.age = age;
        this.name = name;
    }

    public First(String name){
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName(){
        return name;
    }
    public static void main(String[] args) {
        First person1 = new First(23, "Franklin");
        First person2 = new First();
        First person3 = new First("Elolu");

        System.out.println("parameterized "+person1.getAge());
        System.out.println("default "+person2.getAge());
        System.out.println("one parameter: "+person3.getAge());
        System.out.println("one parameter: "+person3.getName());
    }
}
public class Person {
    private String name;

    private Integer age;

    private boolean married;


    public String detailsPerson(){
        return "Name of the person is " + name + " his/her age is " + age + " and is married = " + married;
    }

    public Person(String name, Integer age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;


    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    }
}
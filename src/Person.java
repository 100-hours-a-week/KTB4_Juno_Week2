public class Person {
    private final String name;
    private String grade;

    Person(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    protected String getName() {
        return name;
    }

    public void showPersonInfo() {
        System.out.println("이름: " + name);
        System.out.println("학년: " + grade);
    }
}
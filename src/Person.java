public class Person {
    String name;
    String grade;

    Person(String name, String grade){
        this.name = name;
        this.grade = grade;
    }
    public void showPersonInfo(){
        System.out.println("이름: " + name);
        System.out.println("학년: " + grade);
    }
}

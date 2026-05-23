public class KarasunoMember extends Person {
    private final String school;
    private final String role;

    KarasunoMember(String name, String grade, String role) {
        super(name, grade);
        this.school = "카라스노 고교";
        this.role = role;
    }

    public void showMemberInfo() {
        System.out.println("학교: " + school);
        showPersonInfo();
        System.out.println("역할: " + role);
    }

    public void showDetail() {
        showMemberInfo();
    }
}
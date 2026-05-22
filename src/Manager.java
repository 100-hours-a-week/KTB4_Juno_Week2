public class Manager extends KarasunoMember {
    String supportSkill;

    Manager(String name, String grade, String supportSkill){
        super(name, grade, "매니저");
        this.supportSkill = supportSkill;
    }

    public void showManagerInfo(){
        showPersonInfo();
        System.out.println();
        System.out.println("지원 능력: " + supportSkill);
    }
}

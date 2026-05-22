public class Manager extends KarasunoMember {
    String supportSkill;

    Manager(String name, String grade, String supportSkill) {
        super(name, grade, "매니저");
        this.supportSkill = supportSkill;
    }

    @Override
    public void showDetail() {
        showManagerInfo();
    }

    public void showManagerInfo() {
        showMemberInfo();
        System.out.println("지원 능력: " + supportSkill);
    }
}
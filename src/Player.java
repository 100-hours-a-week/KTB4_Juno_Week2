public class Player extends KarasunoMember {
    int uniformNumber;
    String position;
    int stamina;
    int attackPower;
    int defensePower;
    String specialAbilityName;
    int specialAbilityPower;

    Player(
            String name,
            String grade,
            int uniformNumber,
            String position,
            int stamina,
            int attackPower,
            int defensePower,
            String specialAbilityName,
            int specialAbilityPower
    ){
        super(name, grade, "선수");
        this.uniformNumber = uniformNumber;
        this.position = position;
        this.stamina = stamina;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.specialAbilityName = specialAbilityName;
        this.specialAbilityPower = specialAbilityPower;

    }
    public static void showPlayerList() {
        System.out.println();
        System.out.println(">> 카라스노 고교 소속 멤버 목록을 불러옵니다.. <<");
        System.out.println();
        System.out.println("1. 사와무라 다이치 - 윙 스파이커, 캡틴");
        System.out.println("2. 스가와라 코시 - 세터");
        System.out.println("3. 니시노야 유 - 리베로");
        System.out.println("4. 다나카 류노스케 - 윙 스파이커");
        System.out.println("5. 아즈마네 아사히 - 윙 스파이커, 에이스");
        System.out.println("6. 카게야마 토비오 - 세터");
        System.out.println("7. 히나타 쇼요 - 미들 블로커, 윙 스파이커");
        System.out.println("8. 츠키시마 케이 - 미들 블로커");
        System.out.println("9. 야치 히토카 - 매니저");
        System.out.println("10. 시미즈 키요코 - 매니저");
    }

    @Override
    public void showDetail() {
        showPlayerDetail();
    }

    public void showPlayerDetail() {
        showMemberInfo();
        System.out.println("등번호: " + uniformNumber);
        System.out.println("포지션: " + position);
        System.out.println("체력: " + stamina);
        System.out.println("공격력: " + attackPower);
        System.out.println("방어력: " + defensePower);
        System.out.println(specialAbilityName + ": " + specialAbilityPower);
    }

    public int getPower(){
        return attackPower + defensePower + stamina;
    }
    public void train() {
        System.out.println(name + " 선수가 훈련을 시작합니다!");
        System.out.println();

        attackPower += 10;
        defensePower += 6;
        stamina -= 8;

        System.out.println("공격력 +10");
        System.out.println("방어력 +6");
        System.out.println("체력 -8");
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.println(name + " 선수" + "훈련 완료 ✦‿✦");
        System.out.println();
        System.out.println(name + " 선수의 공격력은 "+attackPower+", 수비력은 "+defensePower+", 체력은 "+stamina+" 입니다!");

    }
}

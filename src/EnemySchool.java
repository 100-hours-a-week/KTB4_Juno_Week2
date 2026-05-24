public enum EnemySchool {
    DATE_TECH(1, "다테 공업 고교", 1900, "Go! Go! Let's Go! Let's Go! 다테공!"),
    AOBA_JOHSAI(2, "아오바죠사이 고교", 1950, "이케 이케이케이케이케 세이죠!"),
    SHIRATORIZAWA(3, "시라토리자와 학원", 2000, "시~라토리자와! 시~라토리자와!"),
    NEKOMA(4, "네코마 고교", 2050, "이케이 이케이 네코마, 오케이 오케이 네코마!");

    private final int number;
    private final String name;
    private final int power;
    private final String cheerMessage;

    EnemySchool(int number, String name, int power, String cheerMessage) {
        this.number = number;
        this.name = name;
        this.power = power;
        this.cheerMessage = cheerMessage;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public String getCheerMessage() {
        return cheerMessage;
    }

    public static EnemySchool findByNumber(int number) {
        for (EnemySchool enemySchool : EnemySchool.values()) {
            if (enemySchool.number == number) {
                return enemySchool;
            }
        }

        return null;
    }
}
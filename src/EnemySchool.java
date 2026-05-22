public enum EnemySchool {
    DATE_TECH(1, "다테 공업 고교", 1900),
    AOBA_JOHSAI(2, "아오바죠사이 고교", 1950),
    SHIRATORIZAWA(3, "시라토리자와 학원", 2000),
    NEKOMA(4, "네코마 고교", 2050);

    private final int number;
    private final String name;
    private final int power;

    EnemySchool(int number, String name, int power) {
        this.number = number;
        this.name = name;
        this.power = power;
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

    public static EnemySchool findByNumber(int number) {
        for (EnemySchool enemySchool : EnemySchool.values()) {
            if (enemySchool.number == number) {
                return enemySchool;
            }
        }

        return null;
    }
}
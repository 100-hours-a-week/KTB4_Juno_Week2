public class CheerBoard {
    private int karasunoCheerScore;
    private int enemyCheerScore;

    public synchronized void addKarasunoCheerScore(int score) {
        karasunoCheerScore += score;
        System.out.println("카라스노 응원 점수 +" + score);
        System.out.println();
    }

    public synchronized void addEnemyCheerScore(int score, EnemySchool enemySchool) {
        enemyCheerScore += score;
        System.out.println(enemySchool.getName()+" 응원 점수 +" + score);
        System.out.println();
    }

    public synchronized int getKarasunoCheerScore() {
        return karasunoCheerScore;
    }

    public synchronized int getEnemyCheerScore() {
        return enemyCheerScore;
    }

    public void showInitialCheerScore(EnemySchool enemySchool) {
        System.out.println("=== 초기 응원 점수 ===");
        System.out.println("카라스노 응원 점수: " + getKarasunoCheerScore());
        System.out.println(enemySchool.getName() + " 응원 점수: " + getEnemyCheerScore());
        System.out.println();
    }

    public void showFinalCheerScore(EnemySchool enemySchool) {
        System.out.println("=== 응원 후 응원 점수 ===");
        System.out.println("카라스노 응원 점수: " + getKarasunoCheerScore());
        System.out.println(enemySchool.getName() + " 응원 점수: " + getEnemyCheerScore());
        System.out.println();
    }
}
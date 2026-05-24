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

    public int getKarasunoCheerScore() {
        return karasunoCheerScore;
    }

    public int getEnemyCheerScore() {
        return enemyCheerScore;
    }
}
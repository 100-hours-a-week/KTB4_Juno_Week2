public class EnemyCheerThread extends Thread {
    private static final int CHEER_COUNT = 2;
    private static final int CHEER_SCORE = 10;
    private static final int CHEER_DELAY_TIME = 700;

    private final CheerBoard cheerBoard;
    private final EnemySchool enemySchool;

    public EnemyCheerThread(CheerBoard cheerBoard, EnemySchool enemySchool) {
        this.cheerBoard = cheerBoard;
        this.enemySchool = enemySchool;
    }

    @Override
    public void run() {
        try {
            for (int count = 0; count < CHEER_COUNT; count++) {
                System.out.println(enemySchool.getName() + " 응원단: ｢" + enemySchool.getCheerMessage()+ " ｣");
                cheerBoard.addEnemyCheerScore(CHEER_SCORE, enemySchool);
                Thread.sleep(CHEER_DELAY_TIME);
            }
        } catch (InterruptedException e) {
            System.out.println(enemySchool.getName() + " 응원이 중단되었습니다 (꒦ິ⍸꒦ິ)");
            Thread.currentThread().interrupt();
        }
    }
}
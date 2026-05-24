public class KarasunoCheerThread extends Thread {
    private static final int CHEER_COUNT = 2;
    private static final int CHEER_SCORE = 10;
    private static final int CHEER_DELAY_MILLISECONDS = 700;

    private final CheerBoard cheerBoard;

    public KarasunoCheerThread(CheerBoard cheerBoard) {
        this.cheerBoard = cheerBoard;
    }

    @Override
    public void run() {
        try {
            for (int count = 0; count < CHEER_COUNT; count++) {
                System.out.println("카라스노 응원단: ｢ 이케이케 카라스노 오쎄오쎄 카라스노! ｣");
                cheerBoard.addKarasunoCheerScore(CHEER_SCORE);
                Thread.sleep(CHEER_DELAY_MILLISECONDS);
            }
        } catch (InterruptedException e) {
            System.out.println("카라스노 응원이 중단되었습니다 (꒦ິ⍸꒦ິ)");
            Thread.currentThread().interrupt();
        }
    }
}
public class CountdownThread extends Thread {
    private static final int COUNTDOWN_START_NUMBER = 3;
    private static final int COUNTDOWN_DELAY_TIME = 1000;

    @Override
    public void run() {
        try {
            System.out.println("경기 시작까지 ｢ 카운트다운 ｣을 시작합니다 !");
            System.out.println();

            for (int count = COUNTDOWN_START_NUMBER; count >= 1; count--) {
                System.out.println(count + " ...");
                Thread.sleep(COUNTDOWN_DELAY_TIME);
            }

            System.out.println();
            System.out.println("경기 시작-!!");
            System.out.println();

        } catch (InterruptedException e) {
            System.out.println("카운트다운이 중단되었습니다 (꒦ິ⍸꒦ິ)");
            Thread.currentThread().interrupt();
        }
    }
}
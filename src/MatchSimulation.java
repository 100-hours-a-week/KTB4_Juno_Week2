import java.util.Scanner;
import java.util.Map;

public class MatchSimulation {

    public static int calculateTeamPower(Map<Integer, Player> players) {
        int teamPower = 0;

        for (Player player : players.values()) {
            teamPower += player.getPower();
        }

        return teamPower;
    }

    public static void startMatch(
            Map<Integer, Player> players,
            Scanner scanner
    ) {
        System.out.println("=== 결전을 펼칠 상대 고교는? ===");

        for (EnemySchool enemySchool : EnemySchool.values()) {
            System.out.println(enemySchool.getNumber() + ". " + enemySchool.getName());
        }

        System.out.println();
        System.out.print("상대 고교 번호를 입력하세요 >> ");

        int enemyNumber = scanner.nextInt();

        EnemySchool enemySchool = EnemySchool.findByNumber(enemyNumber);

        if (enemySchool == null) {
            System.out.println("잘못된 번호입니다 (꒦ິ⍸꒦ິ)");
            return;
        }

        System.out.println();
        System.out.println("카라스노 고교 VS " + enemySchool.getName());
        System.out.println();

        Thread countdownThread = new CountdownThread();
        countdownThread.start();
        try {
            countdownThread.join();
        } catch (InterruptedException e) {
            System.out.println("경기 시작 대기 중 문제가 발생했습니다 (꒦ິ⍸꒦ິ)");
            Thread.currentThread().interrupt();
            return;
        }

        int karasunoPower = calculateTeamPower(players);

        System.out.println("카라스노 전력: " + karasunoPower);
        System.out.println(enemySchool.getName() + " 전력: " + enemySchool.getPower());
        System.out.println();

        if (enemySchool.getPower() < karasunoPower) {
            System.out.println("『카라스노 고교 승리』");
        } else if (enemySchool.getPower() > karasunoPower) {
            System.out.println("『카라스노 고교 패배 ...』");
            System.out.println("선수를 육성시켜 카라스노의 승리를 거머쥐세요!");
        } else {
            System.out.println("『이번 경기는 무승부』");
        }
    }
}
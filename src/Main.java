import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void showMemberDetail(
            Scanner scanner,
            ConsolePrinter consolePrinter,
            Map<Integer, KarasunoMember> members
    ) {
        consolePrinter.printBlank();
        consolePrinter.printMemberDetailInputMessage();

        int memberNumber = scanner.nextInt();

        consolePrinter.printBlank();

        KarasunoMember member = members.get(memberNumber);

        if (member == null) {
            consolePrinter.printInvalidMemberNumber();
            return;
        }

        member.showDetail();
    }

    public static void trainPlayer(
            Scanner scanner,
            ConsolePrinter consolePrinter,
            Map<Integer, Player> players,
            Map<Integer, KarasunoMember> members
    ) {
        consolePrinter.printTrainInputMessage();

        int playerNumber = scanner.nextInt();

        consolePrinter.printBlank();

        Player player = players.get(playerNumber);

        if (player != null) {
            player.train();
            return;
        }

        if (members.containsKey(playerNumber)) {
            consolePrinter.printManagerCannotTrain();
            return;
        }

        consolePrinter.printInvalidPlayerNumber();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsolePrinter consolePrinter = new ConsolePrinter();

        Player sawamura = new Player("사와무라 다이치", "3학년", 1,
                "윙 스파이커 / 캡틴", 85, 75, 90, "리더십", 95);

        Player sugawara = new Player("스가와라 코시", "3학년", 3,
                "세터", 70, 60, 75, "토스 안정성", 90);

        Player nishinoya = new Player("니시노야 유", "2학년", 4,
                "리베로", 85, 40, 98, "리시브", 99);

        Player tanaka = new Player("다나카 류노스케", "2학년", 5,
                "윙 스파이커", 80, 82, 70, "멘탈", 95);

        Player asahi = new Player("아즈마네 아사히", "3학년", 7,
                "윙 스파이커 / 에이스", 80, 95, 70, "스파이크 파워", 98);

        Player kageyama = new Player("카게야마 토비오", "1학년", 9,
                "세터", 85, 70, 70, "토스 정확도", 95);

        Player hinata = new Player("히나타 쇼요", "1학년", 10,
                "미들 블로커 / 스파이커", 80, 75, 50, "점프력", 95);

        Player tsukishima = new Player("츠키시마 케이", "1학년", 11,
                "미들 블로커", 75, 70, 85, "블로킹", 90);

        Manager yachi = new Manager("야치 히토카", "1학년", "전략 분석 및 기록 정리");
        Manager kiyoko = new Manager("시미즈 키요코", "3학년", "팀 운영 및 선수 관리");

        Map<Integer, KarasunoMember> members = new LinkedHashMap<>();
        members.put(1, sawamura);
        members.put(2, sugawara);
        members.put(3, nishinoya);
        members.put(4, tanaka);
        members.put(5, asahi);
        members.put(6, kageyama);
        members.put(7, hinata);
        members.put(8, tsukishima);
        members.put(9, yachi);
        members.put(10, kiyoko);

        Map<Integer, Player> players = new LinkedHashMap<>();
        players.put(1, sawamura);
        players.put(2, sugawara);
        players.put(3, nishinoya);
        players.put(4, tanaka);
        players.put(5, asahi);
        players.put(6, kageyama);
        players.put(7, hinata);
        players.put(8, tsukishima);

        while (true) {
            consolePrinter.printMainMenu();

            int number = scanner.nextInt();

            if (number == 1) {
                Player.showPlayerList();
            } else if (number == 2) {
                showMemberDetail(scanner, consolePrinter, members);
            } else if (number == 3) {
                trainPlayer(scanner, consolePrinter, players, members);
            } else if (number == 4) {
                MatchSimulation.startMatch(scanner, players);
            } else if (number == 5) {
                consolePrinter.printExitMessage();
                break;
            } else {
                consolePrinter.printInvalidMenuNumber();
            }

            consolePrinter.printBlank();
            consolePrinter.printBlank();
        }

        scanner.close();
    }
}
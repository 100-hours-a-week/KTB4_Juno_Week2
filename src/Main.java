import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void showMemberDetail(
            Scanner scanner,
            ConsolePrinter consolePrinter,
            Map<Integer, KarasunoMember> members
    ) {
        System.out.println();
        consolePrinter.printMemberDetailInputMessage();

        int memberNumber = scanner.nextInt();

        System.out.println();

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

        System.out.println();

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
        members.put(MemberNumber.SAWAMURA, sawamura);
        members.put(MemberNumber.SUGAWARA, sugawara);
        members.put(MemberNumber.NISHINOYA, nishinoya);
        members.put(MemberNumber.TANAKA, tanaka);
        members.put(MemberNumber.ASAHI, asahi);
        members.put(MemberNumber.KAGEYAMA, kageyama);
        members.put(MemberNumber.HINATA, hinata);
        members.put(MemberNumber.TSUKISHIMA, tsukishima);
        members.put(MemberNumber.YACHI, yachi);
        members.put(MemberNumber.KIYOKO, kiyoko);

        Map<Integer, Player> players = new LinkedHashMap<>();
        players.put(MemberNumber.SAWAMURA, sawamura);
        players.put(MemberNumber.SUGAWARA, sugawara);
        players.put(MemberNumber.NISHINOYA, nishinoya);
        players.put(MemberNumber.TANAKA, tanaka);
        players.put(MemberNumber.ASAHI, asahi);
        players.put(MemberNumber.KAGEYAMA, kageyama);
        players.put(MemberNumber.HINATA, hinata);
        players.put(MemberNumber.TSUKISHIMA, tsukishima);

        while (true) {
            consolePrinter.printMainMenu();

            int number = scanner.nextInt();

            if (number == MenuNumber.SHOW_MEMBER_LIST) {
                Player.showPlayerList();
            } else if (number == MenuNumber.SHOW_MEMBER_DETAIL) {
                showMemberDetail(scanner, consolePrinter, members);
            } else if (number == MenuNumber.TRAIN_PLAYER) {
                trainPlayer(scanner, consolePrinter, players, members);
            } else if (number == MenuNumber.START_MATCH) {
                MatchSimulation.startMatch(players, scanner);
            } else if (number == MenuNumber.EXIT) {
                consolePrinter.printExitMessage();
                break;
            } else {
                consolePrinter.printInvalidMenuNumber();
            }

            System.out.println();
            System.out.println();
        }

        scanner.close();
    }
}
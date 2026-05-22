import java.util.Scanner;

public class Main {

    public static void printNumber() {
        System.out.println("====================================================================================");
        System.out.println("          『 WELCOME TO KARASUNO HIGHSCHOOL in Haikyuu LEVEL UP SIMULATION 』          ");
        System.out.println("====================================================================================");
        System.out.println();
        System.out.println("1. 카라스노 고교 소속 멤버 목록 보기");
        System.out.println("2. 카라스노 고교 소속 멤버 상세 정보 보기");
        System.out.println("3. 선수 훈련 시키기");
        System.out.println("4. 경기 참가하기");
        System.out.println("5. 종료");
        System.out.println();
        System.out.print("번호를 입력하여 ｢ 카라스노 고교 선수 육성 ｣ 에 함께 하세요-!! >> ");
    }

    public static void showMemberDetail(
            Scanner scanner,
            Player hinata,
            Player kageyama,
            Player tsukishima,
            Player nishinoya,
            Player tanaka,
            Player sawamura,
            Player asahi,
            Player sugawara,
            Manager yachi,
            Manager kiyoko
    ) {
        System.out.println();
        System.out.print("상세 조회하고 싶은 멤버 번호를 입력하세요 >> ");
        int memberNumber = scanner.nextInt();

        System.out.println();

        if (memberNumber == 1) {
            sawamura.showPlayerDetail();
        } else if (memberNumber == 2) {
            sugawara.showPlayerDetail();
        } else if (memberNumber == 3) {
            nishinoya.showPlayerDetail();
        } else if (memberNumber == 4) {
            tanaka.showPlayerDetail();
        } else if (memberNumber == 5) {
            asahi.showPlayerDetail();
        } else if (memberNumber == 6) {
            kageyama.showPlayerDetail();
        } else if (memberNumber == 7) {
            hinata.showPlayerDetail();
        } else if (memberNumber == 8) {
            tsukishima.showPlayerDetail();
        } else if (memberNumber == 9) {
            yachi.showManagerInfo();
        } else if (memberNumber == 10) {
            kiyoko.showManagerInfo();
        } else {
            System.out.println("해당 번호의 멤버는 없습니다 (꒦ິ⍸꒦ິ)");
        }
    }

    public static void trainPlayer(
            Scanner scanner,
            Player hinata,
            Player kageyama,
            Player tsukishima,
            Player nishinoya,
            Player tanaka,
            Player sawamura,
            Player asahi,
            Player sugawara
    ) {
        System.out.print("훈련시킬 선수 번호를 입력하세요 >> ");
        int playerNumber = scanner.nextInt();

        System.out.println();

        if (playerNumber == 1) {
            sawamura.train();
        } else if (playerNumber == 2) {
            sugawara.train();
        } else if (playerNumber == 3) {
            nishinoya.train();
        } else if (playerNumber == 4) {
            tanaka.train();
        } else if (playerNumber == 5) {
            asahi.train();
        } else if (playerNumber == 6) {
            kageyama.train();
        } else if (playerNumber == 7) {
            hinata.train();
        } else if (playerNumber == 8) {
            tsukishima.train();
        } else if (playerNumber == 9 || playerNumber == 10) {
            System.out.println("매니저는 훈련 대상이 아닙니다!");
        } else {
            System.out.println("해당 번호의 선수는 없습니다 (꒦ິ⍸꒦ິ)");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        while (true) {
            printNumber();

            int number = scanner.nextInt();

            if (number == 1) {
                Player.showPlayerList();
            } else if (number == 2) {
                showMemberDetail(
                        scanner,
                        hinata,
                        kageyama,
                        tsukishima,
                        nishinoya,
                        tanaka,
                        sawamura,
                        asahi,
                        sugawara,
                        yachi,
                        kiyoko
                );
            } else if (number == 3) {
                trainPlayer(
                        scanner,
                        hinata,
                        kageyama,
                        tsukishima,
                        nishinoya,
                        tanaka,
                        sawamura,
                        asahi,
                        sugawara
                );
            } else if (number == 4) {
                MatchSimulation.startMatch(
                        hinata,
                        kageyama,
                        tsukishima,
                        nishinoya,
                        tanaka,
                        sawamura,
                        asahi,
                        sugawara,
                        scanner
                );
            } else if (number == 5) {
                System.out.println("카라스노 고교 육성을 종료합니다...");
                break;
            } else {
                System.out.println("잘못된 입력입니다 (꒦ິ⍸꒦ິ)");
            }

            System.out.println();
            System.out.println();
        }

        scanner.close();
    }
}
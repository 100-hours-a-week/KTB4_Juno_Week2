import java.util.Scanner;

public class MatchSimulation {

    public static int calculateTeamPower(
            Player hinata,
            Player kageyama,
            Player tsukishima,
            Player nishinoya,
            Player tanaka,
            Player sawamura,
            Player asahi,
            Player sugawara
    ){
        int teamPower = 0;

        teamPower += hinata.getPower();
        teamPower += kageyama.getPower();
        teamPower += tsukishima.getPower();
        teamPower += nishinoya.getPower();
        teamPower += tanaka.getPower();
        teamPower += sawamura.getPower();
        teamPower += asahi.getPower();
        teamPower += sugawara.getPower();

        return teamPower;
    }

    public static void startMatch(
            Player hinata,
            Player kageyama,
            Player tsukishima,
            Player nishinoya,
            Player tanaka,
            Player sawamura,
            Player asahi,
            Player sugawara,
            Scanner scanner
    ){
        String enemyName = "";
        int enemyPower = 0;

        System.out.println("=== 결전을 펼칠 상대 고교는? ===");
        System.out.println("1. 다테 공업 고교");
        System.out.println("2. 아오바죠사이 고교");
        System.out.println("3. 시라토리자와 학원");
        System.out.println("4. 네코마 고교");
        System.out.println();
        System.out.print("상대 고교 번호를 입력하세요 >> ");
        int enemyNumber = scanner.nextInt();

        if(enemyNumber == 1){
            enemyName = "다테 공업 고교";
            enemyPower = 1900;
        }else if(enemyNumber == 2){
            enemyName = "아오바죠사이 고교";
            enemyPower = 1950;
        } else if (enemyNumber == 3) {
            enemyName = "시라토리지와 학원";
            enemyPower = 2000;
        } else if (enemyNumber == 4) {
            enemyName = "네코마 고교";
            enemyPower = 2050;
        } else{
            System.out.println("잘못된 번호입니다 (꒦ິ⍸꒦ິ)");
            return;
        }

        System.out.println();
        System.out.println("카라스노 고교 VS "+ enemyName + " 경기 시작-!!");
        System.out.println();

        int karasunoPower = calculateTeamPower(hinata,kageyama,tsukishima, nishinoya, tanaka, sawamura, asahi, sugawara);


        System.out.println("카라스노 전력: " + karasunoPower);
        System.out.println(enemyName + " 전력: " + enemyPower);
        System.out.println();

        if(enemyPower < karasunoPower) {
            System.out.println("『카라스노 고교 승리』");
        } else if (enemyPower > karasunoPower) {
            System.out.println("『카라스노 고교 패배 ...");
            System.out.println("선수를 육성시켜 카라스노의 승리를 거머쥐세요!");
        } else {
            System.out.println("『이번 경기는 무승부』");
        }
    }

}
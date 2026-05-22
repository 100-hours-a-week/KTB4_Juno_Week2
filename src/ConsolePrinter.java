public class ConsolePrinter {

    public void printMainMenu() {
        System.out.println("====================================================================================");
        System.out.println("          『 WELCOME TO KARASUNO HIGHSCHOOL in Haikyuu LEVEL UP SIMULATION 』          ");
        System.out.println("====================================================================================");
        System.out.println();
        System.out.println(MenuNumber.SHOW_MEMBER_LIST + ". 카라스노 고교 소속 멤버 목록 보기");
        System.out.println(MenuNumber.SHOW_MEMBER_DETAIL + ". 카라스노 고교 소속 멤버 상세 정보 보기");
        System.out.println(MenuNumber.TRAIN_PLAYER + ". 선수 훈련 시키기");
        System.out.println(MenuNumber.START_MATCH + ". 경기 참가하기");
        System.out.println(MenuNumber.EXIT + ". 종료");
        System.out.println();
        System.out.print("번호를 입력하여 ｢ 카라스노 고교 선수 육성 ｣ 에 함께 하세요-!! >> ");
    }

    public void printMemberDetailInputMessage() {
        System.out.print("상세 조회하고 싶은 멤버 번호를 입력하세요 >> ");
    }

    public void printTrainInputMessage() {
        System.out.print("훈련시킬 선수 번호를 입력하세요 >> ");
    }

    public void printInvalidMenuNumber() {
        System.out.println("잘못된 입력입니다 (꒦ິ⍸꒦ິ)");
    }

    public void printInvalidMemberNumber() {
        System.out.println("해당 번호의 멤버는 없습니다 (꒦ິ⍸꒦ິ)");
    }

    public void printInvalidPlayerNumber() {
        System.out.println("해당 번호의 선수는 없습니다 (꒦ິ⍸꒦ິ)");
    }

    public void printManagerCannotTrain() {
        System.out.println("매니저는 훈련 대상이 아닙니다!");
    }

    public void printExitMessage() {
        System.out.println("카라스노 고교 육성을 종료합니다...");
    }

}
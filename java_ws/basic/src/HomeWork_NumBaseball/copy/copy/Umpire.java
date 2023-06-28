package HomeWork_NumBaseball.copy.copy;

public class Umpire {
    private Pitcher pitcher;
    private Hitter hitter;

    public Umpire(Pitcher pitcher, Hitter hitter) {
        this.pitcher = pitcher;
        this.hitter = hitter;
    }

    public boolean strike() {
        boolean bool = false;
        int strikeCnt = 0;
        for(int i = 0; i < 3; i++) {
            if(pitcher.pitNum[i] == hitter.hitNum[i]) {
                ++strikeCnt;
            }
        }
        if(strikeCnt == 3) {
            bool = true;
        } else {
            System.out.print("======  " + strikeCnt + "  Strike!!! ");
        }
        return bool;
    }

    public void ball() {
        int ballCnt = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if (pitcher.pitNum[i] == hitter.hitNum[j] && pitcher.pitNum[i] != hitter.hitNum[i]) {
                    ++ballCnt;
                }
            }
        }
        System.out.println("   " + ballCnt + "  Ball!!!  ======");
    }
}

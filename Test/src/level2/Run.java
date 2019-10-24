package level2;

public class Run {
    String[] nowLibrary;
    void Run() {
        // 生成一副全新的牌
        nowLibrary= new CreatNewPokerLibrary().CreatNewPokerLibrary();
        // 洗牌
        nowLibrary = new Shuffle().startShuffle(nowLibrary);
        //
    }
}


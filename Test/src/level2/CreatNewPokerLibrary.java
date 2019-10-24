package level2;

public class CreatNewPokerLibrary {
    String[] CreatNewPokerLibrary(){
        Poker poker = new Poker();
        String[] pokerLibrary = new String[54];
        int i = 0;

        //下面两个循环形成一套扑克牌共54张
        for (Info info : poker.infoList) {
            for (Type type : poker.typeList) {
                pokerLibrary[i] =  type.getPokerType()+info.getPokerShow();
                //System.out.print(pokerLibrary[i] + "\t");
                i++;
            }
            //System.out.println();
        }
        for (SpecialPoker specialPoker : poker.specialPokersList) {
            pokerLibrary[i] = specialPoker.getSpecialPoker();
            //System.out.print(pokerLibrary[i] + "\t");
        }
        //此处扑克牌生成完毕
        return pokerLibrary;
    }
}

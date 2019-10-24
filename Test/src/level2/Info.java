package level2;

public enum Info {
    _3("_3"),_4("_4"),_5("_5"), _6("_6"),
        _7("_7"),_8("_8"), _9("_9"), _X("_X"),
        _J("_J"),_Q("_Q"),_K("_K"), _A("_A"),
        _2("_2");

    private String pokerShow;
    private Info(String pokerShow) {
        this.pokerShow = pokerShow;
    }
    public String getPokerShow() {
        return pokerShow;
    }
}

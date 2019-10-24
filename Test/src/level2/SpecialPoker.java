package level2;

public enum SpecialPoker {
    redJoker("R_G"),blackJoker("B_G"),emptyCard("E_C");

    private String specialPoker;
    private SpecialPoker(String specialPoker) {
        this.specialPoker = specialPoker;
    }
    public String getSpecialPoker() {
        return specialPoker;
    }
}

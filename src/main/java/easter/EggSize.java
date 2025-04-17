package easter;

public enum EggSize {
    MALY("M"),
    SREDNI("S"),
    DUZY("D");

    private String scale;

    EggSize(String scale) {
        this.scale = scale;
    }

    public String getScale() {
        return scale;
    }
}

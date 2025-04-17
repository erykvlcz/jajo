package easter;

import java.util.regex.Pattern;

public class Egg {
    private String color;
    private Pattern pattern;
    private final EggSize eggSize;

    private Egg(EggSize eggSize, Pattern pattern, String color) {
        this.eggSize = eggSize;
        this.pattern = pattern;
        this.color = color;
    }

    public static Egg createEgg(EggSize eggSize, String description, String color){
        Pattern pattern = new Pattern(description);
        return new Egg(eggSize, pattern, color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public String getEggSize() {
        return eggSize.getScale();
    }

    @Override
    public String toString() {
        return "Egg{" +
                "color='" + color + '\'' +
                ", pattern=" + pattern +
                ", eggSize=" + eggSize +
                '}';
    }

    private static class Pattern{
        private String description;

        public Pattern(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "Pattern{" +
                    "description='" + description + '\'' +
                    '}';
        }
    }
}

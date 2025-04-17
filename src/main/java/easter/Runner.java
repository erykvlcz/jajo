package easter;

public class Runner {
    public static void main(String[] args) {
        Egg egg1 = Egg.createEgg(EggSize.MALY, "ładne bazgroły", "colorfull");
        System.out.println(egg1);
    }
}

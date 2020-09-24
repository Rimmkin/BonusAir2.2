public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 7800;
        int miles = (int) service.calculate(7800);
        System.out.println(miles);
    }
}

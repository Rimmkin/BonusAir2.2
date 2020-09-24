public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 7800;
        int miles = (int) service.calculate(price);
        System.out.println(miles);
    }
}

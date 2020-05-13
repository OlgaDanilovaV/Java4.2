public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float indexOfWeight = service.calculate(80, 1.7f);
        System.out.println(indexOfWeight);
    }
}

public class BmiService {
    public int calculate(int weight) {
        int mass = 60;
        double height = 1.71;
        double index = weight / (height * height);
        return (int) index;
    }
}

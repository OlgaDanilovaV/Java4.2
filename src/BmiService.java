public class BmiService {
    public float calculate(int weight, float height) {
        double index = weight / (height * height);
        return (float) index;
    }
}

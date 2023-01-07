public class BmiService {
    public double calculate(double height, double weight) {
        double index;
        double heightSquared = (height * height);
        index = (weight / heightSquared);
        return index;
    }
}
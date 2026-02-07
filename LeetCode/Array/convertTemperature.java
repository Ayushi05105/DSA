package LeetCode.Array;

public class convertTemperature {
    public double[] converttheTemperature(double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius*1.80 + 32.00;
        double[] ans = {kelvin,fahrenheit};
        return ans;
    }
    
}

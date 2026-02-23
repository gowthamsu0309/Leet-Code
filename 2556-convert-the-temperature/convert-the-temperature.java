class Solution {
    public double[] convertTemperature(double celsius) {
        double [] a = new double[2];

        double kelvin = celsius + 273.15;
        a[0] = kelvin;
        double fra = (celsius * 1.80) + 32.00;
        a[1] = fra;
        return a;
    }
}
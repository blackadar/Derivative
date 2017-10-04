public class Calculator {

    private static double[] f(double x){

        ////// Function \\\\\\
        double result = 2 * Math.sin(2 * x);

        return new double[] {x, result, 0};
    }

    private static double slope(double[] a, double[] b){
        return (b[1] - a[1]) / (b[0] - a[0]);
    }

    public static double[][] table(int floor, int ceiling){
        double increment = (ceiling - floor) / 1000.0;
        double[][] result = new double[1000][3];

        //First, map all inputs to calculated output
        for(int i = 1; i <= 1000; i++){
            result[i - 1] = f(floor + (i * increment));
        }

        //Next, find slope for 999 points
        for(int i = 0; i < 999; i++){
            result[i][2] = slope(result[i], result[i+1]);
        }

        return result;
    }


}

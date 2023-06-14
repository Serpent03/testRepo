public class test {
    static double toPrec(double num, int prec) {
        return (double) Math.round(num * Math.pow(10d, prec)) / Math.pow(10d, prec);
    }
    public static void main(String[] args) {
        System.out.println("" + toPrec(100.45359210357, 2));
    }
}
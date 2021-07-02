public class BinOps {
    public String sum(String a, String b) {
        int resA = Integer.parseInt(a, 2);
        int resB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(resA + resB);
    }

    public String mult(String a, String b) {
        int resA = Integer.parseInt(a, 2);
        int resB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(resA * resB);
    }
}
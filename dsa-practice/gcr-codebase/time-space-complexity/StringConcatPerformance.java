public class StringConcatPerformance {

    public static void main(String[] args) {

        int n = 1_000_000;
        String text = "hello";

        // Using String
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < n; i++) {
            s = s + text;
        }
        System.out.println("String Time: " + (System.currentTimeMillis() - start) + " ms");

        // Using StringBuilder
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(text);
        }
        System.out.println("StringBuilder Time: " + (System.currentTimeMillis() - start) + " ms");

        // Using StringBuffer
        start = System.currentTimeMillis();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbuf.append(text);
        }
        System.out.println("StringBuffer Time: " + (System.currentTimeMillis() - start) + " ms");
    }
}

public class OOPSBannerUC3 {

    public static void main(String[] args) {
        printBanner();
    }

    private static void printBanner() {

        String line1 = String.join(" ", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*");
        String line2 = String.join(" ", "*", "O", "O", "*", "P", "P", "*", "S", "S", "*");
        String line3 = String.join(" ", "*", "O", "O", "*", "P", "P", "*", "S", "*", "*");
        String line4 = String.join(" ", "*", "O", "O", "*", "P", "P", "*", "S", "S", "*");
        String line5 = String.join(" ", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}
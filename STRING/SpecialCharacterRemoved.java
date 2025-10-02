public class SpecialCharacterRemoved {
    public static void main(String[] args) {
        String str = "%jav!a&*%sta%r";
        String str3 = " J  A  V  A   ";// removing white spaces

        String str2 = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str2);

        String str4 = str3.replaceAll("\\s", "");
        System.out.println(str4);

    }
}

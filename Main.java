public class Main {
    public static void main(String[] args) {

//        printFirstThreeLetters(new String[]{"Ciao", "Sono", "Giuseppe"});
        System.out.println(thirdLettersChains(new String[]{"Ciao", "Sono", "Giuseppe"}, 3));
    }

    public static void printFirstThreeLetters(String[] arrayString) {
        for(String element : arrayString) {
            System.out.println("Prime 3 lettere: " + element.substring(0, 3));
        }
    }

    public static String thirdLettersChains(String[] arrayString2, int n) {
        String concatenation = "";
        for(int i = 0; i < n; i++) {
            String change = arrayString2[i];
            concatenation += change.charAt(2);
        }
        return concatenation;
    }
}

public class Main {
    public static void main(String[] args) {
        Person[] personArray = new Person[]
                {
                        new Person("Alessandro", "Venuti", 26),
                        new Person("Mario", "Rossi", 22),
                        new Person("Mario", "Verdi", 21)
                };
        String[] lastNameArray = new String[3];
        lastNameArray[0] = personArray[0].getLastName();
        lastNameArray[1] = personArray[1].getLastName();
        lastNameArray[2] = personArray[2].getLastName();
        printFirstThreeLetters(lastNameArray);
        System.out.println(thirdLettersChains(lastNameArray, 2));
        for (Person person : personArray) {
            System.out.println(person.getAge());
        }

//        printFirstThreeLetters(new String[]{"Ciao", "Sono", "Giuseppe"});
        // System.out.println(thirdLettersChains(new String[]{"Ciao", "Sono", "Giuseppe"}, 3));
    }

    public static void printFirstThreeLetters(String[] arrayString) {
        for (String element : arrayString) {
            System.out.println("Prime 3 lettere: " + element.substring(0, 3));
        }
    }

    public static String thirdLettersChains(String[] arrayString2, int n) {
        String concatenation = "";
        for (int i = 0; i < n; i++) {
            String change = arrayString2[i];
            concatenation += change.charAt(2);
        }
        return concatenation;
    }
}

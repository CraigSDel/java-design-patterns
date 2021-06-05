package solid.structural.solution;

public class InputValidator {
    public static boolean isValid(Pair pair) {

        String firstInteger = pair.getFirst();
        String secondInteger = pair.getSecond();

        try {
            Integer.parseInt(firstInteger);
            Integer.parseInt(secondInteger);
        } catch (NumberFormatException nfe) {
            System.out.println("Incorrect Number");
            return false;
        }

        return true;
    }
}

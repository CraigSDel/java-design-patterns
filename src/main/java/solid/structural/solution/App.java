package solid.structural.solution;

/* Demo purposes we have used static classes so that no instances need to be created
 */
public class App {
    public static void main(String[] args) {

        System.out.println("Welcome to the Application");
        Pair pair = InputProcessor.process();

        if (!InputValidator.isValid(pair)) {
            System.out.println("The given input is invalid");
            return;
        }

        int result = Operation.execute(Integer.valueOf(pair.getFirst()), Integer.valueOf(pair.getSecond()));

        System.out.println("The result is: " + result);
    }
}

package PredicatesLamda;

public class SAMSimpleTest {
    public static void main(String[] args) {
        SAMTest samTest = (something) -> System.out.println("Hello " + something);

        printSomethingFromLambda(samTest);
    }

    public static void printSomethingFromLambda(SAMTest samTest){
        samTest.printSomeThing("Rajnikant123");
    }
}

public class MethodOverloading {

    public static void main(String[] args) {
        // Call the printValue methods with different argument types
        printValue(10);        // Integer value
        printValue(3.14);      // Double value
        printValue("Hello!");  // String value
    }

    // First printValue method: accepts an integer
    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }

    // Second printValue method: accepts a double
    public static void printValue(double number) {
        System.out.println("Double value: " + number);
    }

    // Third printValue method: accepts a string
    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }
}

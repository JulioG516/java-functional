package functionalinterface;

import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = increment(0);
        System.out.println(increment);

        int increment2 = incrementBy1Function.apply(1); // .Apply to use function
        System.out.println(increment2);

        int multiply = multiplyBy10.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementBy1Function.andThen(multiplyBy10);

        int addByAndMultiply = addBy1AndThenMultiplyBy10.apply(4);
        System.out.println(addByAndMultiply);
    }

    static Function<Integer, Integer> incrementBy1Function = number -> number + 1;          // Number recebe lambda
    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

    static int increment(int number) {
        return number + 1;
    }
}

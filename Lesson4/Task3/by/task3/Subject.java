package by.task3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Anton_Khmyzov on 2/18/2017.
 */
public enum Subject {
    DifferentialEquations,
    Algebra,
    Analysis,
    FunctionalAnalysis,
    ComputationalMethods;
    //...
    private static final int size = Subject.values().length;
    private static final List<Subject> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static Subject randomSubject()  {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }

    public static int getSize() {
        return size;
    }
}
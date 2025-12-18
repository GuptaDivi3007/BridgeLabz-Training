import java.util.*;

public class PenProblem {

    public static void main(String[] args) {
        int total = 14;
        int stu = 3;

        int div = total / stu;
        int rem = total % stu;

        System.out.println("The Pen Per Student is " + div + " and the remaining pen not distributed is " + rem);
    }
}

import java.util.*;

public class QuizPerformanceRanking {

    static class Student {
        public String name;
        public String dept;
        public int q1, q2, q3;

        public Student(String name, String dept, int q1, int q2, int q3) {
            this.name = name;
            this.dept = dept;
            this.q1 = q1;
            this.q2 = q2;
            this.q3 = q3;
        }

        public int total() {
            return q1 + q2 + q3;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        List<Student> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();
            String[] parts = input.split(" ");

            if (parts[0].equals("Record")) {

                String name = parts[1];
                String dept = parts[2];
                int q1 = Integer.parseInt(parts[3]);
                int q2 = Integer.parseInt(parts[4]);
                int q3 = Integer.parseInt(parts[5]);

                list.add(new Student(name, dept, q1, q2, q3));

                System.out.println("Record Added: " + name);
            }

            else if (parts[0].equals("Top")) {

                if (list.isEmpty()) {
                    System.out.println("No Records Available");
                    continue;
                }

                String type = parts[1];

                // ----------- Top by Department -----------
                if (!type.startsWith("Q")) {

                    boolean found = false;
                    int max = -1;

                    // find max total
                    for (Student s : list) {
                        if (s.dept.equals(type)) {
                            found = true;
                            max = Math.max(max, s.total());
                        }
                    }

                    if (!found) {
                        System.out.println("Department Not Found");
                        continue;
                    }

                    // print all with max total (in order)
                    for (Student s : list) {
                        if (s.dept.equals(type) && s.total() == max) {
                            System.out.println(s.name + " " + s.total());
                        }
                    }
                }

                // ----------- Top by Quiz -----------
                else {

                    int max = -1;

                    // find max score
                    for (Student s : list) {
                        if (type.equals("Q1")) max = Math.max(max, s.q1);
                        else if (type.equals("Q2")) max = Math.max(max, s.q2);
                        else if (type.equals("Q3")) max = Math.max(max, s.q3);
                    }

                    // print all with max
                    for (Student s : list) {
                        if (type.equals("Q1") && s.q1 == max) {
                            System.out.println(s.name + " " + s.q1);
                        }
                        else if (type.equals("Q2") && s.q2 == max) {
                            System.out.println(s.name + " " + s.q2);
                        }
                        else if (type.equals("Q3") && s.q3 == max) {
                            System.out.println(s.name + " " + s.q3);
                        }
                    }
                }
            }
        }
    }
}
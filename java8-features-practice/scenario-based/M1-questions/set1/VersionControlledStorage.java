import java.util.*;

public class VersionControlledStorage {

    static class FileVersion {
        public String version;
        public int size;

        public FileVersion(String version, int size) {
            this.version = version;
            this.size = size;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        HashMap<String, List<FileVersion>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            String input = sc.nextLine();
            String[] parts = input.split(" ");

            String operation = parts[0];

            if (operation.equals("UPLOAD")) {

                String file = parts[1];
                String version = parts[2];
                int size = Integer.parseInt(parts[3]);

                map.putIfAbsent(file, new ArrayList<>());

                boolean exists = false;
                for (FileVersion fv : map.get(file)) {
                    if (fv.version.equals(version)) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    map.get(file).add(new FileVersion(version, size));
                }

            } 
            else if (operation.equals("FETCH")) {

                String file = parts[1];

                if (!map.containsKey(file)) {
                    System.out.println("File Not Found");
                    continue;
                }

                List<FileVersion> list = map.get(file);

                Collections.sort(list, (a, b) -> {
                    if (a.size != b.size) {
                        return a.size - b.size;
                    }
                    return a.version.compareTo(b.version);
                });

                for (FileVersion fv : list) {
                    System.out.println(file + " " + fv.version + " " + fv.size);
                }

            } 
            else if (operation.equals("LATEST")) {

                String file = parts[1];

                if (!map.containsKey(file) || map.get(file).isEmpty()) {
                    System.out.println("File Not Found");
                    continue;
                }

                List<FileVersion> list = map.get(file);
                FileVersion latest = list.get(list.size() - 1);

                System.out.println(file + " " + latest.version + " " + latest.size);

            } 
            else if (operation.equals("TOTAL_STORAGE")) {

                String file = parts[1];

                if (!map.containsKey(file)) {
                    System.out.println("File Not Found");
                    continue;
                }

                int sum = 0;
                for (FileVersion fv : map.get(file)) {
                    sum += fv.size;
                }

                System.out.println(file + " " + sum);
            }
        }
    }
}
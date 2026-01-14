import java.util.Stack;

class CircularTourUsingStack {

    static class PetrolPump {
        int petrol;
        int distance;

        PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    public static int findStartingPoint(PetrolPump[] pumps) {

        Stack<Integer> stack = new Stack<>();
        int totalFuel = 0;
        int currentFuel = 0;

        for (int i = 0; i < pumps.length; i++) {

            int gain = pumps[i].petrol - pumps[i].distance;
            totalFuel += gain;
            currentFuel += gain;
            stack.push(i);

            // If fuel goes negative, discard current stack
            if (currentFuel < 0) {
                stack.clear();
                currentFuel = 0;
            }
        }

        if (totalFuel < 0 || stack.isEmpty()) {
            return -1;
        }

        // Bottom of stack is the starting index
        return stack.firstElement();
    }

    public static void main(String[] args) {

        PetrolPump[] pumps = {
            new PetrolPump(6, 4),
            new PetrolPump(3, 6),
            new PetrolPump(7, 3)
        };

        int start = findStartingPoint(pumps);

        if (start == -1) {
            System.out.println("No circular tour possible");
        } else {
            System.out.println("Start from petrol pump index: " + start);
        }
    }
}

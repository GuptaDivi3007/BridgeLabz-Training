public class MealGenerator {

    public static <T extends MealPlan> Meal<T> generateMeal(T plan) {
        if (plan.getCalories() <= 0) {
            throw new IllegalArgumentException("Invalid meal plan");
        }
        return new Meal<>(plan);
    }
}

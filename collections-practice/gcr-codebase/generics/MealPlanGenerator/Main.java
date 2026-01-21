public class Main {

    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal = MealGenerator.generateMeal(new VegetarianMeal());

        Meal<KetoMeal> ketoMeal = MealGenerator.generateMeal(new KetoMeal());

        System.out.println(
                vegMeal.getMealPlan().getPlanName() + " | Calories: " +
                vegMeal.getMealPlan().getCalories()
        );

        System.out.println(
                ketoMeal.getMealPlan().getPlanName() + " | Calories: " +
                ketoMeal.getMealPlan().getCalories()
        );
    }
}

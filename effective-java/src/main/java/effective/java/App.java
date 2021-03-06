/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package effective.java;

import effective.java.abstractbuilder.NutritionFacts;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());


        NutritionFacts nutritionFacts = new NutritionFacts.Builder()
                .servingSize(200)
                .build();

        System.out.println(nutritionFacts.getServingSize());
    }
}

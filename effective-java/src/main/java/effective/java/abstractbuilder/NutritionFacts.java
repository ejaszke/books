package effective.java.abstractbuilder;

public class NutritionFacts {
    private final int servingSize;

    public static class Builder {
        private int servingSize;

        public Builder servingSize(int value) {
            this.servingSize = value;
            return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
    }

    public int getServingSize() {
        return servingSize;
    }
}

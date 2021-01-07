
type Fact = {
    size: number;
}

class NutritionFacts {

    private readonly size: number;

    static Builder = class <T extends Fact> {
        size!: number;

        addSize(val: number) {
            this.size = val;
            return this;
        }

        build(): NutritionFacts {
            return new NutritionFacts(this);
        }
    }

    private constructor(builder: Fact) {
        this.size = builder.size;
    }

    getSize(): number {
        return this.size;
    }
}

const nf = new NutritionFacts.Builder().addSize(29).build()

console.log(nf.getSize())
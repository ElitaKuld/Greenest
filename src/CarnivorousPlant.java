public class CarnivorousPlant extends Plant implements Waterable {

    private NutrientFluid typeOfNutrientFluid = NutrientFluid.PROTEIN_DRINK;

    public CarnivorousPlant() {
    }

    public CarnivorousPlant(String name, double length) {
        super.setName(name);
        super.setLength(length);
    }

    @Override
    public NutrientFluid getTypeOfNutrientFluid() {
        return typeOfNutrientFluid;
    }

    @Override
    public void setTypeOfNutrientFluid(NutrientFluid typeOfNutrientFluid) {
        this.typeOfNutrientFluid = typeOfNutrientFluid;
    }

    public double waterMe() {
        return 0.1 + (super.getLength() * 0.2);
    }
}
/*Köttätande växter: Dessa behöver alltid en basnivå av 0,1 liter proteindryck per dag och
sedan ett extra tillskott med 0,2 liter proteindryck * sin längd i meter. En köttätande växt
som är 50 cm hög behöver alltså 0,1 + (0,2*0,5) = 0,2 liter proteindryck/dag*/
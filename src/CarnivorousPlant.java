public class CarnivorousPlant extends Plant {

    private NutrientFluid typeOfNutrientFluid = NutrientFluid.PROTEIN_DRINK;

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

    @Override
    public double waterMe() {
        return 0.1 + (super.getLength() * 0.2);
    }
}
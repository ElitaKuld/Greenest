public class Palm extends Plant {

    private NutrientFluid typeOfNutrientFluid = NutrientFluid.TAP_WATER;

    public Palm(String name, double length) {
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
        return super.getLength() * 0.5;
    }
}
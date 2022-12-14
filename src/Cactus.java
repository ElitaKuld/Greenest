public class Cactus extends Plant {

    private NutrientFluid typeOfNutrientFluid = NutrientFluid.MINERAL_WATER;

    public Cactus(String name, double length) {
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
        return super.getLength() * 0.02;
    }
}
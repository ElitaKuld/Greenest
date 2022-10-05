public class Palm extends Plant implements Waterable {

    private NutrientFluid typeOfNutrientFluid = NutrientFluid.TAP_WATER;

    public Palm() {
    }

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
/*Palmer: En palm behöver 0,5 liter kranvatten per dag * sin längd i meter. En palm som är 3
meter hög behöver alltså 0,5 * 3 = 1,5 liter vatten/dag.
*/
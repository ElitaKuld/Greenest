public abstract class Plant implements Waterable {

    private NutrientFluid typeOfNutrientFluid;
    private String name;
    private double length; // length in meters

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NutrientFluid getTypeOfNutrientFluid() {
        return typeOfNutrientFluid;
    }

    public void setTypeOfNutrientFluid(NutrientFluid typeOfNutrientFluid) {
        this.typeOfNutrientFluid = typeOfNutrientFluid;
    }

    public abstract double waterMe();
}
public enum NutrientFluid {
    TAP_WATER("kranvatten"),
    PROTEIN_DRINK("proteindryck"),
    MINERAL_WATER("mineralvatten");

    public final String svenskBetydelse;

    NutrientFluid(String vätska) {
        svenskBetydelse = vätska;
    }

    public String getSvenskBetydelse() {
        return svenskBetydelse;
    }
}
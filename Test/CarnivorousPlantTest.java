import org.junit.jupiter.api.Test;

class CarnivorousPlantTest {

    CarnivorousPlant carnivorousPlant = new CarnivorousPlant("iWantMeat", 0.5);

    @Test
    void waterMe() {
        assert (carnivorousPlant.waterMe() == 0.2);
        assert (carnivorousPlant.waterMe() != 0);
        carnivorousPlant.setLength(0.7);
        assert (carnivorousPlant.waterMe() == 0.24);
        assert (carnivorousPlant.waterMe() != 0.2);
    }
}
import org.junit.jupiter.api.Test;

class CarnivorousPlantTest {

    CarnivorousPlant carnivorousPlant = new CarnivorousPlant("iWantMeat", 0.5);

    @Test
    void waterMe() {
        assert(carnivorousPlant.waterMe() == 0.2);
        assert(carnivorousPlant.waterMe() != 0);
    }
}
import org.junit.jupiter.api.Test;

class CactusTest {

    Cactus cactus = new Cactus("Mr Sharp", 0.5);

    @Test
    void waterMe() {
        assert (cactus.waterMe() == 0.01);
        assert (cactus.waterMe() != 0);
        cactus.setLength(0.8);
        assert (cactus.waterMe() == 0.016);
        assert (cactus.waterMe() != 0.01);
    }
}
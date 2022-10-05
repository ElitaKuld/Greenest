import org.junit.jupiter.api.Test;

class PalmTest {

    Palm palm = new Palm("Coco-Nuts", 0.5);

    @Test
    void waterMe() {
        assert(palm.waterMe() == 0.25);
        assert(palm.waterMe() != 0);
    }
}
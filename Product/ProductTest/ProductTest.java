import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product p1, p2, p3, p4, p5, p6;

    @BeforeEach
    void setUp() {
        p1 = new Product("Gum", "Chewable Candy", "000001", .50);
        p2 = new Product("Soda", "8oz Cola", "000002", 1.00);
        p3 = new Product("Licorice", "Red Licorice Candy", "000003", .75);
        p4 = new Product("Popcorn", "Kettlecorn", "000004", 2.00);
        p5 = new Product("Chocolate Bar", "Hershey's Candy Bar", "000005", 1.25);
        p6 = new Product("Hotdog", "Footlong Dog", "000007", 1.50);
    }

    @Test
    void setName() {
        p2.setName("Coke");
        assertEquals("Coke", p2.getName());
    }

    @Test
    void setDescription() {
            p3.setDescription("Red Vines Licorice Candy");
            assertEquals("Red Vines Licorice Candy", p3.getDescription());
    }

    @Test
    void setID() {
        p6.setID("000006");
        assertEquals("000006", p6.getID());
    }

    @Test
    void setCost() {
        p5.setCost(1.00);
        assertEquals(1.00, p5.getCost());
    }
}
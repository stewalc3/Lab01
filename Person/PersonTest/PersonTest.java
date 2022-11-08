import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1, p2, p3, p4, p5, p6;

    @BeforeEach
    void setUp() {
        p1 = new Person("000001", "Lucas", "Stewart", "Mr.", 2000);
        p2 = new Person("000002", "Louis", "Nagy", "Mr.", 1999);
        p3 = new Person("000003", "Sean", "Gue", "Mr.", 1996);
        p4 = new Person("000004", "Nick", "Beavan", "Mr.", 2000);
        p5 = new Person("000005", "Hunter", "Moran", "Mr.", 2000);
        p6 = new Person("000006", "Tony", "Gentile", "Mr.", 2001);
    }

    @Test
    void setID() {
        p1.setID("00000A");
        assertEquals("00000A",p1.getID());
    }

    @Test
    void setFirstName() {
        p6.setFirstName("Anthony");
        assertEquals("Anthony", p6.getFirstName());
    }


    @Test
    void setLastName() {
        p4.setLastName("Ero");
        assertEquals("Ero", p4.getLastName());
    }

    @Test
    void setTitle() {
        p5.setTitle("Dr.");
        assertEquals("Dr.", p5.getTitle());
    }

    @Test
    void setYOB() {
        p3.setYOB(1997);
        assertEquals(1997, p3.getYOB());
    }
    @Test
    void toCSVDataRecord() {
        p1.toCSVDataRecord();
    }

    @Test
    void fullName() {
        p1.fullName();
    }

    @Test
    void formalName() {
        p1.formalName();
    }

    @Test
    void getAge() {
        p1.getAge();
    }

    @Test
    void testGetAge() {
    }
}
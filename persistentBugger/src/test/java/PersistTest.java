import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersistTest {

    @Test
    public void basicTest() {

        System.out.println("****** Basic Tests ******");
        assertEquals(3, Persist.persistence(39));
        assertEquals(0, Persist.persistence(4));
        assertEquals(2, Persist.persistence(25));
        assertEquals(4, Persist.persistence(999));
    }

    @Test
    public void singleDigitTest() {

        assertEquals(0, Persist.persistence(7));
    }

    @Test
    public void twoDigitsTest() {

        assertEquals(3, Persist.persistence(39));
    }

    @Test
    public void threeDigitsTest() {

        assertEquals(4, Persist.persistence(999));
    }

    @Test
    public void singleDigitTestPersistenceWeirdAndHard() {

        assertEquals(0, Persist.persistenceWeirdAndHard(7));
    }

    @Test
    public void twoDigitsTestPersistenceWeirdAndHard() {

        assertEquals(3, Persist.persistenceWeirdAndHard(39));
    }

    @Test
    public void threeDigitsTestPersistenceWeirdAndHard() {

        assertEquals(4, Persist.persistenceWeirdAndHard(999));
    }

    @Test
    public void singleDigitTestPersistenceWeirdAndHardSimmilaOne() {

        assertEquals(0, Persist.persistenceWeirdAndHardSimmilaOne(7));
    }

    @Test
    public void twoDigitsTestPersistenceWeirdAndHardSimmilaOne() {

        assertEquals(3, Persist.persistenceWeirdAndHardSimmilaOne(39));
    }

    @Test
    public void singleDigitTestPersistenceRecursiveAgain() {

        assertEquals(0, Persist.persistenceRecursiveAgain(7));
    }

    @Test
    public void twoDigitsTestPersistencRecursiveAgain() {

        assertEquals(3, Persist.persistenceRecursiveAgain(39));
    }

    @Test
    public void threeDigitsTestPersistenceRecursiveAgainl() {

        assertEquals(4, Persist.persistenceRecursiveAgain(999));
    }

    @Test
    public void singleDigitTestPersistenceClasicalModel() {

        assertEquals(0, Persist.persisyenceClasicalModel(7));
    }

    @Test
    public void twoDigitsTestPersistenceClasicalModele() {

        assertEquals(3, Persist.persisyenceClasicalModel(39));
    }

    @Test
    public void threeDigitsTestPersistencClasicalModele() {

        assertEquals(4, Persist.persisyenceClasicalModel(999));
    }
}
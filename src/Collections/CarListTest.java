/*package Collections;

import com.sun.org.apache.xpath.internal.operations.Equals;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapters;

import static org.junit.Assert.*;

public class CarListTest {

    private CarList carList;

    @org.junit.Before
    public void setUp() throws Exception {
        //init
    }

    @Test
    public void whenAdded100ElementsThenSizeMustBe100() {
        for (int i = 0; i < 100; i++) {
            carList.add(new Car("Brand" + i, i));
        }
        assertEquals(100, carList.size());
    }

@Test
public  void whenElementsRemovedByIndexThenSizeMustBeDecreased(){
    for (int i = 0; i < 100; i++) {
        carList.add(new Car("Brand" + i, i));
    }
    assertEquals( 100, carList.size());
    assertTrue(carList.removeAt(5));
    assertEquals( 99, carList.size());

    @Test
            public void whenElementsRemovedByIndexThenSizeMustBeDecreased(){
        Car car = new Car("Toyota", 15);

    }
}
}

 */
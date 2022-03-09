import static org.testng.AssertJUnit.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.testng.annotations.Test;

public class CustomListTest {
    private CustomList test;

    @Before
    public void createList(){
        list = new CustomList(null, new Arraylist<City>());
    }

    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS");
        assertEquals(list.getCount(), listSize + 1);
    }
}

import context.CatList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CatListTest {

    @Test
    @DisplayName("Can add valid cat name")
    void canAddValidCatName(){
        CatList breederList = new CatList();
        breederList.addCatName("Alisa");
        Assertions.assertEquals("Alisa", breederList.nextCatName());
        Assertions.assertEquals(1, breederList.size());
    }

    @Test
    @DisplayName("Can add multiple cat names")
    void canAddMultipleCatNames(){
        CatList breederList = new CatList();
        breederList.addCatName("Alisa");
        breederList.addCatName("Lissa");
        Assertions.assertEquals("Alisa", breederList.nextCatName());
        Assertions.assertEquals(2, breederList.size());
    }

    @Test
    @DisplayName("Can remove cat name")
    void canRemoveCatName(){
        CatList breederList = new CatList();
        breederList.addCatName("Alisa");
        Assertions.assertEquals("Alisa", breederList.nextCatName());
        breederList.removeCatName();
        Assertions.assertTrue(breederList.size() == 0);
    }
}

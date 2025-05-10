import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTest {
    @Mock
    private static String name;
    @Mock
    private static float price;
    private static Ingredient ingredient;

    @BeforeClass
    public static void init() {
        ingredient = new Ingredient(IngredientType.SAUCE, name, price);
    }

    @Test
    public void getPriceReturnedSuccess() {
        assertEquals(price, ingredient.getPrice(), 0.0001);
    }

    @Test
    public void getNameReturnedSuccess() {
        assertEquals(name, ingredient.getName());
    }

    @Test
    public void getTypeReturnedSuccess() {
        assertEquals(IngredientType.SAUCE, ingredient.getType());
    }
}

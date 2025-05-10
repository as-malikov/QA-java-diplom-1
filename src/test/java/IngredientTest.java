import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
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

//    @Mock
//    private Ingredient ingredient;
//
//    @Test
//    public void getPriceReturnedSuccess() {
//        Mockito.when(ingredient.getPrice()).thenReturn(PRICE_100);
//        assertEquals(PRICE_100, ingredient.getPrice(), 0.0001);
//    }
//
//    @Test
//    public void getNameReturnedSuccess() {
//        Mockito.when(ingredient.getName()).thenReturn(SAUCE_SPICY_X);
//        assertEquals(SAUCE_SPICY_X, ingredient.getName());
//    }
//
//    @Test
//    public void getTypeReturnedSuccess() {
//        Mockito.when(ingredient.getType()).thenReturn(IngredientType.SAUCE);
//        assertEquals(IngredientType.SAUCE, ingredient.getType());
//    }
}

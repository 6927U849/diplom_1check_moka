import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

@RunWith(Parameterized.class)
public class IngredientTest {
    private final String name;
    private final IngredientType type;
    private final float price;

    public IngredientTest(IngredientType type, String name, float price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "{index}: type={0}, name={1}, price={2}")
    public static Object[] testIngredient() {
        return new Object[][]{
                {IngredientType.SAUCE, "sauce spicy-x", 100},
                {IngredientType.SAUCE, "space sauce", 200},
                {IngredientType.SAUCE, "traditional galactic sauce", 300},
                {IngredientType.FILLING, "beef meteorite", 100},
                {IngredientType.FILLING, "mineral rings", 200},
                {IngredientType.FILLING, "cheese with asteroid mold", 300},
        };
    }

    @Test
    public void TestGetType() {
        Ingredient ingredient = new Ingredient(type, name, price);
        Assert.assertEquals(type, ingredient.getType());
    }

    @Test
    public void TestGetName() {
        Ingredient ingredient = new Ingredient(type, name, price);
        Assert.assertEquals(name, ingredient.getName());
    }

    @Test
    public void TestGetPrice() {
        Ingredient ingredient = new Ingredient(type, name, price);
        Assert.assertEquals(price, ingredient.getPrice(), 0);
    }
}
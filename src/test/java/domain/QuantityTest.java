package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    @DisplayName("Can update quantity")
    void canIncreaseQuantity() {
        Quantity initialQuantity = new Quantity(1);
        Quantity updatedQuantity = initialQuantity.add(new Quantity(5));
        Assertions.assertEquals(6, updatedQuantity.value());
    }

    @Test
    @DisplayName("Cant update quantity to more than 200 items")
    void cantUpdateQuantityToMoreThan200Items() {
        Quantity maxQuantity = new Quantity(200);
        Assertions.assertThrows(IllegalArgumentException.class, () -> maxQuantity.add(new Quantity(1)));
    }

    @Test
    @DisplayName("Cant set quantity to less than one")
    void cantSetQuantityToLessThanOne() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Quantity(0));
    }
}

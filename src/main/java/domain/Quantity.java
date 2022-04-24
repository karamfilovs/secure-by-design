package domain;

import org.apache.commons.lang3.Validate;

public class Quantity {
    private final int value;

    public Quantity(final int value) {
        Validate.inclusiveBetween(1, 200, value);
        this.value = value;
    }

    public Quantity add(Quantity toBeAdded){
        Validate.notNull(toBeAdded);
        return new Quantity(value + toBeAdded.value);
    }

    public int value() {
        return value;
    }
}

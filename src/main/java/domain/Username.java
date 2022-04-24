package domain;


import static org.apache.commons.lang3.Validate.*;

public class Username {
    private String value;
    private static final int MIN_LENGTH = 3;
    private static final int MAX_LENGTH = 40;
    private static final String VALID_CHARACTERS = "[A-Za-z0-9_-]+";


    public Username(String username) {
        notBlank(username);
        final String trimmed = username.trim();
        inclusiveBetween(MIN_LENGTH, MAX_LENGTH, trimmed.length());
        matchesPattern(trimmed,
                VALID_CHARACTERS,
                "Allowed characters are: %s", VALID_CHARACTERS);
        this.value = trimmed;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return "Username{" +
                "value='" + value + '\'' +
                '}';
    }
}

package domain;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UsernameTest {

    @Test
    @DisplayName("Can create username with valid name")
    void canCreateValidUsername() {
        final Username alex = new Username("  ALEX  ");
        Assertions.assertEquals(4, alex.value().length());
    }

    @Test
    @DisplayName("Cant create username with special chars in its name")
    void cantCreateUserWithSpecialChars() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Username("<Alex>"), "IllegalArgumentException was expected");
    }

    @Test
    @DisplayName("Cant create username with blank name")
    void canCreateBlankUsername() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Username(""), "IllegalArgumentException was expected");
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "<Alex>", "алекс", "      "})
    @DisplayName("Cant create username with invalid name")
    void cantCreateUsernameWithNameLongerThan40chars(String name) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Username(name), "IllegalArgumentException was expected");
    }

}

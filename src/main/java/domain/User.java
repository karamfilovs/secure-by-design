package domain;

import org.apache.commons.lang3.Validate;

public class User {
    private final Long id;
    private final Username username;

    public User(final Long id, final Username username) {
        this.id = Validate.notNull(id);
        this.username = Validate.notNull(username);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username=" + username +
                '}';
    }
}

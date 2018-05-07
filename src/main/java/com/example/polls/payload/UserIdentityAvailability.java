/**
 * <p> Finalidade da Classe: </p>
 *
 * <p> Copyright: Copyright (c) Synergia - DCC - UFMG </p>
 */
package com.example.polls.payload;

public class UserIdentityAvailability {
    private Boolean available;

    public UserIdentityAvailability(Boolean available) {
        this.available = available;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}

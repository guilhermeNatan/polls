/**
 * <p> Finalidade da Classe: </p>
 *
 * <p> Copyright: Copyright (c) Synergia - DCC - UFMG </p>
 */
package com.example.polls.payload;
import javax.validation.constraints.NotNull;

public class VoteRequest {

    @NotNull
    private Long choiceId;

    public Long getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(Long choiceId) {
        this.choiceId = choiceId;
    }
}

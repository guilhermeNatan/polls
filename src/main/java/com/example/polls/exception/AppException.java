/**
 * <p> Finalidade da Classe: </p>
 *
 * <p> Copyright: Copyright (c) Synergia - DCC - UFMG </p>
 */
package com.example.polls.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class AppException  extends RuntimeException {
    public AppException(String message) {
        super(message);
    }

    public AppException(String message, Throwable cause) {
        super(message, cause);
    }
}

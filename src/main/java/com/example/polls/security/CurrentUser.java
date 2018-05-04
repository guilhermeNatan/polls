/**
 * <p> Finalidade da Classe: </p>
 *
 * <p> Copyright: Copyright (c) Synergia - DCC - UFMG </p>
 */
package com.example.polls.security;

import org.springframework.security.core.annotation.AuthenticationPrincipal;

import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@AuthenticationPrincipal
public @interface CurrentUser {
}

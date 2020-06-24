/*
 * Javalin - https://javalin.io
 * Copyright 2017 David Åse
 * Licensed under Apache 2.0: https://github.com/tipsy/javalin/blob/master/LICENSE
 */
package io.javalin.http;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Creates the {@link Context} instance for each incoming request. Create your own implementation to extend
 * {@link Context} with your own methods.
 *
 * @see <a href="https://javalin.io/documentation#context">Context in docs</a>
 */
public interface ContextFactory {

    /** Create a new {@link io.javalin.http.Context} */
    public Context createContext(HttpServletRequest request, HttpServletResponse response, Map<Class<?>, Object> appAttributes);

}

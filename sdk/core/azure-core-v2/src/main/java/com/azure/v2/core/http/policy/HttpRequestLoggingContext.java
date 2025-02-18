// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.v2.core.http.policy;

import io.clientcore.core.http.models.HttpRequest;
import io.clientcore.core.http.pipeline.HttpPipelinePolicy;
import io.clientcore.core.util.Context;

/**
 * The {@code HttpRequestLoggingContext} class provides contextual information available during HTTP request logging.
 *
 * <p>This class is useful when you need to access information about an HTTP request during logging. It provides
 * access to the HTTP request being sent, the contextual information about the request, and the try count for the
 * request.</p>
 *
 *
 * @see HttpRequest
 * @see Context
 * @see HttpPipelinePolicy
 */
public final class HttpRequestLoggingContext {
    private final HttpRequest httpRequest;
    private final Context context;
    private final Integer tryCount;

    HttpRequestLoggingContext(HttpRequest httpRequest, Context context, Integer tryCount) {
        this.httpRequest = httpRequest;
        this.context = context;
        this.tryCount = tryCount;
    }

    /**
     * Gets the HTTP request being sent.
     *
     * @return The HTTP request.
     */
    public HttpRequest getHttpRequest() {
        return httpRequest;
    }

    /**
     * Gets the contextual information about the HTTP request.
     *
     * @return The contextual information.
     */
    public Context getContext() {
        return context;
    }

    /**
     * Gets the try count for the HTTP request.
     *
     * @return The HTTP request try count.
     */
    public Integer getTryCount() {
        return tryCount;
    }
}

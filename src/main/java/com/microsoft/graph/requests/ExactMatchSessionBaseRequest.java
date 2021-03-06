// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ExactMatchSessionBase;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Exact Match Session Base Request.
 */
public class ExactMatchSessionBaseRequest extends BaseRequest<ExactMatchSessionBase> {
	
    /**
     * The request for the ExactMatchSessionBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ExactMatchSessionBaseRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends ExactMatchSessionBase> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ExactMatchSessionBase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExactMatchSessionBaseRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ExactMatchSessionBase.class);
    }

    /**
     * Gets the ExactMatchSessionBase from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExactMatchSessionBase> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ExactMatchSessionBase from the service
     *
     * @return the ExactMatchSessionBase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExactMatchSessionBase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExactMatchSessionBase> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ExactMatchSessionBase delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ExactMatchSessionBase with a source
     *
     * @param sourceExactMatchSessionBase the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExactMatchSessionBase> patchAsync(@Nonnull final ExactMatchSessionBase sourceExactMatchSessionBase) {
        return sendAsync(HttpMethod.PATCH, sourceExactMatchSessionBase);
    }

    /**
     * Patches this ExactMatchSessionBase with a source
     *
     * @param sourceExactMatchSessionBase the source object with updates
     * @return the updated ExactMatchSessionBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExactMatchSessionBase patch(@Nonnull final ExactMatchSessionBase sourceExactMatchSessionBase) throws ClientException {
        return send(HttpMethod.PATCH, sourceExactMatchSessionBase);
    }

    /**
     * Creates a ExactMatchSessionBase with a new object
     *
     * @param newExactMatchSessionBase the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExactMatchSessionBase> postAsync(@Nonnull final ExactMatchSessionBase newExactMatchSessionBase) {
        return sendAsync(HttpMethod.POST, newExactMatchSessionBase);
    }

    /**
     * Creates a ExactMatchSessionBase with a new object
     *
     * @param newExactMatchSessionBase the new object to create
     * @return the created ExactMatchSessionBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExactMatchSessionBase post(@Nonnull final ExactMatchSessionBase newExactMatchSessionBase) throws ClientException {
        return send(HttpMethod.POST, newExactMatchSessionBase);
    }

    /**
     * Creates a ExactMatchSessionBase with a new object
     *
     * @param newExactMatchSessionBase the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ExactMatchSessionBase> putAsync(@Nonnull final ExactMatchSessionBase newExactMatchSessionBase) {
        return sendAsync(HttpMethod.PUT, newExactMatchSessionBase);
    }

    /**
     * Creates a ExactMatchSessionBase with a new object
     *
     * @param newExactMatchSessionBase the object to create/update
     * @return the created ExactMatchSessionBase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ExactMatchSessionBase put(@Nonnull final ExactMatchSessionBase newExactMatchSessionBase) throws ClientException {
        return send(HttpMethod.PUT, newExactMatchSessionBase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ExactMatchSessionBaseRequest select(@Nonnull final String value) {
         addSelectOption(value);
         return this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     @Nonnull
     public ExactMatchSessionBaseRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


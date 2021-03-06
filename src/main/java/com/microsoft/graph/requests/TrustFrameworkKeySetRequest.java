// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TrustFrameworkKeySet;
import com.microsoft.graph.models.TrustFrameworkKey;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trust Framework Key Set Request.
 */
public class TrustFrameworkKeySetRequest extends BaseRequest<TrustFrameworkKeySet> {
	
    /**
     * The request for the TrustFrameworkKeySet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TrustFrameworkKeySetRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TrustFrameworkKeySet.class);
    }

    /**
     * Gets the TrustFrameworkKeySet from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TrustFrameworkKeySet> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TrustFrameworkKeySet from the service
     *
     * @return the TrustFrameworkKeySet from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TrustFrameworkKeySet get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TrustFrameworkKeySet> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TrustFrameworkKeySet delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TrustFrameworkKeySet with a source
     *
     * @param sourceTrustFrameworkKeySet the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TrustFrameworkKeySet> patchAsync(@Nonnull final TrustFrameworkKeySet sourceTrustFrameworkKeySet) {
        return sendAsync(HttpMethod.PATCH, sourceTrustFrameworkKeySet);
    }

    /**
     * Patches this TrustFrameworkKeySet with a source
     *
     * @param sourceTrustFrameworkKeySet the source object with updates
     * @return the updated TrustFrameworkKeySet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TrustFrameworkKeySet patch(@Nonnull final TrustFrameworkKeySet sourceTrustFrameworkKeySet) throws ClientException {
        return send(HttpMethod.PATCH, sourceTrustFrameworkKeySet);
    }

    /**
     * Creates a TrustFrameworkKeySet with a new object
     *
     * @param newTrustFrameworkKeySet the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TrustFrameworkKeySet> postAsync(@Nonnull final TrustFrameworkKeySet newTrustFrameworkKeySet) {
        return sendAsync(HttpMethod.POST, newTrustFrameworkKeySet);
    }

    /**
     * Creates a TrustFrameworkKeySet with a new object
     *
     * @param newTrustFrameworkKeySet the new object to create
     * @return the created TrustFrameworkKeySet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TrustFrameworkKeySet post(@Nonnull final TrustFrameworkKeySet newTrustFrameworkKeySet) throws ClientException {
        return send(HttpMethod.POST, newTrustFrameworkKeySet);
    }

    /**
     * Creates a TrustFrameworkKeySet with a new object
     *
     * @param newTrustFrameworkKeySet the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TrustFrameworkKeySet> putAsync(@Nonnull final TrustFrameworkKeySet newTrustFrameworkKeySet) {
        return sendAsync(HttpMethod.PUT, newTrustFrameworkKeySet);
    }

    /**
     * Creates a TrustFrameworkKeySet with a new object
     *
     * @param newTrustFrameworkKeySet the object to create/update
     * @return the created TrustFrameworkKeySet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TrustFrameworkKeySet put(@Nonnull final TrustFrameworkKeySet newTrustFrameworkKeySet) throws ClientException {
        return send(HttpMethod.PUT, newTrustFrameworkKeySet);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TrustFrameworkKeySetRequest select(@Nonnull final String value) {
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
     public TrustFrameworkKeySetRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


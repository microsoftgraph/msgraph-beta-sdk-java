// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Schema;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schema Request.
 * @deprecated The OData type annotation for this entity is being deprecated by Aug 2021. Please strip the @odata.type annotations for this specific entity from your request payloads before the deprecation date.
 */
@Deprecated
public class SchemaRequest extends BaseRequest<Schema> {
	
    /**
     * The request for the Schema
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SchemaRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Schema.class);
    }

    /**
     * Gets the Schema from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Schema> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the Schema from the service
     *
     * @return the Schema from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Schema get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Schema> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public Schema delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this Schema with a source
     *
     * @param sourceSchema the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Schema> patchAsync(@Nonnull final Schema sourceSchema) {
        return sendAsync(HttpMethod.PATCH, sourceSchema);
    }

    /**
     * Patches this Schema with a source
     *
     * @param sourceSchema the source object with updates
     * @return the updated Schema
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Schema patch(@Nonnull final Schema sourceSchema) throws ClientException {
        return send(HttpMethod.PATCH, sourceSchema);
    }

    /**
     * Creates a Schema with a new object
     *
     * @param newSchema the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Schema> postAsync(@Nonnull final Schema newSchema) {
        return sendAsync(HttpMethod.POST, newSchema);
    }

    /**
     * Creates a Schema with a new object
     *
     * @param newSchema the new object to create
     * @return the created Schema
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Schema post(@Nonnull final Schema newSchema) throws ClientException {
        return send(HttpMethod.POST, newSchema);
    }

    /**
     * Creates a Schema with a new object
     *
     * @param newSchema the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<Schema> putAsync(@Nonnull final Schema newSchema) {
        return sendAsync(HttpMethod.PUT, newSchema);
    }

    /**
     * Creates a Schema with a new object
     *
     * @param newSchema the object to create/update
     * @return the created Schema
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Schema put(@Nonnull final Schema newSchema) throws ClientException {
        return send(HttpMethod.PUT, newSchema);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public SchemaRequest select(@Nonnull final String value) {
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
     public SchemaRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


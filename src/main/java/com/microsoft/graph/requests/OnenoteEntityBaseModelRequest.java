// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.OnenoteEntityBaseModel;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Onenote Entity Base Model Request.
 */
public class OnenoteEntityBaseModelRequest extends BaseRequest<OnenoteEntityBaseModel> {
	
    /**
     * The request for the OnenoteEntityBaseModel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public OnenoteEntityBaseModelRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends OnenoteEntityBaseModel> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the OnenoteEntityBaseModel
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnenoteEntityBaseModelRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OnenoteEntityBaseModel.class);
    }

    /**
     * Gets the OnenoteEntityBaseModel from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenoteEntityBaseModel> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the OnenoteEntityBaseModel from the service
     *
     * @return the OnenoteEntityBaseModel from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteEntityBaseModel get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenoteEntityBaseModel> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public OnenoteEntityBaseModel delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this OnenoteEntityBaseModel with a source
     *
     * @param sourceOnenoteEntityBaseModel the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenoteEntityBaseModel> patchAsync(@Nonnull final OnenoteEntityBaseModel sourceOnenoteEntityBaseModel) {
        return sendAsync(HttpMethod.PATCH, sourceOnenoteEntityBaseModel);
    }

    /**
     * Patches this OnenoteEntityBaseModel with a source
     *
     * @param sourceOnenoteEntityBaseModel the source object with updates
     * @return the updated OnenoteEntityBaseModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteEntityBaseModel patch(@Nonnull final OnenoteEntityBaseModel sourceOnenoteEntityBaseModel) throws ClientException {
        return send(HttpMethod.PATCH, sourceOnenoteEntityBaseModel);
    }

    /**
     * Creates a OnenoteEntityBaseModel with a new object
     *
     * @param newOnenoteEntityBaseModel the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenoteEntityBaseModel> postAsync(@Nonnull final OnenoteEntityBaseModel newOnenoteEntityBaseModel) {
        return sendAsync(HttpMethod.POST, newOnenoteEntityBaseModel);
    }

    /**
     * Creates a OnenoteEntityBaseModel with a new object
     *
     * @param newOnenoteEntityBaseModel the new object to create
     * @return the created OnenoteEntityBaseModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteEntityBaseModel post(@Nonnull final OnenoteEntityBaseModel newOnenoteEntityBaseModel) throws ClientException {
        return send(HttpMethod.POST, newOnenoteEntityBaseModel);
    }

    /**
     * Creates a OnenoteEntityBaseModel with a new object
     *
     * @param newOnenoteEntityBaseModel the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<OnenoteEntityBaseModel> putAsync(@Nonnull final OnenoteEntityBaseModel newOnenoteEntityBaseModel) {
        return sendAsync(HttpMethod.PUT, newOnenoteEntityBaseModel);
    }

    /**
     * Creates a OnenoteEntityBaseModel with a new object
     *
     * @param newOnenoteEntityBaseModel the object to create/update
     * @return the created OnenoteEntityBaseModel
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public OnenoteEntityBaseModel put(@Nonnull final OnenoteEntityBaseModel newOnenoteEntityBaseModel) throws ClientException {
        return send(HttpMethod.PUT, newOnenoteEntityBaseModel);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public OnenoteEntityBaseModelRequest select(@Nonnull final String value) {
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
     public OnenoteEntityBaseModelRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


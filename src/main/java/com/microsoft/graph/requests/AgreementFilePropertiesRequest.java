// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AgreementFileProperties;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Agreement File Properties Request.
 */
public class AgreementFilePropertiesRequest extends BaseRequest<AgreementFileProperties> {
	
    /**
     * The request for the AgreementFileProperties
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public AgreementFilePropertiesRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends AgreementFileProperties> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the AgreementFileProperties
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AgreementFilePropertiesRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AgreementFileProperties.class);
    }

    /**
     * Gets the AgreementFileProperties from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AgreementFileProperties> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AgreementFileProperties from the service
     *
     * @return the AgreementFileProperties from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AgreementFileProperties get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AgreementFileProperties> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AgreementFileProperties delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AgreementFileProperties with a source
     *
     * @param sourceAgreementFileProperties the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AgreementFileProperties> patchAsync(@Nonnull final AgreementFileProperties sourceAgreementFileProperties) {
        return sendAsync(HttpMethod.PATCH, sourceAgreementFileProperties);
    }

    /**
     * Patches this AgreementFileProperties with a source
     *
     * @param sourceAgreementFileProperties the source object with updates
     * @return the updated AgreementFileProperties
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AgreementFileProperties patch(@Nonnull final AgreementFileProperties sourceAgreementFileProperties) throws ClientException {
        return send(HttpMethod.PATCH, sourceAgreementFileProperties);
    }

    /**
     * Creates a AgreementFileProperties with a new object
     *
     * @param newAgreementFileProperties the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AgreementFileProperties> postAsync(@Nonnull final AgreementFileProperties newAgreementFileProperties) {
        return sendAsync(HttpMethod.POST, newAgreementFileProperties);
    }

    /**
     * Creates a AgreementFileProperties with a new object
     *
     * @param newAgreementFileProperties the new object to create
     * @return the created AgreementFileProperties
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AgreementFileProperties post(@Nonnull final AgreementFileProperties newAgreementFileProperties) throws ClientException {
        return send(HttpMethod.POST, newAgreementFileProperties);
    }

    /**
     * Creates a AgreementFileProperties with a new object
     *
     * @param newAgreementFileProperties the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AgreementFileProperties> putAsync(@Nonnull final AgreementFileProperties newAgreementFileProperties) {
        return sendAsync(HttpMethod.PUT, newAgreementFileProperties);
    }

    /**
     * Creates a AgreementFileProperties with a new object
     *
     * @param newAgreementFileProperties the object to create/update
     * @return the created AgreementFileProperties
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AgreementFileProperties put(@Nonnull final AgreementFileProperties newAgreementFileProperties) throws ClientException {
        return send(HttpMethod.PUT, newAgreementFileProperties);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AgreementFilePropertiesRequest select(@Nonnull final String value) {
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
     public AgreementFilePropertiesRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


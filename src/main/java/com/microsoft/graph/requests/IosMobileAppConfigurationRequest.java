// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IosMobileAppConfiguration;
import com.microsoft.graph.models.ManagedDeviceMobileAppConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Mobile App Configuration Request.
 */
public class IosMobileAppConfigurationRequest extends BaseRequest<IosMobileAppConfiguration> {
	
    /**
     * The request for the IosMobileAppConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosMobileAppConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosMobileAppConfiguration.class);
    }

    /**
     * Gets the IosMobileAppConfiguration from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosMobileAppConfiguration> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the IosMobileAppConfiguration from the service
     *
     * @return the IosMobileAppConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosMobileAppConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosMobileAppConfiguration> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public IosMobileAppConfiguration delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this IosMobileAppConfiguration with a source
     *
     * @param sourceIosMobileAppConfiguration the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosMobileAppConfiguration> patchAsync(@Nonnull final IosMobileAppConfiguration sourceIosMobileAppConfiguration) {
        return sendAsync(HttpMethod.PATCH, sourceIosMobileAppConfiguration);
    }

    /**
     * Patches this IosMobileAppConfiguration with a source
     *
     * @param sourceIosMobileAppConfiguration the source object with updates
     * @return the updated IosMobileAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosMobileAppConfiguration patch(@Nonnull final IosMobileAppConfiguration sourceIosMobileAppConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosMobileAppConfiguration);
    }

    /**
     * Creates a IosMobileAppConfiguration with a new object
     *
     * @param newIosMobileAppConfiguration the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosMobileAppConfiguration> postAsync(@Nonnull final IosMobileAppConfiguration newIosMobileAppConfiguration) {
        return sendAsync(HttpMethod.POST, newIosMobileAppConfiguration);
    }

    /**
     * Creates a IosMobileAppConfiguration with a new object
     *
     * @param newIosMobileAppConfiguration the new object to create
     * @return the created IosMobileAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosMobileAppConfiguration post(@Nonnull final IosMobileAppConfiguration newIosMobileAppConfiguration) throws ClientException {
        return send(HttpMethod.POST, newIosMobileAppConfiguration);
    }

    /**
     * Creates a IosMobileAppConfiguration with a new object
     *
     * @param newIosMobileAppConfiguration the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IosMobileAppConfiguration> putAsync(@Nonnull final IosMobileAppConfiguration newIosMobileAppConfiguration) {
        return sendAsync(HttpMethod.PUT, newIosMobileAppConfiguration);
    }

    /**
     * Creates a IosMobileAppConfiguration with a new object
     *
     * @param newIosMobileAppConfiguration the object to create/update
     * @return the created IosMobileAppConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public IosMobileAppConfiguration put(@Nonnull final IosMobileAppConfiguration newIosMobileAppConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newIosMobileAppConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public IosMobileAppConfigurationRequest select(@Nonnull final String value) {
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
     public IosMobileAppConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


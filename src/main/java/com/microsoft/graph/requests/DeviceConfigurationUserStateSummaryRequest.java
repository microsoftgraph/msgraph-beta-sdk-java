// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceConfigurationUserStateSummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration User State Summary Request.
 */
public class DeviceConfigurationUserStateSummaryRequest extends BaseRequest<DeviceConfigurationUserStateSummary> {
	
    /**
     * The request for the DeviceConfigurationUserStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationUserStateSummaryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationUserStateSummary.class);
    }

    /**
     * Gets the DeviceConfigurationUserStateSummary from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfigurationUserStateSummary> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceConfigurationUserStateSummary from the service
     *
     * @return the DeviceConfigurationUserStateSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfigurationUserStateSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfigurationUserStateSummary> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceConfigurationUserStateSummary delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceConfigurationUserStateSummary with a source
     *
     * @param sourceDeviceConfigurationUserStateSummary the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfigurationUserStateSummary> patchAsync(@Nonnull final DeviceConfigurationUserStateSummary sourceDeviceConfigurationUserStateSummary) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceConfigurationUserStateSummary);
    }

    /**
     * Patches this DeviceConfigurationUserStateSummary with a source
     *
     * @param sourceDeviceConfigurationUserStateSummary the source object with updates
     * @return the updated DeviceConfigurationUserStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfigurationUserStateSummary patch(@Nonnull final DeviceConfigurationUserStateSummary sourceDeviceConfigurationUserStateSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceConfigurationUserStateSummary);
    }

    /**
     * Creates a DeviceConfigurationUserStateSummary with a new object
     *
     * @param newDeviceConfigurationUserStateSummary the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfigurationUserStateSummary> postAsync(@Nonnull final DeviceConfigurationUserStateSummary newDeviceConfigurationUserStateSummary) {
        return sendAsync(HttpMethod.POST, newDeviceConfigurationUserStateSummary);
    }

    /**
     * Creates a DeviceConfigurationUserStateSummary with a new object
     *
     * @param newDeviceConfigurationUserStateSummary the new object to create
     * @return the created DeviceConfigurationUserStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfigurationUserStateSummary post(@Nonnull final DeviceConfigurationUserStateSummary newDeviceConfigurationUserStateSummary) throws ClientException {
        return send(HttpMethod.POST, newDeviceConfigurationUserStateSummary);
    }

    /**
     * Creates a DeviceConfigurationUserStateSummary with a new object
     *
     * @param newDeviceConfigurationUserStateSummary the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceConfigurationUserStateSummary> putAsync(@Nonnull final DeviceConfigurationUserStateSummary newDeviceConfigurationUserStateSummary) {
        return sendAsync(HttpMethod.PUT, newDeviceConfigurationUserStateSummary);
    }

    /**
     * Creates a DeviceConfigurationUserStateSummary with a new object
     *
     * @param newDeviceConfigurationUserStateSummary the object to create/update
     * @return the created DeviceConfigurationUserStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceConfigurationUserStateSummary put(@Nonnull final DeviceConfigurationUserStateSummary newDeviceConfigurationUserStateSummary) throws ClientException {
        return send(HttpMethod.PUT, newDeviceConfigurationUserStateSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceConfigurationUserStateSummaryRequest select(@Nonnull final String value) {
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
     public DeviceConfigurationUserStateSummaryRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


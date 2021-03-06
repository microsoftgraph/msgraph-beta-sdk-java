// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagementSettingInstance;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Setting Instance Request.
 */
public class DeviceManagementSettingInstanceRequest extends BaseRequest<DeviceManagementSettingInstance> {
	
    /**
     * The request for the DeviceManagementSettingInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public DeviceManagementSettingInstanceRequest(@Nonnull final String requestUrl,
            @Nonnull final IBaseClient<?> client,
            @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            @Nonnull final Class<? extends DeviceManagementSettingInstance> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the DeviceManagementSettingInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementSettingInstanceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementSettingInstance.class);
    }

    /**
     * Gets the DeviceManagementSettingInstance from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementSettingInstance> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceManagementSettingInstance from the service
     *
     * @return the DeviceManagementSettingInstance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementSettingInstance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementSettingInstance> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceManagementSettingInstance delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagementSettingInstance with a source
     *
     * @param sourceDeviceManagementSettingInstance the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementSettingInstance> patchAsync(@Nonnull final DeviceManagementSettingInstance sourceDeviceManagementSettingInstance) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceManagementSettingInstance);
    }

    /**
     * Patches this DeviceManagementSettingInstance with a source
     *
     * @param sourceDeviceManagementSettingInstance the source object with updates
     * @return the updated DeviceManagementSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementSettingInstance patch(@Nonnull final DeviceManagementSettingInstance sourceDeviceManagementSettingInstance) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementSettingInstance);
    }

    /**
     * Creates a DeviceManagementSettingInstance with a new object
     *
     * @param newDeviceManagementSettingInstance the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementSettingInstance> postAsync(@Nonnull final DeviceManagementSettingInstance newDeviceManagementSettingInstance) {
        return sendAsync(HttpMethod.POST, newDeviceManagementSettingInstance);
    }

    /**
     * Creates a DeviceManagementSettingInstance with a new object
     *
     * @param newDeviceManagementSettingInstance the new object to create
     * @return the created DeviceManagementSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementSettingInstance post(@Nonnull final DeviceManagementSettingInstance newDeviceManagementSettingInstance) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementSettingInstance);
    }

    /**
     * Creates a DeviceManagementSettingInstance with a new object
     *
     * @param newDeviceManagementSettingInstance the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementSettingInstance> putAsync(@Nonnull final DeviceManagementSettingInstance newDeviceManagementSettingInstance) {
        return sendAsync(HttpMethod.PUT, newDeviceManagementSettingInstance);
    }

    /**
     * Creates a DeviceManagementSettingInstance with a new object
     *
     * @param newDeviceManagementSettingInstance the object to create/update
     * @return the created DeviceManagementSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementSettingInstance put(@Nonnull final DeviceManagementSettingInstance newDeviceManagementSettingInstance) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementSettingInstance);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementSettingInstanceRequest select(@Nonnull final String value) {
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
     public DeviceManagementSettingInstanceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


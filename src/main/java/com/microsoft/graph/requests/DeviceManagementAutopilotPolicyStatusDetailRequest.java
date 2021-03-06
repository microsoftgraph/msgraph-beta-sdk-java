// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceManagementAutopilotPolicyStatusDetail;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Autopilot Policy Status Detail Request.
 */
public class DeviceManagementAutopilotPolicyStatusDetailRequest extends BaseRequest<DeviceManagementAutopilotPolicyStatusDetail> {
	
    /**
     * The request for the DeviceManagementAutopilotPolicyStatusDetail
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementAutopilotPolicyStatusDetailRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementAutopilotPolicyStatusDetail.class);
    }

    /**
     * Gets the DeviceManagementAutopilotPolicyStatusDetail from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementAutopilotPolicyStatusDetail> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the DeviceManagementAutopilotPolicyStatusDetail from the service
     *
     * @return the DeviceManagementAutopilotPolicyStatusDetail from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementAutopilotPolicyStatusDetail get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementAutopilotPolicyStatusDetail> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public DeviceManagementAutopilotPolicyStatusDetail delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagementAutopilotPolicyStatusDetail with a source
     *
     * @param sourceDeviceManagementAutopilotPolicyStatusDetail the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementAutopilotPolicyStatusDetail> patchAsync(@Nonnull final DeviceManagementAutopilotPolicyStatusDetail sourceDeviceManagementAutopilotPolicyStatusDetail) {
        return sendAsync(HttpMethod.PATCH, sourceDeviceManagementAutopilotPolicyStatusDetail);
    }

    /**
     * Patches this DeviceManagementAutopilotPolicyStatusDetail with a source
     *
     * @param sourceDeviceManagementAutopilotPolicyStatusDetail the source object with updates
     * @return the updated DeviceManagementAutopilotPolicyStatusDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementAutopilotPolicyStatusDetail patch(@Nonnull final DeviceManagementAutopilotPolicyStatusDetail sourceDeviceManagementAutopilotPolicyStatusDetail) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementAutopilotPolicyStatusDetail);
    }

    /**
     * Creates a DeviceManagementAutopilotPolicyStatusDetail with a new object
     *
     * @param newDeviceManagementAutopilotPolicyStatusDetail the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementAutopilotPolicyStatusDetail> postAsync(@Nonnull final DeviceManagementAutopilotPolicyStatusDetail newDeviceManagementAutopilotPolicyStatusDetail) {
        return sendAsync(HttpMethod.POST, newDeviceManagementAutopilotPolicyStatusDetail);
    }

    /**
     * Creates a DeviceManagementAutopilotPolicyStatusDetail with a new object
     *
     * @param newDeviceManagementAutopilotPolicyStatusDetail the new object to create
     * @return the created DeviceManagementAutopilotPolicyStatusDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementAutopilotPolicyStatusDetail post(@Nonnull final DeviceManagementAutopilotPolicyStatusDetail newDeviceManagementAutopilotPolicyStatusDetail) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementAutopilotPolicyStatusDetail);
    }

    /**
     * Creates a DeviceManagementAutopilotPolicyStatusDetail with a new object
     *
     * @param newDeviceManagementAutopilotPolicyStatusDetail the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceManagementAutopilotPolicyStatusDetail> putAsync(@Nonnull final DeviceManagementAutopilotPolicyStatusDetail newDeviceManagementAutopilotPolicyStatusDetail) {
        return sendAsync(HttpMethod.PUT, newDeviceManagementAutopilotPolicyStatusDetail);
    }

    /**
     * Creates a DeviceManagementAutopilotPolicyStatusDetail with a new object
     *
     * @param newDeviceManagementAutopilotPolicyStatusDetail the object to create/update
     * @return the created DeviceManagementAutopilotPolicyStatusDetail
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public DeviceManagementAutopilotPolicyStatusDetail put(@Nonnull final DeviceManagementAutopilotPolicyStatusDetail newDeviceManagementAutopilotPolicyStatusDetail) throws ClientException {
        return send(HttpMethod.PUT, newDeviceManagementAutopilotPolicyStatusDetail);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public DeviceManagementAutopilotPolicyStatusDetailRequest select(@Nonnull final String value) {
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
     public DeviceManagementAutopilotPolicyStatusDetailRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedDeviceMobileAppConfigurationUserStatus;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration User Status Request.
 */
public class ManagedDeviceMobileAppConfigurationUserStatusRequest extends BaseRequest<ManagedDeviceMobileAppConfigurationUserStatus> {
	
    /**
     * The request for the ManagedDeviceMobileAppConfigurationUserStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceMobileAppConfigurationUserStatusRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedDeviceMobileAppConfigurationUserStatus.class);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfigurationUserStatus from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfigurationUserStatus> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the ManagedDeviceMobileAppConfigurationUserStatus from the service
     *
     * @return the ManagedDeviceMobileAppConfigurationUserStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfigurationUserStatus get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfigurationUserStatus> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public ManagedDeviceMobileAppConfigurationUserStatus delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagedDeviceMobileAppConfigurationUserStatus with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationUserStatus the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfigurationUserStatus> patchAsync(@Nonnull final ManagedDeviceMobileAppConfigurationUserStatus sourceManagedDeviceMobileAppConfigurationUserStatus) {
        return sendAsync(HttpMethod.PATCH, sourceManagedDeviceMobileAppConfigurationUserStatus);
    }

    /**
     * Patches this ManagedDeviceMobileAppConfigurationUserStatus with a source
     *
     * @param sourceManagedDeviceMobileAppConfigurationUserStatus the source object with updates
     * @return the updated ManagedDeviceMobileAppConfigurationUserStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfigurationUserStatus patch(@Nonnull final ManagedDeviceMobileAppConfigurationUserStatus sourceManagedDeviceMobileAppConfigurationUserStatus) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagedDeviceMobileAppConfigurationUserStatus);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationUserStatus with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationUserStatus the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfigurationUserStatus> postAsync(@Nonnull final ManagedDeviceMobileAppConfigurationUserStatus newManagedDeviceMobileAppConfigurationUserStatus) {
        return sendAsync(HttpMethod.POST, newManagedDeviceMobileAppConfigurationUserStatus);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationUserStatus with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationUserStatus the new object to create
     * @return the created ManagedDeviceMobileAppConfigurationUserStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfigurationUserStatus post(@Nonnull final ManagedDeviceMobileAppConfigurationUserStatus newManagedDeviceMobileAppConfigurationUserStatus) throws ClientException {
        return send(HttpMethod.POST, newManagedDeviceMobileAppConfigurationUserStatus);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationUserStatus with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationUserStatus the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<ManagedDeviceMobileAppConfigurationUserStatus> putAsync(@Nonnull final ManagedDeviceMobileAppConfigurationUserStatus newManagedDeviceMobileAppConfigurationUserStatus) {
        return sendAsync(HttpMethod.PUT, newManagedDeviceMobileAppConfigurationUserStatus);
    }

    /**
     * Creates a ManagedDeviceMobileAppConfigurationUserStatus with a new object
     *
     * @param newManagedDeviceMobileAppConfigurationUserStatus the object to create/update
     * @return the created ManagedDeviceMobileAppConfigurationUserStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ManagedDeviceMobileAppConfigurationUserStatus put(@Nonnull final ManagedDeviceMobileAppConfigurationUserStatus newManagedDeviceMobileAppConfigurationUserStatus) throws ClientException {
        return send(HttpMethod.PUT, newManagedDeviceMobileAppConfigurationUserStatus);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ManagedDeviceMobileAppConfigurationUserStatusRequest select(@Nonnull final String value) {
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
     public ManagedDeviceMobileAppConfigurationUserStatusRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


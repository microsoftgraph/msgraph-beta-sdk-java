// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TeamsDeviceUsageDistributionUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams Device Usage Distribution User Counts Request.
 */
public class TeamsDeviceUsageDistributionUserCountsRequest extends BaseRequest<TeamsDeviceUsageDistributionUserCounts> {
	
    /**
     * The request for the TeamsDeviceUsageDistributionUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsDeviceUsageDistributionUserCountsRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsDeviceUsageDistributionUserCounts.class);
    }

    /**
     * Gets the TeamsDeviceUsageDistributionUserCounts from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsDeviceUsageDistributionUserCounts> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TeamsDeviceUsageDistributionUserCounts from the service
     *
     * @return the TeamsDeviceUsageDistributionUserCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsDeviceUsageDistributionUserCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsDeviceUsageDistributionUserCounts> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TeamsDeviceUsageDistributionUserCounts delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TeamsDeviceUsageDistributionUserCounts with a source
     *
     * @param sourceTeamsDeviceUsageDistributionUserCounts the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsDeviceUsageDistributionUserCounts> patchAsync(@Nonnull final TeamsDeviceUsageDistributionUserCounts sourceTeamsDeviceUsageDistributionUserCounts) {
        return sendAsync(HttpMethod.PATCH, sourceTeamsDeviceUsageDistributionUserCounts);
    }

    /**
     * Patches this TeamsDeviceUsageDistributionUserCounts with a source
     *
     * @param sourceTeamsDeviceUsageDistributionUserCounts the source object with updates
     * @return the updated TeamsDeviceUsageDistributionUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsDeviceUsageDistributionUserCounts patch(@Nonnull final TeamsDeviceUsageDistributionUserCounts sourceTeamsDeviceUsageDistributionUserCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceTeamsDeviceUsageDistributionUserCounts);
    }

    /**
     * Creates a TeamsDeviceUsageDistributionUserCounts with a new object
     *
     * @param newTeamsDeviceUsageDistributionUserCounts the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsDeviceUsageDistributionUserCounts> postAsync(@Nonnull final TeamsDeviceUsageDistributionUserCounts newTeamsDeviceUsageDistributionUserCounts) {
        return sendAsync(HttpMethod.POST, newTeamsDeviceUsageDistributionUserCounts);
    }

    /**
     * Creates a TeamsDeviceUsageDistributionUserCounts with a new object
     *
     * @param newTeamsDeviceUsageDistributionUserCounts the new object to create
     * @return the created TeamsDeviceUsageDistributionUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsDeviceUsageDistributionUserCounts post(@Nonnull final TeamsDeviceUsageDistributionUserCounts newTeamsDeviceUsageDistributionUserCounts) throws ClientException {
        return send(HttpMethod.POST, newTeamsDeviceUsageDistributionUserCounts);
    }

    /**
     * Creates a TeamsDeviceUsageDistributionUserCounts with a new object
     *
     * @param newTeamsDeviceUsageDistributionUserCounts the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsDeviceUsageDistributionUserCounts> putAsync(@Nonnull final TeamsDeviceUsageDistributionUserCounts newTeamsDeviceUsageDistributionUserCounts) {
        return sendAsync(HttpMethod.PUT, newTeamsDeviceUsageDistributionUserCounts);
    }

    /**
     * Creates a TeamsDeviceUsageDistributionUserCounts with a new object
     *
     * @param newTeamsDeviceUsageDistributionUserCounts the object to create/update
     * @return the created TeamsDeviceUsageDistributionUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsDeviceUsageDistributionUserCounts put(@Nonnull final TeamsDeviceUsageDistributionUserCounts newTeamsDeviceUsageDistributionUserCounts) throws ClientException {
        return send(HttpMethod.PUT, newTeamsDeviceUsageDistributionUserCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TeamsDeviceUsageDistributionUserCountsRequest select(@Nonnull final String value) {
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
     public TeamsDeviceUsageDistributionUserCountsRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


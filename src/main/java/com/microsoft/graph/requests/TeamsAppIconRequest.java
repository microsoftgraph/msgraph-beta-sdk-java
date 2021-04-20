// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.TeamsAppIcon;
import com.microsoft.graph.requests.TeamworkHostedContentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Teams App Icon Request.
 */
public class TeamsAppIconRequest extends BaseRequest<TeamsAppIcon> {
	
    /**
     * The request for the TeamsAppIcon
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TeamsAppIconRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TeamsAppIcon.class);
    }

    /**
     * Gets the TeamsAppIcon from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppIcon> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the TeamsAppIcon from the service
     *
     * @return the TeamsAppIcon from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAppIcon get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppIcon> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public TeamsAppIcon delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this TeamsAppIcon with a source
     *
     * @param sourceTeamsAppIcon the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppIcon> patchAsync(@Nonnull final TeamsAppIcon sourceTeamsAppIcon) {
        return sendAsync(HttpMethod.PATCH, sourceTeamsAppIcon);
    }

    /**
     * Patches this TeamsAppIcon with a source
     *
     * @param sourceTeamsAppIcon the source object with updates
     * @return the updated TeamsAppIcon
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAppIcon patch(@Nonnull final TeamsAppIcon sourceTeamsAppIcon) throws ClientException {
        return send(HttpMethod.PATCH, sourceTeamsAppIcon);
    }

    /**
     * Creates a TeamsAppIcon with a new object
     *
     * @param newTeamsAppIcon the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppIcon> postAsync(@Nonnull final TeamsAppIcon newTeamsAppIcon) {
        return sendAsync(HttpMethod.POST, newTeamsAppIcon);
    }

    /**
     * Creates a TeamsAppIcon with a new object
     *
     * @param newTeamsAppIcon the new object to create
     * @return the created TeamsAppIcon
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAppIcon post(@Nonnull final TeamsAppIcon newTeamsAppIcon) throws ClientException {
        return send(HttpMethod.POST, newTeamsAppIcon);
    }

    /**
     * Creates a TeamsAppIcon with a new object
     *
     * @param newTeamsAppIcon the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<TeamsAppIcon> putAsync(@Nonnull final TeamsAppIcon newTeamsAppIcon) {
        return sendAsync(HttpMethod.PUT, newTeamsAppIcon);
    }

    /**
     * Creates a TeamsAppIcon with a new object
     *
     * @param newTeamsAppIcon the object to create/update
     * @return the created TeamsAppIcon
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public TeamsAppIcon put(@Nonnull final TeamsAppIcon newTeamsAppIcon) throws ClientException {
        return send(HttpMethod.PUT, newTeamsAppIcon);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TeamsAppIconRequest select(@Nonnull final String value) {
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
     public TeamsAppIconRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

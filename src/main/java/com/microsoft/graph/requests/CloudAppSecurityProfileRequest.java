// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.CloudAppSecurityProfile;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud App Security Profile Request.
 */
public class CloudAppSecurityProfileRequest extends BaseRequest<CloudAppSecurityProfile> {
	
    /**
     * The request for the CloudAppSecurityProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CloudAppSecurityProfileRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CloudAppSecurityProfile.class);
    }

    /**
     * Gets the CloudAppSecurityProfile from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CloudAppSecurityProfile> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the CloudAppSecurityProfile from the service
     *
     * @return the CloudAppSecurityProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CloudAppSecurityProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CloudAppSecurityProfile> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public CloudAppSecurityProfile delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this CloudAppSecurityProfile with a source
     *
     * @param sourceCloudAppSecurityProfile the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CloudAppSecurityProfile> patchAsync(@Nonnull final CloudAppSecurityProfile sourceCloudAppSecurityProfile) {
        return sendAsync(HttpMethod.PATCH, sourceCloudAppSecurityProfile);
    }

    /**
     * Patches this CloudAppSecurityProfile with a source
     *
     * @param sourceCloudAppSecurityProfile the source object with updates
     * @return the updated CloudAppSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CloudAppSecurityProfile patch(@Nonnull final CloudAppSecurityProfile sourceCloudAppSecurityProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceCloudAppSecurityProfile);
    }

    /**
     * Creates a CloudAppSecurityProfile with a new object
     *
     * @param newCloudAppSecurityProfile the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CloudAppSecurityProfile> postAsync(@Nonnull final CloudAppSecurityProfile newCloudAppSecurityProfile) {
        return sendAsync(HttpMethod.POST, newCloudAppSecurityProfile);
    }

    /**
     * Creates a CloudAppSecurityProfile with a new object
     *
     * @param newCloudAppSecurityProfile the new object to create
     * @return the created CloudAppSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CloudAppSecurityProfile post(@Nonnull final CloudAppSecurityProfile newCloudAppSecurityProfile) throws ClientException {
        return send(HttpMethod.POST, newCloudAppSecurityProfile);
    }

    /**
     * Creates a CloudAppSecurityProfile with a new object
     *
     * @param newCloudAppSecurityProfile the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CloudAppSecurityProfile> putAsync(@Nonnull final CloudAppSecurityProfile newCloudAppSecurityProfile) {
        return sendAsync(HttpMethod.PUT, newCloudAppSecurityProfile);
    }

    /**
     * Creates a CloudAppSecurityProfile with a new object
     *
     * @param newCloudAppSecurityProfile the object to create/update
     * @return the created CloudAppSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public CloudAppSecurityProfile put(@Nonnull final CloudAppSecurityProfile newCloudAppSecurityProfile) throws ClientException {
        return send(HttpMethod.PUT, newCloudAppSecurityProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public CloudAppSecurityProfileRequest select(@Nonnull final String value) {
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
     public CloudAppSecurityProfileRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AzureADWindowsAutopilotDeploymentProfile;
import com.microsoft.graph.models.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Azure ADWindows Autopilot Deployment Profile Request.
 */
public class AzureADWindowsAutopilotDeploymentProfileRequest extends BaseRequest<AzureADWindowsAutopilotDeploymentProfile> {
	
    /**
     * The request for the AzureADWindowsAutopilotDeploymentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AzureADWindowsAutopilotDeploymentProfileRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AzureADWindowsAutopilotDeploymentProfile.class);
    }

    /**
     * Gets the AzureADWindowsAutopilotDeploymentProfile from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AzureADWindowsAutopilotDeploymentProfile> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the AzureADWindowsAutopilotDeploymentProfile from the service
     *
     * @return the AzureADWindowsAutopilotDeploymentProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AzureADWindowsAutopilotDeploymentProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AzureADWindowsAutopilotDeploymentProfile> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public AzureADWindowsAutopilotDeploymentProfile delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AzureADWindowsAutopilotDeploymentProfile with a source
     *
     * @param sourceAzureADWindowsAutopilotDeploymentProfile the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AzureADWindowsAutopilotDeploymentProfile> patchAsync(@Nonnull final AzureADWindowsAutopilotDeploymentProfile sourceAzureADWindowsAutopilotDeploymentProfile) {
        return sendAsync(HttpMethod.PATCH, sourceAzureADWindowsAutopilotDeploymentProfile);
    }

    /**
     * Patches this AzureADWindowsAutopilotDeploymentProfile with a source
     *
     * @param sourceAzureADWindowsAutopilotDeploymentProfile the source object with updates
     * @return the updated AzureADWindowsAutopilotDeploymentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AzureADWindowsAutopilotDeploymentProfile patch(@Nonnull final AzureADWindowsAutopilotDeploymentProfile sourceAzureADWindowsAutopilotDeploymentProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceAzureADWindowsAutopilotDeploymentProfile);
    }

    /**
     * Creates a AzureADWindowsAutopilotDeploymentProfile with a new object
     *
     * @param newAzureADWindowsAutopilotDeploymentProfile the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AzureADWindowsAutopilotDeploymentProfile> postAsync(@Nonnull final AzureADWindowsAutopilotDeploymentProfile newAzureADWindowsAutopilotDeploymentProfile) {
        return sendAsync(HttpMethod.POST, newAzureADWindowsAutopilotDeploymentProfile);
    }

    /**
     * Creates a AzureADWindowsAutopilotDeploymentProfile with a new object
     *
     * @param newAzureADWindowsAutopilotDeploymentProfile the new object to create
     * @return the created AzureADWindowsAutopilotDeploymentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AzureADWindowsAutopilotDeploymentProfile post(@Nonnull final AzureADWindowsAutopilotDeploymentProfile newAzureADWindowsAutopilotDeploymentProfile) throws ClientException {
        return send(HttpMethod.POST, newAzureADWindowsAutopilotDeploymentProfile);
    }

    /**
     * Creates a AzureADWindowsAutopilotDeploymentProfile with a new object
     *
     * @param newAzureADWindowsAutopilotDeploymentProfile the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<AzureADWindowsAutopilotDeploymentProfile> putAsync(@Nonnull final AzureADWindowsAutopilotDeploymentProfile newAzureADWindowsAutopilotDeploymentProfile) {
        return sendAsync(HttpMethod.PUT, newAzureADWindowsAutopilotDeploymentProfile);
    }

    /**
     * Creates a AzureADWindowsAutopilotDeploymentProfile with a new object
     *
     * @param newAzureADWindowsAutopilotDeploymentProfile the object to create/update
     * @return the created AzureADWindowsAutopilotDeploymentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AzureADWindowsAutopilotDeploymentProfile put(@Nonnull final AzureADWindowsAutopilotDeploymentProfile newAzureADWindowsAutopilotDeploymentProfile) throws ClientException {
        return send(HttpMethod.PUT, newAzureADWindowsAutopilotDeploymentProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AzureADWindowsAutopilotDeploymentProfileRequest select(@Nonnull final String value) {
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
     public AzureADWindowsAutopilotDeploymentProfileRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.requests;
import com.microsoft.graph.windowsupdates.requests.DeploymentAudienceUpdateAudienceByIdRequest;
import com.microsoft.graph.windowsupdates.models.DeploymentAudience;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.windowsupdates.models.DeploymentAudienceUpdateAudienceByIdParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Deployment Audience Update Audience By Id Request Builder.
 */
public class DeploymentAudienceUpdateAudienceByIdRequestBuilder extends BaseActionRequestBuilder<DeploymentAudience> {

    /**
     * The request builder for this DeploymentAudienceUpdateAudienceById
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeploymentAudienceUpdateAudienceByIdRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private DeploymentAudienceUpdateAudienceByIdParameterSet body;
    /**
     * The request builder for this DeploymentAudienceUpdateAudienceById
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeploymentAudienceUpdateAudienceByIdRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeploymentAudienceUpdateAudienceByIdParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the DeploymentAudienceUpdateAudienceByIdRequest
     *
     * @param requestOptions the options for the request
     * @return the DeploymentAudienceUpdateAudienceByIdRequest instance
     */
    @Nonnull
    public DeploymentAudienceUpdateAudienceByIdRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeploymentAudienceUpdateAudienceByIdRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeploymentAudienceUpdateAudienceByIdRequest instance
     */
    @Nonnull
    public DeploymentAudienceUpdateAudienceByIdRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DeploymentAudienceUpdateAudienceByIdRequest request = new DeploymentAudienceUpdateAudienceByIdRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
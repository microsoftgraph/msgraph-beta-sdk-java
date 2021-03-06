// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ManagedAppPolicyTargetAppsRequest;
import com.microsoft.graph.models.ManagedAppPolicy;
import com.microsoft.graph.models.ManagedMobileApp;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.ManagedAppPolicyTargetAppsParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Policy Target Apps Request Builder.
 */
public class ManagedAppPolicyTargetAppsRequestBuilder extends BaseActionRequestBuilder<ManagedAppPolicy> {

    /**
     * The request builder for this ManagedAppPolicyTargetApps
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppPolicyTargetAppsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private ManagedAppPolicyTargetAppsParameterSet body;
    /**
     * The request builder for this ManagedAppPolicyTargetApps
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ManagedAppPolicyTargetAppsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ManagedAppPolicyTargetAppsParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the ManagedAppPolicyTargetAppsRequest
     *
     * @param requestOptions the options for the request
     * @return the ManagedAppPolicyTargetAppsRequest instance
     */
    @Nonnull
    public ManagedAppPolicyTargetAppsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ManagedAppPolicyTargetAppsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ManagedAppPolicyTargetAppsRequest instance
     */
    @Nonnull
    public ManagedAppPolicyTargetAppsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ManagedAppPolicyTargetAppsRequest request = new ManagedAppPolicyTargetAppsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}

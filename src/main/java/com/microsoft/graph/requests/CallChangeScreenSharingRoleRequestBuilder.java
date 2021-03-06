// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.CallChangeScreenSharingRoleRequest;
import com.microsoft.graph.models.Call;
import com.microsoft.graph.models.ScreenSharingRole;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.CallChangeScreenSharingRoleParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Change Screen Sharing Role Request Builder.
 */
public class CallChangeScreenSharingRoleRequestBuilder extends BaseActionRequestBuilder<Call> {

    /**
     * The request builder for this CallChangeScreenSharingRole
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CallChangeScreenSharingRoleRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private CallChangeScreenSharingRoleParameterSet body;
    /**
     * The request builder for this CallChangeScreenSharingRole
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public CallChangeScreenSharingRoleRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final CallChangeScreenSharingRoleParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the CallChangeScreenSharingRoleRequest
     *
     * @param requestOptions the options for the request
     * @return the CallChangeScreenSharingRoleRequest instance
     */
    @Nonnull
    public CallChangeScreenSharingRoleRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the CallChangeScreenSharingRoleRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the CallChangeScreenSharingRoleRequest instance
     */
    @Nonnull
    public CallChangeScreenSharingRoleRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final CallChangeScreenSharingRoleRequest request = new CallChangeScreenSharingRoleRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}

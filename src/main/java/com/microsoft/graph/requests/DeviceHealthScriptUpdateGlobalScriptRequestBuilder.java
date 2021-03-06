// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.DeviceHealthScriptUpdateGlobalScriptRequest;
import com.microsoft.graph.models.DeviceHealthScript;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.DeviceHealthScriptUpdateGlobalScriptParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Health Script Update Global Script Request Builder.
 */
public class DeviceHealthScriptUpdateGlobalScriptRequestBuilder extends BaseActionRequestBuilder<String> {

    /**
     * The request builder for this DeviceHealthScriptUpdateGlobalScript
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceHealthScriptUpdateGlobalScriptRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private DeviceHealthScriptUpdateGlobalScriptParameterSet body;
    /**
     * The request builder for this DeviceHealthScriptUpdateGlobalScript
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeviceHealthScriptUpdateGlobalScriptRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeviceHealthScriptUpdateGlobalScriptParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the DeviceHealthScriptUpdateGlobalScriptRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceHealthScriptUpdateGlobalScriptRequest instance
     */
    @Nonnull
    public DeviceHealthScriptUpdateGlobalScriptRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceHealthScriptUpdateGlobalScriptRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceHealthScriptUpdateGlobalScriptRequest instance
     */
    @Nonnull
    public DeviceHealthScriptUpdateGlobalScriptRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DeviceHealthScriptUpdateGlobalScriptRequest request = new DeviceHealthScriptUpdateGlobalScriptRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}

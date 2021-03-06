// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;
import com.microsoft.graph.ediscovery.requests.SettingsResetToDefaultRequest;
import com.microsoft.graph.ediscovery.models.Settings;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Settings Reset To Default Request Builder.
 */
public class SettingsResetToDefaultRequestBuilder extends BaseActionRequestBuilder<Settings> {

    /**
     * The request builder for this SettingsResetToDefault
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SettingsResetToDefaultRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the SettingsResetToDefaultRequest
     *
     * @param requestOptions the options for the request
     * @return the SettingsResetToDefaultRequest instance
     */
    @Nonnull
    public SettingsResetToDefaultRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the SettingsResetToDefaultRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the SettingsResetToDefaultRequest instance
     */
    @Nonnull
    public SettingsResetToDefaultRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final SettingsResetToDefaultRequest request = new SettingsResetToDefaultRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}

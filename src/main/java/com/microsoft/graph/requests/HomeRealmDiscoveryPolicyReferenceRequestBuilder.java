
// Template Source: BaseEntityReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.HomeRealmDiscoveryPolicy;
import com.microsoft.graph.models.DirectoryObject;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Home Realm Discovery Policy Reference Request Builder.
 */
public class HomeRealmDiscoveryPolicyReferenceRequestBuilder extends BaseReferenceRequestBuilder<HomeRealmDiscoveryPolicy, HomeRealmDiscoveryPolicyReferenceRequest> {

    /**
     * The request builder for the HomeRealmDiscoveryPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public HomeRealmDiscoveryPolicyReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, HomeRealmDiscoveryPolicyReferenceRequest.class);
    }
}

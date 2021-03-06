// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.CloudPcOnPremisesConnection;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.CloudPcOnPremisesConnectionUpdateAdDomainPasswordParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Pc On Premises Connection Request Builder.
 */
public class CloudPcOnPremisesConnectionRequestBuilder extends BaseRequestBuilder<CloudPcOnPremisesConnection> {

    /**
     * The request builder for the CloudPcOnPremisesConnection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CloudPcOnPremisesConnectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the CloudPcOnPremisesConnectionRequest instance
     */
    @Nonnull
    public CloudPcOnPremisesConnectionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the CloudPcOnPremisesConnectionRequest instance
     */
    @Nonnull
    public CloudPcOnPremisesConnectionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.CloudPcOnPremisesConnectionRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public CloudPcOnPremisesConnectionRunHealthChecksRequestBuilder runHealthChecks() {
        return new CloudPcOnPremisesConnectionRunHealthChecksRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.runHealthChecks"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public CloudPcOnPremisesConnectionUpdateAdDomainPasswordRequestBuilder updateAdDomainPassword(@Nonnull final CloudPcOnPremisesConnectionUpdateAdDomainPasswordParameterSet parameters) {
        return new CloudPcOnPremisesConnectionUpdateAdDomainPasswordRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateAdDomainPassword"), getClient(), null, parameters);
    }
}

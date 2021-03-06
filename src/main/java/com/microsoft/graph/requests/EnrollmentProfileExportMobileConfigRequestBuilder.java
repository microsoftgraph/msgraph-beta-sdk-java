// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.EnrollmentProfileExportMobileConfigRequest;
import com.microsoft.graph.models.EnrollmentProfile;

import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Enrollment Profile Export Mobile Config Request Builder.
 */
public class EnrollmentProfileExportMobileConfigRequestBuilder extends BaseFunctionRequestBuilder<String> {

    /**
     * The request builder for this EnrollmentProfileExportMobileConfig
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EnrollmentProfileExportMobileConfigRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the EnrollmentProfileExportMobileConfigRequest
     *
     * @param requestOptions the options for the request
     * @return the EnrollmentProfileExportMobileConfigRequest instance
     */
    @Nonnull
    public EnrollmentProfileExportMobileConfigRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the EnrollmentProfileExportMobileConfigRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the EnrollmentProfileExportMobileConfigRequest instance
     */
    @Nonnull
    public EnrollmentProfileExportMobileConfigRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final EnrollmentProfileExportMobileConfigRequest request = new EnrollmentProfileExportMobileConfigRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}

// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.DeviceAndAppManagementAssignmentFilterValidateFilterRequest;
import com.microsoft.graph.models.DeviceAndAppManagementAssignmentFilter;
import com.microsoft.graph.models.DeviceAndAppManagementAssignmentFilter;
import com.microsoft.graph.models.AssignmentFilterValidationResult;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.DeviceAndAppManagementAssignmentFilterValidateFilterParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device And App Management Assignment Filter Validate Filter Request Builder.
 */
public class DeviceAndAppManagementAssignmentFilterValidateFilterRequestBuilder extends BaseActionRequestBuilder<AssignmentFilterValidationResult> {

    /**
     * The request builder for this DeviceAndAppManagementAssignmentFilterValidateFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceAndAppManagementAssignmentFilterValidateFilterRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private DeviceAndAppManagementAssignmentFilterValidateFilterParameterSet body;
    /**
     * The request builder for this DeviceAndAppManagementAssignmentFilterValidateFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DeviceAndAppManagementAssignmentFilterValidateFilterRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DeviceAndAppManagementAssignmentFilterValidateFilterParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the DeviceAndAppManagementAssignmentFilterValidateFilterRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceAndAppManagementAssignmentFilterValidateFilterRequest instance
     */
    @Nonnull
    public DeviceAndAppManagementAssignmentFilterValidateFilterRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceAndAppManagementAssignmentFilterValidateFilterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceAndAppManagementAssignmentFilterValidateFilterRequest instance
     */
    @Nonnull
    public DeviceAndAppManagementAssignmentFilterValidateFilterRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DeviceAndAppManagementAssignmentFilterValidateFilterRequest request = new DeviceAndAppManagementAssignmentFilterValidateFilterRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}

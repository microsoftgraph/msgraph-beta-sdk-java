// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.DeviceCompliancePolicy;
import com.microsoft.graph.models.DeviceCompliancePolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.DeviceCompliancePolicyAssignmentCollectionResponse;
import com.microsoft.graph.requests.DeviceCompliancePolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceCompliancePolicyAssignmentCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Assignment Collection Request.
 */
public class DeviceCompliancePolicyAssignmentCollectionRequest extends BaseEntityCollectionRequest<DeviceCompliancePolicyAssignment, DeviceCompliancePolicyAssignmentCollectionResponse, DeviceCompliancePolicyAssignmentCollectionPage> {

    /**
     * The request builder for this collection of DeviceCompliancePolicyAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyAssignmentCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCompliancePolicyAssignmentCollectionResponse.class, DeviceCompliancePolicyAssignmentCollectionPage.class, DeviceCompliancePolicyAssignmentCollectionRequestBuilder.class);
    }

    /**
     * Creates a new DeviceCompliancePolicyAssignment
     * @param newDeviceCompliancePolicyAssignment the DeviceCompliancePolicyAssignment to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<DeviceCompliancePolicyAssignment> postAsync(@Nonnull final DeviceCompliancePolicyAssignment newDeviceCompliancePolicyAssignment) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceCompliancePolicyAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newDeviceCompliancePolicyAssignment);
    }

    /**
     * Creates a new DeviceCompliancePolicyAssignment
     * @param newDeviceCompliancePolicyAssignment the DeviceCompliancePolicyAssignment to create
     * @return the newly created object
     */
    @Nonnull
    public DeviceCompliancePolicyAssignment post(@Nonnull final DeviceCompliancePolicyAssignment newDeviceCompliancePolicyAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceCompliancePolicyAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceCompliancePolicyAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public DeviceCompliancePolicyAssignmentCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public DeviceCompliancePolicyAssignmentCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public DeviceCompliancePolicyAssignmentCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public DeviceCompliancePolicyAssignmentCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public DeviceCompliancePolicyAssignmentCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public DeviceCompliancePolicyAssignmentCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public DeviceCompliancePolicyAssignmentCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public DeviceCompliancePolicyAssignmentCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public DeviceCompliancePolicyAssignmentCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}


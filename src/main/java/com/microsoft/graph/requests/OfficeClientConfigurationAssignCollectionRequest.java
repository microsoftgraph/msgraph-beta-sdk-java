// Template Source: BaseMethodCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.OfficeClientConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.OfficeClientConfigurationAssignCollectionRequestBuilder;
import com.microsoft.graph.requests.OfficeClientConfigurationAssignCollectionResponse;
import com.microsoft.graph.models.OfficeClientConfigurationAssignment;
import com.microsoft.graph.models.OfficeClientConfigurationAssignParameterSet;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseActionCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office Client Configuration Assign Collection Request.
 */
public class OfficeClientConfigurationAssignCollectionRequest extends BaseActionCollectionRequest<OfficeClientConfigurationAssignment, OfficeClientConfigurationAssignCollectionResponse, OfficeClientConfigurationAssignCollectionPage> {


    /** The body for the method */
    @Nullable
    public OfficeClientConfigurationAssignParameterSet body;


    /**
     * The request for this OfficeClientConfigurationAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OfficeClientConfigurationAssignCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OfficeClientConfigurationAssignCollectionResponse.class, OfficeClientConfigurationAssignCollectionPage.class, OfficeClientConfigurationAssignCollectionRequestBuilder.class);
    }


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public OfficeClientConfigurationAssignCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public OfficeClientConfigurationAssignCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public OfficeClientConfigurationAssignCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public OfficeClientConfigurationAssignCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public OfficeClientConfigurationAssignCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public OfficeClientConfigurationAssignCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }
    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public OfficeClientConfigurationAssignCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public OfficeClientConfigurationAssignCollectionRequest filter(@Nonnull final String value) {
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
    public OfficeClientConfigurationAssignCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

}

// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PermissionGrantPolicy;
import com.microsoft.graph.models.PermissionGrantConditionSet;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.PermissionGrantConditionSetCollectionResponse;
import com.microsoft.graph.requests.PermissionGrantConditionSetCollectionRequestBuilder;
import com.microsoft.graph.requests.PermissionGrantConditionSetCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Grant Condition Set Collection Request.
 */
public class PermissionGrantConditionSetCollectionRequest extends BaseEntityCollectionRequest<PermissionGrantConditionSet, PermissionGrantConditionSetCollectionResponse, PermissionGrantConditionSetCollectionPage> {

    /**
     * The request builder for this collection of PermissionGrantConditionSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PermissionGrantConditionSetCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PermissionGrantConditionSetCollectionResponse.class, PermissionGrantConditionSetCollectionPage.class, PermissionGrantConditionSetCollectionRequestBuilder.class);
    }

    /**
     * Creates a new PermissionGrantConditionSet
     * @param newPermissionGrantConditionSet the PermissionGrantConditionSet to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PermissionGrantConditionSet> postAsync(@Nonnull final PermissionGrantConditionSet newPermissionGrantConditionSet) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PermissionGrantConditionSetRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newPermissionGrantConditionSet);
    }

    /**
     * Creates a new PermissionGrantConditionSet
     * @param newPermissionGrantConditionSet the PermissionGrantConditionSet to create
     * @return the newly created object
     */
    @Nonnull
    public PermissionGrantConditionSet post(@Nonnull final PermissionGrantConditionSet newPermissionGrantConditionSet) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PermissionGrantConditionSetRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPermissionGrantConditionSet);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public PermissionGrantConditionSetCollectionRequest expand(@Nonnull final String value) {
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
    public PermissionGrantConditionSetCollectionRequest filter(@Nonnull final String value) {
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
    public PermissionGrantConditionSetCollectionRequest orderBy(@Nonnull final String value) {
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
    public PermissionGrantConditionSetCollectionRequest select(@Nonnull final String value) {
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
    public PermissionGrantConditionSetCollectionRequest top(final int value) {
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
    public PermissionGrantConditionSetCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public PermissionGrantConditionSetCollectionRequest count() {
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
    public PermissionGrantConditionSetCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public PermissionGrantConditionSetCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}


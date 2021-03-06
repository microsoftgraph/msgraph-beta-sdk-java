// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IdentityContainer;
import com.microsoft.graph.models.B2cIdentityUserFlow;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.B2cIdentityUserFlowCollectionResponse;
import com.microsoft.graph.requests.B2cIdentityUserFlowCollectionRequestBuilder;
import com.microsoft.graph.requests.B2cIdentityUserFlowCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the B2c Identity User Flow Collection Request.
 */
public class B2cIdentityUserFlowCollectionRequest extends BaseEntityCollectionRequest<B2cIdentityUserFlow, B2cIdentityUserFlowCollectionResponse, B2cIdentityUserFlowCollectionPage> {

    /**
     * The request builder for this collection of B2cIdentityUserFlow
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public B2cIdentityUserFlowCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, B2cIdentityUserFlowCollectionResponse.class, B2cIdentityUserFlowCollectionPage.class, B2cIdentityUserFlowCollectionRequestBuilder.class);
    }

    /**
     * Creates a new B2cIdentityUserFlow
     * @param newB2cIdentityUserFlow the B2cIdentityUserFlow to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<B2cIdentityUserFlow> postAsync(@Nonnull final B2cIdentityUserFlow newB2cIdentityUserFlow) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new B2cIdentityUserFlowRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newB2cIdentityUserFlow);
    }

    /**
     * Creates a new B2cIdentityUserFlow
     * @param newB2cIdentityUserFlow the B2cIdentityUserFlow to create
     * @return the newly created object
     */
    @Nonnull
    public B2cIdentityUserFlow post(@Nonnull final B2cIdentityUserFlow newB2cIdentityUserFlow) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new B2cIdentityUserFlowRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newB2cIdentityUserFlow);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public B2cIdentityUserFlowCollectionRequest expand(@Nonnull final String value) {
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
    public B2cIdentityUserFlowCollectionRequest filter(@Nonnull final String value) {
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
    public B2cIdentityUserFlowCollectionRequest orderBy(@Nonnull final String value) {
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
    public B2cIdentityUserFlowCollectionRequest select(@Nonnull final String value) {
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
    public B2cIdentityUserFlowCollectionRequest top(final int value) {
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
    public B2cIdentityUserFlowCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public B2cIdentityUserFlowCollectionRequest count() {
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
    public B2cIdentityUserFlowCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public B2cIdentityUserFlowCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}


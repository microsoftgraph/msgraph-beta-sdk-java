// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IntuneBrandingProfile;
import com.microsoft.graph.models.IntuneBrandingProfileAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.IntuneBrandingProfileAssignmentCollectionResponse;
import com.microsoft.graph.requests.IntuneBrandingProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.IntuneBrandingProfileAssignmentCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Intune Branding Profile Assignment Collection Request.
 */
public class IntuneBrandingProfileAssignmentCollectionRequest extends BaseEntityCollectionRequest<IntuneBrandingProfileAssignment, IntuneBrandingProfileAssignmentCollectionResponse, IntuneBrandingProfileAssignmentCollectionPage> {

    /**
     * The request builder for this collection of IntuneBrandingProfileAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IntuneBrandingProfileAssignmentCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IntuneBrandingProfileAssignmentCollectionResponse.class, IntuneBrandingProfileAssignmentCollectionPage.class, IntuneBrandingProfileAssignmentCollectionRequestBuilder.class);
    }

    /**
     * Creates a new IntuneBrandingProfileAssignment
     * @param newIntuneBrandingProfileAssignment the IntuneBrandingProfileAssignment to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<IntuneBrandingProfileAssignment> postAsync(@Nonnull final IntuneBrandingProfileAssignment newIntuneBrandingProfileAssignment) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new IntuneBrandingProfileAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newIntuneBrandingProfileAssignment);
    }

    /**
     * Creates a new IntuneBrandingProfileAssignment
     * @param newIntuneBrandingProfileAssignment the IntuneBrandingProfileAssignment to create
     * @return the newly created object
     */
    @Nonnull
    public IntuneBrandingProfileAssignment post(@Nonnull final IntuneBrandingProfileAssignment newIntuneBrandingProfileAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new IntuneBrandingProfileAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newIntuneBrandingProfileAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public IntuneBrandingProfileAssignmentCollectionRequest expand(@Nonnull final String value) {
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
    public IntuneBrandingProfileAssignmentCollectionRequest filter(@Nonnull final String value) {
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
    public IntuneBrandingProfileAssignmentCollectionRequest orderBy(@Nonnull final String value) {
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
    public IntuneBrandingProfileAssignmentCollectionRequest select(@Nonnull final String value) {
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
    public IntuneBrandingProfileAssignmentCollectionRequest top(final int value) {
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
    public IntuneBrandingProfileAssignmentCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public IntuneBrandingProfileAssignmentCollectionRequest count() {
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
    public IntuneBrandingProfileAssignmentCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public IntuneBrandingProfileAssignmentCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}


// Template Source: BaseEntityWithReferenceRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.ediscovery.models.SourceCollection;
import com.microsoft.graph.ediscovery.requests.DataSourceCollectionRequestBuilder;
import com.microsoft.graph.ediscovery.requests.DataSourceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.AddToReviewSetOperationWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.DataSourceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.ediscovery.requests.DataSourceWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.EstimateStatisticsOperationWithReferenceRequestBuilder;
import com.microsoft.graph.ediscovery.requests.NoncustodialDataSourceCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.ediscovery.requests.NoncustodialDataSourceWithReferenceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseWithReferenceRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Source Collection With Reference Request.
 */
public class SourceCollectionWithReferenceRequest extends BaseWithReferenceRequest<SourceCollection> {

    /**
     * The request for the SourceCollection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SourceCollectionWithReferenceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SourceCollection.class);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public SourceCollectionWithReferenceRequest select(@Nonnull final String value) {
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
    public SourceCollectionWithReferenceRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }
}

// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;
import com.microsoft.graph.ediscovery.requests.CaseExportOperationGetDownloadUrlRequest;
import com.microsoft.graph.ediscovery.models.CaseExportOperation;

import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Case Export Operation Get Download Url Request Builder.
 */
public class CaseExportOperationGetDownloadUrlRequestBuilder extends BaseFunctionRequestBuilder<String> {

    /**
     * The request builder for this CaseExportOperationGetDownloadUrl
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CaseExportOperationGetDownloadUrlRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the CaseExportOperationGetDownloadUrlRequest
     *
     * @param requestOptions the options for the request
     * @return the CaseExportOperationGetDownloadUrlRequest instance
     */
    @Nonnull
    public CaseExportOperationGetDownloadUrlRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the CaseExportOperationGetDownloadUrlRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the CaseExportOperationGetDownloadUrlRequest instance
     */
    @Nonnull
    public CaseExportOperationGetDownloadUrlRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final CaseExportOperationGetDownloadUrlRequest request = new CaseExportOperationGetDownloadUrlRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        return request;
    }
}

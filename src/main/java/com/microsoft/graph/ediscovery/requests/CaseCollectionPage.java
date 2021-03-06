// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.requests;
import com.microsoft.graph.ediscovery.models.Case;
import com.microsoft.graph.ediscovery.requests.CaseCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.ediscovery.requests.CaseCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Case Collection Page.
 */
public class CaseCollectionPage extends BaseCollectionPage<Case, CaseCollectionRequestBuilder> {

    /**
     * A collection page for Case
     *
     * @param response the serialized CaseCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CaseCollectionPage(@Nonnull final CaseCollectionResponse response, @Nonnull final CaseCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Case
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public CaseCollectionPage(@Nonnull final java.util.List<Case> pageContents, @Nullable final CaseCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

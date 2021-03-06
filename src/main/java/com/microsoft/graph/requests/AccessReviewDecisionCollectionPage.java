// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.AccessReviewDecision;
import com.microsoft.graph.requests.AccessReviewDecisionCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.AccessReviewDecisionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Decision Collection Page.
 */
public class AccessReviewDecisionCollectionPage extends BaseCollectionPage<AccessReviewDecision, AccessReviewDecisionCollectionRequestBuilder> {

    /**
     * A collection page for AccessReviewDecision
     *
     * @param response the serialized AccessReviewDecisionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AccessReviewDecisionCollectionPage(@Nonnull final AccessReviewDecisionCollectionResponse response, @Nonnull final AccessReviewDecisionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AccessReviewDecision
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AccessReviewDecisionCollectionPage(@Nonnull final java.util.List<AccessReviewDecision> pageContents, @Nullable final AccessReviewDecisionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.RiskyUserHistoryItem;
import com.microsoft.graph.requests.RiskyUserHistoryItemCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.RiskyUserHistoryItemCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Risky User History Item Collection Page.
 */
public class RiskyUserHistoryItemCollectionPage extends BaseCollectionPage<RiskyUserHistoryItem, RiskyUserHistoryItemCollectionRequestBuilder> {

    /**
     * A collection page for RiskyUserHistoryItem
     *
     * @param response the serialized RiskyUserHistoryItemCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public RiskyUserHistoryItemCollectionPage(@Nonnull final RiskyUserHistoryItemCollectionResponse response, @Nonnull final RiskyUserHistoryItemCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for RiskyUserHistoryItem
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public RiskyUserHistoryItemCollectionPage(@Nonnull final java.util.List<RiskyUserHistoryItem> pageContents, @Nullable final RiskyUserHistoryItemCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

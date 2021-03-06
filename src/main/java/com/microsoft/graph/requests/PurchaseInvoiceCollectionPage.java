// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.PurchaseInvoice;
import com.microsoft.graph.requests.PurchaseInvoiceCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.PurchaseInvoiceCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Purchase Invoice Collection Page.
 */
public class PurchaseInvoiceCollectionPage extends BaseCollectionPage<PurchaseInvoice, PurchaseInvoiceCollectionRequestBuilder> {

    /**
     * A collection page for PurchaseInvoice
     *
     * @param response the serialized PurchaseInvoiceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PurchaseInvoiceCollectionPage(@Nonnull final PurchaseInvoiceCollectionResponse response, @Nonnull final PurchaseInvoiceCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for PurchaseInvoice
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PurchaseInvoiceCollectionPage(@Nonnull final java.util.List<PurchaseInvoice> pageContents, @Nullable final PurchaseInvoiceCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

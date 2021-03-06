// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.Printer;
import com.microsoft.graph.requests.PrinterCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.PrinterCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Collection Page.
 */
public class PrinterCollectionPage extends BaseCollectionPage<Printer, PrinterCollectionRequestBuilder> {

    /**
     * A collection page for Printer
     *
     * @param response the serialized PrinterCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PrinterCollectionPage(@Nonnull final PrinterCollectionResponse response, @Nonnull final PrinterCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Printer
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PrinterCollectionPage(@Nonnull final java.util.List<Printer> pageContents, @Nullable final PrinterCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

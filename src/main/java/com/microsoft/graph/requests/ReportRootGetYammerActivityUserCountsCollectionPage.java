// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.YammerActivitySummary;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.ReportRootGetYammerActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetYammerActivityUserCountsCollectionPage;
import com.microsoft.graph.requests.ReportRootGetYammerActivityUserCountsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Yammer Activity User Counts Collection Page.
 */
public class ReportRootGetYammerActivityUserCountsCollectionPage extends BaseCollectionPage<YammerActivitySummary, ReportRootGetYammerActivityUserCountsCollectionRequestBuilder> {

    /**
     * A collection page for YammerActivitySummary.
     *
     * @param response The serialized ReportRootGetYammerActivityUserCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetYammerActivityUserCountsCollectionPage(@Nonnull final ReportRootGetYammerActivityUserCountsCollectionResponse response, @Nonnull final ReportRootGetYammerActivityUserCountsCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetYammerActivityUserCounts
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetYammerActivityUserCountsCollectionPage(@Nonnull final java.util.List<YammerActivitySummary> pageContents, @Nullable final ReportRootGetYammerActivityUserCountsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

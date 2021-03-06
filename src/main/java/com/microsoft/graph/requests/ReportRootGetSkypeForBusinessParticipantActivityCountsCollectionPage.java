// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.SkypeForBusinessParticipantActivityCounts;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.ReportRootGetSkypeForBusinessParticipantActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.ReportRootGetSkypeForBusinessParticipantActivityCountsCollectionPage;
import com.microsoft.graph.requests.ReportRootGetSkypeForBusinessParticipantActivityCountsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Skype For Business Participant Activity Counts Collection Page.
 */
public class ReportRootGetSkypeForBusinessParticipantActivityCountsCollectionPage extends BaseCollectionPage<SkypeForBusinessParticipantActivityCounts, ReportRootGetSkypeForBusinessParticipantActivityCountsCollectionRequestBuilder> {

    /**
     * A collection page for SkypeForBusinessParticipantActivityCounts.
     *
     * @param response The serialized ReportRootGetSkypeForBusinessParticipantActivityCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetSkypeForBusinessParticipantActivityCountsCollectionPage(@Nonnull final ReportRootGetSkypeForBusinessParticipantActivityCountsCollectionResponse response, @Nonnull final ReportRootGetSkypeForBusinessParticipantActivityCountsCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ReportRootGetSkypeForBusinessParticipantActivityCounts
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ReportRootGetSkypeForBusinessParticipantActivityCountsCollectionPage(@Nonnull final java.util.List<SkypeForBusinessParticipantActivityCounts> pageContents, @Nullable final ReportRootGetSkypeForBusinessParticipantActivityCountsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

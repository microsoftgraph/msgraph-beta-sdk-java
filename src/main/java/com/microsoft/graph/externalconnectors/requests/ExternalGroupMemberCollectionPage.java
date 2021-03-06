// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.requests;
import com.microsoft.graph.externalconnectors.models.ExternalGroupMember;
import com.microsoft.graph.externalconnectors.requests.ExternalGroupMemberCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.externalconnectors.requests.ExternalGroupMemberCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Group Member Collection Page.
 */
public class ExternalGroupMemberCollectionPage extends BaseCollectionPage<ExternalGroupMember, ExternalGroupMemberCollectionRequestBuilder> {

    /**
     * A collection page for ExternalGroupMember
     *
     * @param response the serialized ExternalGroupMemberCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ExternalGroupMemberCollectionPage(@Nonnull final ExternalGroupMemberCollectionResponse response, @Nonnull final ExternalGroupMemberCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ExternalGroupMember
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ExternalGroupMemberCollectionPage(@Nonnull final java.util.List<ExternalGroupMember> pageContents, @Nullable final ExternalGroupMemberCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

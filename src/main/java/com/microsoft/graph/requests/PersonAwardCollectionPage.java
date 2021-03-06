// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.PersonAward;
import com.microsoft.graph.requests.PersonAwardCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.PersonAwardCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Award Collection Page.
 */
public class PersonAwardCollectionPage extends BaseCollectionPage<PersonAward, PersonAwardCollectionRequestBuilder> {

    /**
     * A collection page for PersonAward
     *
     * @param response the serialized PersonAwardCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PersonAwardCollectionPage(@Nonnull final PersonAwardCollectionResponse response, @Nonnull final PersonAwardCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for PersonAward
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PersonAwardCollectionPage(@Nonnull final java.util.List<PersonAward> pageContents, @Nullable final PersonAwardCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

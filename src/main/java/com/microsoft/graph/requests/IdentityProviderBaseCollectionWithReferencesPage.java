// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.B2xIdentityUserFlow;
import com.microsoft.graph.models.IdentityProviderBase;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.IdentityProviderBaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.IdentityProviderBaseCollectionWithReferencesPage;
import com.microsoft.graph.requests.IdentityProviderBaseCollectionResponse;
import com.microsoft.graph.models.IdentityProviderBase;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Provider Base Collection With References Page.
 */
public class IdentityProviderBaseCollectionWithReferencesPage extends BaseCollectionPage<IdentityProviderBase, IdentityProviderBaseCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for IdentityProviderBase
     *
     * @param response the serialized IdentityProviderBaseCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IdentityProviderBaseCollectionWithReferencesPage(@Nonnull final IdentityProviderBaseCollectionResponse response, @Nullable final IdentityProviderBaseCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for IdentityProviderBase
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public IdentityProviderBaseCollectionWithReferencesPage(@Nonnull final java.util.List<IdentityProviderBase> pageContents, @Nullable final IdentityProviderBaseCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

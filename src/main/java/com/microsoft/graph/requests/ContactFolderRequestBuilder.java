// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ContactFolder;
import com.microsoft.graph.requests.ContactFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.ContactFolderRequestBuilder;
import com.microsoft.graph.requests.ContactCollectionRequestBuilder;
import com.microsoft.graph.requests.ContactRequestBuilder;
import com.microsoft.graph.requests.MultiValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.MultiValueLegacyExtendedPropertyRequestBuilder;
import com.microsoft.graph.requests.SingleValueLegacyExtendedPropertyCollectionRequestBuilder;
import com.microsoft.graph.requests.SingleValueLegacyExtendedPropertyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Contact Folder Request Builder.
 */
public class ContactFolderRequestBuilder extends BaseRequestBuilder<ContactFolder> {

    /**
     * The request builder for the ContactFolder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ContactFolderRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ContactFolderRequest instance
     */
    @Nonnull
    public ContactFolderRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ContactFolderRequest instance
     */
    @Nonnull
    public ContactFolderRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.ContactFolderRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the ContactFolder collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ContactFolderCollectionRequestBuilder childFolders() {
        return new ContactFolderCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("childFolders"), getClient(), null);
    }

    /**
     * Gets a request builder for the ContactFolder item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ContactFolderRequestBuilder childFolders(@Nonnull final String id) {
        return new ContactFolderRequestBuilder(getRequestUrlWithAdditionalSegment("childFolders") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the Contact collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public ContactCollectionRequestBuilder contacts() {
        return new ContactCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("contacts"), getClient(), null);
    }

    /**
     * Gets a request builder for the Contact item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public ContactRequestBuilder contacts(@Nonnull final String id) {
        return new ContactRequestBuilder(getRequestUrlWithAdditionalSegment("contacts") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MultiValueLegacyExtendedProperty collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public MultiValueLegacyExtendedPropertyCollectionRequestBuilder multiValueExtendedProperties() {
        return new MultiValueLegacyExtendedPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("multiValueExtendedProperties"), getClient(), null);
    }

    /**
     * Gets a request builder for the MultiValueLegacyExtendedProperty item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public MultiValueLegacyExtendedPropertyRequestBuilder multiValueExtendedProperties(@Nonnull final String id) {
        return new MultiValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("multiValueExtendedProperties") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SingleValueLegacyExtendedProperty collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public SingleValueLegacyExtendedPropertyCollectionRequestBuilder singleValueExtendedProperties() {
        return new SingleValueLegacyExtendedPropertyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("singleValueExtendedProperties"), getClient(), null);
    }

    /**
     * Gets a request builder for the SingleValueLegacyExtendedProperty item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public SingleValueLegacyExtendedPropertyRequestBuilder singleValueExtendedProperties(@Nonnull final String id) {
        return new SingleValueLegacyExtendedPropertyRequestBuilder(getRequestUrlWithAdditionalSegment("singleValueExtendedProperties") + "/" + id, getClient(), null);
    }
}

// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.MicrosoftTunnelServer;
import com.microsoft.graph.requests.MicrosoftTunnelServerCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.MicrosoftTunnelServerCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Tunnel Server Collection Page.
 */
public class MicrosoftTunnelServerCollectionPage extends BaseCollectionPage<MicrosoftTunnelServer, MicrosoftTunnelServerCollectionRequestBuilder> {

    /**
     * A collection page for MicrosoftTunnelServer
     *
     * @param response the serialized MicrosoftTunnelServerCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MicrosoftTunnelServerCollectionPage(@Nonnull final MicrosoftTunnelServerCollectionResponse response, @Nonnull final MicrosoftTunnelServerCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for MicrosoftTunnelServer
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MicrosoftTunnelServerCollectionPage(@Nonnull final java.util.List<MicrosoftTunnelServer> pageContents, @Nullable final MicrosoftTunnelServerCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

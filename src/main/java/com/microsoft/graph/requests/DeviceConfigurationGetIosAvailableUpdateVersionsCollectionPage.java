// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IosAvailableUpdateVersion;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.DeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequestBuilder;
import com.microsoft.graph.requests.DeviceConfigurationGetIosAvailableUpdateVersionsCollectionPage;
import com.microsoft.graph.requests.DeviceConfigurationGetIosAvailableUpdateVersionsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Get Ios Available Update Versions Collection Page.
 */
public class DeviceConfigurationGetIosAvailableUpdateVersionsCollectionPage extends BaseCollectionPage<IosAvailableUpdateVersion, DeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequestBuilder> {

    /**
     * A collection page for IosAvailableUpdateVersion.
     *
     * @param response The serialized DeviceConfigurationGetIosAvailableUpdateVersionsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DeviceConfigurationGetIosAvailableUpdateVersionsCollectionPage(@Nonnull final DeviceConfigurationGetIosAvailableUpdateVersionsCollectionResponse response, @Nonnull final DeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for DeviceConfigurationGetIosAvailableUpdateVersions
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceConfigurationGetIosAvailableUpdateVersionsCollectionPage(@Nonnull final java.util.List<IosAvailableUpdateVersion> pageContents, @Nullable final DeviceConfigurationGetIosAvailableUpdateVersionsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

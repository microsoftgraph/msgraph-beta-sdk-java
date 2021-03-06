// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.DeviceManagementConfigurationSettingTemplate;
import com.microsoft.graph.requests.DeviceManagementConfigurationSettingTemplateCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.DeviceManagementConfigurationSettingTemplateCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Setting Template Collection Page.
 */
public class DeviceManagementConfigurationSettingTemplateCollectionPage extends BaseCollectionPage<DeviceManagementConfigurationSettingTemplate, DeviceManagementConfigurationSettingTemplateCollectionRequestBuilder> {

    /**
     * A collection page for DeviceManagementConfigurationSettingTemplate
     *
     * @param response the serialized DeviceManagementConfigurationSettingTemplateCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementConfigurationSettingTemplateCollectionPage(@Nonnull final DeviceManagementConfigurationSettingTemplateCollectionResponse response, @Nonnull final DeviceManagementConfigurationSettingTemplateCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceManagementConfigurationSettingTemplate
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceManagementConfigurationSettingTemplateCollectionPage(@Nonnull final java.util.List<DeviceManagementConfigurationSettingTemplate> pageContents, @Nullable final DeviceManagementConfigurationSettingTemplateCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

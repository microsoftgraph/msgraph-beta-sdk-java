// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum App Management Level.
*/
public enum AppManagementLevel
{
    /**
    * unspecified
    */
    UNSPECIFIED,
    /**
    * unmanaged
    */
    UNMANAGED,
    /**
    * mdm
    */
    MDM,
    /**
    * android Enterprise
    */
    ANDROID_ENTERPRISE,
    /**
    * android Enterprise Dedicated Devices With Azure Ad Shared Mode
    */
    ANDROID_ENTERPRISE_DEDICATED_DEVICES_WITH_AZURE_AD_SHARED_MODE,
    /**
    * android Open Source Project User Associated
    */
    ANDROID_OPEN_SOURCE_PROJECT_USER_ASSOCIATED,
    /**
    * android Open Source Project Userless
    */
    ANDROID_OPEN_SOURCE_PROJECT_USERLESS,
    /**
    * For AppManagementLevel values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

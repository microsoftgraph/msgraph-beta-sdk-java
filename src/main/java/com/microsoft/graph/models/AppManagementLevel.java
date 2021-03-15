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
    * For AppManagementLevel values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

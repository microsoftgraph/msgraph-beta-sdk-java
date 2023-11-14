// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Cloud Pc Disk Encryption Type.
*/
public enum CloudPcDiskEncryptionType
{
    /**
    * platform Managed Key
    */
    PLATFORM_MANAGED_KEY,
    /**
    * customer Managed Key
    */
    CUSTOMER_MANAGED_KEY,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For CloudPcDiskEncryptionType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

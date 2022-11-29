// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Cloud Pc Disk Encryption State.
*/
public enum CloudPcDiskEncryptionState
{
    /**
    * not Available
    */
    NOT_AVAILABLE,
    /**
    * not Encrypted
    */
    NOT_ENCRYPTED,
    /**
    * encrypted Using Platform Managed Key
    */
    ENCRYPTED_USING_PLATFORM_MANAGED_KEY,
    /**
    * encrypted Using Customer Managed Key
    */
    ENCRYPTED_USING_CUSTOMER_MANAGED_KEY,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For CloudPcDiskEncryptionState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

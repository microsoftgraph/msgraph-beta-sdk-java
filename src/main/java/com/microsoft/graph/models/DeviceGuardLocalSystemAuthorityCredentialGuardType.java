// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Device Guard Local System Authority Credential Guard Type.
*/
public enum DeviceGuardLocalSystemAuthorityCredentialGuardType
{
    /**
    * not Configured
    */
    NOT_CONFIGURED,
    /**
    * enable With UEFILock
    */
    ENABLE_WITH_UEFI_LOCK,
    /**
    * enable Without UEFILock
    */
    ENABLE_WITHOUT_UEFI_LOCK,
    /**
    * disable
    */
    DISABLE,
    /**
    * For DeviceGuardLocalSystemAuthorityCredentialGuardType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

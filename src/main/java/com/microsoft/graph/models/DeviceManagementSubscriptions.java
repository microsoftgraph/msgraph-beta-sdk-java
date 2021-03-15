// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Device Management Subscriptions.
*/
public enum DeviceManagementSubscriptions
{
    /**
    * none
    */
    NONE,
    /**
    * intune
    */
    INTUNE,
    /**
    * office365
    */
    OFFICE365,
    /**
    * intune Premium
    */
    INTUNE_PREMIUM,
    /**
    * intune_EDU
    */
    INTUNE_EDU,
    /**
    * intune_SMB
    */
    INTUNE_SMB,
    /**
    * For DeviceManagementSubscriptions values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

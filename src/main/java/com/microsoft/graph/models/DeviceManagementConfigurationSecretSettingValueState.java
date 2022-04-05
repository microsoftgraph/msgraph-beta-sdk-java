// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Device Management Configuration Secret Setting Value State.
*/
public enum DeviceManagementConfigurationSecretSettingValueState
{
    /**
    * invalid
    */
    INVALID,
    /**
    * not Encrypted
    */
    NOT_ENCRYPTED,
    /**
    * encrypted Value Token
    */
    ENCRYPTED_VALUE_TOKEN,
    /**
    * For DeviceManagementConfigurationSecretSettingValueState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

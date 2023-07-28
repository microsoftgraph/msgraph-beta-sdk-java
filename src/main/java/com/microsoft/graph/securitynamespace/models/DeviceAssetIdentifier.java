// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Device Asset Identifier.
*/
public enum DeviceAssetIdentifier
{
    /**
    * device Id
    */
    DEVICE_ID,
    /**
    * device Name
    */
    DEVICE_NAME,
    /**
    * remote Device Name
    */
    REMOTE_DEVICE_NAME,
    /**
    * target Device Name
    */
    TARGET_DEVICE_NAME,
    /**
    * destination Device Name
    */
    DESTINATION_DEVICE_NAME,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DeviceAssetIdentifier values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

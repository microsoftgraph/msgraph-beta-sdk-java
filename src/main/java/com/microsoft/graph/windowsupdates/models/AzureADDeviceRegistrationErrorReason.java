// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.windowsupdates.models;


/**
 * The Enum Azure ADDevice Registration Error Reason.
*/
public enum AzureADDeviceRegistrationErrorReason
{
    /**
    * invalid Global Device Id
    */
    INVALID_GLOBAL_DEVICE_ID,
    /**
    * invalid Azure ADDevice Id
    */
    INVALID_AZURE_AD_DEVICE_ID,
    /**
    * missing Trust Type
    */
    MISSING_TRUST_TYPE,
    /**
    * invalid Azure ADJoin
    */
    INVALID_AZURE_AD_JOIN,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AzureADDeviceRegistrationErrorReason values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

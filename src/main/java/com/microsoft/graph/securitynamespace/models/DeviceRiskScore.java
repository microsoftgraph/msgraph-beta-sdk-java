// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Device Risk Score.
*/
public enum DeviceRiskScore
{
    /**
    * none
    */
    NONE,
    /**
    * informational
    */
    INFORMATIONAL,
    /**
    * low
    */
    LOW,
    /**
    * medium
    */
    MEDIUM,
    /**
    * high
    */
    HIGH,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DeviceRiskScore values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Teamwork Device Health Status.
*/
public enum TeamworkDeviceHealthStatus
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * offline
    */
    OFFLINE,
    /**
    * critical
    */
    CRITICAL,
    /**
    * non Urgent
    */
    NON_URGENT,
    /**
    * healthy
    */
    HEALTHY,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For TeamworkDeviceHealthStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

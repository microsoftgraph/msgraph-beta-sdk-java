// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Cloud Pc Connectivity Event Type.
*/
public enum CloudPcConnectivityEventType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * user Connection
    */
    USER_CONNECTION,
    /**
    * user Troubleshooting
    */
    USER_TROUBLESHOOTING,
    /**
    * device Health Check
    */
    DEVICE_HEALTH_CHECK,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For CloudPcConnectivityEventType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

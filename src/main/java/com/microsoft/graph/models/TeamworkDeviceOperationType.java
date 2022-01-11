// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Teamwork Device Operation Type.
*/
public enum TeamworkDeviceOperationType
{
    /**
    * device Restart
    */
    DEVICE_RESTART,
    /**
    * config Update
    */
    CONFIG_UPDATE,
    /**
    * device Diagnostics
    */
    DEVICE_DIAGNOSTICS,
    /**
    * software Update
    */
    SOFTWARE_UPDATE,
    /**
    * device Management Agent Config Update
    */
    DEVICE_MANAGEMENT_AGENT_CONFIG_UPDATE,
    /**
    * remote Login
    */
    REMOTE_LOGIN,
    /**
    * remote Logout
    */
    REMOTE_LOGOUT,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For TeamworkDeviceOperationType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

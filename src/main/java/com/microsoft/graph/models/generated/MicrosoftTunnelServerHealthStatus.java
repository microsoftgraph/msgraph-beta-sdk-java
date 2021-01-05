// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Microsoft Tunnel Server Health Status.
*/
public enum MicrosoftTunnelServerHealthStatus
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * healthy
    */
    HEALTHY,
    /**
    * unhealthy
    */
    UNHEALTHY,
    /**
    * warning
    */
    WARNING,
    /**
    * offline
    */
    OFFLINE,
    /**
    * upgrade In Progress
    */
    UPGRADE_IN_PROGRESS,
    /**
    * upgrade Failed
    */
    UPGRADE_FAILED,
    /**
    * For MicrosoftTunnelServerHealthStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

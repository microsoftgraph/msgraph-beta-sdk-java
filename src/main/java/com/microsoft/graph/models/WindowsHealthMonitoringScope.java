// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Windows Health Monitoring Scope.
*/
public enum WindowsHealthMonitoringScope
{
    /**
    * undefined
    */
    UNDEFINED,
    /**
    * health Monitoring
    */
    HEALTH_MONITORING,
    /**
    * boot Performance
    */
    BOOT_PERFORMANCE,
    /**
    * windows Updates
    */
    WINDOWS_UPDATES,
    /**
    * privilege Management
    */
    PRIVILEGE_MANAGEMENT,
    /**
    * For WindowsHealthMonitoringScope values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

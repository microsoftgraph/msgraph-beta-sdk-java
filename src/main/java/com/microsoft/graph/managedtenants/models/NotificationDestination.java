// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.models;


/**
 * The Enum Notification Destination.
*/
public enum NotificationDestination
{
    /**
    * none
    */
    NONE,
    /**
    * api
    */
    API,
    /**
    * email
    */
    EMAIL,
    /**
    * sms
    */
    SMS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For NotificationDestination values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

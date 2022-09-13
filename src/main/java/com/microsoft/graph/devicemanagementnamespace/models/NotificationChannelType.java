// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.devicemanagement.models;


/**
 * The Enum Notification Channel Type.
*/
public enum NotificationChannelType
{
    /**
    * portal
    */
    PORTAL,
    /**
    * email
    */
    EMAIL,
    /**
    * phone Call
    */
    PHONE_CALL,
    /**
    * sms
    */
    SMS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For NotificationChannelType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

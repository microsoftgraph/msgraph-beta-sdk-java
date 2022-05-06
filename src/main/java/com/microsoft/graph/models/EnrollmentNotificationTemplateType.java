// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Enrollment Notification Template Type.
*/
public enum EnrollmentNotificationTemplateType
{
    /**
    * email
    */
    EMAIL,
    /**
    * push
    */
    PUSH,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For EnrollmentNotificationTemplateType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Apple User Initiated Enrollment Type.
*/
public enum AppleUserInitiatedEnrollmentType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * device
    */
    DEVICE,
    /**
    * user
    */
    USER,
    /**
    * account Driven User Enrollment
    */
    ACCOUNT_DRIVEN_USER_ENROLLMENT,
    /**
    * web Device Enrollment
    */
    WEB_DEVICE_ENROLLMENT,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AppleUserInitiatedEnrollmentType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

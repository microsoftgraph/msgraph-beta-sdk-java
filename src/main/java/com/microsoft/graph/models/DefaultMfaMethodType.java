// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Default Mfa Method Type.
*/
public enum DefaultMfaMethodType
{
    /**
    * none
    */
    NONE,
    /**
    * mobile Phone
    */
    MOBILE_PHONE,
    /**
    * alternate Mobile Phone
    */
    ALTERNATE_MOBILE_PHONE,
    /**
    * office Phone
    */
    OFFICE_PHONE,
    /**
    * microsoft Authenticator Push
    */
    MICROSOFT_AUTHENTICATOR_PUSH,
    /**
    * software One Time Passcode
    */
    SOFTWARE_ONE_TIME_PASSCODE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DefaultMfaMethodType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

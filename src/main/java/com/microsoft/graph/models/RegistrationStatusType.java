// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Registration Status Type.
*/
public enum RegistrationStatusType
{
    /**
    * registered
    */
    REGISTERED,
    /**
    * enabled
    */
    ENABLED,
    /**
    * capable
    */
    CAPABLE,
    /**
    * mfa Registered
    */
    MFA_REGISTERED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For RegistrationStatusType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

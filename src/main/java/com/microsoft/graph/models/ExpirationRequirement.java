// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Expiration Requirement.
*/
public enum ExpirationRequirement
{
    /**
    * remember Multifactor Authentication On Trusted Devices
    */
    REMEMBER_MULTIFACTOR_AUTHENTICATION_ON_TRUSTED_DEVICES,
    /**
    * tenant Token Lifetime Policy
    */
    TENANT_TOKEN_LIFETIME_POLICY,
    /**
    * audience Token Lifetime Policy
    */
    AUDIENCE_TOKEN_LIFETIME_POLICY,
    /**
    * sign In Frequency Periodic Reauthentication
    */
    SIGN_IN_FREQUENCY_PERIODIC_REAUTHENTICATION,
    /**
    * ngc Mfa
    */
    NGC_MFA,
    /**
    * sign In Frequency Every Time
    */
    SIGN_IN_FREQUENCY_EVERY_TIME,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ExpirationRequirement values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

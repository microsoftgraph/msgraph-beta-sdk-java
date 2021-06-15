// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.models;


/**
 * The Enum Tenant Onboarding Status.
*/
public enum TenantOnboardingStatus
{
    /**
    * ineligible
    */
    INELIGIBLE,
    /**
    * in Process
    */
    IN_PROCESS,
    /**
    * active
    */
    ACTIVE,
    /**
    * inactive
    */
    INACTIVE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For TenantOnboardingStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

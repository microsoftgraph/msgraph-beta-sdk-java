// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.models;


/**
 * The Enum Tenant Onboarding Eligibility Reason.
*/
public enum TenantOnboardingEligibilityReason
{
    /**
    * none
    */
    NONE,
    /**
    * contract Type
    */
    CONTRACT_TYPE,
    /**
    * delegated Admin Privileges
    */
    DELEGATED_ADMIN_PRIVILEGES,
    /**
    * users Count
    */
    USERS_COUNT,
    /**
    * license
    */
    LICENSE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For TenantOnboardingEligibilityReason values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

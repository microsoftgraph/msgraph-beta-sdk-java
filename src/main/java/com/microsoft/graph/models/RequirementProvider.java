// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Requirement Provider.
*/
public enum RequirementProvider
{
    /**
    * user
    */
    USER,
    /**
    * request
    */
    REQUEST,
    /**
    * service Principal
    */
    SERVICE_PRINCIPAL,
    /**
    * v1Conditional Access
    */
    V1_CONDITIONAL_ACCESS,
    /**
    * multi Conditional Access
    */
    MULTI_CONDITIONAL_ACCESS,
    /**
    * tenant Session Risk Policy
    */
    TENANT_SESSION_RISK_POLICY,
    /**
    * account Compromise Policies
    */
    ACCOUNT_COMPROMISE_POLICIES,
    /**
    * v1Conditional Access Dependency
    */
    V1_CONDITIONAL_ACCESS_DEPENDENCY,
    /**
    * v1Conditional Access Policy Id Requested
    */
    V1_CONDITIONAL_ACCESS_POLICY_ID_REQUESTED,
    /**
    * mfa Registration Required By Identity Protection Policy
    */
    MFA_REGISTRATION_REQUIRED_BY_IDENTITY_PROTECTION_POLICY,
    /**
    * baseline Protection
    */
    BASELINE_PROTECTION,
    /**
    * mfa Registration Required By Baseline Protection
    */
    MFA_REGISTRATION_REQUIRED_BY_BASELINE_PROTECTION,
    /**
    * mfa Registration Required By Multi Conditional Access
    */
    MFA_REGISTRATION_REQUIRED_BY_MULTI_CONDITIONAL_ACCESS,
    /**
    * enforced For Csp Admins
    */
    ENFORCED_FOR_CSP_ADMINS,
    /**
    * security Defaults
    */
    SECURITY_DEFAULTS,
    /**
    * mfa Registration Required By Security Defaults
    */
    MFA_REGISTRATION_REQUIRED_BY_SECURITY_DEFAULTS,
    /**
    * proof Up Code Request
    */
    PROOF_UP_CODE_REQUEST,
    /**
    * cross Tenant Outbound Rule
    */
    CROSS_TENANT_OUTBOUND_RULE,
    /**
    * gps Location Condition
    */
    GPS_LOCATION_CONDITION,
    /**
    * risk Based Policy
    */
    RISK_BASED_POLICY,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For RequirementProvider values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

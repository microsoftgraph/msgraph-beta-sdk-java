// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Submission Result Detail.
*/
public enum SubmissionResultDetail
{
    /**
    * none
    */
    NONE,
    /**
    * under Investigation
    */
    UNDER_INVESTIGATION,
    /**
    * simulated Threat
    */
    SIMULATED_THREAT,
    /**
    * allowed By Sec Ops
    */
    ALLOWED_BY_SEC_OPS,
    /**
    * allowed By Third Party Filters
    */
    ALLOWED_BY_THIRD_PARTY_FILTERS,
    /**
    * message Not Found
    */
    MESSAGE_NOT_FOUND,
    /**
    * url File Should Not Be Blocked
    */
    URL_FILE_SHOULD_NOT_BE_BLOCKED,
    /**
    * url File Should Be Blocked
    */
    URL_FILE_SHOULD_BE_BLOCKED,
    /**
    * url File Cannot Make Decision
    */
    URL_FILE_CANNOT_MAKE_DECISION,
    /**
    * domain Impersonation
    */
    DOMAIN_IMPERSONATION,
    /**
    * user Impersonation
    */
    USER_IMPERSONATION,
    /**
    * brand Impersonation
    */
    BRAND_IMPERSONATION,
    /**
    * outbound Should Not Be Blocked
    */
    OUTBOUND_SHOULD_NOT_BE_BLOCKED,
    /**
    * outbound Should Be Blocked
    */
    OUTBOUND_SHOULD_BE_BLOCKED,
    /**
    * outbound Bulk
    */
    OUTBOUND_BULK,
    /**
    * outbound Cannot Make Decision
    */
    OUTBOUND_CANNOT_MAKE_DECISION,
    /**
    * outbound Not Rescanned
    */
    OUTBOUND_NOT_RESCANNED,
    /**
    * zero Hour Auto Purge Allowed
    */
    ZERO_HOUR_AUTO_PURGE_ALLOWED,
    /**
    * zero Hour Auto Purge Blocked
    */
    ZERO_HOUR_AUTO_PURGE_BLOCKED,
    /**
    * zero Hour Auto Purge Quarantine Released
    */
    ZERO_HOUR_AUTO_PURGE_QUARANTINE_RELEASED,
    /**
    * on Premises Skip
    */
    ON_PREMISES_SKIP,
    /**
    * allowed By Tenant Allow Block List
    */
    ALLOWED_BY_TENANT_ALLOW_BLOCK_LIST,
    /**
    * blocked By Tenant Allow Block List
    */
    BLOCKED_BY_TENANT_ALLOW_BLOCK_LIST,
    /**
    * allowed Url By Tenant Allow Block List
    */
    ALLOWED_URL_BY_TENANT_ALLOW_BLOCK_LIST,
    /**
    * allowed File By Tenant Allow Block List
    */
    ALLOWED_FILE_BY_TENANT_ALLOW_BLOCK_LIST,
    /**
    * allowed Sender By Tenant Allow Block List
    */
    ALLOWED_SENDER_BY_TENANT_ALLOW_BLOCK_LIST,
    /**
    * allowed Recipient By Tenant Allow Block List
    */
    ALLOWED_RECIPIENT_BY_TENANT_ALLOW_BLOCK_LIST,
    /**
    * blocked Url By Tenant Allow Block List
    */
    BLOCKED_URL_BY_TENANT_ALLOW_BLOCK_LIST,
    /**
    * blocked File By Tenant Allow Block List
    */
    BLOCKED_FILE_BY_TENANT_ALLOW_BLOCK_LIST,
    /**
    * blocked Sender By Tenant Allow Block List
    */
    BLOCKED_SENDER_BY_TENANT_ALLOW_BLOCK_LIST,
    /**
    * blocked Recipient By Tenant Allow Block List
    */
    BLOCKED_RECIPIENT_BY_TENANT_ALLOW_BLOCK_LIST,
    /**
    * allowed By Connection
    */
    ALLOWED_BY_CONNECTION,
    /**
    * blocked By Connection
    */
    BLOCKED_BY_CONNECTION,
    /**
    * allowed By Exchange Transport Rule
    */
    ALLOWED_BY_EXCHANGE_TRANSPORT_RULE,
    /**
    * blocked By Exchange Transport Rule
    */
    BLOCKED_BY_EXCHANGE_TRANSPORT_RULE,
    /**
    * quarantine Released
    */
    QUARANTINE_RELEASED,
    /**
    * quarantine Released Then Blocked
    */
    QUARANTINE_RELEASED_THEN_BLOCKED,
    /**
    * junk Mail Rule Disabled
    */
    JUNK_MAIL_RULE_DISABLED,
    /**
    * allowed By User Setting
    */
    ALLOWED_BY_USER_SETTING,
    /**
    * blocked By User Setting
    */
    BLOCKED_BY_USER_SETTING,
    /**
    * allowed By Tenant
    */
    ALLOWED_BY_TENANT,
    /**
    * blocked By Tenant
    */
    BLOCKED_BY_TENANT,
    /**
    * invalid False Positive
    */
    INVALID_FALSE_POSITIVE,
    /**
    * invalid False Negative
    */
    INVALID_FALSE_NEGATIVE,
    /**
    * spoof Blocked
    */
    SPOOF_BLOCKED,
    /**
    * good Reclassified As Bad
    */
    GOOD_RECLASSIFIED_AS_BAD,
    /**
    * good Reclassified As Bulk
    */
    GOOD_RECLASSIFIED_AS_BULK,
    /**
    * good Reclassified As Good
    */
    GOOD_RECLASSIFIED_AS_GOOD,
    /**
    * good Reclassified As Cannot Make Decision
    */
    GOOD_RECLASSIFIED_AS_CANNOT_MAKE_DECISION,
    /**
    * bad Reclassified As Good
    */
    BAD_RECLASSIFIED_AS_GOOD,
    /**
    * bad Reclassified As Bulk
    */
    BAD_RECLASSIFIED_AS_BULK,
    /**
    * bad Reclassified As Bad
    */
    BAD_RECLASSIFIED_AS_BAD,
    /**
    * bad Reclassified As Cannot Make Decision
    */
    BAD_RECLASSIFIED_AS_CANNOT_MAKE_DECISION,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SubmissionResultDetail values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Membership Rule Processing Status Details.
*/
public enum MembershipRuleProcessingStatusDetails
{
    /**
    * Not Started
    */
    NOT_STARTED,
    /**
    * Running
    */
    RUNNING,
    /**
    * Failed
    */
    FAILED,
    /**
    * Succeeded
    */
    SUCCEEDED,
    /**
    * Unsupported Future Value
    */
    UNSUPPORTED_FUTURE_VALUE,
    /**
    * For MembershipRuleProcessingStatusDetails values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

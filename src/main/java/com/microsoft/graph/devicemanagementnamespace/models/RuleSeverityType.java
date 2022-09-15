// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.devicemanagement.models;


/**
 * The Enum Rule Severity Type.
*/
public enum RuleSeverityType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * informational
    */
    INFORMATIONAL,
    /**
    * warning
    */
    WARNING,
    /**
    * critical
    */
    CRITICAL,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For RuleSeverityType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

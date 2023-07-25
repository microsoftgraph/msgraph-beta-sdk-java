// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Hunting Rule Run Status.
*/
public enum HuntingRuleRunStatus
{
    /**
    * running
    */
    RUNNING,
    /**
    * completed
    */
    COMPLETED,
    /**
    * failed
    */
    FAILED,
    /**
    * partially Failed
    */
    PARTIALLY_FAILED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For HuntingRuleRunStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

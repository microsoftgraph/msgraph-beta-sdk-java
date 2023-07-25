// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Hunting Rule Error Code.
*/
public enum HuntingRuleErrorCode
{
    /**
    * query Execution Failed
    */
    QUERY_EXECUTION_FAILED,
    /**
    * query Execution Throttling
    */
    QUERY_EXECUTION_THROTTLING,
    /**
    * query Exceeded Result Size
    */
    QUERY_EXCEEDED_RESULT_SIZE,
    /**
    * query Limits Exceeded
    */
    QUERY_LIMITS_EXCEEDED,
    /**
    * query Timeout
    */
    QUERY_TIMEOUT,
    /**
    * alert Creation Failed
    */
    ALERT_CREATION_FAILED,
    /**
    * alert Report Not Found
    */
    ALERT_REPORT_NOT_FOUND,
    /**
    * partial Rows Failed
    */
    PARTIAL_ROWS_FAILED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For HuntingRuleErrorCode values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

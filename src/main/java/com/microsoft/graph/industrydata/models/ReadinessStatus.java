// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.industrydata.models;


/**
 * The Enum Readiness Status.
*/
public enum ReadinessStatus
{
    /**
    * not Ready
    */
    NOT_READY,
    /**
    * ready
    */
    READY,
    /**
    * failed
    */
    FAILED,
    /**
    * disabled
    */
    DISABLED,
    /**
    * expired
    */
    EXPIRED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ReadinessStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Mobile Threat Partner Tenant State.
*/
public enum MobileThreatPartnerTenantState
{
    /**
    * unavailable
    */
    UNAVAILABLE,
    /**
    * available
    */
    AVAILABLE,
    /**
    * enabled
    */
    ENABLED,
    /**
    * unresponsive
    */
    UNRESPONSIVE,
    /**
    * not Set Up
    */
    NOT_SET_UP,
    /**
    * error
    */
    ERROR,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For MobileThreatPartnerTenantState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

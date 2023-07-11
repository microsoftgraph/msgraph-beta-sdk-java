// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Root Domains.
*/
public enum RootDomains
{
    /**
    * none
    */
    NONE,
    /**
    * all
    */
    ALL,
    /**
    * all Federated
    */
    ALL_FEDERATED,
    /**
    * all Managed
    */
    ALL_MANAGED,
    /**
    * enumerated
    */
    ENUMERATED,
    /**
    * all Managed And Enumerated Federated
    */
    ALL_MANAGED_AND_ENUMERATED_FEDERATED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For RootDomains values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.models;


/**
 * The Enum Management Provider.
*/
public enum ManagementProvider
{
    /**
    * microsoft
    */
    MICROSOFT,
    /**
    * community
    */
    COMMUNITY,
    /**
    * indirect Provider
    */
    INDIRECT_PROVIDER,
    /**
    * self
    */
    SELF,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ManagementProvider values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

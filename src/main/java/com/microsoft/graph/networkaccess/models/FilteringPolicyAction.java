// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.networkaccess.models;


/**
 * The Enum Filtering Policy Action.
*/
public enum FilteringPolicyAction
{
    /**
    * block
    */
    BLOCK,
    /**
    * allow
    */
    ALLOW,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For FilteringPolicyAction values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

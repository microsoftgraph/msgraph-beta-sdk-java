// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.models;


/**
 * The Enum External Group Member Type.
*/
public enum ExternalGroupMemberType
{
    /**
    * user
    */
    USER,
    /**
    * group
    */
    GROUP,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ExternalGroupMemberType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

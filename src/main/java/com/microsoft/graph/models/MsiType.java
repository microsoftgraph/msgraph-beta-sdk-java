// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Msi Type.
*/
public enum MsiType
{
    /**
    * none
    */
    NONE,
    /**
    * user Assigned
    */
    USER_ASSIGNED,
    /**
    * system Assigned
    */
    SYSTEM_ASSIGNED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For MsiType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

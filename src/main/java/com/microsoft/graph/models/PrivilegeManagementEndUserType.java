// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Privilege Management End User Type.
*/
public enum PrivilegeManagementEndUserType
{
    /**
    * undetermined
    */
    UNDETERMINED,
    /**
    * azure Ad
    */
    AZURE_AD,
    /**
    * hybrid
    */
    HYBRID,
    /**
    * local
    */
    LOCAL,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PrivilegeManagementEndUserType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

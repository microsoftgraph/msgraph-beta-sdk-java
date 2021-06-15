// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.managedtenants.models;


/**
 * The Enum Delegated Privilege Status.
*/
public enum DelegatedPrivilegeStatus
{
    /**
    * none
    */
    NONE,
    /**
    * delegated Admin Privileges
    */
    DELEGATED_ADMIN_PRIVILEGES,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DelegatedPrivilegeStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

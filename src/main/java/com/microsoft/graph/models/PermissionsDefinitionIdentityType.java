// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Permissions Definition Identity Type.
*/
public enum PermissionsDefinitionIdentityType
{
    /**
    * user
    */
    USER,
    /**
    * role
    */
    ROLE,
    /**
    * application
    */
    APPLICATION,
    /**
    * managed Identity
    */
    MANAGED_IDENTITY,
    /**
    * service Account
    */
    SERVICE_ACCOUNT,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PermissionsDefinitionIdentityType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

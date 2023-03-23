// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Allowed Role Principal Types.
*/
public enum AllowedRolePrincipalTypes
{
    /**
    * user
    */
    USER,
    /**
    * service Principal
    */
    SERVICE_PRINCIPAL,
    /**
    * group
    */
    GROUP,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AllowedRolePrincipalTypes values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

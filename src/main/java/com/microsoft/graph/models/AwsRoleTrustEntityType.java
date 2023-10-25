// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Aws Role Trust Entity Type.
*/
public enum AwsRoleTrustEntityType
{
    /**
    * none
    */
    NONE,
    /**
    * service
    */
    SERVICE,
    /**
    * sso
    */
    SSO,
    /**
    * cross Account
    */
    CROSS_ACCOUNT,
    /**
    * web Identity
    */
    WEB_IDENTITY,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AwsRoleTrustEntityType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

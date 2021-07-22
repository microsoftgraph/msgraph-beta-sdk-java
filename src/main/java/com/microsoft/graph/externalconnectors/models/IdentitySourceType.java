// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.models;


/**
 * The Enum Identity Source Type.
 * @deprecated The property named 'IdentitySource' will be deprecated in September 2021, please see the updated aclType usage.
*/
@Deprecated
public enum IdentitySourceType
{
    /**
    * azure Active Directory
    */
    AZURE_ACTIVE_DIRECTORY,
    /**
    * external
    */
    EXTERNAL,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For IdentitySourceType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

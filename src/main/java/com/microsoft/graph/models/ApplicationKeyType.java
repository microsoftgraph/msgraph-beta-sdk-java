// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Application Key Type.
*/
public enum ApplicationKeyType
{
    /**
    * client Secret
    */
    CLIENT_SECRET,
    /**
    * certificate
    */
    CERTIFICATE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For ApplicationKeyType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

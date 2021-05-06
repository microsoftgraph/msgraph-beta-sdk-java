// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Network Type.
*/
public enum NetworkType
{
    /**
    * intranet
    */
    INTRANET,
    /**
    * extranet
    */
    EXTRANET,
    /**
    * named Network
    */
    NAMED_NETWORK,
    /**
    * trusted
    */
    TRUSTED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * trusted Named Location
    */
    TRUSTED_NAMED_LOCATION,
    /**
    * For NetworkType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

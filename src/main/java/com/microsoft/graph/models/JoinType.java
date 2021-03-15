// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Join Type.
*/
public enum JoinType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * azure ADJoined
    */
    AZURE_AD_JOINED,
    /**
    * azure ADRegistered
    */
    AZURE_AD_REGISTERED,
    /**
    * hybrid Azure ADJoined
    */
    HYBRID_AZURE_AD_JOINED,
    /**
    * For JoinType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

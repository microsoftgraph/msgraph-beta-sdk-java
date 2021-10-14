// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Cloud Pc Domain Join Type.
*/
public enum CloudPcDomainJoinType
{
    /**
    * azure ADJoin
    */
    AZURE_AD_JOIN,
    /**
    * hybrid Azure ADJoin
    */
    HYBRID_AZURE_AD_JOIN,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For CloudPcDomainJoinType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

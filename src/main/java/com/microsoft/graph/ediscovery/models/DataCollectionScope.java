// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.ediscovery.models;


/**
 * The Enum Data Collection Scope.
*/
public enum DataCollectionScope
{
    /**
    * all Versions
    */
    ALL_VERSIONS,
    /**
    * conversations
    */
    CONVERSATIONS,
    /**
    * linked Files
    */
    LINKED_FILES,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DataCollectionScope values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

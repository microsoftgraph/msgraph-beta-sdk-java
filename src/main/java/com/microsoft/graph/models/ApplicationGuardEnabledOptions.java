// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Application Guard Enabled Options.
*/
public enum ApplicationGuardEnabledOptions
{
    /**
    * not Configured
    */
    NOT_CONFIGURED,
    /**
    * enabled For Edge
    */
    ENABLED_FOR_EDGE,
    /**
    * enabled For Office
    */
    ENABLED_FOR_OFFICE,
    /**
    * enabled For Edge And Office
    */
    ENABLED_FOR_EDGE_AND_OFFICE,
    /**
    * For ApplicationGuardEnabledOptions values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

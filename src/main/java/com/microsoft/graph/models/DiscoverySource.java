// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Discovery Source.
*/
public enum DiscoverySource
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * admin Import
    */
    ADMIN_IMPORT,
    /**
    * device Enrollment Program
    */
    DEVICE_ENROLLMENT_PROGRAM,
    /**
    * For DiscoverySource values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

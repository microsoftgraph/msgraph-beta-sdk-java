// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Stop And Quarantine File Entity Identifier.
*/
public enum StopAndQuarantineFileEntityIdentifier
{
    /**
    * device Id
    */
    DEVICE_ID,
    /**
    * sha1
    */
    SHA1,
    /**
    * initiating Process SHA1
    */
    INITIATING_PROCESS_SHA1,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For StopAndQuarantineFileEntityIdentifier values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

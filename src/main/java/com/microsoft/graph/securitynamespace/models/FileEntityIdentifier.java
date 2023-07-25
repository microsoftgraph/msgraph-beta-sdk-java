// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum File Entity Identifier.
*/
public enum FileEntityIdentifier
{
    /**
    * sha1
    */
    SHA1,
    /**
    * initiating Process SHA1
    */
    INITIATING_PROCESS_SHA1,
    /**
    * sha256
    */
    SHA256,
    /**
    * initiating Process SHA256
    */
    INITIATING_PROCESS_SHA256,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For FileEntityIdentifier values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

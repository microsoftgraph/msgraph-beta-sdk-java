// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Permissions Request Occurrence Status.
*/
public enum PermissionsRequestOccurrenceStatus
{
    /**
    * granting Failed
    */
    GRANTING_FAILED,
    /**
    * granted
    */
    GRANTED,
    /**
    * granting
    */
    GRANTING,
    /**
    * revoked
    */
    REVOKED,
    /**
    * revoking
    */
    REVOKING,
    /**
    * revoking Failed
    */
    REVOKING_FAILED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PermissionsRequestOccurrenceStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

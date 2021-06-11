// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Cloud Pc Audit Activity Result.
*/
public enum CloudPcAuditActivityResult
{
    /**
    * success
    */
    SUCCESS,
    /**
    * client Error
    */
    CLIENT_ERROR,
    /**
    * failure
    */
    FAILURE,
    /**
    * timeout
    */
    TIMEOUT,
    /**
    * other
    */
    OTHER,
    /**
    * For CloudPcAuditActivityResult values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

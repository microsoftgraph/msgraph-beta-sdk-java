// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Error Code.
*/
public enum ErrorCode
{
    /**
    * no Error
    */
    NO_ERROR,
    /**
    * unauthorized
    */
    UNAUTHORIZED,
    /**
    * not Found
    */
    NOT_FOUND,
    /**
    * deleted
    */
    DELETED,
    /**
    * For ErrorCode values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Cloud Pc Resize Validation Code.
*/
public enum CloudPcResizeValidationCode
{
    /**
    * success
    */
    SUCCESS,
    /**
    * cloud Pc Not Found
    */
    CLOUD_PC_NOT_FOUND,
    /**
    * operation Conflict
    */
    OPERATION_CONFLICT,
    /**
    * operation Not Supported
    */
    OPERATION_NOT_SUPPORTED,
    /**
    * target License Has Assigned
    */
    TARGET_LICENSE_HAS_ASSIGNED,
    /**
    * internal Server Error
    */
    INTERNAL_SERVER_ERROR,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For CloudPcResizeValidationCode values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

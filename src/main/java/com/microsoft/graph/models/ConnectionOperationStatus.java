// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Connection Operation Status.
*/
public enum ConnectionOperationStatus
{
    /**
    * unspecified
    */
    UNSPECIFIED,
    /**
    * inprogress
    */
    INPROGRESS,
    /**
    * completed
    */
    COMPLETED,
    /**
    * failed
    */
    FAILED,
    /**
    * For ConnectionOperationStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

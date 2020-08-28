// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Management State.
*/
public enum ManagementState
{
    /**
    * managed
    */
    MANAGED,
    /**
    * retire Pending
    */
    RETIRE_PENDING,
    /**
    * retire Failed
    */
    RETIRE_FAILED,
    /**
    * wipe Pending
    */
    WIPE_PENDING,
    /**
    * wipe Failed
    */
    WIPE_FAILED,
    /**
    * unhealthy
    */
    UNHEALTHY,
    /**
    * delete Pending
    */
    DELETE_PENDING,
    /**
    * retire Issued
    */
    RETIRE_ISSUED,
    /**
    * wipe Issued
    */
    WIPE_ISSUED,
    /**
    * wipe Canceled
    */
    WIPE_CANCELED,
    /**
    * retire Canceled
    */
    RETIRE_CANCELED,
    /**
    * discovered
    */
    DISCOVERED,
    /**
    * For ManagementState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

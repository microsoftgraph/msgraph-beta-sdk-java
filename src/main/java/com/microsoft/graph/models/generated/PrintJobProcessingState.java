// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Print Job Processing State.
*/
public enum PrintJobProcessingState
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * pending
    */
    PENDING,
    /**
    * pending Held
    */
    PENDING_HELD,
    /**
    * processing
    */
    PROCESSING,
    /**
    * paused
    */
    PAUSED,
    /**
    * stopped
    */
    STOPPED,
    /**
    * completed
    */
    COMPLETED,
    /**
    * canceled
    */
    CANCELED,
    /**
    * aborted
    */
    ABORTED,
    /**
    * For PrintJobProcessingState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

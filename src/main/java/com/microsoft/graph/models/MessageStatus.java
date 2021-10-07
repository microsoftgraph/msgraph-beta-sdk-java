// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Message Status.
*/
public enum MessageStatus
{
    /**
    * getting Status
    */
    GETTING_STATUS,
    /**
    * pending
    */
    PENDING,
    /**
    * failed
    */
    FAILED,
    /**
    * delivered
    */
    DELIVERED,
    /**
    * expanded
    */
    EXPANDED,
    /**
    * quarantined
    */
    QUARANTINED,
    /**
    * filtered As Spam
    */
    FILTERED_AS_SPAM,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For MessageStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

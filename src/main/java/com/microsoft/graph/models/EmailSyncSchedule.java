// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Email Sync Schedule.
*/
public enum EmailSyncSchedule
{
    /**
    * user Defined
    */
    USER_DEFINED,
    /**
    * as Messages Arrive
    */
    AS_MESSAGES_ARRIVE,
    /**
    * manual
    */
    MANUAL,
    /**
    * fifteen Minutes
    */
    FIFTEEN_MINUTES,
    /**
    * thirty Minutes
    */
    THIRTY_MINUTES,
    /**
    * sixty Minutes
    */
    SIXTY_MINUTES,
    /**
    * based On My Usage
    */
    BASED_ON_MY_USAGE,
    /**
    * For EmailSyncSchedule values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Setup Status.
*/
public enum SetupStatus
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * not Registered Yet
    */
    NOT_REGISTERED_YET,
    /**
    * registered Setup Not Started
    */
    REGISTERED_SETUP_NOT_STARTED,
    /**
    * registered Setup In Progress
    */
    REGISTERED_SETUP_IN_PROGRESS,
    /**
    * registration And Setup Completed
    */
    REGISTRATION_AND_SETUP_COMPLETED,
    /**
    * registration Failed
    */
    REGISTRATION_FAILED,
    /**
    * registration Timed Out
    */
    REGISTRATION_TIMED_OUT,
    /**
    * disabled
    */
    DISABLED,
    /**
    * For SetupStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

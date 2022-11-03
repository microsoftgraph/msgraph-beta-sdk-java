// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Authentication App Policy Status.
*/
public enum AuthenticationAppPolicyStatus
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * app Lock Out Of Date
    */
    APP_LOCK_OUT_OF_DATE,
    /**
    * app Lock Enabled
    */
    APP_LOCK_ENABLED,
    /**
    * app Lock Disabled
    */
    APP_LOCK_DISABLED,
    /**
    * app Context Out Of Date
    */
    APP_CONTEXT_OUT_OF_DATE,
    /**
    * app Context Shown
    */
    APP_CONTEXT_SHOWN,
    /**
    * app Context Not Shown
    */
    APP_CONTEXT_NOT_SHOWN,
    /**
    * location Context Out Of Date
    */
    LOCATION_CONTEXT_OUT_OF_DATE,
    /**
    * location Context Shown
    */
    LOCATION_CONTEXT_SHOWN,
    /**
    * location Context Not Shown
    */
    LOCATION_CONTEXT_NOT_SHOWN,
    /**
    * number Match Out Of Date
    */
    NUMBER_MATCH_OUT_OF_DATE,
    /**
    * number Match Correct Number Entered
    */
    NUMBER_MATCH_CORRECT_NUMBER_ENTERED,
    /**
    * number Match Incorrect Number Entered
    */
    NUMBER_MATCH_INCORRECT_NUMBER_ENTERED,
    /**
    * number Match Deny
    */
    NUMBER_MATCH_DENY,
    /**
    * tamper Resistant Hardware Out Of Date
    */
    TAMPER_RESISTANT_HARDWARE_OUT_OF_DATE,
    /**
    * tamper Resistant Hardware Used
    */
    TAMPER_RESISTANT_HARDWARE_USED,
    /**
    * tamper Resistant Hardware Not Used
    */
    TAMPER_RESISTANT_HARDWARE_NOT_USED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AuthenticationAppPolicyStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

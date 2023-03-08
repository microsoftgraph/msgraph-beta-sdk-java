// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Authentication Strength Result.
*/
public enum AuthenticationStrengthResult
{
    /**
    * not Set
    */
    NOT_SET,
    /**
    * skipped For Proof Up
    */
    SKIPPED_FOR_PROOF_UP,
    /**
    * satisfied
    */
    SATISFIED,
    /**
    * single Challenge Required
    */
    SINGLE_CHALLENGE_REQUIRED,
    /**
    * multiple Challenges Required
    */
    MULTIPLE_CHALLENGES_REQUIRED,
    /**
    * single Registration Required
    */
    SINGLE_REGISTRATION_REQUIRED,
    /**
    * multiple Registrations Required
    */
    MULTIPLE_REGISTRATIONS_REQUIRED,
    /**
    * cannot Satisfy Due To Combination Configuration
    */
    CANNOT_SATISFY_DUE_TO_COMBINATION_CONFIGURATION,
    /**
    * cannot Satisfy
    */
    CANNOT_SATISFY,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AuthenticationStrengthResult values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

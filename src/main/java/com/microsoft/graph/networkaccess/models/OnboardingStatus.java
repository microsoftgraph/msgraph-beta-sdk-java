// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.networkaccess.models;


/**
 * The Enum Onboarding Status.
*/
public enum OnboardingStatus
{
    /**
    * offboarded
    */
    OFFBOARDED,
    /**
    * offboarding In Progress
    */
    OFFBOARDING_IN_PROGRESS,
    /**
    * onboarding In Progress
    */
    ONBOARDING_IN_PROGRESS,
    /**
    * onboarded
    */
    ONBOARDED,
    /**
    * onboarding Error Occurred
    */
    ONBOARDING_ERROR_OCCURRED,
    /**
    * offboarding Error Occurred
    */
    OFFBOARDING_ERROR_OCCURRED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For OnboardingStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

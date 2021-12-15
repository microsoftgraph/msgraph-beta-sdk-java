// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Onboarding Status.
*/
public enum OnboardingStatus
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * inprogress
    */
    INPROGRESS,
    /**
    * onboarded
    */
    ONBOARDED,
    /**
    * failed
    */
    FAILED,
    /**
    * offboarding
    */
    OFFBOARDING,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For OnboardingStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Comanagement Eligible Type.
*/
public enum ComanagementEligibleType
{
    /**
    * comanaged
    */
    COMANAGED,
    /**
    * eligible
    */
    ELIGIBLE,
    /**
    * eligible But Not Azure Ad Joined
    */
    ELIGIBLE_BUT_NOT_AZURE_AD_JOINED,
    /**
    * needs Os Update
    */
    NEEDS_OS_UPDATE,
    /**
    * ineligible
    */
    INELIGIBLE,
    /**
    * For ComanagementEligibleType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

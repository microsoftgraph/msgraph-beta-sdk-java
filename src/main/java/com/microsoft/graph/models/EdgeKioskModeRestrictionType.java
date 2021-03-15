// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Edge Kiosk Mode Restriction Type.
*/
public enum EdgeKioskModeRestrictionType
{
    /**
    * not Configured
    */
    NOT_CONFIGURED,
    /**
    * digital Signage
    */
    DIGITAL_SIGNAGE,
    /**
    * normal Mode
    */
    NORMAL_MODE,
    /**
    * public Browsing Single App
    */
    PUBLIC_BROWSING_SINGLE_APP,
    /**
    * public Browsing Multi App
    */
    PUBLIC_BROWSING_MULTI_APP,
    /**
    * For EdgeKioskModeRestrictionType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

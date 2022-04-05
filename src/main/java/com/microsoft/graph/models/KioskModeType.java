// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Kiosk Mode Type.
*/
public enum KioskModeType
{
    /**
    * not Configured
    */
    NOT_CONFIGURED,
    /**
    * single App Mode
    */
    SINGLE_APP_MODE,
    /**
    * multi App Mode
    */
    MULTI_APP_MODE,
    /**
    * For KioskModeType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

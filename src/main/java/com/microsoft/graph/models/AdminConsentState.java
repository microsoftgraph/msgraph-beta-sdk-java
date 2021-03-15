// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Admin Consent State.
*/
public enum AdminConsentState
{
    /**
    * not Configured
    */
    NOT_CONFIGURED,
    /**
    * granted
    */
    GRANTED,
    /**
    * not Granted
    */
    NOT_GRANTED,
    /**
    * For AdminConsentState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

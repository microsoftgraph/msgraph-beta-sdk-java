// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Configuration Manager Action Type.
*/
public enum ConfigurationManagerActionType
{
    /**
    * refresh Machine Policy
    */
    REFRESH_MACHINE_POLICY,
    /**
    * refresh User Policy
    */
    REFRESH_USER_POLICY,
    /**
    * wake Up Client
    */
    WAKE_UP_CLIENT,
    /**
    * app Evaluation
    */
    APP_EVALUATION,
    /**
    * For ConfigurationManagerActionType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

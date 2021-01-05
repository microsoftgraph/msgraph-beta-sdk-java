// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Configuration Manager Client State.
*/
public enum ConfigurationManagerClientState
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * installed
    */
    INSTALLED,
    /**
    * healthy
    */
    HEALTHY,
    /**
    * install Failed
    */
    INSTALL_FAILED,
    /**
    * update Failed
    */
    UPDATE_FAILED,
    /**
    * communication Error
    */
    COMMUNICATION_ERROR,
    /**
    * For ConfigurationManagerClientState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

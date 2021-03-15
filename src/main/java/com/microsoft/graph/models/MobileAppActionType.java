// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Mobile App Action Type.
*/
public enum MobileAppActionType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * install Command Sent
    */
    INSTALL_COMMAND_SENT,
    /**
    * installed
    */
    INSTALLED,
    /**
    * uninstalled
    */
    UNINSTALLED,
    /**
    * user Requested Install
    */
    USER_REQUESTED_INSTALL,
    /**
    * For MobileAppActionType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

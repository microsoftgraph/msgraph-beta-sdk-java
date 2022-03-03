// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Local Security Options Smart Card Removal Behavior Type.
*/
public enum LocalSecurityOptionsSmartCardRemovalBehaviorType
{
    /**
    * no Action
    */
    NO_ACTION,
    /**
    * lock Workstation
    */
    LOCK_WORKSTATION,
    /**
    * force Logoff
    */
    FORCE_LOGOFF,
    /**
    * disconnect Remote Desktop Session
    */
    DISCONNECT_REMOTE_DESKTOP_SESSION,
    /**
    * For LocalSecurityOptionsSmartCardRemovalBehaviorType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

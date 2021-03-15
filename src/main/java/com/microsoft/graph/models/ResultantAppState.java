// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Resultant App State.
*/
public enum ResultantAppState
{
    /**
    * not Applicable
    */
    NOT_APPLICABLE,
    /**
    * installed
    */
    INSTALLED,
    /**
    * failed
    */
    FAILED,
    /**
    * not Installed
    */
    NOT_INSTALLED,
    /**
    * uninstall Failed
    */
    UNINSTALL_FAILED,
    /**
    * pending Install
    */
    PENDING_INSTALL,
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * For ResultantAppState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

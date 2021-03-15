// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Windows Update Status.
*/
public enum WindowsUpdateStatus
{
    /**
    * up To Date
    */
    UP_TO_DATE,
    /**
    * pending Installation
    */
    PENDING_INSTALLATION,
    /**
    * pending Reboot
    */
    PENDING_REBOOT,
    /**
    * failed
    */
    FAILED,
    /**
    * For WindowsUpdateStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Mac OSSoftware Update Behavior.
*/
public enum MacOSSoftwareUpdateBehavior
{
    /**
    * not Configured
    */
    NOT_CONFIGURED,
    /**
    * default
    */
    DEFAULT,
    /**
    * download Only
    */
    DOWNLOAD_ONLY,
    /**
    * install ASAP
    */
    INSTALL_ASAP,
    /**
    * notify Only
    */
    NOTIFY_ONLY,
    /**
    * install Later
    */
    INSTALL_LATER,
    /**
    * For MacOSSoftwareUpdateBehavior values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

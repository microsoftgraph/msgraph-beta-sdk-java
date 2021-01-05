// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Mac OSSoftware Update State.
*/
public enum MacOSSoftwareUpdateState
{
    /**
    * success
    */
    SUCCESS,
    /**
    * downloading
    */
    DOWNLOADING,
    /**
    * downloaded
    */
    DOWNLOADED,
    /**
    * installing
    */
    INSTALLING,
    /**
    * idle
    */
    IDLE,
    /**
    * available
    */
    AVAILABLE,
    /**
    * scheduled
    */
    SCHEDULED,
    /**
    * download Failed
    */
    DOWNLOAD_FAILED,
    /**
    * download Insufficient Space
    */
    DOWNLOAD_INSUFFICIENT_SPACE,
    /**
    * download Insufficient Power
    */
    DOWNLOAD_INSUFFICIENT_POWER,
    /**
    * download Insufficient Network
    */
    DOWNLOAD_INSUFFICIENT_NETWORK,
    /**
    * install Insufficient Space
    */
    INSTALL_INSUFFICIENT_SPACE,
    /**
    * install Insufficient Power
    */
    INSTALL_INSUFFICIENT_POWER,
    /**
    * install Failed
    */
    INSTALL_FAILED,
    /**
    * command Failed
    */
    COMMAND_FAILED,
    /**
    * For MacOSSoftwareUpdateState values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

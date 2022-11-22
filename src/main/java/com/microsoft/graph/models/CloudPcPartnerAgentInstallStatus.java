// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Cloud Pc Partner Agent Install Status.
*/
public enum CloudPcPartnerAgentInstallStatus
{
    /**
    * installed
    */
    INSTALLED,
    /**
    * install Failed
    */
    INSTALL_FAILED,
    /**
    * installing
    */
    INSTALLING,
    /**
    * uninstalling
    */
    UNINSTALLING,
    /**
    * uninstall Failed
    */
    UNINSTALL_FAILED,
    /**
    * licensed
    */
    LICENSED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For CloudPcPartnerAgentInstallStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

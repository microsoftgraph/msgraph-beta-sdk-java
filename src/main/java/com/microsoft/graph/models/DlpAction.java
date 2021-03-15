// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Dlp Action.
*/
public enum DlpAction
{
    /**
    * notify User
    */
    NOTIFY_USER,
    /**
    * block Access
    */
    BLOCK_ACCESS,
    /**
    * device Restriction
    */
    DEVICE_RESTRICTION,
    /**
    * For DlpAction values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

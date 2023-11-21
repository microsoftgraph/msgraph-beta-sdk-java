// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Messaging Redirect App Type.
*/
public enum MessagingRedirectAppType
{
    /**
    * any App
    */
    ANY_APP,
    /**
    * any Managed App
    */
    ANY_MANAGED_APP,
    /**
    * specific Apps
    */
    SPECIFIC_APPS,
    /**
    * For MessagingRedirectAppType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

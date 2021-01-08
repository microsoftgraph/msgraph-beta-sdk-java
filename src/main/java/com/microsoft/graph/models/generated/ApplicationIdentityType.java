// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Application Identity Type.
*/
public enum ApplicationIdentityType
{
    /**
    * aad Application
    */
    AAD_APPLICATION,
    /**
    * bot
    */
    BOT,
    /**
    * tenant Bot
    */
    TENANT_BOT,
    /**
    * office365Connector
    */
    OFFICE365_CONNECTOR,
    /**
    * outgoing Webhook
    */
    OUTGOING_WEBHOOK,
    /**
    * For ApplicationIdentityType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum B2b Identity Providers Type.
*/
public enum B2bIdentityProvidersType
{
    /**
    * azure Active Directory
    */
    AZURE_ACTIVE_DIRECTORY,
    /**
    * external Federation
    */
    EXTERNAL_FEDERATION,
    /**
    * social Identity Providers
    */
    SOCIAL_IDENTITY_PROVIDERS,
    /**
    * email One Time Passcode
    */
    EMAIL_ONE_TIME_PASSCODE,
    /**
    * microsoft Account
    */
    MICROSOFT_ACCOUNT,
    /**
    * default Configured Idp
    */
    DEFAULT_CONFIGURED_IDP,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For B2bIdentityProvidersType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

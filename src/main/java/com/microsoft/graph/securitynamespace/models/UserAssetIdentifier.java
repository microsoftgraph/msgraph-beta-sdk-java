// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum User Asset Identifier.
*/
public enum UserAssetIdentifier
{
    /**
    * account Object Id
    */
    ACCOUNT_OBJECT_ID,
    /**
    * account Sid
    */
    ACCOUNT_SID,
    /**
    * account Upn
    */
    ACCOUNT_UPN,
    /**
    * account Name
    */
    ACCOUNT_NAME,
    /**
    * account Domain
    */
    ACCOUNT_DOMAIN,
    /**
    * account Id
    */
    ACCOUNT_ID,
    /**
    * request Account Sid
    */
    REQUEST_ACCOUNT_SID,
    /**
    * request Account Name
    */
    REQUEST_ACCOUNT_NAME,
    /**
    * request Account Domain
    */
    REQUEST_ACCOUNT_DOMAIN,
    /**
    * recipient Object Id
    */
    RECIPIENT_OBJECT_ID,
    /**
    * process Account Object Id
    */
    PROCESS_ACCOUNT_OBJECT_ID,
    /**
    * initiating Account Sid
    */
    INITIATING_ACCOUNT_SID,
    /**
    * initiating Process Account Upn
    */
    INITIATING_PROCESS_ACCOUNT_UPN,
    /**
    * initiating Account Name
    */
    INITIATING_ACCOUNT_NAME,
    /**
    * initiating Account Domain
    */
    INITIATING_ACCOUNT_DOMAIN,
    /**
    * service Principal Id
    */
    SERVICE_PRINCIPAL_ID,
    /**
    * service Principal Name
    */
    SERVICE_PRINCIPAL_NAME,
    /**
    * target Account Upn
    */
    TARGET_ACCOUNT_UPN,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For UserAssetIdentifier values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

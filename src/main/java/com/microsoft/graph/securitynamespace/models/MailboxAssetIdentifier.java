// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum Mailbox Asset Identifier.
*/
public enum MailboxAssetIdentifier
{
    /**
    * account Upn
    */
    ACCOUNT_UPN,
    /**
    * file Owner Upn
    */
    FILE_OWNER_UPN,
    /**
    * initiating Process Account Upn
    */
    INITIATING_PROCESS_ACCOUNT_UPN,
    /**
    * last Modifying Account Upn
    */
    LAST_MODIFYING_ACCOUNT_UPN,
    /**
    * target Account Upn
    */
    TARGET_ACCOUNT_UPN,
    /**
    * sender From Address
    */
    SENDER_FROM_ADDRESS,
    /**
    * sender Display Name
    */
    SENDER_DISPLAY_NAME,
    /**
    * recipient Email Address
    */
    RECIPIENT_EMAIL_ADDRESS,
    /**
    * sender Mail From Address
    */
    SENDER_MAIL_FROM_ADDRESS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For MailboxAssetIdentifier values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

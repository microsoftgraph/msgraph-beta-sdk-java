// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;


/**
 * The Enum User Mailbox Setting.
*/
public enum UserMailboxSetting
{
    /**
    * none
    */
    NONE,
    /**
    * junk Mail Deletion
    */
    JUNK_MAIL_DELETION,
    /**
    * is From Address In Address Book
    */
    IS_FROM_ADDRESS_IN_ADDRESS_BOOK,
    /**
    * is From Address In Address Safe List
    */
    IS_FROM_ADDRESS_IN_ADDRESS_SAFE_LIST,
    /**
    * is From Address In Address Block List
    */
    IS_FROM_ADDRESS_IN_ADDRESS_BLOCK_LIST,
    /**
    * is From Address In Address Implicit Safe List
    */
    IS_FROM_ADDRESS_IN_ADDRESS_IMPLICIT_SAFE_LIST,
    /**
    * is From Address In Address Implicit Junk List
    */
    IS_FROM_ADDRESS_IN_ADDRESS_IMPLICIT_JUNK_LIST,
    /**
    * is From Domain In Domain Safe List
    */
    IS_FROM_DOMAIN_IN_DOMAIN_SAFE_LIST,
    /**
    * is From Domain In Domain Block List
    */
    IS_FROM_DOMAIN_IN_DOMAIN_BLOCK_LIST,
    /**
    * is Recipient In Recipient Safe List
    */
    IS_RECIPIENT_IN_RECIPIENT_SAFE_LIST,
    /**
    * custom Rule
    */
    CUSTOM_RULE,
    /**
    * junk Mail Rule
    */
    JUNK_MAIL_RULE,
    /**
    * sender Pra Present
    */
    SENDER_PRA_PRESENT,
    /**
    * from First Time Sender
    */
    FROM_FIRST_TIME_SENDER,
    /**
    * exclusive
    */
    EXCLUSIVE,
    /**
    * prior Seen Pass
    */
    PRIOR_SEEN_PASS,
    /**
    * sender Authentication Succeeded
    */
    SENDER_AUTHENTICATION_SUCCEEDED,
    /**
    * is Junk Mail Rule Enabled
    */
    IS_JUNK_MAIL_RULE_ENABLED,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For UserMailboxSetting values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

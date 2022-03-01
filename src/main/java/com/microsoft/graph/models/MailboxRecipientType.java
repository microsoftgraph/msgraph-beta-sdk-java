// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Mailbox Recipient Type.
 * @deprecated The UserPurposeV2 API is deprecated and will stop returning data on April 30, 2022. Please use the UserPurpose API.
*/
@Deprecated
public enum MailboxRecipientType
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * user
    */
    USER,
    /**
    * linked
    */
    LINKED,
    /**
    * shared
    */
    SHARED,
    /**
    * room
    */
    ROOM,
    /**
    * equipment
    */
    EQUIPMENT,
    /**
    * others
    */
    OTHERS,
    /**
    * For MailboxRecipientType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

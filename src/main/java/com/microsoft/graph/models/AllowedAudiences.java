// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Allowed Audiences.
*/
public enum AllowedAudiences
{
    /**
    * me
    */
    ME,
    /**
    * family
    */
    FAMILY,
    /**
    * contacts
    */
    CONTACTS,
    /**
    * group Members
    */
    GROUP_MEMBERS,
    /**
    * organization
    */
    ORGANIZATION,
    /**
    * federated Organizations
    */
    FEDERATED_ORGANIZATIONS,
    /**
    * everyone
    */
    EVERYONE,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AllowedAudiences values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

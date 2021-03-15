// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Person Relationship.
*/
public enum PersonRelationship
{
    /**
    * manager
    */
    MANAGER,
    /**
    * colleague
    */
    COLLEAGUE,
    /**
    * direct Report
    */
    DIRECT_REPORT,
    /**
    * dot Line Report
    */
    DOT_LINE_REPORT,
    /**
    * assistant
    */
    ASSISTANT,
    /**
    * dot Line Manager
    */
    DOT_LINE_MANAGER,
    /**
    * alternate Contact
    */
    ALTERNATE_CONTACT,
    /**
    * friend
    */
    FRIEND,
    /**
    * spouse
    */
    SPOUSE,
    /**
    * sibling
    */
    SIBLING,
    /**
    * child
    */
    CHILD,
    /**
    * parent
    */
    PARENT,
    /**
    * sponsor
    */
    SPONSOR,
    /**
    * emergency Contact
    */
    EMERGENCY_CONTACT,
    /**
    * other
    */
    OTHER,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For PersonRelationship values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

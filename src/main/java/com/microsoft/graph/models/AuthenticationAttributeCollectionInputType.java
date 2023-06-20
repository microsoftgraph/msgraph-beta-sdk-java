// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Authentication Attribute Collection Input Type.
*/
public enum AuthenticationAttributeCollectionInputType
{
    /**
    * text
    */
    TEXT,
    /**
    * radio Single Select
    */
    RADIO_SINGLE_SELECT,
    /**
    * checkbox Multi Select
    */
    CHECKBOX_MULTI_SELECT,
    /**
    * boolean
    */
    BOOLEAN,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AuthenticationAttributeCollectionInputType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

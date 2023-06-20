// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.networkaccess.models;


/**
 * The Enum Dh Group.
*/
public enum DhGroup
{
    /**
    * dh Group14
    */
    DH_GROUP14,
    /**
    * dh Group24
    */
    DH_GROUP24,
    /**
    * dh Group2048
    */
    DH_GROUP2048,
    /**
    * ecp256
    */
    ECP256,
    /**
    * ecp384
    */
    ECP384,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DhGroup values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

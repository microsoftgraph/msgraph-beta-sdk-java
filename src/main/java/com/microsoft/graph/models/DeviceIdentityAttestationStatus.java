// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Device Identity Attestation Status.
*/
public enum DeviceIdentityAttestationStatus
{
    /**
    * unknown
    */
    UNKNOWN,
    /**
    * trusted
    */
    TRUSTED,
    /**
    * un Trusted
    */
    UN_TRUSTED,
    /**
    * not Supported
    */
    NOT_SUPPORTED,
    /**
    * incomplete Data
    */
    INCOMPLETE_DATA,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For DeviceIdentityAttestationStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

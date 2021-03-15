// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Certificate Revocation Status.
*/
public enum CertificateRevocationStatus
{
    /**
    * none
    */
    NONE,
    /**
    * pending
    */
    PENDING,
    /**
    * issued
    */
    ISSUED,
    /**
    * failed
    */
    FAILED,
    /**
    * revoked
    */
    REVOKED,
    /**
    * For CertificateRevocationStatus values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

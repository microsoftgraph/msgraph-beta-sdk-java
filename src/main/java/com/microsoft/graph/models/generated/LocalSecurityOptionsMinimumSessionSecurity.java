// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Local Security Options Minimum Session Security.
*/
public enum LocalSecurityOptionsMinimumSessionSecurity
{
    /**
    * none
    */
    NONE,
    /**
    * require Ntml V2Session Security
    */
    REQUIRE_NTML_V2_SESSION_SECURITY,
    /**
    * require128Bit Encryption
    */
    REQUIRE128_BIT_ENCRYPTION,
    /**
    * ntlm V2And128Bit Encryption
    */
    NTLM_V2_AND128_BIT_ENCRYPTION,
    /**
    * For LocalSecurityOptionsMinimumSessionSecurity values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

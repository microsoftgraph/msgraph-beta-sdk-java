// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum User Pfx Padding Scheme.
*/
public enum UserPfxPaddingScheme
{
    /**
    * none
    */
    NONE,
    /**
    * pkcs1
    */
    PKCS1,
    /**
    * oaep Sha1
    */
    OAEP_SHA1,
    /**
    * oaep Sha256
    */
    OAEP_SHA256,
    /**
    * oaep Sha384
    */
    OAEP_SHA384,
    /**
    * oaep Sha512
    */
    OAEP_SHA512,
    /**
    * For UserPfxPaddingScheme values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

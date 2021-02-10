// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Sign In Identifier Type.
*/
public enum SignInIdentifierType
{
    /**
    * user Principal Name
    */
    USER_PRINCIPAL_NAME,
    /**
    * phone Number
    */
    PHONE_NUMBER,
    /**
    * proxy Address
    */
    PROXY_ADDRESS,
    /**
    * qr Code
    */
    QR_CODE,
    /**
    * on Premises User Principal Name
    */
    ON_PREMISES_USER_PRINCIPAL_NAME,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For SignInIdentifierType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Subject Alternative Name Type.
*/
public enum SubjectAlternativeNameType
{
    /**
    * none
    */
    NONE,
    /**
    * email Address
    */
    EMAIL_ADDRESS,
    /**
    * user Principal Name
    */
    USER_PRINCIPAL_NAME,
    /**
    * custom Azure ADAttribute
    */
    CUSTOM_AZURE_AD_ATTRIBUTE,
    /**
    * domain Name Service
    */
    DOMAIN_NAME_SERVICE,
    /**
    * universal Resource Identifier
    */
    UNIVERSAL_RESOURCE_IDENTIFIER,
    /**
    * For SubjectAlternativeNameType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

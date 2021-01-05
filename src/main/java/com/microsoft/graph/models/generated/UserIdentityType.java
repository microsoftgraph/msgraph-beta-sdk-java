// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum User Identity Type.
*/
public enum UserIdentityType
{
    /**
    * aad User
    */
    AAD_USER,
    /**
    * on Premise Aad User
    */
    ON_PREMISE_AAD_USER,
    /**
    * anonymous Guest
    */
    ANONYMOUS_GUEST,
    /**
    * federated User
    */
    FEDERATED_USER,
    /**
    * personal Microsoft Account User
    */
    PERSONAL_MICROSOFT_ACCOUNT_USER,
    /**
    * skype User
    */
    SKYPE_USER,
    /**
    * For UserIdentityType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

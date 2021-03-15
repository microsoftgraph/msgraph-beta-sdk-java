// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Secure Assessment Account Type.
*/
public enum SecureAssessmentAccountType
{
    /**
    * azure ADAccount
    */
    AZURE_AD_ACCOUNT,
    /**
    * domain Account
    */
    DOMAIN_ACCOUNT,
    /**
    * local Account
    */
    LOCAL_ACCOUNT,
    /**
    * local Guest Account
    */
    LOCAL_GUEST_ACCOUNT,
    /**
    * For SecureAssessmentAccountType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Registration Auth Method.
*/
public enum RegistrationAuthMethod
{
    /**
    * email
    */
    EMAIL,
    /**
    * mobile Phone
    */
    MOBILE_PHONE,
    /**
    * office Phone
    */
    OFFICE_PHONE,
    /**
    * security Question
    */
    SECURITY_QUESTION,
    /**
    * app Notification
    */
    APP_NOTIFICATION,
    /**
    * app Code
    */
    APP_CODE,
    /**
    * alternate Mobile Phone
    */
    ALTERNATE_MOBILE_PHONE,
    /**
    * fido
    */
    FIDO,
    /**
    * app Password
    */
    APP_PASSWORD,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For RegistrationAuthMethod values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Auth Methods Type.
*/
public enum AuthMethodsType
{
    /**
    * email
    */
    EMAIL,
    /**
    * mobile SMS
    */
    MOBILE_SMS,
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
    * app Notification Code
    */
    APP_NOTIFICATION_CODE,
    /**
    * app Notification And Code
    */
    APP_NOTIFICATION_AND_CODE,
    /**
    * app Password
    */
    APP_PASSWORD,
    /**
    * fido
    */
    FIDO,
    /**
    * alternate Mobile Phone
    */
    ALTERNATE_MOBILE_PHONE,
    /**
    * mobile Phone And SMS
    */
    MOBILE_PHONE_AND_SMS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * For AuthMethodsType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

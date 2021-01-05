// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.generated;


/**
 * The Enum Usage Auth Method.
*/
public enum UsageAuthMethod
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
    * mobile Call
    */
    MOBILE_CALL,
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
    * alternate Mobile Call
    */
    ALTERNATE_MOBILE_CALL,
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
    * For UsageAuthMethod values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

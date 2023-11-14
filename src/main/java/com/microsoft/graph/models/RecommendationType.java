// Template Source: Enum.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


/**
 * The Enum Recommendation Type.
*/
public enum RecommendationType
{
    /**
    * adfs Apps Migration
    */
    ADFS_APPS_MIGRATION,
    /**
    * enable Desktop SSO
    */
    ENABLE_DESKTOP_SSO,
    /**
    * enable PHS
    */
    ENABLE_PHS,
    /**
    * enable Provisioning
    */
    ENABLE_PROVISIONING,
    /**
    * switch From Per User MFA
    */
    SWITCH_FROM_PER_USER_MFA,
    /**
    * tenant MFA
    */
    TENANT_MFA,
    /**
    * third Party Apps
    */
    THIRD_PARTY_APPS,
    /**
    * turn Off Per User MFA
    */
    TURN_OFF_PER_USER_MFA,
    /**
    * use Authenticator App
    */
    USE_AUTHENTICATOR_APP,
    /**
    * use My Apps
    */
    USE_MY_APPS,
    /**
    * stale Apps
    */
    STALE_APPS,
    /**
    * stale App Creds
    */
    STALE_APP_CREDS,
    /**
    * application Credential Expiry
    */
    APPLICATION_CREDENTIAL_EXPIRY,
    /**
    * service Principal Key Expiry
    */
    SERVICE_PRINCIPAL_KEY_EXPIRY,
    /**
    * admin MFAV2
    */
    ADMIN_MFAV2,
    /**
    * block Legacy Authentication
    */
    BLOCK_LEGACY_AUTHENTICATION,
    /**
    * integrated Apps
    */
    INTEGRATED_APPS,
    /**
    * mfa Registration V2
    */
    MFA_REGISTRATION_V2,
    /**
    * pwage Policy New
    */
    PWAGE_POLICY_NEW,
    /**
    * password Hash Sync
    */
    PASSWORD_HASH_SYNC,
    /**
    * one Admin
    */
    ONE_ADMIN,
    /**
    * role Overlap
    */
    ROLE_OVERLAP,
    /**
    * self Service Password Reset
    */
    SELF_SERVICE_PASSWORD_RESET,
    /**
    * signin Risk Policy
    */
    SIGNIN_RISK_POLICY,
    /**
    * user Risk Policy
    */
    USER_RISK_POLICY,
    /**
    * verify App Publisher
    */
    VERIFY_APP_PUBLISHER,
    /**
    * private Link For AAD
    */
    PRIVATE_LINK_FOR_AAD,
    /**
    * app Role Assignments Groups
    */
    APP_ROLE_ASSIGNMENTS_GROUPS,
    /**
    * app Role Assignments Users
    */
    APP_ROLE_ASSIGNMENTS_USERS,
    /**
    * managed Identity
    */
    MANAGED_IDENTITY,
    /**
    * overprivileged Apps
    */
    OVERPRIVILEGED_APPS,
    /**
    * unknown Future Value
    */
    UNKNOWN_FUTURE_VALUE,
    /**
    * long Lived Credentials
    */
    LONG_LIVED_CREDENTIALS,
    /**
    * aad Connect Deprecated
    */
    AAD_CONNECT_DEPRECATED,
    /**
    * adal To Msal Migration
    */
    ADAL_TO_MSAL_MIGRATION,
    /**
    * ownerless Apps
    */
    OWNERLESS_APPS,
    /**
    * inactive Guests
    */
    INACTIVE_GUESTS,
    /**
    * For RecommendationType values that were not expected from the service
    */
    UNEXPECTED_VALUE
}

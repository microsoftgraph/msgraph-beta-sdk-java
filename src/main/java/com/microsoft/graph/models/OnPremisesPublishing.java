package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesPublishing implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** If you are configuring a traffic manager in front of multiple App Proxy applications, the alternateUrl is the user-friendly URL that will point to the traffic manager. */
    private String _alternateUrl;
    /** The duration the connector will wait for a response from the backend application before closing the connection. Possible values are default, long. When set to default, the backend application timeout has a length of 85 seconds. When set to long, the backend timeout is increased to 180 seconds. Use long if your server takes more than 85 seconds to respond to requests or if you are unable to access the application and the error status is 'Backend Timeout'. Default value is default. */
    private String _applicationServerTimeout;
    /** Indicates if this application is an Application Proxy configured application. This is pre-set by the system. Read-only. */
    private String _applicationType;
    /** Details the pre-authentication setting for the application. Pre-authentication enforces that users must authenticate before accessing the app. Passthru does not require authentication. Possible values are: passthru, aadPreAuthentication. */
    private ExternalAuthenticationType _externalAuthenticationType;
    /** The published external url for the application. For example, https://intranet-contoso.msappproxy.net/. */
    private String _externalUrl;
    /** The internal url of the application. For example, https://intranet/. */
    private String _internalUrl;
    /** Indicates whether backend SSL certificate validation is enabled for the application. For all new Application Proxy apps, the property will be set to true by default. For all existing apps, the property will be set to false. */
    private Boolean _isBackendCertificateValidationEnabled;
    /** Indicates if the HTTPOnly cookie flag should be set in the HTTP response headers. Set this value to true to have Application Proxy cookies include the HTTPOnly flag in the HTTP response headers. If using Remote Desktop Services, set this value to False. Default value is false. */
    private Boolean _isHttpOnlyCookieEnabled;
    /** Indicates if the application is currently being published via Application Proxy or not. This is pre-set by the system. Read-only. */
    private Boolean _isOnPremPublishingEnabled;
    /** Indicates if the Persistent cookie flag should be set in the HTTP response headers. Keep this value set to false. Only use this setting for applications that can't share cookies between processes. For more information about cookie settings, see Cookie settings for accessing on-premises applications in Azure Active Directory. Default value is false. */
    private Boolean _isPersistentCookieEnabled;
    /** Indicates if the Secure cookie flag should be set in the HTTP response headers. Set this value to true to transmit cookies over a secure channel such as an encrypted HTTPS request. Default value is true. */
    private Boolean _isSecureCookieEnabled;
    /** Indicates whether validation of the state parameter when the client uses the OAuth 2.0 authorization code grant flow is enabled. This setting allows admins to specify whether they want to enable CSRF protection for their apps. */
    private Boolean _isStateSessionEnabled;
    /** Indicates if the application should translate urls in the reponse headers. Keep this value as true unless your application required the original host header in the authentication request. Default value is true. */
    private Boolean _isTranslateHostHeaderEnabled;
    /** Indicates if the application should translate urls in the application body. Keep this value as false unless you have hardcoded HTML links to other on-premises applications and don't use custom domains. For more information, see Link translation with Application Proxy. Default value is false. */
    private Boolean _isTranslateLinksInBodyEnabled;
    /** The OdataType property */
    private String _odataType;
    /** Represents the application segment collection for an on-premises wildcard application. */
    private java.util.List<OnPremisesApplicationSegment> _onPremisesApplicationSegments;
    /** Represents the single sign-on configuration for the on-premises application. */
    private OnPremisesPublishingSingleSignOn _singleSignOnSettings;
    /** The useAlternateUrlForTranslationAndRedirect property */
    private Boolean _useAlternateUrlForTranslationAndRedirect;
    /** Details of the certificate associated with the application when a custom domain is in use. null when using the default domain. Read-only. */
    private VerifiedCustomDomainCertificatesMetadata _verifiedCustomDomainCertificatesMetadata;
    /** The associated key credential for the custom domain used. */
    private KeyCredential _verifiedCustomDomainKeyCredential;
    /** The associated password credential for the custom domain used. */
    private PasswordCredential _verifiedCustomDomainPasswordCredential;
    /**
     * Instantiates a new onPremisesPublishing and sets the default values.
     * @return a void
     */
    public OnPremisesPublishing() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.onPremisesPublishing");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesPublishing
     */
    @javax.annotation.Nonnull
    public static OnPremisesPublishing createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesPublishing();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the alternateUrl property value. If you are configuring a traffic manager in front of multiple App Proxy applications, the alternateUrl is the user-friendly URL that will point to the traffic manager.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlternateUrl() {
        return this._alternateUrl;
    }
    /**
     * Gets the applicationServerTimeout property value. The duration the connector will wait for a response from the backend application before closing the connection. Possible values are default, long. When set to default, the backend application timeout has a length of 85 seconds. When set to long, the backend timeout is increased to 180 seconds. Use long if your server takes more than 85 seconds to respond to requests or if you are unable to access the application and the error status is 'Backend Timeout'. Default value is default.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationServerTimeout() {
        return this._applicationServerTimeout;
    }
    /**
     * Gets the applicationType property value. Indicates if this application is an Application Proxy configured application. This is pre-set by the system. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationType() {
        return this._applicationType;
    }
    /**
     * Gets the externalAuthenticationType property value. Details the pre-authentication setting for the application. Pre-authentication enforces that users must authenticate before accessing the app. Passthru does not require authentication. Possible values are: passthru, aadPreAuthentication.
     * @return a externalAuthenticationType
     */
    @javax.annotation.Nullable
    public ExternalAuthenticationType getExternalAuthenticationType() {
        return this._externalAuthenticationType;
    }
    /**
     * Gets the externalUrl property value. The published external url for the application. For example, https://intranet-contoso.msappproxy.net/.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalUrl() {
        return this._externalUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnPremisesPublishing currentObject = this;
        return new HashMap<>(21) {{
            this.put("alternateUrl", (n) -> { currentObject.setAlternateUrl(n.getStringValue()); });
            this.put("applicationServerTimeout", (n) -> { currentObject.setApplicationServerTimeout(n.getStringValue()); });
            this.put("applicationType", (n) -> { currentObject.setApplicationType(n.getStringValue()); });
            this.put("externalAuthenticationType", (n) -> { currentObject.setExternalAuthenticationType(n.getEnumValue(ExternalAuthenticationType.class)); });
            this.put("externalUrl", (n) -> { currentObject.setExternalUrl(n.getStringValue()); });
            this.put("internalUrl", (n) -> { currentObject.setInternalUrl(n.getStringValue()); });
            this.put("isBackendCertificateValidationEnabled", (n) -> { currentObject.setIsBackendCertificateValidationEnabled(n.getBooleanValue()); });
            this.put("isHttpOnlyCookieEnabled", (n) -> { currentObject.setIsHttpOnlyCookieEnabled(n.getBooleanValue()); });
            this.put("isOnPremPublishingEnabled", (n) -> { currentObject.setIsOnPremPublishingEnabled(n.getBooleanValue()); });
            this.put("isPersistentCookieEnabled", (n) -> { currentObject.setIsPersistentCookieEnabled(n.getBooleanValue()); });
            this.put("isSecureCookieEnabled", (n) -> { currentObject.setIsSecureCookieEnabled(n.getBooleanValue()); });
            this.put("isStateSessionEnabled", (n) -> { currentObject.setIsStateSessionEnabled(n.getBooleanValue()); });
            this.put("isTranslateHostHeaderEnabled", (n) -> { currentObject.setIsTranslateHostHeaderEnabled(n.getBooleanValue()); });
            this.put("isTranslateLinksInBodyEnabled", (n) -> { currentObject.setIsTranslateLinksInBodyEnabled(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("onPremisesApplicationSegments", (n) -> { currentObject.setOnPremisesApplicationSegments(n.getCollectionOfObjectValues(OnPremisesApplicationSegment::createFromDiscriminatorValue)); });
            this.put("singleSignOnSettings", (n) -> { currentObject.setSingleSignOnSettings(n.getObjectValue(OnPremisesPublishingSingleSignOn::createFromDiscriminatorValue)); });
            this.put("useAlternateUrlForTranslationAndRedirect", (n) -> { currentObject.setUseAlternateUrlForTranslationAndRedirect(n.getBooleanValue()); });
            this.put("verifiedCustomDomainCertificatesMetadata", (n) -> { currentObject.setVerifiedCustomDomainCertificatesMetadata(n.getObjectValue(VerifiedCustomDomainCertificatesMetadata::createFromDiscriminatorValue)); });
            this.put("verifiedCustomDomainKeyCredential", (n) -> { currentObject.setVerifiedCustomDomainKeyCredential(n.getObjectValue(KeyCredential::createFromDiscriminatorValue)); });
            this.put("verifiedCustomDomainPasswordCredential", (n) -> { currentObject.setVerifiedCustomDomainPasswordCredential(n.getObjectValue(PasswordCredential::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the internalUrl property value. The internal url of the application. For example, https://intranet/.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInternalUrl() {
        return this._internalUrl;
    }
    /**
     * Gets the isBackendCertificateValidationEnabled property value. Indicates whether backend SSL certificate validation is enabled for the application. For all new Application Proxy apps, the property will be set to true by default. For all existing apps, the property will be set to false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBackendCertificateValidationEnabled() {
        return this._isBackendCertificateValidationEnabled;
    }
    /**
     * Gets the isHttpOnlyCookieEnabled property value. Indicates if the HTTPOnly cookie flag should be set in the HTTP response headers. Set this value to true to have Application Proxy cookies include the HTTPOnly flag in the HTTP response headers. If using Remote Desktop Services, set this value to False. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsHttpOnlyCookieEnabled() {
        return this._isHttpOnlyCookieEnabled;
    }
    /**
     * Gets the isOnPremPublishingEnabled property value. Indicates if the application is currently being published via Application Proxy or not. This is pre-set by the system. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsOnPremPublishingEnabled() {
        return this._isOnPremPublishingEnabled;
    }
    /**
     * Gets the isPersistentCookieEnabled property value. Indicates if the Persistent cookie flag should be set in the HTTP response headers. Keep this value set to false. Only use this setting for applications that can't share cookies between processes. For more information about cookie settings, see Cookie settings for accessing on-premises applications in Azure Active Directory. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPersistentCookieEnabled() {
        return this._isPersistentCookieEnabled;
    }
    /**
     * Gets the isSecureCookieEnabled property value. Indicates if the Secure cookie flag should be set in the HTTP response headers. Set this value to true to transmit cookies over a secure channel such as an encrypted HTTPS request. Default value is true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSecureCookieEnabled() {
        return this._isSecureCookieEnabled;
    }
    /**
     * Gets the isStateSessionEnabled property value. Indicates whether validation of the state parameter when the client uses the OAuth 2.0 authorization code grant flow is enabled. This setting allows admins to specify whether they want to enable CSRF protection for their apps.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsStateSessionEnabled() {
        return this._isStateSessionEnabled;
    }
    /**
     * Gets the isTranslateHostHeaderEnabled property value. Indicates if the application should translate urls in the reponse headers. Keep this value as true unless your application required the original host header in the authentication request. Default value is true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsTranslateHostHeaderEnabled() {
        return this._isTranslateHostHeaderEnabled;
    }
    /**
     * Gets the isTranslateLinksInBodyEnabled property value. Indicates if the application should translate urls in the application body. Keep this value as false unless you have hardcoded HTML links to other on-premises applications and don't use custom domains. For more information, see Link translation with Application Proxy. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsTranslateLinksInBodyEnabled() {
        return this._isTranslateLinksInBodyEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the onPremisesApplicationSegments property value. Represents the application segment collection for an on-premises wildcard application.
     * @return a onPremisesApplicationSegment
     */
    @javax.annotation.Nullable
    public java.util.List<OnPremisesApplicationSegment> getOnPremisesApplicationSegments() {
        return this._onPremisesApplicationSegments;
    }
    /**
     * Gets the singleSignOnSettings property value. Represents the single sign-on configuration for the on-premises application.
     * @return a onPremisesPublishingSingleSignOn
     */
    @javax.annotation.Nullable
    public OnPremisesPublishingSingleSignOn getSingleSignOnSettings() {
        return this._singleSignOnSettings;
    }
    /**
     * Gets the useAlternateUrlForTranslationAndRedirect property value. The useAlternateUrlForTranslationAndRedirect property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseAlternateUrlForTranslationAndRedirect() {
        return this._useAlternateUrlForTranslationAndRedirect;
    }
    /**
     * Gets the verifiedCustomDomainCertificatesMetadata property value. Details of the certificate associated with the application when a custom domain is in use. null when using the default domain. Read-only.
     * @return a verifiedCustomDomainCertificatesMetadata
     */
    @javax.annotation.Nullable
    public VerifiedCustomDomainCertificatesMetadata getVerifiedCustomDomainCertificatesMetadata() {
        return this._verifiedCustomDomainCertificatesMetadata;
    }
    /**
     * Gets the verifiedCustomDomainKeyCredential property value. The associated key credential for the custom domain used.
     * @return a keyCredential
     */
    @javax.annotation.Nullable
    public KeyCredential getVerifiedCustomDomainKeyCredential() {
        return this._verifiedCustomDomainKeyCredential;
    }
    /**
     * Gets the verifiedCustomDomainPasswordCredential property value. The associated password credential for the custom domain used.
     * @return a passwordCredential
     */
    @javax.annotation.Nullable
    public PasswordCredential getVerifiedCustomDomainPasswordCredential() {
        return this._verifiedCustomDomainPasswordCredential;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("alternateUrl", this.getAlternateUrl());
        writer.writeStringValue("applicationServerTimeout", this.getApplicationServerTimeout());
        writer.writeStringValue("applicationType", this.getApplicationType());
        writer.writeEnumValue("externalAuthenticationType", this.getExternalAuthenticationType());
        writer.writeStringValue("externalUrl", this.getExternalUrl());
        writer.writeStringValue("internalUrl", this.getInternalUrl());
        writer.writeBooleanValue("isBackendCertificateValidationEnabled", this.getIsBackendCertificateValidationEnabled());
        writer.writeBooleanValue("isHttpOnlyCookieEnabled", this.getIsHttpOnlyCookieEnabled());
        writer.writeBooleanValue("isOnPremPublishingEnabled", this.getIsOnPremPublishingEnabled());
        writer.writeBooleanValue("isPersistentCookieEnabled", this.getIsPersistentCookieEnabled());
        writer.writeBooleanValue("isSecureCookieEnabled", this.getIsSecureCookieEnabled());
        writer.writeBooleanValue("isStateSessionEnabled", this.getIsStateSessionEnabled());
        writer.writeBooleanValue("isTranslateHostHeaderEnabled", this.getIsTranslateHostHeaderEnabled());
        writer.writeBooleanValue("isTranslateLinksInBodyEnabled", this.getIsTranslateLinksInBodyEnabled());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeCollectionOfObjectValues("onPremisesApplicationSegments", this.getOnPremisesApplicationSegments());
        writer.writeObjectValue("singleSignOnSettings", this.getSingleSignOnSettings());
        writer.writeBooleanValue("useAlternateUrlForTranslationAndRedirect", this.getUseAlternateUrlForTranslationAndRedirect());
        writer.writeObjectValue("verifiedCustomDomainCertificatesMetadata", this.getVerifiedCustomDomainCertificatesMetadata());
        writer.writeObjectValue("verifiedCustomDomainKeyCredential", this.getVerifiedCustomDomainKeyCredential());
        writer.writeObjectValue("verifiedCustomDomainPasswordCredential", this.getVerifiedCustomDomainPasswordCredential());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the alternateUrl property value. If you are configuring a traffic manager in front of multiple App Proxy applications, the alternateUrl is the user-friendly URL that will point to the traffic manager.
     * @param value Value to set for the alternateUrl property.
     * @return a void
     */
    public void setAlternateUrl(@javax.annotation.Nullable final String value) {
        this._alternateUrl = value;
    }
    /**
     * Sets the applicationServerTimeout property value. The duration the connector will wait for a response from the backend application before closing the connection. Possible values are default, long. When set to default, the backend application timeout has a length of 85 seconds. When set to long, the backend timeout is increased to 180 seconds. Use long if your server takes more than 85 seconds to respond to requests or if you are unable to access the application and the error status is 'Backend Timeout'. Default value is default.
     * @param value Value to set for the applicationServerTimeout property.
     * @return a void
     */
    public void setApplicationServerTimeout(@javax.annotation.Nullable final String value) {
        this._applicationServerTimeout = value;
    }
    /**
     * Sets the applicationType property value. Indicates if this application is an Application Proxy configured application. This is pre-set by the system. Read-only.
     * @param value Value to set for the applicationType property.
     * @return a void
     */
    public void setApplicationType(@javax.annotation.Nullable final String value) {
        this._applicationType = value;
    }
    /**
     * Sets the externalAuthenticationType property value. Details the pre-authentication setting for the application. Pre-authentication enforces that users must authenticate before accessing the app. Passthru does not require authentication. Possible values are: passthru, aadPreAuthentication.
     * @param value Value to set for the externalAuthenticationType property.
     * @return a void
     */
    public void setExternalAuthenticationType(@javax.annotation.Nullable final ExternalAuthenticationType value) {
        this._externalAuthenticationType = value;
    }
    /**
     * Sets the externalUrl property value. The published external url for the application. For example, https://intranet-contoso.msappproxy.net/.
     * @param value Value to set for the externalUrl property.
     * @return a void
     */
    public void setExternalUrl(@javax.annotation.Nullable final String value) {
        this._externalUrl = value;
    }
    /**
     * Sets the internalUrl property value. The internal url of the application. For example, https://intranet/.
     * @param value Value to set for the internalUrl property.
     * @return a void
     */
    public void setInternalUrl(@javax.annotation.Nullable final String value) {
        this._internalUrl = value;
    }
    /**
     * Sets the isBackendCertificateValidationEnabled property value. Indicates whether backend SSL certificate validation is enabled for the application. For all new Application Proxy apps, the property will be set to true by default. For all existing apps, the property will be set to false.
     * @param value Value to set for the isBackendCertificateValidationEnabled property.
     * @return a void
     */
    public void setIsBackendCertificateValidationEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isBackendCertificateValidationEnabled = value;
    }
    /**
     * Sets the isHttpOnlyCookieEnabled property value. Indicates if the HTTPOnly cookie flag should be set in the HTTP response headers. Set this value to true to have Application Proxy cookies include the HTTPOnly flag in the HTTP response headers. If using Remote Desktop Services, set this value to False. Default value is false.
     * @param value Value to set for the isHttpOnlyCookieEnabled property.
     * @return a void
     */
    public void setIsHttpOnlyCookieEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isHttpOnlyCookieEnabled = value;
    }
    /**
     * Sets the isOnPremPublishingEnabled property value. Indicates if the application is currently being published via Application Proxy or not. This is pre-set by the system. Read-only.
     * @param value Value to set for the isOnPremPublishingEnabled property.
     * @return a void
     */
    public void setIsOnPremPublishingEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isOnPremPublishingEnabled = value;
    }
    /**
     * Sets the isPersistentCookieEnabled property value. Indicates if the Persistent cookie flag should be set in the HTTP response headers. Keep this value set to false. Only use this setting for applications that can't share cookies between processes. For more information about cookie settings, see Cookie settings for accessing on-premises applications in Azure Active Directory. Default value is false.
     * @param value Value to set for the isPersistentCookieEnabled property.
     * @return a void
     */
    public void setIsPersistentCookieEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isPersistentCookieEnabled = value;
    }
    /**
     * Sets the isSecureCookieEnabled property value. Indicates if the Secure cookie flag should be set in the HTTP response headers. Set this value to true to transmit cookies over a secure channel such as an encrypted HTTPS request. Default value is true.
     * @param value Value to set for the isSecureCookieEnabled property.
     * @return a void
     */
    public void setIsSecureCookieEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isSecureCookieEnabled = value;
    }
    /**
     * Sets the isStateSessionEnabled property value. Indicates whether validation of the state parameter when the client uses the OAuth 2.0 authorization code grant flow is enabled. This setting allows admins to specify whether they want to enable CSRF protection for their apps.
     * @param value Value to set for the isStateSessionEnabled property.
     * @return a void
     */
    public void setIsStateSessionEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isStateSessionEnabled = value;
    }
    /**
     * Sets the isTranslateHostHeaderEnabled property value. Indicates if the application should translate urls in the reponse headers. Keep this value as true unless your application required the original host header in the authentication request. Default value is true.
     * @param value Value to set for the isTranslateHostHeaderEnabled property.
     * @return a void
     */
    public void setIsTranslateHostHeaderEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isTranslateHostHeaderEnabled = value;
    }
    /**
     * Sets the isTranslateLinksInBodyEnabled property value. Indicates if the application should translate urls in the application body. Keep this value as false unless you have hardcoded HTML links to other on-premises applications and don't use custom domains. For more information, see Link translation with Application Proxy. Default value is false.
     * @param value Value to set for the isTranslateLinksInBodyEnabled property.
     * @return a void
     */
    public void setIsTranslateLinksInBodyEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isTranslateLinksInBodyEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the onPremisesApplicationSegments property value. Represents the application segment collection for an on-premises wildcard application.
     * @param value Value to set for the onPremisesApplicationSegments property.
     * @return a void
     */
    public void setOnPremisesApplicationSegments(@javax.annotation.Nullable final java.util.List<OnPremisesApplicationSegment> value) {
        this._onPremisesApplicationSegments = value;
    }
    /**
     * Sets the singleSignOnSettings property value. Represents the single sign-on configuration for the on-premises application.
     * @param value Value to set for the singleSignOnSettings property.
     * @return a void
     */
    public void setSingleSignOnSettings(@javax.annotation.Nullable final OnPremisesPublishingSingleSignOn value) {
        this._singleSignOnSettings = value;
    }
    /**
     * Sets the useAlternateUrlForTranslationAndRedirect property value. The useAlternateUrlForTranslationAndRedirect property
     * @param value Value to set for the useAlternateUrlForTranslationAndRedirect property.
     * @return a void
     */
    public void setUseAlternateUrlForTranslationAndRedirect(@javax.annotation.Nullable final Boolean value) {
        this._useAlternateUrlForTranslationAndRedirect = value;
    }
    /**
     * Sets the verifiedCustomDomainCertificatesMetadata property value. Details of the certificate associated with the application when a custom domain is in use. null when using the default domain. Read-only.
     * @param value Value to set for the verifiedCustomDomainCertificatesMetadata property.
     * @return a void
     */
    public void setVerifiedCustomDomainCertificatesMetadata(@javax.annotation.Nullable final VerifiedCustomDomainCertificatesMetadata value) {
        this._verifiedCustomDomainCertificatesMetadata = value;
    }
    /**
     * Sets the verifiedCustomDomainKeyCredential property value. The associated key credential for the custom domain used.
     * @param value Value to set for the verifiedCustomDomainKeyCredential property.
     * @return a void
     */
    public void setVerifiedCustomDomainKeyCredential(@javax.annotation.Nullable final KeyCredential value) {
        this._verifiedCustomDomainKeyCredential = value;
    }
    /**
     * Sets the verifiedCustomDomainPasswordCredential property value. The associated password credential for the custom domain used.
     * @param value Value to set for the verifiedCustomDomainPasswordCredential property.
     * @return a void
     */
    public void setVerifiedCustomDomainPasswordCredential(@javax.annotation.Nullable final PasswordCredential value) {
        this._verifiedCustomDomainPasswordCredential = value;
    }
}

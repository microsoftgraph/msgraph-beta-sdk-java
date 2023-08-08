package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesPublishing implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * If you are configuring a traffic manager in front of multiple App Proxy applications, the alternateUrl is the user-friendly URL that will point to the traffic manager.
     */
    private String alternateUrl;
    /**
     * The duration the connector will wait for a response from the backend application before closing the connection. Possible values are default, long. When set to default, the backend application timeout has a length of 85 seconds. When set to long, the backend timeout is increased to 180 seconds. Use long if your server takes more than 85 seconds to respond to requests or if you are unable to access the application and the error status is 'Backend Timeout'. Default value is default.
     */
    private String applicationServerTimeout;
    /**
     * Indicates if this application is an Application Proxy configured application. This is pre-set by the system. Read-only.
     */
    private String applicationType;
    /**
     * Details the pre-authentication setting for the application. Pre-authentication enforces that users must authenticate before accessing the app. Passthru does not require authentication. Possible values are: passthru, aadPreAuthentication.
     */
    private ExternalAuthenticationType externalAuthenticationType;
    /**
     * The published external url for the application. For example, https://intranet-contoso.msappproxy.net/.
     */
    private String externalUrl;
    /**
     * The internal url of the application. For example, https://intranet/.
     */
    private String internalUrl;
    /**
     * The isAccessibleViaZTNAClient property
     */
    private Boolean isAccessibleViaZTNAClient;
    /**
     * Indicates whether backend SSL certificate validation is enabled for the application. For all new Application Proxy apps, the property will be set to true by default. For all existing apps, the property will be set to false.
     */
    private Boolean isBackendCertificateValidationEnabled;
    /**
     * Indicates if the HTTPOnly cookie flag should be set in the HTTP response headers. Set this value to true to have Application Proxy cookies include the HTTPOnly flag in the HTTP response headers. If using Remote Desktop Services, set this value to False. Default value is false.
     */
    private Boolean isHttpOnlyCookieEnabled;
    /**
     * Indicates if the application is currently being published via Application Proxy or not. This is pre-set by the system. Read-only.
     */
    private Boolean isOnPremPublishingEnabled;
    /**
     * Indicates if the Persistent cookie flag should be set in the HTTP response headers. Keep this value set to false. Only use this setting for applications that can't share cookies between processes. For more information about cookie settings, see Cookie settings for accessing on-premises applications in Azure Active Directory. Default value is false.
     */
    private Boolean isPersistentCookieEnabled;
    /**
     * Indicates if the Secure cookie flag should be set in the HTTP response headers. Set this value to true to transmit cookies over a secure channel such as an encrypted HTTPS request. Default value is true.
     */
    private Boolean isSecureCookieEnabled;
    /**
     * Indicates whether validation of the state parameter when the client uses the OAuth 2.0 authorization code grant flow is enabled. This setting allows admins to specify whether they want to enable CSRF protection for their apps.
     */
    private Boolean isStateSessionEnabled;
    /**
     * Indicates if the application should translate urls in the reponse headers. Keep this value as true unless your application required the original host header in the authentication request. Default value is true.
     */
    private Boolean isTranslateHostHeaderEnabled;
    /**
     * Indicates if the application should translate urls in the application body. Keep this value as false unless you have hardcoded HTML links to other on-premises applications and don't use custom domains. For more information, see Link translation with Application Proxy. Default value is false.
     */
    private Boolean isTranslateLinksInBodyEnabled;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The onPremisesApplicationSegments property
     */
    private java.util.List<OnPremisesApplicationSegment> onPremisesApplicationSegments;
    /**
     * Represents the collection of application segments for an on-premises wildcard application that's published through Azure AD Application Proxy.
     */
    private SegmentConfiguration segmentsConfiguration;
    /**
     * Represents the single sign-on configuration for the on-premises application.
     */
    private OnPremisesPublishingSingleSignOn singleSignOnSettings;
    /**
     * The useAlternateUrlForTranslationAndRedirect property
     */
    private Boolean useAlternateUrlForTranslationAndRedirect;
    /**
     * Details of the certificate associated with the application when a custom domain is in use. null when using the default domain. Read-only.
     */
    private VerifiedCustomDomainCertificatesMetadata verifiedCustomDomainCertificatesMetadata;
    /**
     * The associated key credential for the custom domain used.
     */
    private KeyCredential verifiedCustomDomainKeyCredential;
    /**
     * The associated password credential for the custom domain used.
     */
    private PasswordCredential verifiedCustomDomainPasswordCredential;
    /**
     * Instantiates a new onPremisesPublishing and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public OnPremisesPublishing() {
        this.setAdditionalData(new HashMap<>());
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
        return this.additionalData;
    }
    /**
     * Gets the alternateUrl property value. If you are configuring a traffic manager in front of multiple App Proxy applications, the alternateUrl is the user-friendly URL that will point to the traffic manager.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlternateUrl() {
        return this.alternateUrl;
    }
    /**
     * Gets the applicationServerTimeout property value. The duration the connector will wait for a response from the backend application before closing the connection. Possible values are default, long. When set to default, the backend application timeout has a length of 85 seconds. When set to long, the backend timeout is increased to 180 seconds. Use long if your server takes more than 85 seconds to respond to requests or if you are unable to access the application and the error status is 'Backend Timeout'. Default value is default.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationServerTimeout() {
        return this.applicationServerTimeout;
    }
    /**
     * Gets the applicationType property value. Indicates if this application is an Application Proxy configured application. This is pre-set by the system. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getApplicationType() {
        return this.applicationType;
    }
    /**
     * Gets the externalAuthenticationType property value. Details the pre-authentication setting for the application. Pre-authentication enforces that users must authenticate before accessing the app. Passthru does not require authentication. Possible values are: passthru, aadPreAuthentication.
     * @return a externalAuthenticationType
     */
    @javax.annotation.Nullable
    public ExternalAuthenticationType getExternalAuthenticationType() {
        return this.externalAuthenticationType;
    }
    /**
     * Gets the externalUrl property value. The published external url for the application. For example, https://intranet-contoso.msappproxy.net/.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalUrl() {
        return this.externalUrl;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(23);
        deserializerMap.put("alternateUrl", (n) -> { this.setAlternateUrl(n.getStringValue()); });
        deserializerMap.put("applicationServerTimeout", (n) -> { this.setApplicationServerTimeout(n.getStringValue()); });
        deserializerMap.put("applicationType", (n) -> { this.setApplicationType(n.getStringValue()); });
        deserializerMap.put("externalAuthenticationType", (n) -> { this.setExternalAuthenticationType(n.getEnumValue(ExternalAuthenticationType.class)); });
        deserializerMap.put("externalUrl", (n) -> { this.setExternalUrl(n.getStringValue()); });
        deserializerMap.put("internalUrl", (n) -> { this.setInternalUrl(n.getStringValue()); });
        deserializerMap.put("isAccessibleViaZTNAClient", (n) -> { this.setIsAccessibleViaZTNAClient(n.getBooleanValue()); });
        deserializerMap.put("isBackendCertificateValidationEnabled", (n) -> { this.setIsBackendCertificateValidationEnabled(n.getBooleanValue()); });
        deserializerMap.put("isHttpOnlyCookieEnabled", (n) -> { this.setIsHttpOnlyCookieEnabled(n.getBooleanValue()); });
        deserializerMap.put("isOnPremPublishingEnabled", (n) -> { this.setIsOnPremPublishingEnabled(n.getBooleanValue()); });
        deserializerMap.put("isPersistentCookieEnabled", (n) -> { this.setIsPersistentCookieEnabled(n.getBooleanValue()); });
        deserializerMap.put("isSecureCookieEnabled", (n) -> { this.setIsSecureCookieEnabled(n.getBooleanValue()); });
        deserializerMap.put("isStateSessionEnabled", (n) -> { this.setIsStateSessionEnabled(n.getBooleanValue()); });
        deserializerMap.put("isTranslateHostHeaderEnabled", (n) -> { this.setIsTranslateHostHeaderEnabled(n.getBooleanValue()); });
        deserializerMap.put("isTranslateLinksInBodyEnabled", (n) -> { this.setIsTranslateLinksInBodyEnabled(n.getBooleanValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("onPremisesApplicationSegments", (n) -> { this.setOnPremisesApplicationSegments(n.getCollectionOfObjectValues(OnPremisesApplicationSegment::createFromDiscriminatorValue)); });
        deserializerMap.put("segmentsConfiguration", (n) -> { this.setSegmentsConfiguration(n.getObjectValue(SegmentConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("singleSignOnSettings", (n) -> { this.setSingleSignOnSettings(n.getObjectValue(OnPremisesPublishingSingleSignOn::createFromDiscriminatorValue)); });
        deserializerMap.put("useAlternateUrlForTranslationAndRedirect", (n) -> { this.setUseAlternateUrlForTranslationAndRedirect(n.getBooleanValue()); });
        deserializerMap.put("verifiedCustomDomainCertificatesMetadata", (n) -> { this.setVerifiedCustomDomainCertificatesMetadata(n.getObjectValue(VerifiedCustomDomainCertificatesMetadata::createFromDiscriminatorValue)); });
        deserializerMap.put("verifiedCustomDomainKeyCredential", (n) -> { this.setVerifiedCustomDomainKeyCredential(n.getObjectValue(KeyCredential::createFromDiscriminatorValue)); });
        deserializerMap.put("verifiedCustomDomainPasswordCredential", (n) -> { this.setVerifiedCustomDomainPasswordCredential(n.getObjectValue(PasswordCredential::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the internalUrl property value. The internal url of the application. For example, https://intranet/.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getInternalUrl() {
        return this.internalUrl;
    }
    /**
     * Gets the isAccessibleViaZTNAClient property value. The isAccessibleViaZTNAClient property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAccessibleViaZTNAClient() {
        return this.isAccessibleViaZTNAClient;
    }
    /**
     * Gets the isBackendCertificateValidationEnabled property value. Indicates whether backend SSL certificate validation is enabled for the application. For all new Application Proxy apps, the property will be set to true by default. For all existing apps, the property will be set to false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsBackendCertificateValidationEnabled() {
        return this.isBackendCertificateValidationEnabled;
    }
    /**
     * Gets the isHttpOnlyCookieEnabled property value. Indicates if the HTTPOnly cookie flag should be set in the HTTP response headers. Set this value to true to have Application Proxy cookies include the HTTPOnly flag in the HTTP response headers. If using Remote Desktop Services, set this value to False. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsHttpOnlyCookieEnabled() {
        return this.isHttpOnlyCookieEnabled;
    }
    /**
     * Gets the isOnPremPublishingEnabled property value. Indicates if the application is currently being published via Application Proxy or not. This is pre-set by the system. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsOnPremPublishingEnabled() {
        return this.isOnPremPublishingEnabled;
    }
    /**
     * Gets the isPersistentCookieEnabled property value. Indicates if the Persistent cookie flag should be set in the HTTP response headers. Keep this value set to false. Only use this setting for applications that can't share cookies between processes. For more information about cookie settings, see Cookie settings for accessing on-premises applications in Azure Active Directory. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPersistentCookieEnabled() {
        return this.isPersistentCookieEnabled;
    }
    /**
     * Gets the isSecureCookieEnabled property value. Indicates if the Secure cookie flag should be set in the HTTP response headers. Set this value to true to transmit cookies over a secure channel such as an encrypted HTTPS request. Default value is true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSecureCookieEnabled() {
        return this.isSecureCookieEnabled;
    }
    /**
     * Gets the isStateSessionEnabled property value. Indicates whether validation of the state parameter when the client uses the OAuth 2.0 authorization code grant flow is enabled. This setting allows admins to specify whether they want to enable CSRF protection for their apps.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsStateSessionEnabled() {
        return this.isStateSessionEnabled;
    }
    /**
     * Gets the isTranslateHostHeaderEnabled property value. Indicates if the application should translate urls in the reponse headers. Keep this value as true unless your application required the original host header in the authentication request. Default value is true.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsTranslateHostHeaderEnabled() {
        return this.isTranslateHostHeaderEnabled;
    }
    /**
     * Gets the isTranslateLinksInBodyEnabled property value. Indicates if the application should translate urls in the application body. Keep this value as false unless you have hardcoded HTML links to other on-premises applications and don't use custom domains. For more information, see Link translation with Application Proxy. Default value is false.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsTranslateLinksInBodyEnabled() {
        return this.isTranslateLinksInBodyEnabled;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the onPremisesApplicationSegments property value. The onPremisesApplicationSegments property
     * @return a onPremisesApplicationSegment
     */
    @javax.annotation.Nullable
    public java.util.List<OnPremisesApplicationSegment> getOnPremisesApplicationSegments() {
        return this.onPremisesApplicationSegments;
    }
    /**
     * Gets the segmentsConfiguration property value. Represents the collection of application segments for an on-premises wildcard application that's published through Azure AD Application Proxy.
     * @return a segmentConfiguration
     */
    @javax.annotation.Nullable
    public SegmentConfiguration getSegmentsConfiguration() {
        return this.segmentsConfiguration;
    }
    /**
     * Gets the singleSignOnSettings property value. Represents the single sign-on configuration for the on-premises application.
     * @return a onPremisesPublishingSingleSignOn
     */
    @javax.annotation.Nullable
    public OnPremisesPublishingSingleSignOn getSingleSignOnSettings() {
        return this.singleSignOnSettings;
    }
    /**
     * Gets the useAlternateUrlForTranslationAndRedirect property value. The useAlternateUrlForTranslationAndRedirect property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseAlternateUrlForTranslationAndRedirect() {
        return this.useAlternateUrlForTranslationAndRedirect;
    }
    /**
     * Gets the verifiedCustomDomainCertificatesMetadata property value. Details of the certificate associated with the application when a custom domain is in use. null when using the default domain. Read-only.
     * @return a verifiedCustomDomainCertificatesMetadata
     */
    @javax.annotation.Nullable
    public VerifiedCustomDomainCertificatesMetadata getVerifiedCustomDomainCertificatesMetadata() {
        return this.verifiedCustomDomainCertificatesMetadata;
    }
    /**
     * Gets the verifiedCustomDomainKeyCredential property value. The associated key credential for the custom domain used.
     * @return a keyCredential
     */
    @javax.annotation.Nullable
    public KeyCredential getVerifiedCustomDomainKeyCredential() {
        return this.verifiedCustomDomainKeyCredential;
    }
    /**
     * Gets the verifiedCustomDomainPasswordCredential property value. The associated password credential for the custom domain used.
     * @return a passwordCredential
     */
    @javax.annotation.Nullable
    public PasswordCredential getVerifiedCustomDomainPasswordCredential() {
        return this.verifiedCustomDomainPasswordCredential;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("alternateUrl", this.getAlternateUrl());
        writer.writeStringValue("applicationServerTimeout", this.getApplicationServerTimeout());
        writer.writeStringValue("applicationType", this.getApplicationType());
        writer.writeEnumValue("externalAuthenticationType", this.getExternalAuthenticationType());
        writer.writeStringValue("externalUrl", this.getExternalUrl());
        writer.writeStringValue("internalUrl", this.getInternalUrl());
        writer.writeBooleanValue("isAccessibleViaZTNAClient", this.getIsAccessibleViaZTNAClient());
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
        writer.writeObjectValue("segmentsConfiguration", this.getSegmentsConfiguration());
        writer.writeObjectValue("singleSignOnSettings", this.getSingleSignOnSettings());
        writer.writeBooleanValue("useAlternateUrlForTranslationAndRedirect", this.getUseAlternateUrlForTranslationAndRedirect());
        writer.writeObjectValue("verifiedCustomDomainCertificatesMetadata", this.getVerifiedCustomDomainCertificatesMetadata());
        writer.writeObjectValue("verifiedCustomDomainKeyCredential", this.getVerifiedCustomDomainKeyCredential());
        writer.writeObjectValue("verifiedCustomDomainPasswordCredential", this.getVerifiedCustomDomainPasswordCredential());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the alternateUrl property value. If you are configuring a traffic manager in front of multiple App Proxy applications, the alternateUrl is the user-friendly URL that will point to the traffic manager.
     * @param value Value to set for the alternateUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlternateUrl(@javax.annotation.Nullable final String value) {
        this.alternateUrl = value;
    }
    /**
     * Sets the applicationServerTimeout property value. The duration the connector will wait for a response from the backend application before closing the connection. Possible values are default, long. When set to default, the backend application timeout has a length of 85 seconds. When set to long, the backend timeout is increased to 180 seconds. Use long if your server takes more than 85 seconds to respond to requests or if you are unable to access the application and the error status is 'Backend Timeout'. Default value is default.
     * @param value Value to set for the applicationServerTimeout property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationServerTimeout(@javax.annotation.Nullable final String value) {
        this.applicationServerTimeout = value;
    }
    /**
     * Sets the applicationType property value. Indicates if this application is an Application Proxy configured application. This is pre-set by the system. Read-only.
     * @param value Value to set for the applicationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicationType(@javax.annotation.Nullable final String value) {
        this.applicationType = value;
    }
    /**
     * Sets the externalAuthenticationType property value. Details the pre-authentication setting for the application. Pre-authentication enforces that users must authenticate before accessing the app. Passthru does not require authentication. Possible values are: passthru, aadPreAuthentication.
     * @param value Value to set for the externalAuthenticationType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalAuthenticationType(@javax.annotation.Nullable final ExternalAuthenticationType value) {
        this.externalAuthenticationType = value;
    }
    /**
     * Sets the externalUrl property value. The published external url for the application. For example, https://intranet-contoso.msappproxy.net/.
     * @param value Value to set for the externalUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalUrl(@javax.annotation.Nullable final String value) {
        this.externalUrl = value;
    }
    /**
     * Sets the internalUrl property value. The internal url of the application. For example, https://intranet/.
     * @param value Value to set for the internalUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInternalUrl(@javax.annotation.Nullable final String value) {
        this.internalUrl = value;
    }
    /**
     * Sets the isAccessibleViaZTNAClient property value. The isAccessibleViaZTNAClient property
     * @param value Value to set for the isAccessibleViaZTNAClient property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAccessibleViaZTNAClient(@javax.annotation.Nullable final Boolean value) {
        this.isAccessibleViaZTNAClient = value;
    }
    /**
     * Sets the isBackendCertificateValidationEnabled property value. Indicates whether backend SSL certificate validation is enabled for the application. For all new Application Proxy apps, the property will be set to true by default. For all existing apps, the property will be set to false.
     * @param value Value to set for the isBackendCertificateValidationEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsBackendCertificateValidationEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isBackendCertificateValidationEnabled = value;
    }
    /**
     * Sets the isHttpOnlyCookieEnabled property value. Indicates if the HTTPOnly cookie flag should be set in the HTTP response headers. Set this value to true to have Application Proxy cookies include the HTTPOnly flag in the HTTP response headers. If using Remote Desktop Services, set this value to False. Default value is false.
     * @param value Value to set for the isHttpOnlyCookieEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsHttpOnlyCookieEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isHttpOnlyCookieEnabled = value;
    }
    /**
     * Sets the isOnPremPublishingEnabled property value. Indicates if the application is currently being published via Application Proxy or not. This is pre-set by the system. Read-only.
     * @param value Value to set for the isOnPremPublishingEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsOnPremPublishingEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isOnPremPublishingEnabled = value;
    }
    /**
     * Sets the isPersistentCookieEnabled property value. Indicates if the Persistent cookie flag should be set in the HTTP response headers. Keep this value set to false. Only use this setting for applications that can't share cookies between processes. For more information about cookie settings, see Cookie settings for accessing on-premises applications in Azure Active Directory. Default value is false.
     * @param value Value to set for the isPersistentCookieEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsPersistentCookieEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isPersistentCookieEnabled = value;
    }
    /**
     * Sets the isSecureCookieEnabled property value. Indicates if the Secure cookie flag should be set in the HTTP response headers. Set this value to true to transmit cookies over a secure channel such as an encrypted HTTPS request. Default value is true.
     * @param value Value to set for the isSecureCookieEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSecureCookieEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isSecureCookieEnabled = value;
    }
    /**
     * Sets the isStateSessionEnabled property value. Indicates whether validation of the state parameter when the client uses the OAuth 2.0 authorization code grant flow is enabled. This setting allows admins to specify whether they want to enable CSRF protection for their apps.
     * @param value Value to set for the isStateSessionEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsStateSessionEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isStateSessionEnabled = value;
    }
    /**
     * Sets the isTranslateHostHeaderEnabled property value. Indicates if the application should translate urls in the reponse headers. Keep this value as true unless your application required the original host header in the authentication request. Default value is true.
     * @param value Value to set for the isTranslateHostHeaderEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsTranslateHostHeaderEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isTranslateHostHeaderEnabled = value;
    }
    /**
     * Sets the isTranslateLinksInBodyEnabled property value. Indicates if the application should translate urls in the application body. Keep this value as false unless you have hardcoded HTML links to other on-premises applications and don't use custom domains. For more information, see Link translation with Application Proxy. Default value is false.
     * @param value Value to set for the isTranslateLinksInBodyEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsTranslateLinksInBodyEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isTranslateLinksInBodyEnabled = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the onPremisesApplicationSegments property value. The onPremisesApplicationSegments property
     * @param value Value to set for the onPremisesApplicationSegments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesApplicationSegments(@javax.annotation.Nullable final java.util.List<OnPremisesApplicationSegment> value) {
        this.onPremisesApplicationSegments = value;
    }
    /**
     * Sets the segmentsConfiguration property value. Represents the collection of application segments for an on-premises wildcard application that's published through Azure AD Application Proxy.
     * @param value Value to set for the segmentsConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSegmentsConfiguration(@javax.annotation.Nullable final SegmentConfiguration value) {
        this.segmentsConfiguration = value;
    }
    /**
     * Sets the singleSignOnSettings property value. Represents the single sign-on configuration for the on-premises application.
     * @param value Value to set for the singleSignOnSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSingleSignOnSettings(@javax.annotation.Nullable final OnPremisesPublishingSingleSignOn value) {
        this.singleSignOnSettings = value;
    }
    /**
     * Sets the useAlternateUrlForTranslationAndRedirect property value. The useAlternateUrlForTranslationAndRedirect property
     * @param value Value to set for the useAlternateUrlForTranslationAndRedirect property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUseAlternateUrlForTranslationAndRedirect(@javax.annotation.Nullable final Boolean value) {
        this.useAlternateUrlForTranslationAndRedirect = value;
    }
    /**
     * Sets the verifiedCustomDomainCertificatesMetadata property value. Details of the certificate associated with the application when a custom domain is in use. null when using the default domain. Read-only.
     * @param value Value to set for the verifiedCustomDomainCertificatesMetadata property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVerifiedCustomDomainCertificatesMetadata(@javax.annotation.Nullable final VerifiedCustomDomainCertificatesMetadata value) {
        this.verifiedCustomDomainCertificatesMetadata = value;
    }
    /**
     * Sets the verifiedCustomDomainKeyCredential property value. The associated key credential for the custom domain used.
     * @param value Value to set for the verifiedCustomDomainKeyCredential property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVerifiedCustomDomainKeyCredential(@javax.annotation.Nullable final KeyCredential value) {
        this.verifiedCustomDomainKeyCredential = value;
    }
    /**
     * Sets the verifiedCustomDomainPasswordCredential property value. The associated password credential for the custom domain used.
     * @param value Value to set for the verifiedCustomDomainPasswordCredential property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVerifiedCustomDomainPasswordCredential(@javax.annotation.Nullable final PasswordCredential value) {
        this.verifiedCustomDomainPasswordCredential = value;
    }
}

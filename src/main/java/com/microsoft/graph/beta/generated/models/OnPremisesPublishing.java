package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class OnPremisesPublishing implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    protected BackingStore backingStore;
    /**
     * Instantiates a new {@link OnPremisesPublishing} and sets the default values.
     */
    public OnPremisesPublishing() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link OnPremisesPublishing}
     */
    @jakarta.annotation.Nonnull
    public static OnPremisesPublishing createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesPublishing();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a {@link Map<String, Object>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * Gets the alternateUrl property value. If you&apos;re configuring a traffic manager in front of multiple app proxy applications, this user-friendly URL points to the traffic manager.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAlternateUrl() {
        return this.backingStore.get("alternateUrl");
    }
    /**
     * Gets the applicationServerTimeout property value. The duration the connector waits for a response from the backend application before closing the connection. Possible values are default, long. When set to default, the backend application timeout has a length of 85 seconds. When set to long, the backend timeout is increased to 180 seconds. Use long if your server takes more than 85 seconds to respond to requests or if you are unable to access the application and the error status is &apos;Backend Timeout&apos;. Default value is default.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicationServerTimeout() {
        return this.backingStore.get("applicationServerTimeout");
    }
    /**
     * Gets the applicationType property value. System-defined value that indicates whether this application is an application proxy configured application. The possible values are quickaccessapp and nonwebapp. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getApplicationType() {
        return this.backingStore.get("applicationType");
    }
    /**
     * Gets the backingStore property value. Stores model information.
     * @return a {@link BackingStore}
     */
    @jakarta.annotation.Nonnull
    public BackingStore getBackingStore() {
        return this.backingStore;
    }
    /**
     * Gets the externalAuthenticationType property value. Details the pre-authentication setting for the application. Pre-authentication enforces that users must authenticate before accessing the app. Pass through doesn&apos;t require authentication. Possible values are: passthru, aadPreAuthentication.
     * @return a {@link ExternalAuthenticationType}
     */
    @jakarta.annotation.Nullable
    public ExternalAuthenticationType getExternalAuthenticationType() {
        return this.backingStore.get("externalAuthenticationType");
    }
    /**
     * Gets the externalUrl property value. The published external URL for the application. For example, https://intranet-contoso.msappproxy.net/.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getExternalUrl() {
        return this.backingStore.get("externalUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(27);
        deserializerMap.put("alternateUrl", (n) -> { this.setAlternateUrl(n.getStringValue()); });
        deserializerMap.put("applicationServerTimeout", (n) -> { this.setApplicationServerTimeout(n.getStringValue()); });
        deserializerMap.put("applicationType", (n) -> { this.setApplicationType(n.getStringValue()); });
        deserializerMap.put("externalAuthenticationType", (n) -> { this.setExternalAuthenticationType(n.getEnumValue(ExternalAuthenticationType::forValue)); });
        deserializerMap.put("externalUrl", (n) -> { this.setExternalUrl(n.getStringValue()); });
        deserializerMap.put("internalUrl", (n) -> { this.setInternalUrl(n.getStringValue()); });
        deserializerMap.put("isAccessibleViaZTNAClient", (n) -> { this.setIsAccessibleViaZTNAClient(n.getBooleanValue()); });
        deserializerMap.put("isBackendCertificateValidationEnabled", (n) -> { this.setIsBackendCertificateValidationEnabled(n.getBooleanValue()); });
        deserializerMap.put("isDnsResolutionEnabled", (n) -> { this.setIsDnsResolutionEnabled(n.getBooleanValue()); });
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
        deserializerMap.put("wafAllowedHeaders", (n) -> { this.setWafAllowedHeaders(n.getObjectValue(WafAllowedHeadersDictionary::createFromDiscriminatorValue)); });
        deserializerMap.put("wafIpRanges", (n) -> { this.setWafIpRanges(n.getCollectionOfObjectValues(IpRange::createFromDiscriminatorValue)); });
        deserializerMap.put("wafProvider", (n) -> { this.setWafProvider(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the internalUrl property value. The internal url of the application. For example, https://intranet/.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getInternalUrl() {
        return this.backingStore.get("internalUrl");
    }
    /**
     * Gets the isAccessibleViaZTNAClient property value. Indicates whether the application is accessible via a Global Secure Access client on a managed device.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAccessibleViaZTNAClient() {
        return this.backingStore.get("isAccessibleViaZTNAClient");
    }
    /**
     * Gets the isBackendCertificateValidationEnabled property value. Indicates whether backend SSL certificate validation is enabled for the application. For all new Application Proxy apps, the property is set to true by default. For all existing apps, the property is set to false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsBackendCertificateValidationEnabled() {
        return this.backingStore.get("isBackendCertificateValidationEnabled");
    }
    /**
     * Gets the isDnsResolutionEnabled property value. Indicates Microsoft Entra Private Access should handle DNS resolution. false by default.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDnsResolutionEnabled() {
        return this.backingStore.get("isDnsResolutionEnabled");
    }
    /**
     * Gets the isHttpOnlyCookieEnabled property value. Indicates if the HTTPOnly cookie flag should be set in the HTTP response headers. Set this value to true to have Application Proxy cookies include the HTTPOnly flag in the HTTP response headers. If using Remote Desktop Services, set this value to False. Default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsHttpOnlyCookieEnabled() {
        return this.backingStore.get("isHttpOnlyCookieEnabled");
    }
    /**
     * Gets the isOnPremPublishingEnabled property value. Indicates if the application is currently being published via Application Proxy or not. This is preset by the system. Read-only.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsOnPremPublishingEnabled() {
        return this.backingStore.get("isOnPremPublishingEnabled");
    }
    /**
     * Gets the isPersistentCookieEnabled property value. Indicates if the Persistent cookie flag should be set in the HTTP response headers. Keep this value set to false. Only use this setting for applications that can&apos;t share cookies between processes. For more information about cookie settings, see Cookie settings for accessing on-premises applications in Microsoft Entra ID. Default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPersistentCookieEnabled() {
        return this.backingStore.get("isPersistentCookieEnabled");
    }
    /**
     * Gets the isSecureCookieEnabled property value. Indicates if the Secure cookie flag should be set in the HTTP response headers. Set this value to true to transmit cookies over a secure channel such as an encrypted HTTPS request. Default value is true.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSecureCookieEnabled() {
        return this.backingStore.get("isSecureCookieEnabled");
    }
    /**
     * Gets the isStateSessionEnabled property value. Indicates whether validation of the state parameter when the client uses the OAuth 2.0 authorization code grant flow is enabled. This setting allows admins to specify whether they want to enable CSRF protection for their apps.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsStateSessionEnabled() {
        return this.backingStore.get("isStateSessionEnabled");
    }
    /**
     * Gets the isTranslateHostHeaderEnabled property value. Indicates if the application should translate urls in the response headers. Keep this value as true unless your application required the original host header in the authentication request. Default value is true.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTranslateHostHeaderEnabled() {
        return this.backingStore.get("isTranslateHostHeaderEnabled");
    }
    /**
     * Gets the isTranslateLinksInBodyEnabled property value. Indicates if the application should translate urls in the application body. Keep this value as false unless you have hardcoded HTML links to other on-premises applications and don&apos;t use custom domains. For more information, see Link translation with Application Proxy. Default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsTranslateLinksInBodyEnabled() {
        return this.backingStore.get("isTranslateLinksInBodyEnabled");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the onPremisesApplicationSegments property value. Represents the application segment collection for an on-premises wildcard application. This property is deprecated and will stop returning data on June 1, 2023. Use segmentsConfiguration instead.
     * @return a {@link java.util.List<OnPremisesApplicationSegment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<OnPremisesApplicationSegment> getOnPremisesApplicationSegments() {
        return this.backingStore.get("onPremisesApplicationSegments");
    }
    /**
     * Gets the segmentsConfiguration property value. Represents the collection of application segments for an on-premises wildcard application that&apos;s published through Microsoft Entra application proxy.
     * @return a {@link SegmentConfiguration}
     */
    @jakarta.annotation.Nullable
    public SegmentConfiguration getSegmentsConfiguration() {
        return this.backingStore.get("segmentsConfiguration");
    }
    /**
     * Gets the singleSignOnSettings property value. Represents the single sign-on configuration for the on-premises application.
     * @return a {@link OnPremisesPublishingSingleSignOn}
     */
    @jakarta.annotation.Nullable
    public OnPremisesPublishingSingleSignOn getSingleSignOnSettings() {
        return this.backingStore.get("singleSignOnSettings");
    }
    /**
     * Gets the useAlternateUrlForTranslationAndRedirect property value. Indicates whether the application should use alternateUrl instead of externalUrl.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUseAlternateUrlForTranslationAndRedirect() {
        return this.backingStore.get("useAlternateUrlForTranslationAndRedirect");
    }
    /**
     * Gets the verifiedCustomDomainCertificatesMetadata property value. Details of the certificate associated with the application when a custom domain is in use. null when using the default domain. Read-only.
     * @return a {@link VerifiedCustomDomainCertificatesMetadata}
     */
    @jakarta.annotation.Nullable
    public VerifiedCustomDomainCertificatesMetadata getVerifiedCustomDomainCertificatesMetadata() {
        return this.backingStore.get("verifiedCustomDomainCertificatesMetadata");
    }
    /**
     * Gets the verifiedCustomDomainKeyCredential property value. The associated key credential for the custom domain used.
     * @return a {@link KeyCredential}
     */
    @jakarta.annotation.Nullable
    public KeyCredential getVerifiedCustomDomainKeyCredential() {
        return this.backingStore.get("verifiedCustomDomainKeyCredential");
    }
    /**
     * Gets the verifiedCustomDomainPasswordCredential property value. The associated password credential for the custom domain used.
     * @return a {@link PasswordCredential}
     */
    @jakarta.annotation.Nullable
    public PasswordCredential getVerifiedCustomDomainPasswordCredential() {
        return this.backingStore.get("verifiedCustomDomainPasswordCredential");
    }
    /**
     * Gets the wafAllowedHeaders property value. The wafAllowedHeaders property
     * @return a {@link WafAllowedHeadersDictionary}
     */
    @jakarta.annotation.Nullable
    public WafAllowedHeadersDictionary getWafAllowedHeaders() {
        return this.backingStore.get("wafAllowedHeaders");
    }
    /**
     * Gets the wafIpRanges property value. The wafIpRanges property
     * @return a {@link java.util.List<IpRange>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<IpRange> getWafIpRanges() {
        return this.backingStore.get("wafIpRanges");
    }
    /**
     * Gets the wafProvider property value. The wafProvider property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWafProvider() {
        return this.backingStore.get("wafProvider");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("alternateUrl", this.getAlternateUrl());
        writer.writeStringValue("applicationServerTimeout", this.getApplicationServerTimeout());
        writer.writeStringValue("applicationType", this.getApplicationType());
        writer.writeEnumValue("externalAuthenticationType", this.getExternalAuthenticationType());
        writer.writeStringValue("externalUrl", this.getExternalUrl());
        writer.writeStringValue("internalUrl", this.getInternalUrl());
        writer.writeBooleanValue("isAccessibleViaZTNAClient", this.getIsAccessibleViaZTNAClient());
        writer.writeBooleanValue("isBackendCertificateValidationEnabled", this.getIsBackendCertificateValidationEnabled());
        writer.writeBooleanValue("isDnsResolutionEnabled", this.getIsDnsResolutionEnabled());
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
        writer.writeObjectValue("wafAllowedHeaders", this.getWafAllowedHeaders());
        writer.writeCollectionOfObjectValues("wafIpRanges", this.getWafIpRanges());
        writer.writeStringValue("wafProvider", this.getWafProvider());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the alternateUrl property value. If you&apos;re configuring a traffic manager in front of multiple app proxy applications, this user-friendly URL points to the traffic manager.
     * @param value Value to set for the alternateUrl property.
     */
    public void setAlternateUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("alternateUrl", value);
    }
    /**
     * Sets the applicationServerTimeout property value. The duration the connector waits for a response from the backend application before closing the connection. Possible values are default, long. When set to default, the backend application timeout has a length of 85 seconds. When set to long, the backend timeout is increased to 180 seconds. Use long if your server takes more than 85 seconds to respond to requests or if you are unable to access the application and the error status is &apos;Backend Timeout&apos;. Default value is default.
     * @param value Value to set for the applicationServerTimeout property.
     */
    public void setApplicationServerTimeout(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applicationServerTimeout", value);
    }
    /**
     * Sets the applicationType property value. System-defined value that indicates whether this application is an application proxy configured application. The possible values are quickaccessapp and nonwebapp. Read-only.
     * @param value Value to set for the applicationType property.
     */
    public void setApplicationType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("applicationType", value);
    }
    /**
     * Sets the backingStore property value. Stores model information.
     * @param value Value to set for the backingStore property.
     */
    public void setBackingStore(@jakarta.annotation.Nonnull final BackingStore value) {
        Objects.requireNonNull(value);
        this.backingStore = value;
    }
    /**
     * Sets the externalAuthenticationType property value. Details the pre-authentication setting for the application. Pre-authentication enforces that users must authenticate before accessing the app. Pass through doesn&apos;t require authentication. Possible values are: passthru, aadPreAuthentication.
     * @param value Value to set for the externalAuthenticationType property.
     */
    public void setExternalAuthenticationType(@jakarta.annotation.Nullable final ExternalAuthenticationType value) {
        this.backingStore.set("externalAuthenticationType", value);
    }
    /**
     * Sets the externalUrl property value. The published external URL for the application. For example, https://intranet-contoso.msappproxy.net/.
     * @param value Value to set for the externalUrl property.
     */
    public void setExternalUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("externalUrl", value);
    }
    /**
     * Sets the internalUrl property value. The internal url of the application. For example, https://intranet/.
     * @param value Value to set for the internalUrl property.
     */
    public void setInternalUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("internalUrl", value);
    }
    /**
     * Sets the isAccessibleViaZTNAClient property value. Indicates whether the application is accessible via a Global Secure Access client on a managed device.
     * @param value Value to set for the isAccessibleViaZTNAClient property.
     */
    public void setIsAccessibleViaZTNAClient(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAccessibleViaZTNAClient", value);
    }
    /**
     * Sets the isBackendCertificateValidationEnabled property value. Indicates whether backend SSL certificate validation is enabled for the application. For all new Application Proxy apps, the property is set to true by default. For all existing apps, the property is set to false.
     * @param value Value to set for the isBackendCertificateValidationEnabled property.
     */
    public void setIsBackendCertificateValidationEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isBackendCertificateValidationEnabled", value);
    }
    /**
     * Sets the isDnsResolutionEnabled property value. Indicates Microsoft Entra Private Access should handle DNS resolution. false by default.
     * @param value Value to set for the isDnsResolutionEnabled property.
     */
    public void setIsDnsResolutionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDnsResolutionEnabled", value);
    }
    /**
     * Sets the isHttpOnlyCookieEnabled property value. Indicates if the HTTPOnly cookie flag should be set in the HTTP response headers. Set this value to true to have Application Proxy cookies include the HTTPOnly flag in the HTTP response headers. If using Remote Desktop Services, set this value to False. Default value is false.
     * @param value Value to set for the isHttpOnlyCookieEnabled property.
     */
    public void setIsHttpOnlyCookieEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isHttpOnlyCookieEnabled", value);
    }
    /**
     * Sets the isOnPremPublishingEnabled property value. Indicates if the application is currently being published via Application Proxy or not. This is preset by the system. Read-only.
     * @param value Value to set for the isOnPremPublishingEnabled property.
     */
    public void setIsOnPremPublishingEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isOnPremPublishingEnabled", value);
    }
    /**
     * Sets the isPersistentCookieEnabled property value. Indicates if the Persistent cookie flag should be set in the HTTP response headers. Keep this value set to false. Only use this setting for applications that can&apos;t share cookies between processes. For more information about cookie settings, see Cookie settings for accessing on-premises applications in Microsoft Entra ID. Default value is false.
     * @param value Value to set for the isPersistentCookieEnabled property.
     */
    public void setIsPersistentCookieEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPersistentCookieEnabled", value);
    }
    /**
     * Sets the isSecureCookieEnabled property value. Indicates if the Secure cookie flag should be set in the HTTP response headers. Set this value to true to transmit cookies over a secure channel such as an encrypted HTTPS request. Default value is true.
     * @param value Value to set for the isSecureCookieEnabled property.
     */
    public void setIsSecureCookieEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSecureCookieEnabled", value);
    }
    /**
     * Sets the isStateSessionEnabled property value. Indicates whether validation of the state parameter when the client uses the OAuth 2.0 authorization code grant flow is enabled. This setting allows admins to specify whether they want to enable CSRF protection for their apps.
     * @param value Value to set for the isStateSessionEnabled property.
     */
    public void setIsStateSessionEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isStateSessionEnabled", value);
    }
    /**
     * Sets the isTranslateHostHeaderEnabled property value. Indicates if the application should translate urls in the response headers. Keep this value as true unless your application required the original host header in the authentication request. Default value is true.
     * @param value Value to set for the isTranslateHostHeaderEnabled property.
     */
    public void setIsTranslateHostHeaderEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isTranslateHostHeaderEnabled", value);
    }
    /**
     * Sets the isTranslateLinksInBodyEnabled property value. Indicates if the application should translate urls in the application body. Keep this value as false unless you have hardcoded HTML links to other on-premises applications and don&apos;t use custom domains. For more information, see Link translation with Application Proxy. Default value is false.
     * @param value Value to set for the isTranslateLinksInBodyEnabled property.
     */
    public void setIsTranslateLinksInBodyEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isTranslateLinksInBodyEnabled", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the onPremisesApplicationSegments property value. Represents the application segment collection for an on-premises wildcard application. This property is deprecated and will stop returning data on June 1, 2023. Use segmentsConfiguration instead.
     * @param value Value to set for the onPremisesApplicationSegments property.
     */
    public void setOnPremisesApplicationSegments(@jakarta.annotation.Nullable final java.util.List<OnPremisesApplicationSegment> value) {
        this.backingStore.set("onPremisesApplicationSegments", value);
    }
    /**
     * Sets the segmentsConfiguration property value. Represents the collection of application segments for an on-premises wildcard application that&apos;s published through Microsoft Entra application proxy.
     * @param value Value to set for the segmentsConfiguration property.
     */
    public void setSegmentsConfiguration(@jakarta.annotation.Nullable final SegmentConfiguration value) {
        this.backingStore.set("segmentsConfiguration", value);
    }
    /**
     * Sets the singleSignOnSettings property value. Represents the single sign-on configuration for the on-premises application.
     * @param value Value to set for the singleSignOnSettings property.
     */
    public void setSingleSignOnSettings(@jakarta.annotation.Nullable final OnPremisesPublishingSingleSignOn value) {
        this.backingStore.set("singleSignOnSettings", value);
    }
    /**
     * Sets the useAlternateUrlForTranslationAndRedirect property value. Indicates whether the application should use alternateUrl instead of externalUrl.
     * @param value Value to set for the useAlternateUrlForTranslationAndRedirect property.
     */
    public void setUseAlternateUrlForTranslationAndRedirect(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("useAlternateUrlForTranslationAndRedirect", value);
    }
    /**
     * Sets the verifiedCustomDomainCertificatesMetadata property value. Details of the certificate associated with the application when a custom domain is in use. null when using the default domain. Read-only.
     * @param value Value to set for the verifiedCustomDomainCertificatesMetadata property.
     */
    public void setVerifiedCustomDomainCertificatesMetadata(@jakarta.annotation.Nullable final VerifiedCustomDomainCertificatesMetadata value) {
        this.backingStore.set("verifiedCustomDomainCertificatesMetadata", value);
    }
    /**
     * Sets the verifiedCustomDomainKeyCredential property value. The associated key credential for the custom domain used.
     * @param value Value to set for the verifiedCustomDomainKeyCredential property.
     */
    public void setVerifiedCustomDomainKeyCredential(@jakarta.annotation.Nullable final KeyCredential value) {
        this.backingStore.set("verifiedCustomDomainKeyCredential", value);
    }
    /**
     * Sets the verifiedCustomDomainPasswordCredential property value. The associated password credential for the custom domain used.
     * @param value Value to set for the verifiedCustomDomainPasswordCredential property.
     */
    public void setVerifiedCustomDomainPasswordCredential(@jakarta.annotation.Nullable final PasswordCredential value) {
        this.backingStore.set("verifiedCustomDomainPasswordCredential", value);
    }
    /**
     * Sets the wafAllowedHeaders property value. The wafAllowedHeaders property
     * @param value Value to set for the wafAllowedHeaders property.
     */
    public void setWafAllowedHeaders(@jakarta.annotation.Nullable final WafAllowedHeadersDictionary value) {
        this.backingStore.set("wafAllowedHeaders", value);
    }
    /**
     * Sets the wafIpRanges property value. The wafIpRanges property
     * @param value Value to set for the wafIpRanges property.
     */
    public void setWafIpRanges(@jakarta.annotation.Nullable final java.util.List<IpRange> value) {
        this.backingStore.set("wafIpRanges", value);
    }
    /**
     * Sets the wafProvider property value. The wafProvider property
     * @param value Value to set for the wafProvider property.
     */
    public void setWafProvider(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("wafProvider", value);
    }
}

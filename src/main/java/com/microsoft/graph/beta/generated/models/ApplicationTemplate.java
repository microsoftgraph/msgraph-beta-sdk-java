package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ApplicationTemplate extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ApplicationTemplate} and sets the default values.
     */
    public ApplicationTemplate() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ApplicationTemplate}
     */
    @jakarta.annotation.Nonnull
    public static ApplicationTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ApplicationTemplate();
    }
    /**
     * Gets the categories property value. The list of categories for the application. Supported values can be: Collaboration, Business Management, Consumer, Content management, CRM, Data services, Developer services, E-commerce, Education, ERP, Finance, Health, Human resources, IT infrastructure, Mail, Management, Marketing, Media, Productivity, Project management, Telecommunications, Tools, Travel, and Web design &amp; hosting.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getCategories() {
        return this.backingStore.get("categories");
    }
    /**
     * Gets the configurationUris property value. The URIs required for the single sign-on configuration of a preintegrated application.
     * @return a {@link java.util.List<ConfigurationUri>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ConfigurationUri> getConfigurationUris() {
        return this.backingStore.get("configurationUris");
    }
    /**
     * Gets the description property value. A description of the application.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The name of the application.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("categories", (n) -> { this.setCategories(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("configurationUris", (n) -> { this.setConfigurationUris(n.getCollectionOfObjectValues(ConfigurationUri::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("homePageUrl", (n) -> { this.setHomePageUrl(n.getStringValue()); });
        deserializerMap.put("informationalUrls", (n) -> { this.setInformationalUrls(n.getObjectValue(InformationalUrls::createFromDiscriminatorValue)); });
        deserializerMap.put("logoUrl", (n) -> { this.setLogoUrl(n.getStringValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        deserializerMap.put("supportedClaimConfiguration", (n) -> { this.setSupportedClaimConfiguration(n.getObjectValue(SupportedClaimConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("supportedProvisioningTypes", (n) -> { this.setSupportedProvisioningTypes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("supportedSingleSignOnModes", (n) -> { this.setSupportedSingleSignOnModes(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the homePageUrl property value. The home page URL of the application.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHomePageUrl() {
        return this.backingStore.get("homePageUrl");
    }
    /**
     * Gets the informationalUrls property value. The informationalUrls property
     * @return a {@link InformationalUrls}
     */
    @jakarta.annotation.Nullable
    public InformationalUrls getInformationalUrls() {
        return this.backingStore.get("informationalUrls");
    }
    /**
     * Gets the logoUrl property value. The URL to get the logo for this application.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLogoUrl() {
        return this.backingStore.get("logoUrl");
    }
    /**
     * Gets the publisher property value. The name of the publisher for this application.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPublisher() {
        return this.backingStore.get("publisher");
    }
    /**
     * Gets the supportedClaimConfiguration property value. The supportedClaimConfiguration property
     * @return a {@link SupportedClaimConfiguration}
     */
    @jakarta.annotation.Nullable
    public SupportedClaimConfiguration getSupportedClaimConfiguration() {
        return this.backingStore.get("supportedClaimConfiguration");
    }
    /**
     * Gets the supportedProvisioningTypes property value. The list of provisioning modes supported by this application. The only valid value is sync.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportedProvisioningTypes() {
        return this.backingStore.get("supportedProvisioningTypes");
    }
    /**
     * Gets the supportedSingleSignOnModes property value. The list of single sign-on modes supported by this application. The supported values are oidc, password, saml, and notSupported.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getSupportedSingleSignOnModes() {
        return this.backingStore.get("supportedSingleSignOnModes");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("categories", this.getCategories());
        writer.writeCollectionOfObjectValues("configurationUris", this.getConfigurationUris());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("homePageUrl", this.getHomePageUrl());
        writer.writeObjectValue("informationalUrls", this.getInformationalUrls());
        writer.writeStringValue("logoUrl", this.getLogoUrl());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeObjectValue("supportedClaimConfiguration", this.getSupportedClaimConfiguration());
        writer.writeCollectionOfPrimitiveValues("supportedProvisioningTypes", this.getSupportedProvisioningTypes());
        writer.writeCollectionOfPrimitiveValues("supportedSingleSignOnModes", this.getSupportedSingleSignOnModes());
    }
    /**
     * Sets the categories property value. The list of categories for the application. Supported values can be: Collaboration, Business Management, Consumer, Content management, CRM, Data services, Developer services, E-commerce, Education, ERP, Finance, Health, Human resources, IT infrastructure, Mail, Management, Marketing, Media, Productivity, Project management, Telecommunications, Tools, Travel, and Web design &amp; hosting.
     * @param value Value to set for the categories property.
     */
    public void setCategories(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("categories", value);
    }
    /**
     * Sets the configurationUris property value. The URIs required for the single sign-on configuration of a preintegrated application.
     * @param value Value to set for the configurationUris property.
     */
    public void setConfigurationUris(@jakarta.annotation.Nullable final java.util.List<ConfigurationUri> value) {
        this.backingStore.set("configurationUris", value);
    }
    /**
     * Sets the description property value. A description of the application.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The name of the application.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the homePageUrl property value. The home page URL of the application.
     * @param value Value to set for the homePageUrl property.
     */
    public void setHomePageUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("homePageUrl", value);
    }
    /**
     * Sets the informationalUrls property value. The informationalUrls property
     * @param value Value to set for the informationalUrls property.
     */
    public void setInformationalUrls(@jakarta.annotation.Nullable final InformationalUrls value) {
        this.backingStore.set("informationalUrls", value);
    }
    /**
     * Sets the logoUrl property value. The URL to get the logo for this application.
     * @param value Value to set for the logoUrl property.
     */
    public void setLogoUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("logoUrl", value);
    }
    /**
     * Sets the publisher property value. The name of the publisher for this application.
     * @param value Value to set for the publisher property.
     */
    public void setPublisher(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("publisher", value);
    }
    /**
     * Sets the supportedClaimConfiguration property value. The supportedClaimConfiguration property
     * @param value Value to set for the supportedClaimConfiguration property.
     */
    public void setSupportedClaimConfiguration(@jakarta.annotation.Nullable final SupportedClaimConfiguration value) {
        this.backingStore.set("supportedClaimConfiguration", value);
    }
    /**
     * Sets the supportedProvisioningTypes property value. The list of provisioning modes supported by this application. The only valid value is sync.
     * @param value Value to set for the supportedProvisioningTypes property.
     */
    public void setSupportedProvisioningTypes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("supportedProvisioningTypes", value);
    }
    /**
     * Sets the supportedSingleSignOnModes property value. The list of single sign-on modes supported by this application. The supported values are oidc, password, saml, and notSupported.
     * @param value Value to set for the supportedSingleSignOnModes property.
     */
    public void setSupportedSingleSignOnModes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("supportedSingleSignOnModes", value);
    }
}

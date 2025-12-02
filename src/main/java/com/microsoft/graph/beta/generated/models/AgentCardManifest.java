package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AgentCardManifest extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AgentCardManifest} and sets the default values.
     */
    public AgentCardManifest() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AgentCardManifest}
     */
    @jakarta.annotation.Nonnull
    public static AgentCardManifest createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AgentCardManifest();
    }
    /**
     * Gets the capabilities property value. The capabilities property
     * @return a {@link AgentCapabilities}
     */
    @jakarta.annotation.Nullable
    public AgentCapabilities getCapabilities() {
        return this.backingStore.get("capabilities");
    }
    /**
     * Gets the createdBy property value. Object ID of the user or application that created the agent card manifest. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the createdDateTime property value. When this agent card manifest was created.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the defaultInputModes property value. Default set of supported input MIME types for all skills, which can be overridden on a per-skill basis.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDefaultInputModes() {
        return this.backingStore.get("defaultInputModes");
    }
    /**
     * Gets the defaultOutputModes property value. Default set of supported output MIME types for all skills, which can be overridden on a per-skill basis.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDefaultOutputModes() {
        return this.backingStore.get("defaultOutputModes");
    }
    /**
     * Gets the description property value. A human-readable description of the agent.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. A human-readable display name of the agent.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the documentationUrl property value. URL to agent&apos;s documentation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDocumentationUrl() {
        return this.backingStore.get("documentationUrl");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("capabilities", (n) -> { this.setCapabilities(n.getObjectValue(AgentCapabilities::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("defaultInputModes", (n) -> { this.setDefaultInputModes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("defaultOutputModes", (n) -> { this.setDefaultOutputModes(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("documentationUrl", (n) -> { this.setDocumentationUrl(n.getStringValue()); });
        deserializerMap.put("iconUrl", (n) -> { this.setIconUrl(n.getStringValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("managedBy", (n) -> { this.setManagedBy(n.getStringValue()); });
        deserializerMap.put("originatingStore", (n) -> { this.setOriginatingStore(n.getStringValue()); });
        deserializerMap.put("ownerIds", (n) -> { this.setOwnerIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("protocolVersion", (n) -> { this.setProtocolVersion(n.getStringValue()); });
        deserializerMap.put("provider", (n) -> { this.setProvider(n.getObjectValue(AgentProvider::createFromDiscriminatorValue)); });
        deserializerMap.put("security", (n) -> { this.setSecurity(n.getCollectionOfObjectValues(SecurityRequirement::createFromDiscriminatorValue)); });
        deserializerMap.put("securitySchemes", (n) -> { this.setSecuritySchemes(n.getObjectValue(SecuritySchemes::createFromDiscriminatorValue)); });
        deserializerMap.put("skills", (n) -> { this.setSkills(n.getCollectionOfObjectValues(AgentSkill::createFromDiscriminatorValue)); });
        deserializerMap.put("supportsAuthenticatedExtendedCard", (n) -> { this.setSupportsAuthenticatedExtendedCard(n.getBooleanValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the iconUrl property value. URL to agent&apos;s icon image.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIconUrl() {
        return this.backingStore.get("iconUrl");
    }
    /**
     * Gets the lastModifiedDateTime property value. When this agent card manifest was last modified.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the managedBy property value. appId (referred to as Application (client) ID on the Microsoft Entra admin center) of the application managing this agent manifest.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getManagedBy() {
        return this.backingStore.get("managedBy");
    }
    /**
     * Gets the originatingStore property value. Name of the store/system where agent originated. For example Copilot Studio.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOriginatingStore() {
        return this.backingStore.get("originatingStore");
    }
    /**
     * Gets the ownerIds property value. List of object IDs for the owners of the agent card manifest.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getOwnerIds() {
        return this.backingStore.get("ownerIds");
    }
    /**
     * Gets the protocolVersion property value. Protocol version supported by the agent.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getProtocolVersion() {
        return this.backingStore.get("protocolVersion");
    }
    /**
     * Gets the provider property value. Information about the organization providing the agent.
     * @return a {@link AgentProvider}
     */
    @jakarta.annotation.Nullable
    public AgentProvider getProvider() {
        return this.backingStore.get("provider");
    }
    /**
     * Gets the security property value. Security requirements - array of security scheme references.
     * @return a {@link java.util.List<SecurityRequirement>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<SecurityRequirement> getSecurity() {
        return this.backingStore.get("security");
    }
    /**
     * Gets the securitySchemes property value. Dictionary of security scheme definitions keyed by scheme name.
     * @return a {@link SecuritySchemes}
     */
    @jakarta.annotation.Nullable
    public SecuritySchemes getSecuritySchemes() {
        return this.backingStore.get("securitySchemes");
    }
    /**
     * Gets the skills property value. Skills/capabilities that the agent can perform
     * @return a {@link java.util.List<AgentSkill>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<AgentSkill> getSkills() {
        return this.backingStore.get("skills");
    }
    /**
     * Gets the supportsAuthenticatedExtendedCard property value. Whether agent supports authenticated extended card retrieval
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getSupportsAuthenticatedExtendedCard() {
        return this.backingStore.get("supportsAuthenticatedExtendedCard");
    }
    /**
     * Gets the version property value. Version of the agent implementation
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("capabilities", this.getCapabilities());
        writer.writeStringValue("createdBy", this.getCreatedBy());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeCollectionOfPrimitiveValues("defaultInputModes", this.getDefaultInputModes());
        writer.writeCollectionOfPrimitiveValues("defaultOutputModes", this.getDefaultOutputModes());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("documentationUrl", this.getDocumentationUrl());
        writer.writeStringValue("iconUrl", this.getIconUrl());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("managedBy", this.getManagedBy());
        writer.writeStringValue("originatingStore", this.getOriginatingStore());
        writer.writeCollectionOfPrimitiveValues("ownerIds", this.getOwnerIds());
        writer.writeStringValue("protocolVersion", this.getProtocolVersion());
        writer.writeObjectValue("provider", this.getProvider());
        writer.writeCollectionOfObjectValues("security", this.getSecurity());
        writer.writeObjectValue("securitySchemes", this.getSecuritySchemes());
        writer.writeCollectionOfObjectValues("skills", this.getSkills());
        writer.writeBooleanValue("supportsAuthenticatedExtendedCard", this.getSupportsAuthenticatedExtendedCard());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the capabilities property value. The capabilities property
     * @param value Value to set for the capabilities property.
     */
    public void setCapabilities(@jakarta.annotation.Nullable final AgentCapabilities value) {
        this.backingStore.set("capabilities", value);
    }
    /**
     * Sets the createdBy property value. Object ID of the user or application that created the agent card manifest. Read-only.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the createdDateTime property value. When this agent card manifest was created.
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the defaultInputModes property value. Default set of supported input MIME types for all skills, which can be overridden on a per-skill basis.
     * @param value Value to set for the defaultInputModes property.
     */
    public void setDefaultInputModes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("defaultInputModes", value);
    }
    /**
     * Sets the defaultOutputModes property value. Default set of supported output MIME types for all skills, which can be overridden on a per-skill basis.
     * @param value Value to set for the defaultOutputModes property.
     */
    public void setDefaultOutputModes(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("defaultOutputModes", value);
    }
    /**
     * Sets the description property value. A human-readable description of the agent.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. A human-readable display name of the agent.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the documentationUrl property value. URL to agent&apos;s documentation.
     * @param value Value to set for the documentationUrl property.
     */
    public void setDocumentationUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("documentationUrl", value);
    }
    /**
     * Sets the iconUrl property value. URL to agent&apos;s icon image.
     * @param value Value to set for the iconUrl property.
     */
    public void setIconUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("iconUrl", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. When this agent card manifest was last modified.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the managedBy property value. appId (referred to as Application (client) ID on the Microsoft Entra admin center) of the application managing this agent manifest.
     * @param value Value to set for the managedBy property.
     */
    public void setManagedBy(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("managedBy", value);
    }
    /**
     * Sets the originatingStore property value. Name of the store/system where agent originated. For example Copilot Studio.
     * @param value Value to set for the originatingStore property.
     */
    public void setOriginatingStore(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("originatingStore", value);
    }
    /**
     * Sets the ownerIds property value. List of object IDs for the owners of the agent card manifest.
     * @param value Value to set for the ownerIds property.
     */
    public void setOwnerIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("ownerIds", value);
    }
    /**
     * Sets the protocolVersion property value. Protocol version supported by the agent.
     * @param value Value to set for the protocolVersion property.
     */
    public void setProtocolVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("protocolVersion", value);
    }
    /**
     * Sets the provider property value. Information about the organization providing the agent.
     * @param value Value to set for the provider property.
     */
    public void setProvider(@jakarta.annotation.Nullable final AgentProvider value) {
        this.backingStore.set("provider", value);
    }
    /**
     * Sets the security property value. Security requirements - array of security scheme references.
     * @param value Value to set for the security property.
     */
    public void setSecurity(@jakarta.annotation.Nullable final java.util.List<SecurityRequirement> value) {
        this.backingStore.set("security", value);
    }
    /**
     * Sets the securitySchemes property value. Dictionary of security scheme definitions keyed by scheme name.
     * @param value Value to set for the securitySchemes property.
     */
    public void setSecuritySchemes(@jakarta.annotation.Nullable final SecuritySchemes value) {
        this.backingStore.set("securitySchemes", value);
    }
    /**
     * Sets the skills property value. Skills/capabilities that the agent can perform
     * @param value Value to set for the skills property.
     */
    public void setSkills(@jakarta.annotation.Nullable final java.util.List<AgentSkill> value) {
        this.backingStore.set("skills", value);
    }
    /**
     * Sets the supportsAuthenticatedExtendedCard property value. Whether agent supports authenticated extended card retrieval
     * @param value Value to set for the supportsAuthenticatedExtendedCard property.
     */
    public void setSupportsAuthenticatedExtendedCard(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("supportsAuthenticatedExtendedCard", value);
    }
    /**
     * Sets the version property value. Version of the agent implementation
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("version", value);
    }
}

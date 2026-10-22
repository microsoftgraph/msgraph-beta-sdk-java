package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ContentLink extends PlannerDelta implements Parsable {
    /**
     * Instantiates a new {@link ContentLink} and sets the default values.
     */
    public ContentLink() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ContentLink}
     */
    @jakarta.annotation.Nonnull
    public static ContentLink createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ContentLink();
    }
    /**
     * Gets the capabilities property value. Server-computed, read-only capability flags indicating which optional features are enabled for the entity.
     * @return a {@link ContentLinkCapability}
     */
    @jakarta.annotation.Nullable
    public ContentLinkCapability getCapabilities() {
        return this.backingStore.get("capabilities");
    }
    /**
     * Gets the createdBy property value. Identity of the user (or application) who created the entity. Read-only.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getCreatedBy() {
        return this.backingStore.get("createdBy");
    }
    /**
     * Gets the displayName property value. Display label for the link.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the extensions property value. Custom extension field values set on the entity. Supports $select.
     * @return a {@link ExtensionFieldCollection}
     */
    @jakarta.annotation.Nullable
    public ExtensionFieldCollection getExtensions() {
        return this.backingStore.get("extensions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("capabilities", (n) -> { this.setCapabilities(n.getObjectValue(ContentLinkCapability::createFromDiscriminatorValue)); });
        deserializerMap.put("createdBy", (n) -> { this.setCreatedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getObjectValue(ExtensionFieldCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("linkType", (n) -> { this.setLinkType(n.getEnumValue(ContentLinkType::forValue)); });
        deserializerMap.put("webUrl", (n) -> { this.setWebUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastModifiedBy property value. Identity of the user (or application) who last modified the entity. Read-only.
     * @return a {@link IdentitySet}
     */
    @jakarta.annotation.Nullable
    public IdentitySet getLastModifiedBy() {
        return this.backingStore.get("lastModifiedBy");
    }
    /**
     * Gets the lastModifiedDateTime property value. Date and time the entity was last modified. The value is represented in ISO 8601 format and is always in UTC time. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the linkType property value. Type of content the link points to. The possible values are: documentReference, webReference, unknownFutureValue.
     * @return a {@link ContentLinkType}
     */
    @jakarta.annotation.Nullable
    public ContentLinkType getLinkType() {
        return this.backingStore.get("linkType");
    }
    /**
     * Gets the webUrl property value. URL the link points to.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getWebUrl() {
        return this.backingStore.get("webUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("extensions", this.getExtensions());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeEnumValue("linkType", this.getLinkType());
        writer.writeStringValue("webUrl", this.getWebUrl());
    }
    /**
     * Sets the capabilities property value. Server-computed, read-only capability flags indicating which optional features are enabled for the entity.
     * @param value Value to set for the capabilities property.
     */
    public void setCapabilities(@jakarta.annotation.Nullable final ContentLinkCapability value) {
        this.backingStore.set("capabilities", value);
    }
    /**
     * Sets the createdBy property value. Identity of the user (or application) who created the entity. Read-only.
     * @param value Value to set for the createdBy property.
     */
    public void setCreatedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("createdBy", value);
    }
    /**
     * Sets the displayName property value. Display label for the link.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the extensions property value. Custom extension field values set on the entity. Supports $select.
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final ExtensionFieldCollection value) {
        this.backingStore.set("extensions", value);
    }
    /**
     * Sets the lastModifiedBy property value. Identity of the user (or application) who last modified the entity. Read-only.
     * @param value Value to set for the lastModifiedBy property.
     */
    public void setLastModifiedBy(@jakarta.annotation.Nullable final IdentitySet value) {
        this.backingStore.set("lastModifiedBy", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. Date and time the entity was last modified. The value is represented in ISO 8601 format and is always in UTC time. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the linkType property value. Type of content the link points to. The possible values are: documentReference, webReference, unknownFutureValue.
     * @param value Value to set for the linkType property.
     */
    public void setLinkType(@jakarta.annotation.Nullable final ContentLinkType value) {
        this.backingStore.set("linkType", value);
    }
    /**
     * Sets the webUrl property value. URL the link points to.
     * @param value Value to set for the webUrl property.
     */
    public void setWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("webUrl", value);
    }
}

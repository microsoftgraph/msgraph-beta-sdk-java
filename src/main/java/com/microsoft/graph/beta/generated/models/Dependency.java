package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Dependency extends PlannerDelta implements Parsable {
    /**
     * Instantiates a new {@link Dependency} and sets the default values.
     */
    public Dependency() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Dependency}
     */
    @jakarta.annotation.Nonnull
    public static Dependency createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Dependency();
    }
    /**
     * Gets the archivalInfo property value. Information about whether the entity is archived, and when it was archived.
     * @return a {@link PlannerArchivalInfo}
     */
    @jakarta.annotation.Nullable
    public PlannerArchivalInfo getArchivalInfo() {
        return this.backingStore.get("archivalInfo");
    }
    /**
     * Gets the constraint property value. The constraint property
     * @return a {@link DependencyType}
     */
    @jakarta.annotation.Nullable
    public DependencyType getConstraint() {
        return this.backingStore.get("constraint");
    }
    /**
     * Gets the creationInfo property value. Read-only creation metadata for the entity.
     * @return a {@link CreationInfo}
     */
    @jakarta.annotation.Nullable
    public CreationInfo getCreationInfo() {
        return this.backingStore.get("creationInfo");
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
        deserializerMap.put("archivalInfo", (n) -> { this.setArchivalInfo(n.getObjectValue(PlannerArchivalInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("constraint", (n) -> { this.setConstraint(n.getEnumValue(DependencyType::forValue)); });
        deserializerMap.put("creationInfo", (n) -> { this.setCreationInfo(n.getObjectValue(CreationInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getObjectValue(ExtensionFieldCollection::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedBy", (n) -> { this.setLastModifiedBy(n.getObjectValue(IdentitySet::createFromDiscriminatorValue)); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sourceItemId", (n) -> { this.setSourceItemId(n.getStringValue()); });
        deserializerMap.put("targetItemId", (n) -> { this.setTargetItemId(n.getStringValue()); });
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
     * Gets the sourceItemId property value. ID of the source item in the dependency.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceItemId() {
        return this.backingStore.get("sourceItemId");
    }
    /**
     * Gets the targetItemId property value. ID of the target item in the dependency.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTargetItemId() {
        return this.backingStore.get("targetItemId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("archivalInfo", this.getArchivalInfo());
        writer.writeEnumValue("constraint", this.getConstraint());
        writer.writeObjectValue("extensions", this.getExtensions());
        writer.writeObjectValue("lastModifiedBy", this.getLastModifiedBy());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("sourceItemId", this.getSourceItemId());
        writer.writeStringValue("targetItemId", this.getTargetItemId());
    }
    /**
     * Sets the archivalInfo property value. Information about whether the entity is archived, and when it was archived.
     * @param value Value to set for the archivalInfo property.
     */
    public void setArchivalInfo(@jakarta.annotation.Nullable final PlannerArchivalInfo value) {
        this.backingStore.set("archivalInfo", value);
    }
    /**
     * Sets the constraint property value. The constraint property
     * @param value Value to set for the constraint property.
     */
    public void setConstraint(@jakarta.annotation.Nullable final DependencyType value) {
        this.backingStore.set("constraint", value);
    }
    /**
     * Sets the creationInfo property value. Read-only creation metadata for the entity.
     * @param value Value to set for the creationInfo property.
     */
    public void setCreationInfo(@jakarta.annotation.Nullable final CreationInfo value) {
        this.backingStore.set("creationInfo", value);
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
     * Sets the sourceItemId property value. ID of the source item in the dependency.
     * @param value Value to set for the sourceItemId property.
     */
    public void setSourceItemId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceItemId", value);
    }
    /**
     * Sets the targetItemId property value. ID of the target item in the dependency.
     * @param value Value to set for the targetItemId property.
     */
    public void setTargetItemId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("targetItemId", value);
    }
}

package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Ring extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Ring} and sets the default values.
     */
    public Ring() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Ring}
     */
    @jakarta.annotation.Nonnull
    public static Ring createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsUpdates.qualityUpdateRing": return new QualityUpdateRing();
            }
        }
        return new Ring();
    }
    /**
     * Gets the createdDateTime property value. The date and time when the ring is created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the deferralInDays property value. The quality update deferral period in days. The value must be between 0 and 30. Optional.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getDeferralInDays() {
        return this.backingStore.get("deferralInDays");
    }
    /**
     * Gets the description property value. The ring description. The maximum length is 1,500 characters. Required
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The ring display name. The maximum length is 200 characters. Required.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the excludedGroupAssignment property value. The excludedGroupAssignment property
     * @return a {@link ExcludedGroupAssignment}
     */
    @jakarta.annotation.Nullable
    public ExcludedGroupAssignment getExcludedGroupAssignment() {
        return this.backingStore.get("excludedGroupAssignment");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deferralInDays", (n) -> { this.setDeferralInDays(n.getIntegerValue()); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("excludedGroupAssignment", (n) -> { this.setExcludedGroupAssignment(n.getObjectValue(ExcludedGroupAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("includedGroupAssignment", (n) -> { this.setIncludedGroupAssignment(n.getObjectValue(IncludedGroupAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("isPaused", (n) -> { this.setIsPaused(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the includedGroupAssignment property value. The includedGroupAssignment property
     * @return a {@link IncludedGroupAssignment}
     */
    @jakarta.annotation.Nullable
    public IncludedGroupAssignment getIncludedGroupAssignment() {
        return this.backingStore.get("includedGroupAssignment");
    }
    /**
     * Gets the isPaused property value. The pause action for the quality update ring policy. Required.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsPaused() {
        return this.backingStore.get("isPaused");
    }
    /**
     * Gets the lastModifiedDateTime property value. The date and time whenthe ring was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeIntegerValue("deferralInDays", this.getDeferralInDays());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("excludedGroupAssignment", this.getExcludedGroupAssignment());
        writer.writeObjectValue("includedGroupAssignment", this.getIncludedGroupAssignment());
        writer.writeBooleanValue("isPaused", this.getIsPaused());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
    }
    /**
     * Sets the createdDateTime property value. The date and time when the ring is created. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deferralInDays property value. The quality update deferral period in days. The value must be between 0 and 30. Optional.
     * @param value Value to set for the deferralInDays property.
     */
    public void setDeferralInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("deferralInDays", value);
    }
    /**
     * Sets the description property value. The ring description. The maximum length is 1,500 characters. Required
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The ring display name. The maximum length is 200 characters. Required.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the excludedGroupAssignment property value. The excludedGroupAssignment property
     * @param value Value to set for the excludedGroupAssignment property.
     */
    public void setExcludedGroupAssignment(@jakarta.annotation.Nullable final ExcludedGroupAssignment value) {
        this.backingStore.set("excludedGroupAssignment", value);
    }
    /**
     * Sets the includedGroupAssignment property value. The includedGroupAssignment property
     * @param value Value to set for the includedGroupAssignment property.
     */
    public void setIncludedGroupAssignment(@jakarta.annotation.Nullable final IncludedGroupAssignment value) {
        this.backingStore.set("includedGroupAssignment", value);
    }
    /**
     * Sets the isPaused property value. The pause action for the quality update ring policy. Required.
     * @param value Value to set for the isPaused property.
     */
    public void setIsPaused(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isPaused", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The date and time whenthe ring was last modified. The timestamp type represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
}

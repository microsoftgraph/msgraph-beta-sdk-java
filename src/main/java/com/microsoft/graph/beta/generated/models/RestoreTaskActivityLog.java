package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RestoreTaskActivityLog extends ActivityLogBase implements Parsable {
    /**
     * Instantiates a new {@link RestoreTaskActivityLog} and sets the default values.
     */
    public RestoreTaskActivityLog() {
        super();
        this.setOdataType("#microsoft.graph.restoreTaskActivityLog");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RestoreTaskActivityLog}
     */
    @jakarta.annotation.Nonnull
    public static RestoreTaskActivityLog createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RestoreTaskActivityLog();
    }
    /**
     * Gets the destinationType property value. The destinationType property
     * @return a {@link DestinationType}
     */
    @jakarta.annotation.Nullable
    public DestinationType getDestinationType() {
        return this.backingStore.get("destinationType");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("destinationType", (n) -> { this.setDestinationType(n.getEnumValue(DestinationType::forValue)); });
        deserializerMap.put("restoreArtifactDetails", (n) -> { this.setRestoreArtifactDetails(n.getObjectValue(RestoreArtifactDetails::createFromDiscriminatorValue)); });
        deserializerMap.put("restoreCompletionDateTime", (n) -> { this.setRestoreCompletionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("restoreSessionId", (n) -> { this.setRestoreSessionId(n.getStringValue()); });
        deserializerMap.put("restoreSessionStatus", (n) -> { this.setRestoreSessionStatus(n.getEnumValue(RestoreSessionStatus::forValue)); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getEnumSetValue(RestorePointTags::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the restoreArtifactDetails property value. The restoreArtifactDetails property
     * @return a {@link RestoreArtifactDetails}
     */
    @jakarta.annotation.Nullable
    public RestoreArtifactDetails getRestoreArtifactDetails() {
        return this.backingStore.get("restoreArtifactDetails");
    }
    /**
     * Gets the restoreCompletionDateTime property value. The restoreCompletionDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRestoreCompletionDateTime() {
        return this.backingStore.get("restoreCompletionDateTime");
    }
    /**
     * Gets the restoreSessionId property value. The restoreSessionId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRestoreSessionId() {
        return this.backingStore.get("restoreSessionId");
    }
    /**
     * Gets the restoreSessionStatus property value. The restoreSessionStatus property
     * @return a {@link RestoreSessionStatus}
     */
    @jakarta.annotation.Nullable
    public RestoreSessionStatus getRestoreSessionStatus() {
        return this.backingStore.get("restoreSessionStatus");
    }
    /**
     * Gets the tags property value. The tags property
     * @return a {@link EnumSet<RestorePointTags>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<RestorePointTags> getTags() {
        return this.backingStore.get("tags");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("destinationType", this.getDestinationType());
        writer.writeObjectValue("restoreArtifactDetails", this.getRestoreArtifactDetails());
        writer.writeOffsetDateTimeValue("restoreCompletionDateTime", this.getRestoreCompletionDateTime());
        writer.writeStringValue("restoreSessionId", this.getRestoreSessionId());
        writer.writeEnumValue("restoreSessionStatus", this.getRestoreSessionStatus());
        writer.writeEnumSetValue("tags", this.getTags());
    }
    /**
     * Sets the destinationType property value. The destinationType property
     * @param value Value to set for the destinationType property.
     */
    public void setDestinationType(@jakarta.annotation.Nullable final DestinationType value) {
        this.backingStore.set("destinationType", value);
    }
    /**
     * Sets the restoreArtifactDetails property value. The restoreArtifactDetails property
     * @param value Value to set for the restoreArtifactDetails property.
     */
    public void setRestoreArtifactDetails(@jakarta.annotation.Nullable final RestoreArtifactDetails value) {
        this.backingStore.set("restoreArtifactDetails", value);
    }
    /**
     * Sets the restoreCompletionDateTime property value. The restoreCompletionDateTime property
     * @param value Value to set for the restoreCompletionDateTime property.
     */
    public void setRestoreCompletionDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("restoreCompletionDateTime", value);
    }
    /**
     * Sets the restoreSessionId property value. The restoreSessionId property
     * @param value Value to set for the restoreSessionId property.
     */
    public void setRestoreSessionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("restoreSessionId", value);
    }
    /**
     * Sets the restoreSessionStatus property value. The restoreSessionStatus property
     * @param value Value to set for the restoreSessionStatus property.
     */
    public void setRestoreSessionStatus(@jakarta.annotation.Nullable final RestoreSessionStatus value) {
        this.backingStore.set("restoreSessionStatus", value);
    }
    /**
     * Sets the tags property value. The tags property
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final EnumSet<RestorePointTags> value) {
        this.backingStore.set("tags", value);
    }
}

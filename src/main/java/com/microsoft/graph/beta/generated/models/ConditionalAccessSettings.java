package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ConditionalAccessSettings extends Entity implements Parsable {
    /**
     * Instantiates a new {@link ConditionalAccessSettings} and sets the default values.
     */
    public ConditionalAccessSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ConditionalAccessSettings}
     */
    @jakarta.annotation.Nonnull
    public static ConditionalAccessSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConditionalAccessSettings();
    }
    /**
     * Gets the exclusions property value. The tenant-wide exclusions configuration.
     * @return a {@link ConditionalAccessExclusions}
     */
    @jakarta.annotation.Nullable
    public ConditionalAccessExclusions getExclusions() {
        return this.backingStore.get("exclusions");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("exclusions", (n) -> { this.setExclusions(n.getObjectValue(ConditionalAccessExclusions::createFromDiscriminatorValue)); });
        deserializerMap.put("modifiedDateTime", (n) -> { this.setModifiedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the modifiedDateTime property value. The date and time the settings were last modified, in ISO 8601 format and UTC. Nullable. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getModifiedDateTime() {
        return this.backingStore.get("modifiedDateTime");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("exclusions", this.getExclusions());
        writer.writeOffsetDateTimeValue("modifiedDateTime", this.getModifiedDateTime());
    }
    /**
     * Sets the exclusions property value. The tenant-wide exclusions configuration.
     * @param value Value to set for the exclusions property.
     */
    public void setExclusions(@jakarta.annotation.Nullable final ConditionalAccessExclusions value) {
        this.backingStore.set("exclusions", value);
    }
    /**
     * Sets the modifiedDateTime property value. The date and time the settings were last modified, in ISO 8601 format and UTC. Nullable. Read-only.
     * @param value Value to set for the modifiedDateTime property.
     */
    public void setModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("modifiedDateTime", value);
    }
}

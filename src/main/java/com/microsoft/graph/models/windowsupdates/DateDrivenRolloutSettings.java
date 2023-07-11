package com.microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DateDrivenRolloutSettings extends GradualRolloutSettings implements Parsable {
    /**
     * Specifies the date before which all devices currently in the deployment are offered the update. Devices added after this date are offered immediately. When the endDateTime is not set, all devices in the deployment are offered content at the same time.
     */
    private OffsetDateTime endDateTime;
    /**
     * Instantiates a new dateDrivenRolloutSettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DateDrivenRolloutSettings() {
        super();
        this.setOdataType("#microsoft.graph.windowsUpdates.dateDrivenRolloutSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a dateDrivenRolloutSettings
     */
    @javax.annotation.Nonnull
    public static DateDrivenRolloutSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DateDrivenRolloutSettings();
    }
    /**
     * Gets the endDateTime property value. Specifies the date before which all devices currently in the deployment are offered the update. Devices added after this date are offered immediately. When the endDateTime is not set, all devices in the deployment are offered content at the same time.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEndDateTime() {
        return this.endDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("endDateTime", (n) -> { this.setEndDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("endDateTime", this.getEndDateTime());
    }
    /**
     * Sets the endDateTime property value. Specifies the date before which all devices currently in the deployment are offered the update. Devices added after this date are offered immediately. When the endDateTime is not set, all devices in the deployment are offered content at the same time.
     * @param value Value to set for the endDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.endDateTime = value;
    }
}

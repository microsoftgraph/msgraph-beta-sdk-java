package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device health script run once schedule.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceHealthScriptRunOnceSchedule extends DeviceHealthScriptTimeSchedule implements Parsable {
    /**
     * Instantiates a new DeviceHealthScriptRunOnceSchedule and sets the default values.
     */
    public DeviceHealthScriptRunOnceSchedule() {
        super();
        this.setOdataType("#microsoft.graph.deviceHealthScriptRunOnceSchedule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceHealthScriptRunOnceSchedule
     */
    @jakarta.annotation.Nonnull
    public static DeviceHealthScriptRunOnceSchedule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScriptRunOnceSchedule();
    }
    /**
     * Gets the date property value. The date the script is scheduled to run. This collection can contain a maximum of 20 elements.
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getDate() {
        return this.BackingStore.get("date");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("date", (n) -> { this.setDate(n.getLocalDateValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLocalDateValue("date", this.getDate());
    }
    /**
     * Sets the date property value. The date the script is scheduled to run. This collection can contain a maximum of 20 elements.
     * @param value Value to set for the date property.
     */
    public void setDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.BackingStore.set("date", value);
    }
}

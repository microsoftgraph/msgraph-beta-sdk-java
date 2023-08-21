package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Base type of Device health script time schedule.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceHealthScriptTimeSchedule extends DeviceHealthScriptRunSchedule implements Parsable {
    /**
     * At what time the script is scheduled to run. This collection can contain a maximum of 20 elements.
     */
    private LocalTime time;
    /**
     * Indicate if the time is Utc or client local time.
     */
    private Boolean useUtc;
    /**
     * Instantiates a new deviceHealthScriptTimeSchedule and sets the default values.
     */
    public DeviceHealthScriptTimeSchedule() {
        super();
        this.setOdataType("#microsoft.graph.deviceHealthScriptTimeSchedule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthScriptTimeSchedule
     */
    @jakarta.annotation.Nonnull
    public static DeviceHealthScriptTimeSchedule createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceHealthScriptDailySchedule": return new DeviceHealthScriptDailySchedule();
                case "#microsoft.graph.deviceHealthScriptRunOnceSchedule": return new DeviceHealthScriptRunOnceSchedule();
            }
        }
        return new DeviceHealthScriptTimeSchedule();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("time", (n) -> { this.setTime(n.getLocalTimeValue()); });
        deserializerMap.put("useUtc", (n) -> { this.setUseUtc(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the time property value. At what time the script is scheduled to run. This collection can contain a maximum of 20 elements.
     * @return a LocalTime
     */
    @jakarta.annotation.Nullable
    public LocalTime getTime() {
        return this.time;
    }
    /**
     * Gets the useUtc property value. Indicate if the time is Utc or client local time.
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getUseUtc() {
        return this.useUtc;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLocalTimeValue("time", this.getTime());
        writer.writeBooleanValue("useUtc", this.getUseUtc());
    }
    /**
     * Sets the time property value. At what time the script is scheduled to run. This collection can contain a maximum of 20 elements.
     * @param value Value to set for the time property.
     */
    public void setTime(@jakarta.annotation.Nullable final LocalTime value) {
        this.time = value;
    }
    /**
     * Sets the useUtc property value. Indicate if the time is Utc or client local time.
     * @param value Value to set for the useUtc property.
     */
    public void setUseUtc(@jakarta.annotation.Nullable final Boolean value) {
        this.useUtc = value;
    }
}

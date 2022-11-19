package com.microsoft.graph.models;

import com.microsoft.graph.models.DeviceHealthScriptDailySchedule;
import com.microsoft.graph.models.DeviceHealthScriptRunOnceSchedule;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceHealthScriptTimeSchedule extends DeviceHealthScriptRunSchedule implements Parsable {
    /** At what time the script is scheduled to run. This collection can contain a maximum of 20 elements. */
    private LocalTime _time;
    /** Indicate if the time is Utc or client local time. */
    private Boolean _useUtc;
    /**
     * Instantiates a new DeviceHealthScriptTimeSchedule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceHealthScriptTimeSchedule() {
        super();
        this.setOdataType("#microsoft.graph.deviceHealthScriptTimeSchedule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceHealthScriptTimeSchedule
     */
    @javax.annotation.Nonnull
    public static DeviceHealthScriptTimeSchedule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceHealthScriptTimeSchedule currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("time", (n) -> { currentObject.setTime(n.getLocalTimeValue()); });
        deserializerMap.put("useUtc", (n) -> { currentObject.setUseUtc(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the time property value. At what time the script is scheduled to run. This collection can contain a maximum of 20 elements.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getTime() {
        return this._time;
    }
    /**
     * Gets the useUtc property value. Indicate if the time is Utc or client local time.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getUseUtc() {
        return this._useUtc;
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
        writer.writeLocalTimeValue("time", this.getTime());
        writer.writeBooleanValue("useUtc", this.getUseUtc());
    }
    /**
     * Sets the time property value. At what time the script is scheduled to run. This collection can contain a maximum of 20 elements.
     * @param value Value to set for the time property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTime(@javax.annotation.Nullable final LocalTime value) {
        this._time = value;
    }
    /**
     * Sets the useUtc property value. Indicate if the time is Utc or client local time.
     * @param value Value to set for the useUtc property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUseUtc(@javax.annotation.Nullable final Boolean value) {
        this._useUtc = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.graph.models.DeviceHealthScriptDailySchedule;
import com.microsoft.graph.models.DeviceHealthScriptHourlySchedule;
import com.microsoft.graph.models.DeviceHealthScriptRunOnceSchedule;
import com.microsoft.graph.models.DeviceHealthScriptTimeSchedule;
import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Base type of Device health script run schedule. */
public class DeviceHealthScriptRunSchedule implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The x value of every x hours for hourly schedule, every x days for Daily Schedule, every x weeks for weekly schedule, every x months for Monthly Schedule. Valid values 1 to 23 */
    private Integer _interval;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new deviceHealthScriptRunSchedule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public DeviceHealthScriptRunSchedule() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceHealthScriptRunSchedule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceHealthScriptRunSchedule
     */
    @javax.annotation.Nonnull
    public static DeviceHealthScriptRunSchedule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.deviceHealthScriptDailySchedule": return new DeviceHealthScriptDailySchedule();
                case "#microsoft.graph.deviceHealthScriptHourlySchedule": return new DeviceHealthScriptHourlySchedule();
                case "#microsoft.graph.deviceHealthScriptRunOnceSchedule": return new DeviceHealthScriptRunOnceSchedule();
                case "#microsoft.graph.deviceHealthScriptTimeSchedule": return new DeviceHealthScriptTimeSchedule();
            }
        }
        return new DeviceHealthScriptRunSchedule();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceHealthScriptRunSchedule currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(2) {{
            this.put("interval", (n) -> { currentObject.setInterval(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the interval property value. The x value of every x hours for hourly schedule, every x days for Daily Schedule, every x weeks for weekly schedule, every x months for Monthly Schedule. Valid values 1 to 23
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getInterval() {
        return this._interval;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("interval", this.getInterval());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the interval property value. The x value of every x hours for hourly schedule, every x days for Daily Schedule, every x weeks for weekly schedule, every x months for Monthly Schedule. Valid values 1 to 23
     * @param value Value to set for the interval property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setInterval(@javax.annotation.Nullable final Integer value) {
        this._interval = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}

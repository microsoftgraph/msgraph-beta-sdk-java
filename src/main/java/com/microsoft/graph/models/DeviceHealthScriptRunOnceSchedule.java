package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceHealthScriptRunOnceSchedule extends DeviceHealthScriptTimeSchedule implements Parsable {
    /** The date the script is scheduled to run. This collection can contain a maximum of 20 elements. */
    private LocalDate _date;
    /**
     * Instantiates a new DeviceHealthScriptRunOnceSchedule and sets the default values.
     * @return a void
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
    @javax.annotation.Nonnull
    public static DeviceHealthScriptRunOnceSchedule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceHealthScriptRunOnceSchedule();
    }
    /**
     * Gets the date property value. The date the script is scheduled to run. This collection can contain a maximum of 20 elements.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getDate() {
        return this._date;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceHealthScriptRunOnceSchedule currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("date", (n) -> { currentObject.setDate(n.getLocalDateValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLocalDateValue("date", this.getDate());
    }
    /**
     * Sets the date property value. The date the script is scheduled to run. This collection can contain a maximum of 20 elements.
     * @param value Value to set for the date property.
     * @return a void
     */
    public void setDate(@javax.annotation.Nullable final LocalDate value) {
        this._date = value;
    }
}

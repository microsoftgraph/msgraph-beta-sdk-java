package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CallActivityStatistics extends ActivityStatistics implements Parsable {
    /**
     * Time spent on calls outside of working hours, which is based on the user's Outlook calendar setting for work hours. The value is represented in ISO 8601 format for durations.
     */
    private Period afterHours;
    /**
     * Instantiates a new callActivityStatistics and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CallActivityStatistics() {
        super();
        this.setOdataType("#microsoft.graph.callActivityStatistics");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a callActivityStatistics
     */
    @javax.annotation.Nonnull
    public static CallActivityStatistics createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallActivityStatistics();
    }
    /**
     * Gets the afterHours property value. Time spent on calls outside of working hours, which is based on the user's Outlook calendar setting for work hours. The value is represented in ISO 8601 format for durations.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getAfterHours() {
        return this.afterHours;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("afterHours", (n) -> { this.setAfterHours(n.getPeriodValue()); });
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
        writer.writePeriodValue("afterHours", this.getAfterHours());
    }
    /**
     * Sets the afterHours property value. Time spent on calls outside of working hours, which is based on the user's Outlook calendar setting for work hours. The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the afterHours property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAfterHours(@javax.annotation.Nullable final Period value) {
        this.afterHours = value;
    }
}

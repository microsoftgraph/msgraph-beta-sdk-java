package com.microsoft.graph.beta.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CallActivityStatistics extends ActivityStatistics implements Parsable {
    /**
     * Instantiates a new CallActivityStatistics and sets the default values.
     */
    public CallActivityStatistics() {
        super();
        this.setOdataType("#microsoft.graph.callActivityStatistics");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CallActivityStatistics
     */
    @jakarta.annotation.Nonnull
    public static CallActivityStatistics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CallActivityStatistics();
    }
    /**
     * Gets the afterHours property value. Time spent on calls outside of working hours, which is based on the user's Outlook calendar setting for work hours. The value is represented in ISO 8601 format for durations.
     * @return a PeriodAndDuration
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getAfterHours() {
        return this.backingStore.get("afterHours");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("afterHours", (n) -> { this.setAfterHours(n.getPeriodAndDurationValue()); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writePeriodAndDurationValue("afterHours", this.getAfterHours());
    }
    /**
     * Sets the afterHours property value. Time spent on calls outside of working hours, which is based on the user's Outlook calendar setting for work hours. The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the afterHours property.
     */
    public void setAfterHours(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("afterHours", value);
    }
}

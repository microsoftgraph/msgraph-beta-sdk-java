package com.microsoft.graph.beta.models;

import com.microsoft.kiota.PeriodAndDuration;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EmailActivityStatistics extends ActivityStatistics implements Parsable {
    /**
     * Instantiates a new {@link EmailActivityStatistics} and sets the default values.
     */
    public EmailActivityStatistics() {
        super();
        this.setOdataType("#microsoft.graph.emailActivityStatistics");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EmailActivityStatistics}
     */
    @jakarta.annotation.Nonnull
    public static EmailActivityStatistics createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmailActivityStatistics();
    }
    /**
     * Gets the afterHours property value. Total hours spent on email outside of working hours, which is based on the user&apos;s Outlook calendar setting for work hours. The value is represented in ISO 8601 format for durations.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getAfterHours() {
        return this.backingStore.get("afterHours");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("afterHours", (n) -> { this.setAfterHours(n.getPeriodAndDurationValue()); });
        deserializerMap.put("readEmail", (n) -> { this.setReadEmail(n.getPeriodAndDurationValue()); });
        deserializerMap.put("sentEmail", (n) -> { this.setSentEmail(n.getPeriodAndDurationValue()); });
        return deserializerMap;
    }
    /**
     * Gets the readEmail property value. Total hours spent reading email. The value is represented in ISO 8601 format for durations.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getReadEmail() {
        return this.backingStore.get("readEmail");
    }
    /**
     * Gets the sentEmail property value. Total hours spent writing and sending email. The value is represented in ISO 8601 format for durations.
     * @return a {@link PeriodAndDuration}
     */
    @jakarta.annotation.Nullable
    public PeriodAndDuration getSentEmail() {
        return this.backingStore.get("sentEmail");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writePeriodAndDurationValue("afterHours", this.getAfterHours());
        writer.writePeriodAndDurationValue("readEmail", this.getReadEmail());
        writer.writePeriodAndDurationValue("sentEmail", this.getSentEmail());
    }
    /**
     * Sets the afterHours property value. Total hours spent on email outside of working hours, which is based on the user&apos;s Outlook calendar setting for work hours. The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the afterHours property.
     */
    public void setAfterHours(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("afterHours", value);
    }
    /**
     * Sets the readEmail property value. Total hours spent reading email. The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the readEmail property.
     */
    public void setReadEmail(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("readEmail", value);
    }
    /**
     * Sets the sentEmail property value. Total hours spent writing and sending email. The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the sentEmail property.
     */
    public void setSentEmail(@jakarta.annotation.Nullable final PeriodAndDuration value) {
        this.backingStore.set("sentEmail", value);
    }
}

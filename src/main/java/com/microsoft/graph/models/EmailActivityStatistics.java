package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.Period;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EmailActivityStatistics extends ActivityStatistics implements Parsable {
    /** Total hours spent on email outside of working hours, which is based on the user's Outlook calendar setting for work hours. The value is represented in ISO 8601 format for durations. */
    private Period _afterHours;
    /** Total hours spent reading email. The value is represented in ISO 8601 format for durations. */
    private Period _readEmail;
    /** Total hours spent writing and sending email. The value is represented in ISO 8601 format for durations. */
    private Period _sentEmail;
    /**
     * Instantiates a new EmailActivityStatistics and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EmailActivityStatistics() {
        super();
        this.setOdataType("#microsoft.graph.emailActivityStatistics");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EmailActivityStatistics
     */
    @javax.annotation.Nonnull
    public static EmailActivityStatistics createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EmailActivityStatistics();
    }
    /**
     * Gets the afterHours property value. Total hours spent on email outside of working hours, which is based on the user's Outlook calendar setting for work hours. The value is represented in ISO 8601 format for durations.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getAfterHours() {
        return this._afterHours;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("afterHours", (n) -> { this.setAfterHours(n.getPeriodValue()); });
        deserializerMap.put("readEmail", (n) -> { this.setReadEmail(n.getPeriodValue()); });
        deserializerMap.put("sentEmail", (n) -> { this.setSentEmail(n.getPeriodValue()); });
        return deserializerMap;
    }
    /**
     * Gets the readEmail property value. Total hours spent reading email. The value is represented in ISO 8601 format for durations.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getReadEmail() {
        return this._readEmail;
    }
    /**
     * Gets the sentEmail property value. Total hours spent writing and sending email. The value is represented in ISO 8601 format for durations.
     * @return a Period
     */
    @javax.annotation.Nullable
    public Period getSentEmail() {
        return this._sentEmail;
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
        writer.writePeriodValue("readEmail", this.getReadEmail());
        writer.writePeriodValue("sentEmail", this.getSentEmail());
    }
    /**
     * Sets the afterHours property value. Total hours spent on email outside of working hours, which is based on the user's Outlook calendar setting for work hours. The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the afterHours property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAfterHours(@javax.annotation.Nullable final Period value) {
        this._afterHours = value;
    }
    /**
     * Sets the readEmail property value. Total hours spent reading email. The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the readEmail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReadEmail(@javax.annotation.Nullable final Period value) {
        this._readEmail = value;
    }
    /**
     * Sets the sentEmail property value. Total hours spent writing and sending email. The value is represented in ISO 8601 format for durations.
     * @param value Value to set for the sentEmail property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSentEmail(@javax.annotation.Nullable final Period value) {
        this._sentEmail = value;
    }
}

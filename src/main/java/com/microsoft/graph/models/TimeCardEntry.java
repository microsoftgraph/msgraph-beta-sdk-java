package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TimeCardEntry implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The list of breaks associated with the timeCard.
     */
    private java.util.List<TimeCardBreak> breaks;
    /**
     * The clock-in event of the timeCard.
     */
    private TimeCardEvent clockInEvent;
    /**
     * The clock-out event of the timeCard.
     */
    private TimeCardEvent clockOutEvent;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * Instantiates a new timeCardEntry and sets the default values.
     */
    public TimeCardEntry() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a timeCardEntry
     */
    @jakarta.annotation.Nonnull
    public static TimeCardEntry createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeCardEntry();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the breaks property value. The list of breaks associated with the timeCard.
     * @return a timeCardBreak
     */
    @jakarta.annotation.Nullable
    public java.util.List<TimeCardBreak> getBreaks() {
        return this.breaks;
    }
    /**
     * Gets the clockInEvent property value. The clock-in event of the timeCard.
     * @return a timeCardEvent
     */
    @jakarta.annotation.Nullable
    public TimeCardEvent getClockInEvent() {
        return this.clockInEvent;
    }
    /**
     * Gets the clockOutEvent property value. The clock-out event of the timeCard.
     * @return a timeCardEvent
     */
    @jakarta.annotation.Nullable
    public TimeCardEvent getClockOutEvent() {
        return this.clockOutEvent;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("breaks", (n) -> { this.setBreaks(n.getCollectionOfObjectValues(TimeCardBreak::createFromDiscriminatorValue)); });
        deserializerMap.put("clockInEvent", (n) -> { this.setClockInEvent(n.getObjectValue(TimeCardEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("clockOutEvent", (n) -> { this.setClockOutEvent(n.getObjectValue(TimeCardEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("breaks", this.getBreaks());
        writer.writeObjectValue("clockInEvent", this.getClockInEvent());
        writer.writeObjectValue("clockOutEvent", this.getClockOutEvent());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the breaks property value. The list of breaks associated with the timeCard.
     * @param value Value to set for the breaks property.
     */
    public void setBreaks(@jakarta.annotation.Nullable final java.util.List<TimeCardBreak> value) {
        this.breaks = value;
    }
    /**
     * Sets the clockInEvent property value. The clock-in event of the timeCard.
     * @param value Value to set for the clockInEvent property.
     */
    public void setClockInEvent(@jakarta.annotation.Nullable final TimeCardEvent value) {
        this.clockInEvent = value;
    }
    /**
     * Sets the clockOutEvent property value. The clock-out event of the timeCard.
     * @param value Value to set for the clockOutEvent property.
     */
    public void setClockOutEvent(@jakarta.annotation.Nullable final TimeCardEvent value) {
        this.clockOutEvent = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
}

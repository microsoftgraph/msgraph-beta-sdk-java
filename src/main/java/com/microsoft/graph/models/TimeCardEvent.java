package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TimeCardEvent implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** Indicates whether the entry was recorded at the approved location. */
    private Boolean atApprovedLocation;
    /** The time the entry is recorded. */
    private OffsetDateTime dateTime;
    /** Notes about the timeCardEvent. */
    private ItemBody notes;
    /** The OdataType property */
    private String odataType;
    /**
     * Instantiates a new timeCardEvent and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TimeCardEvent() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a timeCardEvent
     */
    @javax.annotation.Nonnull
    public static TimeCardEvent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeCardEvent();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the atApprovedLocation property value. Indicates whether the entry was recorded at the approved location.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAtApprovedLocation() {
        return this.atApprovedLocation;
    }
    /**
     * Gets the dateTime property value. The time the entry is recorded.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDateTime() {
        return this.dateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("atApprovedLocation", (n) -> { this.setAtApprovedLocation(n.getBooleanValue()); });
        deserializerMap.put("dateTime", (n) -> { this.setDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the notes property value. Notes about the timeCardEvent.
     * @return a itemBody
     */
    @javax.annotation.Nullable
    public ItemBody getNotes() {
        return this.notes;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeBooleanValue("atApprovedLocation", this.getAtApprovedLocation());
        writer.writeOffsetDateTimeValue("dateTime", this.getDateTime());
        writer.writeObjectValue("notes", this.getNotes());
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
        this.additionalData = value;
    }
    /**
     * Sets the atApprovedLocation property value. Indicates whether the entry was recorded at the approved location.
     * @param value Value to set for the atApprovedLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAtApprovedLocation(@javax.annotation.Nullable final Boolean value) {
        this.atApprovedLocation = value;
    }
    /**
     * Sets the dateTime property value. The time the entry is recorded.
     * @param value Value to set for the dateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.dateTime = value;
    }
    /**
     * Sets the notes property value. Notes about the timeCardEvent.
     * @param value Value to set for the notes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotes(@javax.annotation.Nullable final ItemBody value) {
        this.notes = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TimeCardBreak implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * ID of the timeCardBreak.
     */
    private String breakId;
    /**
     * The start event of the timeCardBreak.
     */
    private TimeCardEvent end;
    /**
     * Notes about the timeCardBreak.
     */
    private ItemBody notes;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The start property
     */
    private TimeCardEvent start;
    /**
     * Instantiates a new TimeCardBreak and sets the default values.
     */
    public TimeCardBreak() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TimeCardBreak
     */
    @jakarta.annotation.Nonnull
    public static TimeCardBreak createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TimeCardBreak();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the breakId property value. ID of the timeCardBreak.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getBreakId() {
        return this.breakId;
    }
    /**
     * Gets the end property value. The start event of the timeCardBreak.
     * @return a TimeCardEvent
     */
    @jakarta.annotation.Nullable
    public TimeCardEvent getEnd() {
        return this.end;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("breakId", (n) -> { this.setBreakId(n.getStringValue()); });
        deserializerMap.put("end", (n) -> { this.setEnd(n.getObjectValue(TimeCardEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("notes", (n) -> { this.setNotes(n.getObjectValue(ItemBody::createFromDiscriminatorValue)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("start", (n) -> { this.setStart(n.getObjectValue(TimeCardEvent::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the notes property value. Notes about the timeCardBreak.
     * @return a ItemBody
     */
    @jakarta.annotation.Nullable
    public ItemBody getNotes() {
        return this.notes;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the start property value. The start property
     * @return a TimeCardEvent
     */
    @jakarta.annotation.Nullable
    public TimeCardEvent getStart() {
        return this.start;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("breakId", this.getBreakId());
        writer.writeObjectValue("end", this.getEnd());
        writer.writeObjectValue("notes", this.getNotes());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeObjectValue("start", this.getStart());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the breakId property value. ID of the timeCardBreak.
     * @param value Value to set for the breakId property.
     */
    public void setBreakId(@jakarta.annotation.Nullable final String value) {
        this.breakId = value;
    }
    /**
     * Sets the end property value. The start event of the timeCardBreak.
     * @param value Value to set for the end property.
     */
    public void setEnd(@jakarta.annotation.Nullable final TimeCardEvent value) {
        this.end = value;
    }
    /**
     * Sets the notes property value. Notes about the timeCardBreak.
     * @param value Value to set for the notes property.
     */
    public void setNotes(@jakarta.annotation.Nullable final ItemBody value) {
        this.notes = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the start property value. The start property
     * @param value Value to set for the start property.
     */
    public void setStart(@jakarta.annotation.Nullable final TimeCardEvent value) {
        this.start = value;
    }
}

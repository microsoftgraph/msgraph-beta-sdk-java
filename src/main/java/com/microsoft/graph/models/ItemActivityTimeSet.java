package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ItemActivityTimeSet implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The lastRecordedDateTime property
     */
    private OffsetDateTime lastRecordedDateTime;
    /**
     * When the activity was observed to take place.
     */
    private OffsetDateTime observedDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * When the observation was recorded on the service.
     */
    private OffsetDateTime recordedDateTime;
    /**
     * Instantiates a new itemActivityTimeSet and sets the default values.
     */
    public ItemActivityTimeSet() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a itemActivityTimeSet
     */
    @jakarta.annotation.Nonnull
    public static ItemActivityTimeSet createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ItemActivityTimeSet();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(4);
        deserializerMap.put("lastRecordedDateTime", (n) -> { this.setLastRecordedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("observedDateTime", (n) -> { this.setObservedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recordedDateTime", (n) -> { this.setRecordedDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastRecordedDateTime property value. The lastRecordedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastRecordedDateTime() {
        return this.lastRecordedDateTime;
    }
    /**
     * Gets the observedDateTime property value. When the activity was observed to take place.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getObservedDateTime() {
        return this.observedDateTime;
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
     * Gets the recordedDateTime property value. When the observation was recorded on the service.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRecordedDateTime() {
        return this.recordedDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeOffsetDateTimeValue("lastRecordedDateTime", this.getLastRecordedDateTime());
        writer.writeOffsetDateTimeValue("observedDateTime", this.getObservedDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeOffsetDateTimeValue("recordedDateTime", this.getRecordedDateTime());
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
     * Sets the lastRecordedDateTime property value. The lastRecordedDateTime property
     * @param value Value to set for the lastRecordedDateTime property.
     */
    public void setLastRecordedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastRecordedDateTime = value;
    }
    /**
     * Sets the observedDateTime property value. When the activity was observed to take place.
     * @param value Value to set for the observedDateTime property.
     */
    public void setObservedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.observedDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the recordedDateTime property value. When the observation was recorded on the service.
     * @param value Value to set for the recordedDateTime property.
     */
    public void setRecordedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.recordedDateTime = value;
    }
}

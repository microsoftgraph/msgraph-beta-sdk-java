package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Custom update time window
 */
public class CustomUpdateTimeWindow implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The endDay property */
    private DayOfWeek endDay;
    /** End time of the time window */
    private LocalTime endTime;
    /** The OdataType property */
    private String odataType;
    /** The startDay property */
    private DayOfWeek startDay;
    /** Start time of the time window */
    private LocalTime startTime;
    /**
     * Instantiates a new customUpdateTimeWindow and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CustomUpdateTimeWindow() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a customUpdateTimeWindow
     */
    @javax.annotation.Nonnull
    public static CustomUpdateTimeWindow createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomUpdateTimeWindow();
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
     * Gets the endDay property value. The endDay property
     * @return a dayOfWeek
     */
    @javax.annotation.Nullable
    public DayOfWeek getEndDay() {
        return this.endDay;
    }
    /**
     * Gets the endTime property value. End time of the time window
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getEndTime() {
        return this.endTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("endDay", (n) -> { this.setEndDay(n.getEnumValue(DayOfWeek.class)); });
        deserializerMap.put("endTime", (n) -> { this.setEndTime(n.getLocalTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("startDay", (n) -> { this.setStartDay(n.getEnumValue(DayOfWeek.class)); });
        deserializerMap.put("startTime", (n) -> { this.setStartTime(n.getLocalTimeValue()); });
        return deserializerMap;
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
     * Gets the startDay property value. The startDay property
     * @return a dayOfWeek
     */
    @javax.annotation.Nullable
    public DayOfWeek getStartDay() {
        return this.startDay;
    }
    /**
     * Gets the startTime property value. Start time of the time window
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getStartTime() {
        return this.startTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeEnumValue("endDay", this.getEndDay());
        writer.writeLocalTimeValue("endTime", this.getEndTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("startDay", this.getStartDay());
        writer.writeLocalTimeValue("startTime", this.getStartTime());
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
     * Sets the endDay property value. The endDay property
     * @param value Value to set for the endDay property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDay(@javax.annotation.Nullable final DayOfWeek value) {
        this.endDay = value;
    }
    /**
     * Sets the endTime property value. End time of the time window
     * @param value Value to set for the endTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndTime(@javax.annotation.Nullable final LocalTime value) {
        this.endTime = value;
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
    /**
     * Sets the startDay property value. The startDay property
     * @param value Value to set for the startDay property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDay(@javax.annotation.Nullable final DayOfWeek value) {
        this.startDay = value;
    }
    /**
     * Sets the startTime property value. Start time of the time window
     * @param value Value to set for the startTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartTime(@javax.annotation.Nullable final LocalTime value) {
        this.startTime = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewRecurrenceSettings implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The duration in days for recurrence.
     */
    private Integer durationInDays;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The count of recurrences, if the value of recurrenceEndType is occurrences, or 0 otherwise.
     */
    private Integer recurrenceCount;
    /**
     * How the recurrence ends. Possible values: never, endBy, occurrences, or recurrenceCount. If it is never, then there is no explicit end of the recurrence series. If it is endBy, then the recurrence ends at a certain date. If it is occurrences, then the series ends after recurrenceCount instances of the review have completed.
     */
    private String recurrenceEndType;
    /**
     * The recurrence interval. Possible vaules: onetime, weekly, monthly, quarterly, halfyearly or annual.
     */
    private String recurrenceType;
    /**
     * Instantiates a new accessReviewRecurrenceSettings and sets the default values.
     */
    public AccessReviewRecurrenceSettings() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewRecurrenceSettings
     */
    @jakarta.annotation.Nonnull
    public static AccessReviewRecurrenceSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewRecurrenceSettings();
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
     * Gets the durationInDays property value. The duration in days for recurrence.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getDurationInDays() {
        return this.durationInDays;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(5);
        deserializerMap.put("durationInDays", (n) -> { this.setDurationInDays(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recurrenceCount", (n) -> { this.setRecurrenceCount(n.getIntegerValue()); });
        deserializerMap.put("recurrenceEndType", (n) -> { this.setRecurrenceEndType(n.getStringValue()); });
        deserializerMap.put("recurrenceType", (n) -> { this.setRecurrenceType(n.getStringValue()); });
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
     * Gets the recurrenceCount property value. The count of recurrences, if the value of recurrenceEndType is occurrences, or 0 otherwise.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getRecurrenceCount() {
        return this.recurrenceCount;
    }
    /**
     * Gets the recurrenceEndType property value. How the recurrence ends. Possible values: never, endBy, occurrences, or recurrenceCount. If it is never, then there is no explicit end of the recurrence series. If it is endBy, then the recurrence ends at a certain date. If it is occurrences, then the series ends after recurrenceCount instances of the review have completed.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRecurrenceEndType() {
        return this.recurrenceEndType;
    }
    /**
     * Gets the recurrenceType property value. The recurrence interval. Possible vaules: onetime, weekly, monthly, quarterly, halfyearly or annual.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRecurrenceType() {
        return this.recurrenceType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("durationInDays", this.getDurationInDays());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("recurrenceCount", this.getRecurrenceCount());
        writer.writeStringValue("recurrenceEndType", this.getRecurrenceEndType());
        writer.writeStringValue("recurrenceType", this.getRecurrenceType());
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
     * Sets the durationInDays property value. The duration in days for recurrence.
     * @param value Value to set for the durationInDays property.
     */
    public void setDurationInDays(@jakarta.annotation.Nullable final Integer value) {
        this.durationInDays = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the recurrenceCount property value. The count of recurrences, if the value of recurrenceEndType is occurrences, or 0 otherwise.
     * @param value Value to set for the recurrenceCount property.
     */
    public void setRecurrenceCount(@jakarta.annotation.Nullable final Integer value) {
        this.recurrenceCount = value;
    }
    /**
     * Sets the recurrenceEndType property value. How the recurrence ends. Possible values: never, endBy, occurrences, or recurrenceCount. If it is never, then there is no explicit end of the recurrence series. If it is endBy, then the recurrence ends at a certain date. If it is occurrences, then the series ends after recurrenceCount instances of the review have completed.
     * @param value Value to set for the recurrenceEndType property.
     */
    public void setRecurrenceEndType(@jakarta.annotation.Nullable final String value) {
        this.recurrenceEndType = value;
    }
    /**
     * Sets the recurrenceType property value. The recurrence interval. Possible vaules: onetime, weekly, monthly, quarterly, halfyearly or annual.
     * @param value Value to set for the recurrenceType property.
     */
    public void setRecurrenceType(@jakarta.annotation.Nullable final String value) {
        this.recurrenceType = value;
    }
}

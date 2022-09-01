package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class AccessReviewRecurrenceSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The duration in days for recurrence. */
    private Integer _durationInDays;
    /** The OdataType property */
    private String _odataType;
    /** The count of recurrences, if the value of recurrenceEndType is occurrences, or 0 otherwise. */
    private Integer _recurrenceCount;
    /** How the recurrence ends. Possible values: never, endBy, occurrences, or recurrenceCount. If it is never, then there is no explicit end of the recurrence series. If it is endBy, then the recurrence ends at a certain date. If it is occurrences, then the series ends after recurrenceCount instances of the review have completed. */
    private String _recurrenceEndType;
    /** The recurrence interval. Possible vaules: onetime, weekly, monthly, quarterly, halfyearly or annual. */
    private String _recurrenceType;
    /**
     * Instantiates a new accessReviewRecurrenceSettings and sets the default values.
     * @return a void
     */
    public AccessReviewRecurrenceSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.accessReviewRecurrenceSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a accessReviewRecurrenceSettings
     */
    @javax.annotation.Nonnull
    public static AccessReviewRecurrenceSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AccessReviewRecurrenceSettings();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the durationInDays property value. The duration in days for recurrence.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDurationInDays() {
        return this._durationInDays;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AccessReviewRecurrenceSettings currentObject = this;
        return new HashMap<>(5) {{
            this.put("durationInDays", (n) -> { currentObject.setDurationInDays(n.getIntegerValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("recurrenceCount", (n) -> { currentObject.setRecurrenceCount(n.getIntegerValue()); });
            this.put("recurrenceEndType", (n) -> { currentObject.setRecurrenceEndType(n.getStringValue()); });
            this.put("recurrenceType", (n) -> { currentObject.setRecurrenceType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the recurrenceCount property value. The count of recurrences, if the value of recurrenceEndType is occurrences, or 0 otherwise.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRecurrenceCount() {
        return this._recurrenceCount;
    }
    /**
     * Gets the recurrenceEndType property value. How the recurrence ends. Possible values: never, endBy, occurrences, or recurrenceCount. If it is never, then there is no explicit end of the recurrence series. If it is endBy, then the recurrence ends at a certain date. If it is occurrences, then the series ends after recurrenceCount instances of the review have completed.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecurrenceEndType() {
        return this._recurrenceEndType;
    }
    /**
     * Gets the recurrenceType property value. The recurrence interval. Possible vaules: onetime, weekly, monthly, quarterly, halfyearly or annual.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecurrenceType() {
        return this._recurrenceType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the durationInDays property value. The duration in days for recurrence.
     * @param value Value to set for the durationInDays property.
     * @return a void
     */
    public void setDurationInDays(@javax.annotation.Nullable final Integer value) {
        this._durationInDays = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the recurrenceCount property value. The count of recurrences, if the value of recurrenceEndType is occurrences, or 0 otherwise.
     * @param value Value to set for the recurrenceCount property.
     * @return a void
     */
    public void setRecurrenceCount(@javax.annotation.Nullable final Integer value) {
        this._recurrenceCount = value;
    }
    /**
     * Sets the recurrenceEndType property value. How the recurrence ends. Possible values: never, endBy, occurrences, or recurrenceCount. If it is never, then there is no explicit end of the recurrence series. If it is endBy, then the recurrence ends at a certain date. If it is occurrences, then the series ends after recurrenceCount instances of the review have completed.
     * @param value Value to set for the recurrenceEndType property.
     * @return a void
     */
    public void setRecurrenceEndType(@javax.annotation.Nullable final String value) {
        this._recurrenceEndType = value;
    }
    /**
     * Sets the recurrenceType property value. The recurrence interval. Possible vaules: onetime, weekly, monthly, quarterly, halfyearly or annual.
     * @param value Value to set for the recurrenceType property.
     * @return a void
     */
    public void setRecurrenceType(@javax.annotation.Nullable final String value) {
        this._recurrenceType = value;
    }
}

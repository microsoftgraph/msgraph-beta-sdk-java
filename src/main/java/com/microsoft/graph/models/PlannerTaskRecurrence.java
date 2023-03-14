package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlannerTaskRecurrence implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> additionalData;
    /** The nextInSeriesTaskId property */
    private String nextInSeriesTaskId;
    /** The occurrenceId property */
    private Integer occurrenceId;
    /** The OdataType property */
    private String odataType;
    /** The previousInSeriesTaskId property */
    private String previousInSeriesTaskId;
    /** The recurrenceStartDateTime property */
    private OffsetDateTime recurrenceStartDateTime;
    /** The schedule property */
    private PlannerRecurrenceSchedule schedule;
    /** The seriesId property */
    private String seriesId;
    /**
     * Instantiates a new plannerTaskRecurrence and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public PlannerTaskRecurrence() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a plannerTaskRecurrence
     */
    @javax.annotation.Nonnull
    public static PlannerTaskRecurrence createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTaskRecurrence();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("nextInSeriesTaskId", (n) -> { this.setNextInSeriesTaskId(n.getStringValue()); });
        deserializerMap.put("occurrenceId", (n) -> { this.setOccurrenceId(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("previousInSeriesTaskId", (n) -> { this.setPreviousInSeriesTaskId(n.getStringValue()); });
        deserializerMap.put("recurrenceStartDateTime", (n) -> { this.setRecurrenceStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("schedule", (n) -> { this.setSchedule(n.getObjectValue(PlannerRecurrenceSchedule::createFromDiscriminatorValue)); });
        deserializerMap.put("seriesId", (n) -> { this.setSeriesId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nextInSeriesTaskId property value. The nextInSeriesTaskId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getNextInSeriesTaskId() {
        return this.nextInSeriesTaskId;
    }
    /**
     * Gets the occurrenceId property value. The occurrenceId property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getOccurrenceId() {
        return this.occurrenceId;
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
     * Gets the previousInSeriesTaskId property value. The previousInSeriesTaskId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreviousInSeriesTaskId() {
        return this.previousInSeriesTaskId;
    }
    /**
     * Gets the recurrenceStartDateTime property value. The recurrenceStartDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRecurrenceStartDateTime() {
        return this.recurrenceStartDateTime;
    }
    /**
     * Gets the schedule property value. The schedule property
     * @return a plannerRecurrenceSchedule
     */
    @javax.annotation.Nullable
    public PlannerRecurrenceSchedule getSchedule() {
        return this.schedule;
    }
    /**
     * Gets the seriesId property value. The seriesId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSeriesId() {
        return this.seriesId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("nextInSeriesTaskId", this.getNextInSeriesTaskId());
        writer.writeIntegerValue("occurrenceId", this.getOccurrenceId());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("previousInSeriesTaskId", this.getPreviousInSeriesTaskId());
        writer.writeOffsetDateTimeValue("recurrenceStartDateTime", this.getRecurrenceStartDateTime());
        writer.writeObjectValue("schedule", this.getSchedule());
        writer.writeStringValue("seriesId", this.getSeriesId());
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
     * Sets the nextInSeriesTaskId property value. The nextInSeriesTaskId property
     * @param value Value to set for the nextInSeriesTaskId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNextInSeriesTaskId(@javax.annotation.Nullable final String value) {
        this.nextInSeriesTaskId = value;
    }
    /**
     * Sets the occurrenceId property value. The occurrenceId property
     * @param value Value to set for the occurrenceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOccurrenceId(@javax.annotation.Nullable final Integer value) {
        this.occurrenceId = value;
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
     * Sets the previousInSeriesTaskId property value. The previousInSeriesTaskId property
     * @param value Value to set for the previousInSeriesTaskId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreviousInSeriesTaskId(@javax.annotation.Nullable final String value) {
        this.previousInSeriesTaskId = value;
    }
    /**
     * Sets the recurrenceStartDateTime property value. The recurrenceStartDateTime property
     * @param value Value to set for the recurrenceStartDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecurrenceStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.recurrenceStartDateTime = value;
    }
    /**
     * Sets the schedule property value. The schedule property
     * @param value Value to set for the schedule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSchedule(@javax.annotation.Nullable final PlannerRecurrenceSchedule value) {
        this.schedule = value;
    }
    /**
     * Sets the seriesId property value. The seriesId property
     * @param value Value to set for the seriesId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeriesId(@javax.annotation.Nullable final String value) {
        this.seriesId = value;
    }
}

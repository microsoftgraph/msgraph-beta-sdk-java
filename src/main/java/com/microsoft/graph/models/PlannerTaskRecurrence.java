package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import com.microsoft.kiota.store.BackedModel;
import com.microsoft.kiota.store.BackingStore;
import com.microsoft.kiota.store.BackingStoreFactorySingleton;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlannerTaskRecurrence implements AdditionalDataHolder, BackedModel, Parsable {
    /**
     * Stores model information.
     */
    @jakarta.annotation.Nonnull
    public BackingStore backingStore;
    /**
     * Instantiates a new PlannerTaskRecurrence and sets the default values.
     */
    public PlannerTaskRecurrence() {
        this.backingStore = BackingStoreFactorySingleton.instance.createBackingStore();
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlannerTaskRecurrence
     */
    @jakarta.annotation.Nonnull
    public static PlannerTaskRecurrence createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlannerTaskRecurrence();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        Map<String, Object> value = this.backingStore.get("additionalData");
        if(value == null) {
            value = new HashMap<>();
            this.setAdditionalData(value);
        }
        return value;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
     * Gets the nextInSeriesTaskId property value. The taskId of the next task in this series. This value is assigned at the time the next task in the series is created, and is null prior to that time.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getNextInSeriesTaskId() {
        return this.backingStore.get("nextInSeriesTaskId");
    }
    /**
     * Gets the occurrenceId property value. The 1-based index of this task within the recurrence series. The first task in a series has the value 1, the next task in the series has the value 2, and so on.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getOccurrenceId() {
        return this.backingStore.get("occurrenceId");
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.backingStore.get("odataType");
    }
    /**
     * Gets the previousInSeriesTaskId property value. The taskId of the previous task in this series. null for the first task in a series since it has no predecessor. All subsequent tasks in the series have a value that corresponds to their predecessors.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPreviousInSeriesTaskId() {
        return this.backingStore.get("previousInSeriesTaskId");
    }
    /**
     * Gets the recurrenceStartDateTime property value. The date and time when this recurrence series begin. For the first task in a series (occurrenceId = 1) this value is copied from schedule.patternStartDateTime. For subsequent tasks in the series (occurrenceId >= 2) this value is copied from the previous task and never changes; it preserves the start date of the recurring series. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRecurrenceStartDateTime() {
        return this.backingStore.get("recurrenceStartDateTime");
    }
    /**
     * Gets the schedule property value. The schedule for recurrence. Clients define and edit recurrence by specifying the schedule. If nextInSeriesTaskId isn't assigned, clients may terminate the series by assigning null to this property.
     * @return a PlannerRecurrenceSchedule
     */
    @jakarta.annotation.Nullable
    public PlannerRecurrenceSchedule getSchedule() {
        return this.backingStore.get("schedule");
    }
    /**
     * Gets the seriesId property value. The recurrence series this task belongs to. A GUID-based value that serves as the unique identifier for a series.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getSeriesId() {
        return this.backingStore.get("seriesId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.backingStore.set("additionalData", value);
    }
    /**
     * Sets the nextInSeriesTaskId property value. The taskId of the next task in this series. This value is assigned at the time the next task in the series is created, and is null prior to that time.
     * @param value Value to set for the nextInSeriesTaskId property.
     */
    public void setNextInSeriesTaskId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("nextInSeriesTaskId", value);
    }
    /**
     * Sets the occurrenceId property value. The 1-based index of this task within the recurrence series. The first task in a series has the value 1, the next task in the series has the value 2, and so on.
     * @param value Value to set for the occurrenceId property.
     */
    public void setOccurrenceId(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("occurrenceId", value);
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("odataType", value);
    }
    /**
     * Sets the previousInSeriesTaskId property value. The taskId of the previous task in this series. null for the first task in a series since it has no predecessor. All subsequent tasks in the series have a value that corresponds to their predecessors.
     * @param value Value to set for the previousInSeriesTaskId property.
     */
    public void setPreviousInSeriesTaskId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("previousInSeriesTaskId", value);
    }
    /**
     * Sets the recurrenceStartDateTime property value. The date and time when this recurrence series begin. For the first task in a series (occurrenceId = 1) this value is copied from schedule.patternStartDateTime. For subsequent tasks in the series (occurrenceId >= 2) this value is copied from the previous task and never changes; it preserves the start date of the recurring series. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the recurrenceStartDateTime property.
     */
    public void setRecurrenceStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("recurrenceStartDateTime", value);
    }
    /**
     * Sets the schedule property value. The schedule for recurrence. Clients define and edit recurrence by specifying the schedule. If nextInSeriesTaskId isn't assigned, clients may terminate the series by assigning null to this property.
     * @param value Value to set for the schedule property.
     */
    public void setSchedule(@jakarta.annotation.Nullable final PlannerRecurrenceSchedule value) {
        this.backingStore.set("schedule", value);
    }
    /**
     * Sets the seriesId property value. The recurrence series this task belongs to. A GUID-based value that serves as the unique identifier for a series.
     * @param value Value to set for the seriesId property.
     */
    public void setSeriesId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("seriesId", value);
    }
}

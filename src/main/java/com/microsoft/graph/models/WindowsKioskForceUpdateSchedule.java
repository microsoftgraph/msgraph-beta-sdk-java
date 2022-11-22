package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Windows 10 force update schedule for Kiosk devices. */
public class WindowsKioskForceUpdateSchedule implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Day of month. Valid values 1 to 31 */
    private Integer _dayofMonth;
    /** The dayofWeek property */
    private DayOfWeek _dayofWeek;
    /** The OdataType property */
    private String _odataType;
    /** Possible values for App update on Windows10 recurrence. */
    private Windows10AppsUpdateRecurrence _recurrence;
    /** If true, runs the task immediately if StartDateTime is in the past, else, runs at the next recurrence. */
    private Boolean _runImmediatelyIfAfterStartDateTime;
    /** The start time for the force restart. */
    private OffsetDateTime _startDateTime;
    /**
     * Instantiates a new windowsKioskForceUpdateSchedule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public WindowsKioskForceUpdateSchedule() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsKioskForceUpdateSchedule
     */
    @javax.annotation.Nonnull
    public static WindowsKioskForceUpdateSchedule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsKioskForceUpdateSchedule();
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
     * Gets the dayofMonth property value. Day of month. Valid values 1 to 31
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDayofMonth() {
        return this._dayofMonth;
    }
    /**
     * Gets the dayofWeek property value. The dayofWeek property
     * @return a dayOfWeek
     */
    @javax.annotation.Nullable
    public DayOfWeek getDayofWeek() {
        return this._dayofWeek;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(6);
        deserializerMap.put("dayofMonth", (n) -> { this.setDayofMonth(n.getIntegerValue()); });
        deserializerMap.put("dayofWeek", (n) -> { this.setDayofWeek(n.getEnumValue(DayOfWeek.class)); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("recurrence", (n) -> { this.setRecurrence(n.getEnumValue(Windows10AppsUpdateRecurrence.class)); });
        deserializerMap.put("runImmediatelyIfAfterStartDateTime", (n) -> { this.setRunImmediatelyIfAfterStartDateTime(n.getBooleanValue()); });
        deserializerMap.put("startDateTime", (n) -> { this.setStartDateTime(n.getOffsetDateTimeValue()); });
        return deserializerMap;
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
     * Gets the recurrence property value. Possible values for App update on Windows10 recurrence.
     * @return a windows10AppsUpdateRecurrence
     */
    @javax.annotation.Nullable
    public Windows10AppsUpdateRecurrence getRecurrence() {
        return this._recurrence;
    }
    /**
     * Gets the runImmediatelyIfAfterStartDateTime property value. If true, runs the task immediately if StartDateTime is in the past, else, runs at the next recurrence.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getRunImmediatelyIfAfterStartDateTime() {
        return this._runImmediatelyIfAfterStartDateTime;
    }
    /**
     * Gets the startDateTime property value. The start time for the force restart.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getStartDateTime() {
        return this._startDateTime;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("dayofMonth", this.getDayofMonth());
        writer.writeEnumValue("dayofWeek", this.getDayofWeek());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("recurrence", this.getRecurrence());
        writer.writeBooleanValue("runImmediatelyIfAfterStartDateTime", this.getRunImmediatelyIfAfterStartDateTime());
        writer.writeOffsetDateTimeValue("startDateTime", this.getStartDateTime());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the dayofMonth property value. Day of month. Valid values 1 to 31
     * @param value Value to set for the dayofMonth property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDayofMonth(@javax.annotation.Nullable final Integer value) {
        this._dayofMonth = value;
    }
    /**
     * Sets the dayofWeek property value. The dayofWeek property
     * @param value Value to set for the dayofWeek property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDayofWeek(@javax.annotation.Nullable final DayOfWeek value) {
        this._dayofWeek = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the recurrence property value. Possible values for App update on Windows10 recurrence.
     * @param value Value to set for the recurrence property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecurrence(@javax.annotation.Nullable final Windows10AppsUpdateRecurrence value) {
        this._recurrence = value;
    }
    /**
     * Sets the runImmediatelyIfAfterStartDateTime property value. If true, runs the task immediately if StartDateTime is in the past, else, runs at the next recurrence.
     * @param value Value to set for the runImmediatelyIfAfterStartDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRunImmediatelyIfAfterStartDateTime(@javax.annotation.Nullable final Boolean value) {
        this._runImmediatelyIfAfterStartDateTime = value;
    }
    /**
     * Sets the startDateTime property value. The start time for the force restart.
     * @param value Value to set for the startDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._startDateTime = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TeamworkDateTimeConfiguration implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The date format for the device. */
    private String _dateFormat;
    /** The OdataType property */
    private String _odataType;
    /** The time of the day when the device is turned off. */
    private LocalTime _officeHoursEndTime;
    /** The time of the day when the device is turned on. */
    private LocalTime _officeHoursStartTime;
    /** The time format for the device. */
    private String _timeFormat;
    /** The time zone to which the office hours apply. */
    private String _timeZone;
    /**
     * Instantiates a new teamworkDateTimeConfiguration and sets the default values.
     * @return a void
     */
    public TeamworkDateTimeConfiguration() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.teamworkDateTimeConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a teamworkDateTimeConfiguration
     */
    @javax.annotation.Nonnull
    public static TeamworkDateTimeConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TeamworkDateTimeConfiguration();
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
     * Gets the dateFormat property value. The date format for the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDateFormat() {
        return this._dateFormat;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final TeamworkDateTimeConfiguration currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(6) {{
            this.put("dateFormat", (n) -> { currentObject.setDateFormat(n.getStringValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("officeHoursEndTime", (n) -> { currentObject.setOfficeHoursEndTime(n.getLocalTimeValue()); });
            this.put("officeHoursStartTime", (n) -> { currentObject.setOfficeHoursStartTime(n.getLocalTimeValue()); });
            this.put("timeFormat", (n) -> { currentObject.setTimeFormat(n.getStringValue()); });
            this.put("timeZone", (n) -> { currentObject.setTimeZone(n.getStringValue()); });
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
     * Gets the officeHoursEndTime property value. The time of the day when the device is turned off.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getOfficeHoursEndTime() {
        return this._officeHoursEndTime;
    }
    /**
     * Gets the officeHoursStartTime property value. The time of the day when the device is turned on.
     * @return a LocalTime
     */
    @javax.annotation.Nullable
    public LocalTime getOfficeHoursStartTime() {
        return this._officeHoursStartTime;
    }
    /**
     * Gets the timeFormat property value. The time format for the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTimeFormat() {
        return this._timeFormat;
    }
    /**
     * Gets the timeZone property value. The time zone to which the office hours apply.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTimeZone() {
        return this._timeZone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("dateFormat", this.getDateFormat());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeLocalTimeValue("officeHoursEndTime", this.getOfficeHoursEndTime());
        writer.writeLocalTimeValue("officeHoursStartTime", this.getOfficeHoursStartTime());
        writer.writeStringValue("timeFormat", this.getTimeFormat());
        writer.writeStringValue("timeZone", this.getTimeZone());
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
     * Sets the dateFormat property value. The date format for the device.
     * @param value Value to set for the dateFormat property.
     * @return a void
     */
    public void setDateFormat(@javax.annotation.Nullable final String value) {
        this._dateFormat = value;
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
     * Sets the officeHoursEndTime property value. The time of the day when the device is turned off.
     * @param value Value to set for the officeHoursEndTime property.
     * @return a void
     */
    public void setOfficeHoursEndTime(@javax.annotation.Nullable final LocalTime value) {
        this._officeHoursEndTime = value;
    }
    /**
     * Sets the officeHoursStartTime property value. The time of the day when the device is turned on.
     * @param value Value to set for the officeHoursStartTime property.
     * @return a void
     */
    public void setOfficeHoursStartTime(@javax.annotation.Nullable final LocalTime value) {
        this._officeHoursStartTime = value;
    }
    /**
     * Sets the timeFormat property value. The time format for the device.
     * @param value Value to set for the timeFormat property.
     * @return a void
     */
    public void setTimeFormat(@javax.annotation.Nullable final String value) {
        this._timeFormat = value;
    }
    /**
     * Sets the timeZone property value. The time zone to which the office hours apply.
     * @param value Value to set for the timeZone property.
     * @return a void
     */
    public void setTimeZone(@javax.annotation.Nullable final String value) {
        this._timeZone = value;
    }
}

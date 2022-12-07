package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RegionalFormatOverrides implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The calendar to use, e.g., Gregorian Calendar.Returned by default. */
    private String _calendar;
    /** The first day of the week to use, e.g., Sunday.Returned by default. */
    private String _firstDayOfWeek;
    /** The long date time format to be used for displaying dates.Returned by default. */
    private String _longDateFormat;
    /** The long time format to be used for displaying time.Returned by default. */
    private String _longTimeFormat;
    /** The OdataType property */
    private String _odataType;
    /** The short date time format to be used for displaying dates.Returned by default. */
    private String _shortDateFormat;
    /** The short time format to be used for displaying time.Returned by default. */
    private String _shortTimeFormat;
    /** The timezone to be used for displaying time.Returned by default. */
    private String _timeZone;
    /**
     * Instantiates a new regionalFormatOverrides and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public RegionalFormatOverrides() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a regionalFormatOverrides
     */
    @javax.annotation.Nonnull
    public static RegionalFormatOverrides createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegionalFormatOverrides();
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
     * Gets the calendar property value. The calendar to use, e.g., Gregorian Calendar.Returned by default.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCalendar() {
        return this._calendar;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(8);
        deserializerMap.put("calendar", (n) -> { this.setCalendar(n.getStringValue()); });
        deserializerMap.put("firstDayOfWeek", (n) -> { this.setFirstDayOfWeek(n.getStringValue()); });
        deserializerMap.put("longDateFormat", (n) -> { this.setLongDateFormat(n.getStringValue()); });
        deserializerMap.put("longTimeFormat", (n) -> { this.setLongTimeFormat(n.getStringValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("shortDateFormat", (n) -> { this.setShortDateFormat(n.getStringValue()); });
        deserializerMap.put("shortTimeFormat", (n) -> { this.setShortTimeFormat(n.getStringValue()); });
        deserializerMap.put("timeZone", (n) -> { this.setTimeZone(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the firstDayOfWeek property value. The first day of the week to use, e.g., Sunday.Returned by default.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getFirstDayOfWeek() {
        return this._firstDayOfWeek;
    }
    /**
     * Gets the longDateFormat property value. The long date time format to be used for displaying dates.Returned by default.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLongDateFormat() {
        return this._longDateFormat;
    }
    /**
     * Gets the longTimeFormat property value. The long time format to be used for displaying time.Returned by default.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getLongTimeFormat() {
        return this._longTimeFormat;
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
     * Gets the shortDateFormat property value. The short date time format to be used for displaying dates.Returned by default.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getShortDateFormat() {
        return this._shortDateFormat;
    }
    /**
     * Gets the shortTimeFormat property value. The short time format to be used for displaying time.Returned by default.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getShortTimeFormat() {
        return this._shortTimeFormat;
    }
    /**
     * Gets the timeZone property value. The timezone to be used for displaying time.Returned by default.
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
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("calendar", this.getCalendar());
        writer.writeStringValue("firstDayOfWeek", this.getFirstDayOfWeek());
        writer.writeStringValue("longDateFormat", this.getLongDateFormat());
        writer.writeStringValue("longTimeFormat", this.getLongTimeFormat());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("shortDateFormat", this.getShortDateFormat());
        writer.writeStringValue("shortTimeFormat", this.getShortTimeFormat());
        writer.writeStringValue("timeZone", this.getTimeZone());
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
     * Sets the calendar property value. The calendar to use, e.g., Gregorian Calendar.Returned by default.
     * @param value Value to set for the calendar property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalendar(@javax.annotation.Nullable final String value) {
        this._calendar = value;
    }
    /**
     * Sets the firstDayOfWeek property value. The first day of the week to use, e.g., Sunday.Returned by default.
     * @param value Value to set for the firstDayOfWeek property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirstDayOfWeek(@javax.annotation.Nullable final String value) {
        this._firstDayOfWeek = value;
    }
    /**
     * Sets the longDateFormat property value. The long date time format to be used for displaying dates.Returned by default.
     * @param value Value to set for the longDateFormat property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLongDateFormat(@javax.annotation.Nullable final String value) {
        this._longDateFormat = value;
    }
    /**
     * Sets the longTimeFormat property value. The long time format to be used for displaying time.Returned by default.
     * @param value Value to set for the longTimeFormat property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLongTimeFormat(@javax.annotation.Nullable final String value) {
        this._longTimeFormat = value;
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
     * Sets the shortDateFormat property value. The short date time format to be used for displaying dates.Returned by default.
     * @param value Value to set for the shortDateFormat property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShortDateFormat(@javax.annotation.Nullable final String value) {
        this._shortDateFormat = value;
    }
    /**
     * Sets the shortTimeFormat property value. The short time format to be used for displaying time.Returned by default.
     * @param value Value to set for the shortTimeFormat property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setShortTimeFormat(@javax.annotation.Nullable final String value) {
        this._shortTimeFormat = value;
    }
    /**
     * Sets the timeZone property value. The timezone to be used for displaying time.Returned by default.
     * @param value Value to set for the timeZone property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTimeZone(@javax.annotation.Nullable final String value) {
        this._timeZone = value;
    }
}

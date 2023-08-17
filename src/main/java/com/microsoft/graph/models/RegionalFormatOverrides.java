package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class RegionalFormatOverrides implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The calendar to use, e.g., Gregorian Calendar.Returned by default.
     */
    private String calendar;
    /**
     * The first day of the week to use, e.g., Sunday.Returned by default.
     */
    private String firstDayOfWeek;
    /**
     * The long date time format to be used for displaying dates.Returned by default.
     */
    private String longDateFormat;
    /**
     * The long time format to be used for displaying time.Returned by default.
     */
    private String longTimeFormat;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The short date time format to be used for displaying dates.Returned by default.
     */
    private String shortDateFormat;
    /**
     * The short time format to be used for displaying time.Returned by default.
     */
    private String shortTimeFormat;
    /**
     * The timezone to be used for displaying time.Returned by default.
     */
    private String timeZone;
    /**
     * Instantiates a new regionalFormatOverrides and sets the default values.
     */
    public RegionalFormatOverrides() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a regionalFormatOverrides
     */
    @jakarta.annotation.Nonnull
    public static RegionalFormatOverrides createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RegionalFormatOverrides();
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
     * Gets the calendar property value. The calendar to use, e.g., Gregorian Calendar.Returned by default.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCalendar() {
        return this.calendar;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
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
    @jakarta.annotation.Nullable
    public String getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }
    /**
     * Gets the longDateFormat property value. The long date time format to be used for displaying dates.Returned by default.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLongDateFormat() {
        return this.longDateFormat;
    }
    /**
     * Gets the longTimeFormat property value. The long time format to be used for displaying time.Returned by default.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getLongTimeFormat() {
        return this.longTimeFormat;
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
     * Gets the shortDateFormat property value. The short date time format to be used for displaying dates.Returned by default.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getShortDateFormat() {
        return this.shortDateFormat;
    }
    /**
     * Gets the shortTimeFormat property value. The short time format to be used for displaying time.Returned by default.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getShortTimeFormat() {
        return this.shortTimeFormat;
    }
    /**
     * Gets the timeZone property value. The timezone to be used for displaying time.Returned by default.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTimeZone() {
        return this.timeZone;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     * @param value Value to set for the additionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the calendar property value. The calendar to use, e.g., Gregorian Calendar.Returned by default.
     * @param value Value to set for the calendar property.
     */
    public void setCalendar(@jakarta.annotation.Nullable final String value) {
        this.calendar = value;
    }
    /**
     * Sets the firstDayOfWeek property value. The first day of the week to use, e.g., Sunday.Returned by default.
     * @param value Value to set for the firstDayOfWeek property.
     */
    public void setFirstDayOfWeek(@jakarta.annotation.Nullable final String value) {
        this.firstDayOfWeek = value;
    }
    /**
     * Sets the longDateFormat property value. The long date time format to be used for displaying dates.Returned by default.
     * @param value Value to set for the longDateFormat property.
     */
    public void setLongDateFormat(@jakarta.annotation.Nullable final String value) {
        this.longDateFormat = value;
    }
    /**
     * Sets the longTimeFormat property value. The long time format to be used for displaying time.Returned by default.
     * @param value Value to set for the longTimeFormat property.
     */
    public void setLongTimeFormat(@jakarta.annotation.Nullable final String value) {
        this.longTimeFormat = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the shortDateFormat property value. The short date time format to be used for displaying dates.Returned by default.
     * @param value Value to set for the shortDateFormat property.
     */
    public void setShortDateFormat(@jakarta.annotation.Nullable final String value) {
        this.shortDateFormat = value;
    }
    /**
     * Sets the shortTimeFormat property value. The short time format to be used for displaying time.Returned by default.
     * @param value Value to set for the shortTimeFormat property.
     */
    public void setShortTimeFormat(@jakarta.annotation.Nullable final String value) {
        this.shortTimeFormat = value;
    }
    /**
     * Sets the timeZone property value. The timezone to be used for displaying time.Returned by default.
     * @param value Value to set for the timeZone property.
     */
    public void setTimeZone(@jakarta.annotation.Nullable final String value) {
        this.timeZone = value;
    }
}

package com.microsoft.graph.models.industrydata;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class YearTimePeriodDefinition extends Entity implements Parsable {
    /** The name of the year. Maximum supported length is 100 characters. */
    private String displayName;
    /** The last day of the year using ISO 8601 format for date. */
    private LocalDate endDate;
    /** The first day of the year using ISO 8601 format for date. */
    private LocalDate startDate;
    /** The year property */
    private YearReferenceValue year;
    /**
     * Instantiates a new yearTimePeriodDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public YearTimePeriodDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a yearTimePeriodDefinition
     */
    @javax.annotation.Nonnull
    public static YearTimePeriodDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new YearTimePeriodDefinition();
    }
    /**
     * Gets the displayName property value. The name of the year. Maximum supported length is 100 characters.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Gets the endDate property value. The last day of the year using ISO 8601 format for date.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getEndDate() {
        return this.endDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("endDate", (n) -> { this.setEndDate(n.getLocalDateValue()); });
        deserializerMap.put("startDate", (n) -> { this.setStartDate(n.getLocalDateValue()); });
        deserializerMap.put("year", (n) -> { this.setYear(n.getObjectValue(YearReferenceValue::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the startDate property value. The first day of the year using ISO 8601 format for date.
     * @return a LocalDate
     */
    @javax.annotation.Nullable
    public LocalDate getStartDate() {
        return this.startDate;
    }
    /**
     * Gets the year property value. The year property
     * @return a yearReferenceValue
     */
    @javax.annotation.Nullable
    public YearReferenceValue getYear() {
        return this.year;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeLocalDateValue("endDate", this.getEndDate());
        writer.writeLocalDateValue("startDate", this.getStartDate());
        writer.writeObjectValue("year", this.getYear());
    }
    /**
     * Sets the displayName property value. The name of the year. Maximum supported length is 100 characters.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the endDate property value. The last day of the year using ISO 8601 format for date.
     * @param value Value to set for the endDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEndDate(@javax.annotation.Nullable final LocalDate value) {
        this.endDate = value;
    }
    /**
     * Sets the startDate property value. The first day of the year using ISO 8601 format for date.
     * @param value Value to set for the startDate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStartDate(@javax.annotation.Nullable final LocalDate value) {
        this.startDate = value;
    }
    /**
     * Sets the year property value. The year property
     * @param value Value to set for the year property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setYear(@javax.annotation.Nullable final YearReferenceValue value) {
        this.year = value;
    }
}

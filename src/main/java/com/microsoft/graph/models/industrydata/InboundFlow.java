package com.microsoft.graph.models.industrydata;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InboundFlow extends IndustryDataActivity implements Parsable {
    /**
     * The dataConnector property
     */
    private IndustryDataConnector dataConnector;
    /**
     * The dataDomain property
     */
    private InboundDomain dataDomain;
    /**
     * The start of the time window when the flow is allowed to run. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime effectiveDateTime;
    /**
     * The end of the time window when the flow is allowed to run. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime expirationDateTime;
    /**
     * The year property
     */
    private YearTimePeriodDefinition year;
    /**
     * Instantiates a new inboundFlow and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public InboundFlow() {
        super();
        this.setOdataType("#microsoft.graph.industryData.inboundFlow");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a inboundFlow
     */
    @javax.annotation.Nonnull
    public static InboundFlow createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.industryData.inboundFileFlow": return new InboundFileFlow();
            }
        }
        return new InboundFlow();
    }
    /**
     * Gets the dataConnector property value. The dataConnector property
     * @return a industryDataConnector
     */
    @javax.annotation.Nullable
    public IndustryDataConnector getDataConnector() {
        return this.dataConnector;
    }
    /**
     * Gets the dataDomain property value. The dataDomain property
     * @return a inboundDomain
     */
    @javax.annotation.Nullable
    public InboundDomain getDataDomain() {
        return this.dataDomain;
    }
    /**
     * Gets the effectiveDateTime property value. The start of the time window when the flow is allowed to run. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getEffectiveDateTime() {
        return this.effectiveDateTime;
    }
    /**
     * Gets the expirationDateTime property value. The end of the time window when the flow is allowed to run. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.expirationDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("dataConnector", (n) -> { this.setDataConnector(n.getObjectValue(IndustryDataConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("dataDomain", (n) -> { this.setDataDomain(n.getEnumValue(InboundDomain.class)); });
        deserializerMap.put("effectiveDateTime", (n) -> { this.setEffectiveDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("year", (n) -> { this.setYear(n.getObjectValue(YearTimePeriodDefinition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the year property value. The year property
     * @return a yearTimePeriodDefinition
     */
    @javax.annotation.Nullable
    public YearTimePeriodDefinition getYear() {
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
        writer.writeObjectValue("dataConnector", this.getDataConnector());
        writer.writeEnumValue("dataDomain", this.getDataDomain());
        writer.writeOffsetDateTimeValue("effectiveDateTime", this.getEffectiveDateTime());
        writer.writeOffsetDateTimeValue("expirationDateTime", this.getExpirationDateTime());
        writer.writeObjectValue("year", this.getYear());
    }
    /**
     * Sets the dataConnector property value. The dataConnector property
     * @param value Value to set for the dataConnector property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataConnector(@javax.annotation.Nullable final IndustryDataConnector value) {
        this.dataConnector = value;
    }
    /**
     * Sets the dataDomain property value. The dataDomain property
     * @param value Value to set for the dataDomain property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDataDomain(@javax.annotation.Nullable final InboundDomain value) {
        this.dataDomain = value;
    }
    /**
     * Sets the effectiveDateTime property value. The start of the time window when the flow is allowed to run. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the effectiveDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEffectiveDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.effectiveDateTime = value;
    }
    /**
     * Sets the expirationDateTime property value. The end of the time window when the flow is allowed to run. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the expirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.expirationDateTime = value;
    }
    /**
     * Sets the year property value. The year property
     * @param value Value to set for the year property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setYear(@javax.annotation.Nullable final YearTimePeriodDefinition value) {
        this.year = value;
    }
}

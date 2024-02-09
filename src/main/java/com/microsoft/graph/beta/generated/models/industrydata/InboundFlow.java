package com.microsoft.graph.beta.models.industrydata;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InboundFlow extends IndustryDataActivity implements Parsable {
    /**
     * Instantiates a new {@link InboundFlow} and sets the default values.
     */
    public InboundFlow() {
        super();
        this.setOdataType("#microsoft.graph.industryData.inboundFlow");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InboundFlow}
     */
    @jakarta.annotation.Nonnull
    public static InboundFlow createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a {@link IndustryDataConnector}
     */
    @jakarta.annotation.Nullable
    public IndustryDataConnector getDataConnector() {
        return this.backingStore.get("dataConnector");
    }
    /**
     * Gets the dataDomain property value. The dataDomain property
     * @return a {@link InboundDomain}
     */
    @jakarta.annotation.Nullable
    public InboundDomain getDataDomain() {
        return this.backingStore.get("dataDomain");
    }
    /**
     * Gets the effectiveDateTime property value. The start of the time window when the flow is allowed to run. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEffectiveDateTime() {
        return this.backingStore.get("effectiveDateTime");
    }
    /**
     * Gets the expirationDateTime property value. The end of the time window when the flow is allowed to run. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getExpirationDateTime() {
        return this.backingStore.get("expirationDateTime");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("dataConnector", (n) -> { this.setDataConnector(n.getObjectValue(IndustryDataConnector::createFromDiscriminatorValue)); });
        deserializerMap.put("dataDomain", (n) -> { this.setDataDomain(n.getEnumValue(InboundDomain::forValue)); });
        deserializerMap.put("effectiveDateTime", (n) -> { this.setEffectiveDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("expirationDateTime", (n) -> { this.setExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("year", (n) -> { this.setYear(n.getObjectValue(YearTimePeriodDefinition::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the year property value. The year property
     * @return a {@link YearTimePeriodDefinition}
     */
    @jakarta.annotation.Nullable
    public YearTimePeriodDefinition getYear() {
        return this.backingStore.get("year");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDataConnector(@jakarta.annotation.Nullable final IndustryDataConnector value) {
        this.backingStore.set("dataConnector", value);
    }
    /**
     * Sets the dataDomain property value. The dataDomain property
     * @param value Value to set for the dataDomain property.
     */
    public void setDataDomain(@jakarta.annotation.Nullable final InboundDomain value) {
        this.backingStore.set("dataDomain", value);
    }
    /**
     * Sets the effectiveDateTime property value. The start of the time window when the flow is allowed to run. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the effectiveDateTime property.
     */
    public void setEffectiveDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("effectiveDateTime", value);
    }
    /**
     * Sets the expirationDateTime property value. The end of the time window when the flow is allowed to run. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the expirationDateTime property.
     */
    public void setExpirationDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("expirationDateTime", value);
    }
    /**
     * Sets the year property value. The year property
     * @param value Value to set for the year property.
     */
    public void setYear(@jakarta.annotation.Nullable final YearTimePeriodDefinition value) {
        this.backingStore.set("year", value);
    }
}

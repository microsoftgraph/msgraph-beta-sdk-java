package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InactiveUsersByApplicationMetricBase extends Entity implements Parsable {
    /**
     * Instantiates a new InactiveUsersByApplicationMetricBase and sets the default values.
     */
    public InactiveUsersByApplicationMetricBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InactiveUsersByApplicationMetricBase
     */
    @jakarta.annotation.Nonnull
    public static InactiveUsersByApplicationMetricBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.dailyInactiveUsersByApplicationMetric": return new DailyInactiveUsersByApplicationMetric();
                case "#microsoft.graph.monthlyInactiveUsersByApplicationMetric": return new MonthlyInactiveUsersByApplicationMetric();
            }
        }
        return new InactiveUsersByApplicationMetricBase();
    }
    /**
     * Gets the appId property value. The appId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.backingStore.get("appId");
    }
    /**
     * Gets the factDate property value. The factDate property
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getFactDate() {
        return this.backingStore.get("factDate");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("factDate", (n) -> { this.setFactDate(n.getLocalDateValue()); });
        deserializerMap.put("inactive30DayCount", (n) -> { this.setInactive30DayCount(n.getLongValue()); });
        deserializerMap.put("inactive60DayCount", (n) -> { this.setInactive60DayCount(n.getLongValue()); });
        deserializerMap.put("inactive90DayCount", (n) -> { this.setInactive90DayCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the inactive30DayCount property value. The inactive30DayCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getInactive30DayCount() {
        return this.backingStore.get("inactive30DayCount");
    }
    /**
     * Gets the inactive60DayCount property value. The inactive60DayCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getInactive60DayCount() {
        return this.backingStore.get("inactive60DayCount");
    }
    /**
     * Gets the inactive90DayCount property value. The inactive90DayCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getInactive90DayCount() {
        return this.backingStore.get("inactive90DayCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeLocalDateValue("factDate", this.getFactDate());
        writer.writeLongValue("inactive30DayCount", this.getInactive30DayCount());
        writer.writeLongValue("inactive60DayCount", this.getInactive60DayCount());
        writer.writeLongValue("inactive90DayCount", this.getInactive90DayCount());
    }
    /**
     * Sets the appId property value. The appId property
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appId", value);
    }
    /**
     * Sets the factDate property value. The factDate property
     * @param value Value to set for the factDate property.
     */
    public void setFactDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("factDate", value);
    }
    /**
     * Sets the inactive30DayCount property value. The inactive30DayCount property
     * @param value Value to set for the inactive30DayCount property.
     */
    public void setInactive30DayCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("inactive30DayCount", value);
    }
    /**
     * Sets the inactive60DayCount property value. The inactive60DayCount property
     * @param value Value to set for the inactive60DayCount property.
     */
    public void setInactive60DayCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("inactive60DayCount", value);
    }
    /**
     * Sets the inactive90DayCount property value. The inactive90DayCount property
     * @param value Value to set for the inactive90DayCount property.
     */
    public void setInactive90DayCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("inactive90DayCount", value);
    }
}

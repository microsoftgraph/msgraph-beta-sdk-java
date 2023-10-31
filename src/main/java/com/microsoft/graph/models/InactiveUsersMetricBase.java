package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InactiveUsersMetricBase extends Entity implements Parsable {
    /**
     * The factDate property
     */
    private LocalDate factDate;
    /**
     * The inactive30DayCount property
     */
    private Long inactive30DayCount;
    /**
     * The inactive60DayCount property
     */
    private Long inactive60DayCount;
    /**
     * The inactive90DayCount property
     */
    private Long inactive90DayCount;
    /**
     * Instantiates a new InactiveUsersMetricBase and sets the default values.
     */
    public InactiveUsersMetricBase() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InactiveUsersMetricBase
     */
    @jakarta.annotation.Nonnull
    public static InactiveUsersMetricBase createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.dailyInactiveUsersMetric": return new DailyInactiveUsersMetric();
                case "#microsoft.graph.monthlyInactiveUsersMetric": return new MonthlyInactiveUsersMetric();
            }
        }
        return new InactiveUsersMetricBase();
    }
    /**
     * Gets the factDate property value. The factDate property
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getFactDate() {
        return this.factDate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
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
        return this.inactive30DayCount;
    }
    /**
     * Gets the inactive60DayCount property value. The inactive60DayCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getInactive60DayCount() {
        return this.inactive60DayCount;
    }
    /**
     * Gets the inactive90DayCount property value. The inactive90DayCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getInactive90DayCount() {
        return this.inactive90DayCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLocalDateValue("factDate", this.getFactDate());
        writer.writeLongValue("inactive30DayCount", this.getInactive30DayCount());
        writer.writeLongValue("inactive60DayCount", this.getInactive60DayCount());
        writer.writeLongValue("inactive90DayCount", this.getInactive90DayCount());
    }
    /**
     * Sets the factDate property value. The factDate property
     * @param value Value to set for the factDate property.
     */
    public void setFactDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.factDate = value;
    }
    /**
     * Sets the inactive30DayCount property value. The inactive30DayCount property
     * @param value Value to set for the inactive30DayCount property.
     */
    public void setInactive30DayCount(@jakarta.annotation.Nullable final Long value) {
        this.inactive30DayCount = value;
    }
    /**
     * Sets the inactive60DayCount property value. The inactive60DayCount property
     * @param value Value to set for the inactive60DayCount property.
     */
    public void setInactive60DayCount(@jakarta.annotation.Nullable final Long value) {
        this.inactive60DayCount = value;
    }
    /**
     * Sets the inactive90DayCount property value. The inactive90DayCount property
     * @param value Value to set for the inactive90DayCount property.
     */
    public void setInactive90DayCount(@jakarta.annotation.Nullable final Long value) {
        this.inactive90DayCount = value;
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A native-source session grouping within a user&apos;s raw usage detail. Activity without a sessionidentifier may be omitted, even when it contributes to the parent total.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CostManagementUserUsageSessionDetail extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CostManagementUserUsageSessionDetail} and sets the default values.
     */
    public CostManagementUserUsageSessionDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CostManagementUserUsageSessionDetail}
     */
    @jakarta.annotation.Nonnull
    public static CostManagementUserUsageSessionDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CostManagementUserUsageSessionDetail();
    }
    /**
     * Gets the consumedQuantity property value. Raw, billable-flagged consumption attributed to this source-returned session grouping withinthe containing user&apos;s detail window. Session rows need not sum to the parent&apos;s consumedQuantity.Read-only.
     * @return a {@link Double}
     */
    @jakarta.annotation.Nullable
    public Double getConsumedQuantity() {
        return this.backingStore.get("consumedQuantity");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("consumedQuantity", (n) -> { this.setConsumedQuantity(n.getDoubleValue()); });
        deserializerMap.put("firstActivityDateTime", (n) -> { this.setFirstActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastActivityDateTime", (n) -> { this.setLastActivityDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("sourceSessionId", (n) -> { this.setSourceSessionId(n.getStringValue()); });
        deserializerMap.put("unit", (n) -> { this.setUnit(n.getEnumValue(CostManagementUnit::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstActivityDateTime property value. Time the earliest activity in this session was recorded, or null when the source did notreport one. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstActivityDateTime() {
        return this.backingStore.get("firstActivityDateTime");
    }
    /**
     * Gets the lastActivityDateTime property value. Time the latest activity in this session was recorded, or null when the source did notreport one. Read-only.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastActivityDateTime() {
        return this.backingStore.get("lastActivityDateTime");
    }
    /**
     * Gets the sourceSessionId property value. The native session identifier on a row returned by the source, preserved verbatim, includingnull if the source returns it. Distinct from this row&apos;s opaque id. A nullable value does notguarantee a returned group for activity without a session identifier; such activity may beabsent from the session breakdown while contributing to the parent total. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSourceSessionId() {
        return this.backingStore.get("sourceSessionId");
    }
    /**
     * Gets the unit property value. Unit in which consumption quantities are expressed. Values are consumption units, not currency.
     * @return a {@link CostManagementUnit}
     */
    @jakarta.annotation.Nullable
    public CostManagementUnit getUnit() {
        return this.backingStore.get("unit");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("unit", this.getUnit());
    }
    /**
     * Sets the consumedQuantity property value. Raw, billable-flagged consumption attributed to this source-returned session grouping withinthe containing user&apos;s detail window. Session rows need not sum to the parent&apos;s consumedQuantity.Read-only.
     * @param value Value to set for the consumedQuantity property.
     */
    public void setConsumedQuantity(@jakarta.annotation.Nullable final Double value) {
        this.backingStore.set("consumedQuantity", value);
    }
    /**
     * Sets the firstActivityDateTime property value. Time the earliest activity in this session was recorded, or null when the source did notreport one. Read-only.
     * @param value Value to set for the firstActivityDateTime property.
     */
    public void setFirstActivityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("firstActivityDateTime", value);
    }
    /**
     * Sets the lastActivityDateTime property value. Time the latest activity in this session was recorded, or null when the source did notreport one. Read-only.
     * @param value Value to set for the lastActivityDateTime property.
     */
    public void setLastActivityDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastActivityDateTime", value);
    }
    /**
     * Sets the sourceSessionId property value. The native session identifier on a row returned by the source, preserved verbatim, includingnull if the source returns it. Distinct from this row&apos;s opaque id. A nullable value does notguarantee a returned group for activity without a session identifier; such activity may beabsent from the session breakdown while contributing to the parent total. Read-only.
     * @param value Value to set for the sourceSessionId property.
     */
    public void setSourceSessionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("sourceSessionId", value);
    }
    /**
     * Sets the unit property value. Unit in which consumption quantities are expressed. Values are consumption units, not currency.
     * @param value Value to set for the unit property.
     */
    public void setUnit(@jakarta.annotation.Nullable final CostManagementUnit value) {
        this.backingStore.set("unit", value);
    }
}

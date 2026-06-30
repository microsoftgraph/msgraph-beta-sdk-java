package com.microsoft.graph.beta.reports.serviceactivity.getusagemetricsforteamsbylaunchwithinclusiveintervalsta_1f012dec;

import com.microsoft.graph.beta.models.BaseCollectionPaginationCountResponse;
import com.microsoft.graph.beta.models.ServiceActivityValueMetric;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Original name: GetUsageMetricsForTeamsByLaunchWithInclusiveIntervalStartDateTimeWithExclusiveIntervalEndDateTimeWithAggregationIntervalInMinutesGetResponse
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class GetUsageMetricsForTeamsByLaunchWithInclusiveIntervalSta_86934c7d extends BaseCollectionPaginationCountResponse implements Parsable {
    /**
     * Instantiates a new {@link GetUsageMetricsForTeamsByLaunchWithInclusiveIntervalSta_86934c7d} and sets the default values.
     */
    public GetUsageMetricsForTeamsByLaunchWithInclusiveIntervalSta_86934c7d() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link GetUsageMetricsForTeamsByLaunchWithInclusiveIntervalSta_86934c7d}
     */
    @jakarta.annotation.Nonnull
    public static GetUsageMetricsForTeamsByLaunchWithInclusiveIntervalSta_86934c7d createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new GetUsageMetricsForTeamsByLaunchWithInclusiveIntervalSta_86934c7d();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("value", (n) -> { this.setValue(n.getCollectionOfObjectValues(ServiceActivityValueMetric::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the value property value. The value property
     * @return a {@link java.util.List<ServiceActivityValueMetric>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ServiceActivityValueMetric> getValue() {
        return this.backingStore.get("value");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("value", this.getValue());
    }
    /**
     * Sets the value property value. The value property
     * @param value Value to set for the value property.
     */
    public void setValue(@jakarta.annotation.Nullable final java.util.List<ServiceActivityValueMetric> value) {
        this.backingStore.set("value", value);
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserInsightsRoot extends Entity implements Parsable {
    /**
     * The daily property
     */
    private DailyUserInsightMetricsRoot daily;
    /**
     * The monthly property
     */
    private MonthlyUserInsightMetricsRoot monthly;
    /**
     * Instantiates a new UserInsightsRoot and sets the default values.
     */
    public UserInsightsRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserInsightsRoot
     */
    @jakarta.annotation.Nonnull
    public static UserInsightsRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserInsightsRoot();
    }
    /**
     * Gets the daily property value. The daily property
     * @return a DailyUserInsightMetricsRoot
     */
    @jakarta.annotation.Nullable
    public DailyUserInsightMetricsRoot getDaily() {
        return this.daily;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("daily", (n) -> { this.setDaily(n.getObjectValue(DailyUserInsightMetricsRoot::createFromDiscriminatorValue)); });
        deserializerMap.put("monthly", (n) -> { this.setMonthly(n.getObjectValue(MonthlyUserInsightMetricsRoot::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the monthly property value. The monthly property
     * @return a MonthlyUserInsightMetricsRoot
     */
    @jakarta.annotation.Nullable
    public MonthlyUserInsightMetricsRoot getMonthly() {
        return this.monthly;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("daily", this.getDaily());
        writer.writeObjectValue("monthly", this.getMonthly());
    }
    /**
     * Sets the daily property value. The daily property
     * @param value Value to set for the daily property.
     */
    public void setDaily(@jakarta.annotation.Nullable final DailyUserInsightMetricsRoot value) {
        this.daily = value;
    }
    /**
     * Sets the monthly property value. The monthly property
     * @param value Value to set for the monthly property.
     */
    public void setMonthly(@jakarta.annotation.Nullable final MonthlyUserInsightMetricsRoot value) {
        this.monthly = value;
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserRequestsMetric extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserRequestsMetric} and sets the default values.
     */
    public UserRequestsMetric() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserRequestsMetric}
     */
    @jakarta.annotation.Nonnull
    public static UserRequestsMetric createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserRequestsMetric();
    }
    /**
     * Gets the factDate property value. The date of the user insight.
     * @return a {@link LocalDate}
     */
    @jakarta.annotation.Nullable
    public LocalDate getFactDate() {
        return this.backingStore.get("factDate");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("factDate", (n) -> { this.setFactDate(n.getLocalDateValue()); });
        deserializerMap.put("requestCount", (n) -> { this.setRequestCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the requestCount property value. Number of requests to the tenant. Supports $filter (eq).
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getRequestCount() {
        return this.backingStore.get("requestCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLocalDateValue("factDate", this.getFactDate());
        writer.writeLongValue("requestCount", this.getRequestCount());
    }
    /**
     * Sets the factDate property value. The date of the user insight.
     * @param value Value to set for the factDate property.
     */
    public void setFactDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("factDate", value);
    }
    /**
     * Sets the requestCount property value. Number of requests to the tenant. Supports $filter (eq).
     * @param value Value to set for the requestCount property.
     */
    public void setRequestCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("requestCount", value);
    }
}

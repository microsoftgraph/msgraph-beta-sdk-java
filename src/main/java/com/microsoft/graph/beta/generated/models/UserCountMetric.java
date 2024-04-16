package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserCountMetric extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserCountMetric} and sets the default values.
     */
    public UserCountMetric() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserCountMetric}
     */
    @jakarta.annotation.Nonnull
    public static UserCountMetric createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserCountMetric();
    }
    /**
     * Gets the count property value. The total number of users in the tenant over time.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCount() {
        return this.backingStore.get("count");
    }
    /**
     * Gets the factDate property value. The date of the insight.
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
        deserializerMap.put("count", (n) -> { this.setCount(n.getLongValue()); });
        deserializerMap.put("factDate", (n) -> { this.setFactDate(n.getLocalDateValue()); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the language property value. The language property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getLanguage() {
        return this.backingStore.get("language");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("count", this.getCount());
        writer.writeLocalDateValue("factDate", this.getFactDate());
        writer.writeStringValue("language", this.getLanguage());
    }
    /**
     * Sets the count property value. The total number of users in the tenant over time.
     * @param value Value to set for the count property.
     */
    public void setCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("count", value);
    }
    /**
     * Sets the factDate property value. The date of the insight.
     * @param value Value to set for the factDate property.
     */
    public void setFactDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("factDate", value);
    }
    /**
     * Sets the language property value. The language property
     * @param value Value to set for the language property.
     */
    public void setLanguage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("language", value);
    }
}

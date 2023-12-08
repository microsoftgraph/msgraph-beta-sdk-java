package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserSignUpMetric extends Entity implements Parsable {
    /**
     * Instantiates a new UserSignUpMetric and sets the default values.
     */
    public UserSignUpMetric() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UserSignUpMetric
     */
    @jakarta.annotation.Nonnull
    public static UserSignUpMetric createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserSignUpMetric();
    }
    /**
     * Gets the count property value. The total number of users who signed up in the specified period. Supports $filter (eq).
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getCount() {
        return this.backingStore.get("count");
    }
    /**
     * Gets the factDate property value. The date of the user insight.
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
        deserializerMap.put("count", (n) -> { this.setCount(n.getLongValue()); });
        deserializerMap.put("factDate", (n) -> { this.setFactDate(n.getLocalDateValue()); });
        deserializerMap.put("os", (n) -> { this.setOs(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the os property value. The device plaform that the customers used. Supports $filter (eq).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOs() {
        return this.backingStore.get("os");
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
        writer.writeStringValue("os", this.getOs());
    }
    /**
     * Sets the count property value. The total number of users who signed up in the specified period. Supports $filter (eq).
     * @param value Value to set for the count property.
     */
    public void setCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("count", value);
    }
    /**
     * Sets the factDate property value. The date of the user insight.
     * @param value Value to set for the factDate property.
     */
    public void setFactDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("factDate", value);
    }
    /**
     * Sets the os property value. The device plaform that the customers used. Supports $filter (eq).
     * @param value Value to set for the os property.
     */
    public void setOs(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("os", value);
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AuthenticationsMetric extends Entity implements Parsable {
    /**
     * Instantiates a new {@link AuthenticationsMetric} and sets the default values.
     */
    public AuthenticationsMetric() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link AuthenticationsMetric}
     */
    @jakarta.annotation.Nonnull
    public static AuthenticationsMetric createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AuthenticationsMetric();
    }
    /**
     * Gets the appid property value. The ID of the Microsoft Entra application. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppid() {
        return this.backingStore.get("appid");
    }
    /**
     * Gets the attemptsCount property value. The number of authentication requests made in the specified period. Supports $filter (eq).
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getAttemptsCount() {
        return this.backingStore.get("attemptsCount");
    }
    /**
     * Gets the country property value. The location where the customers authenticated from. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCountry() {
        return this.backingStore.get("country");
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
        deserializerMap.put("appid", (n) -> { this.setAppid(n.getStringValue()); });
        deserializerMap.put("attemptsCount", (n) -> { this.setAttemptsCount(n.getLongValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("factDate", (n) -> { this.setFactDate(n.getLocalDateValue()); });
        deserializerMap.put("os", (n) -> { this.setOs(n.getStringValue()); });
        deserializerMap.put("successCount", (n) -> { this.setSuccessCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the os property value. The platform for the device that the customers used. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOs() {
        return this.backingStore.get("os");
    }
    /**
     * Gets the successCount property value. Number of successful authentication requests. Supports $filter (eq).
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getSuccessCount() {
        return this.backingStore.get("successCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appid", this.getAppid());
        writer.writeLongValue("attemptsCount", this.getAttemptsCount());
        writer.writeStringValue("country", this.getCountry());
        writer.writeLocalDateValue("factDate", this.getFactDate());
        writer.writeStringValue("os", this.getOs());
        writer.writeLongValue("successCount", this.getSuccessCount());
    }
    /**
     * Sets the appid property value. The ID of the Microsoft Entra application. Supports $filter (eq).
     * @param value Value to set for the appid property.
     */
    public void setAppid(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appid", value);
    }
    /**
     * Sets the attemptsCount property value. The number of authentication requests made in the specified period. Supports $filter (eq).
     * @param value Value to set for the attemptsCount property.
     */
    public void setAttemptsCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("attemptsCount", value);
    }
    /**
     * Sets the country property value. The location where the customers authenticated from. Supports $filter (eq).
     * @param value Value to set for the country property.
     */
    public void setCountry(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("country", value);
    }
    /**
     * Sets the factDate property value. The date of the user insight.
     * @param value Value to set for the factDate property.
     */
    public void setFactDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("factDate", value);
    }
    /**
     * Sets the os property value. The platform for the device that the customers used. Supports $filter (eq).
     * @param value Value to set for the os property.
     */
    public void setOs(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("os", value);
    }
    /**
     * Sets the successCount property value. Number of successful authentication requests. Supports $filter (eq).
     * @param value Value to set for the successCount property.
     */
    public void setSuccessCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("successCount", value);
    }
}

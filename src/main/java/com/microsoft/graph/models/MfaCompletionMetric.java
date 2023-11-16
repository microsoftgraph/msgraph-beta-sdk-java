package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MfaCompletionMetric extends Entity implements Parsable {
    /**
     * Instantiates a new MfaCompletionMetric and sets the default values.
     */
    public MfaCompletionMetric() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MfaCompletionMetric
     */
    @jakarta.annotation.Nonnull
    public static MfaCompletionMetric createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MfaCompletionMetric();
    }
    /**
     * Gets the appId property value. The appId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.BackingStore.get("appId");
    }
    /**
     * Gets the attemptsCount property value. The attemptsCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getAttemptsCount() {
        return this.BackingStore.get("attemptsCount");
    }
    /**
     * Gets the factDate property value. The factDate property
     * @return a LocalDate
     */
    @jakarta.annotation.Nullable
    public LocalDate getFactDate() {
        return this.BackingStore.get("factDate");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("attemptsCount", (n) -> { this.setAttemptsCount(n.getLongValue()); });
        deserializerMap.put("factDate", (n) -> { this.setFactDate(n.getLocalDateValue()); });
        deserializerMap.put("mfaMethod", (n) -> { this.setMfaMethod(n.getStringValue()); });
        deserializerMap.put("os", (n) -> { this.setOs(n.getStringValue()); });
        deserializerMap.put("successCount", (n) -> { this.setSuccessCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the mfaMethod property value. The mfaMethod property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getMfaMethod() {
        return this.BackingStore.get("mfaMethod");
    }
    /**
     * Gets the os property value. The os property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOs() {
        return this.BackingStore.get("os");
    }
    /**
     * Gets the successCount property value. The successCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSuccessCount() {
        return this.BackingStore.get("successCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("appId", this.getAppId());
        writer.writeLongValue("attemptsCount", this.getAttemptsCount());
        writer.writeLocalDateValue("factDate", this.getFactDate());
        writer.writeStringValue("mfaMethod", this.getMfaMethod());
        writer.writeStringValue("os", this.getOs());
        writer.writeLongValue("successCount", this.getSuccessCount());
    }
    /**
     * Sets the appId property value. The appId property
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("appId", value);
    }
    /**
     * Sets the attemptsCount property value. The attemptsCount property
     * @param value Value to set for the attemptsCount property.
     */
    public void setAttemptsCount(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("attemptsCount", value);
    }
    /**
     * Sets the factDate property value. The factDate property
     * @param value Value to set for the factDate property.
     */
    public void setFactDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.BackingStore.set("factDate", value);
    }
    /**
     * Sets the mfaMethod property value. The mfaMethod property
     * @param value Value to set for the mfaMethod property.
     */
    public void setMfaMethod(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("mfaMethod", value);
    }
    /**
     * Sets the os property value. The os property
     * @param value Value to set for the os property.
     */
    public void setOs(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("os", value);
    }
    /**
     * Sets the successCount property value. The successCount property
     * @param value Value to set for the successCount property.
     */
    public void setSuccessCount(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("successCount", value);
    }
}

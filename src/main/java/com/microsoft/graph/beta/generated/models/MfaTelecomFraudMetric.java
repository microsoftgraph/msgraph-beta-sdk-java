package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MfaTelecomFraudMetric extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MfaTelecomFraudMetric} and sets the default values.
     */
    public MfaTelecomFraudMetric() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MfaTelecomFraudMetric}
     */
    @jakarta.annotation.Nonnull
    public static MfaTelecomFraudMetric createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MfaTelecomFraudMetric();
    }
    /**
     * Gets the captchaFailureCount property value. The captchaFailureCount property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCaptchaFailureCount() {
        return this.backingStore.get("captchaFailureCount");
    }
    /**
     * Gets the captchaNotTriggeredUserCount property value. The captchaNotTriggeredUserCount property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCaptchaNotTriggeredUserCount() {
        return this.backingStore.get("captchaNotTriggeredUserCount");
    }
    /**
     * Gets the captchaShownUserCount property value. The captchaShownUserCount property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCaptchaShownUserCount() {
        return this.backingStore.get("captchaShownUserCount");
    }
    /**
     * Gets the captchaSuccessCount property value. The captchaSuccessCount property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getCaptchaSuccessCount() {
        return this.backingStore.get("captchaSuccessCount");
    }
    /**
     * Gets the factDate property value. The factDate property
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
        deserializerMap.put("captchaFailureCount", (n) -> { this.setCaptchaFailureCount(n.getLongValue()); });
        deserializerMap.put("captchaNotTriggeredUserCount", (n) -> { this.setCaptchaNotTriggeredUserCount(n.getLongValue()); });
        deserializerMap.put("captchaShownUserCount", (n) -> { this.setCaptchaShownUserCount(n.getLongValue()); });
        deserializerMap.put("captchaSuccessCount", (n) -> { this.setCaptchaSuccessCount(n.getLongValue()); });
        deserializerMap.put("factDate", (n) -> { this.setFactDate(n.getLocalDateValue()); });
        deserializerMap.put("telecomBlockedUserCount", (n) -> { this.setTelecomBlockedUserCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the telecomBlockedUserCount property value. The telecomBlockedUserCount property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTelecomBlockedUserCount() {
        return this.backingStore.get("telecomBlockedUserCount");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("captchaFailureCount", this.getCaptchaFailureCount());
        writer.writeLongValue("captchaNotTriggeredUserCount", this.getCaptchaNotTriggeredUserCount());
        writer.writeLongValue("captchaShownUserCount", this.getCaptchaShownUserCount());
        writer.writeLongValue("captchaSuccessCount", this.getCaptchaSuccessCount());
        writer.writeLocalDateValue("factDate", this.getFactDate());
        writer.writeLongValue("telecomBlockedUserCount", this.getTelecomBlockedUserCount());
    }
    /**
     * Sets the captchaFailureCount property value. The captchaFailureCount property
     * @param value Value to set for the captchaFailureCount property.
     */
    public void setCaptchaFailureCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("captchaFailureCount", value);
    }
    /**
     * Sets the captchaNotTriggeredUserCount property value. The captchaNotTriggeredUserCount property
     * @param value Value to set for the captchaNotTriggeredUserCount property.
     */
    public void setCaptchaNotTriggeredUserCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("captchaNotTriggeredUserCount", value);
    }
    /**
     * Sets the captchaShownUserCount property value. The captchaShownUserCount property
     * @param value Value to set for the captchaShownUserCount property.
     */
    public void setCaptchaShownUserCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("captchaShownUserCount", value);
    }
    /**
     * Sets the captchaSuccessCount property value. The captchaSuccessCount property
     * @param value Value to set for the captchaSuccessCount property.
     */
    public void setCaptchaSuccessCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("captchaSuccessCount", value);
    }
    /**
     * Sets the factDate property value. The factDate property
     * @param value Value to set for the factDate property.
     */
    public void setFactDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.backingStore.set("factDate", value);
    }
    /**
     * Sets the telecomBlockedUserCount property value. The telecomBlockedUserCount property
     * @param value Value to set for the telecomBlockedUserCount property.
     */
    public void setTelecomBlockedUserCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("telecomBlockedUserCount", value);
    }
}

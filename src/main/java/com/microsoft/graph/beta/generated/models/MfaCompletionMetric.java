package com.microsoft.graph.beta.models;

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
     * Instantiates a new {@link MfaCompletionMetric} and sets the default values.
     */
    public MfaCompletionMetric() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MfaCompletionMetric}
     */
    @jakarta.annotation.Nonnull
    public static MfaCompletionMetric createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MfaCompletionMetric();
    }
    /**
     * Gets the appId property value. The ID of the Microsoft Entra application. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getAppId() {
        return this.backingStore.get("appId");
    }
    /**
     * Gets the attemptsCount property value. Number of users who attempted to sign up. Supports $filter (eq).
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getAttemptsCount() {
        return this.backingStore.get("attemptsCount");
    }
    /**
     * Gets the country property value. The country property
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
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("attemptsCount", (n) -> { this.setAttemptsCount(n.getLongValue()); });
        deserializerMap.put("country", (n) -> { this.setCountry(n.getStringValue()); });
        deserializerMap.put("factDate", (n) -> { this.setFactDate(n.getLocalDateValue()); });
        deserializerMap.put("identityProvider", (n) -> { this.setIdentityProvider(n.getStringValue()); });
        deserializerMap.put("language", (n) -> { this.setLanguage(n.getStringValue()); });
        deserializerMap.put("mfaFailures", (n) -> { this.setMfaFailures(n.getCollectionOfObjectValues(MfaFailure::createFromDiscriminatorValue)); });
        deserializerMap.put("mfaMethod", (n) -> { this.setMfaMethod(n.getStringValue()); });
        deserializerMap.put("os", (n) -> { this.setOs(n.getStringValue()); });
        deserializerMap.put("successCount", (n) -> { this.setSuccessCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the identityProvider property value. The identityProvider property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getIdentityProvider() {
        return this.backingStore.get("identityProvider");
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
     * Gets the mfaFailures property value. The mfaFailures property
     * @return a {@link java.util.List<MfaFailure>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<MfaFailure> getMfaFailures() {
        return this.backingStore.get("mfaFailures");
    }
    /**
     * Gets the mfaMethod property value. The MFA authentication method used by the customers. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMfaMethod() {
        return this.backingStore.get("mfaMethod");
    }
    /**
     * Gets the os property value. The platform of the device that the customers used. Supports $filter (eq).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getOs() {
        return this.backingStore.get("os");
    }
    /**
     * Gets the successCount property value. Number of users who signed up successfully. Supports $filter (eq).
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
        writer.writeStringValue("appId", this.getAppId());
        writer.writeLongValue("attemptsCount", this.getAttemptsCount());
        writer.writeStringValue("country", this.getCountry());
        writer.writeLocalDateValue("factDate", this.getFactDate());
        writer.writeStringValue("identityProvider", this.getIdentityProvider());
        writer.writeStringValue("language", this.getLanguage());
        writer.writeCollectionOfObjectValues("mfaFailures", this.getMfaFailures());
        writer.writeStringValue("mfaMethod", this.getMfaMethod());
        writer.writeStringValue("os", this.getOs());
        writer.writeLongValue("successCount", this.getSuccessCount());
    }
    /**
     * Sets the appId property value. The ID of the Microsoft Entra application. Supports $filter (eq).
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("appId", value);
    }
    /**
     * Sets the attemptsCount property value. Number of users who attempted to sign up. Supports $filter (eq).
     * @param value Value to set for the attemptsCount property.
     */
    public void setAttemptsCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("attemptsCount", value);
    }
    /**
     * Sets the country property value. The country property
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
     * Sets the identityProvider property value. The identityProvider property
     * @param value Value to set for the identityProvider property.
     */
    public void setIdentityProvider(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("identityProvider", value);
    }
    /**
     * Sets the language property value. The language property
     * @param value Value to set for the language property.
     */
    public void setLanguage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("language", value);
    }
    /**
     * Sets the mfaFailures property value. The mfaFailures property
     * @param value Value to set for the mfaFailures property.
     */
    public void setMfaFailures(@jakarta.annotation.Nullable final java.util.List<MfaFailure> value) {
        this.backingStore.set("mfaFailures", value);
    }
    /**
     * Sets the mfaMethod property value. The MFA authentication method used by the customers. Supports $filter (eq).
     * @param value Value to set for the mfaMethod property.
     */
    public void setMfaMethod(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mfaMethod", value);
    }
    /**
     * Sets the os property value. The platform of the device that the customers used. Supports $filter (eq).
     * @param value Value to set for the os property.
     */
    public void setOs(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("os", value);
    }
    /**
     * Sets the successCount property value. Number of users who signed up successfully. Supports $filter (eq).
     * @param value Value to set for the successCount property.
     */
    public void setSuccessCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("successCount", value);
    }
}

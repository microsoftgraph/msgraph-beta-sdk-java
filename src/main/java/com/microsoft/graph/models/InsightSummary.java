package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InsightSummary extends Entity implements Parsable {
    /**
     * Instantiates a new InsightSummary and sets the default values.
     */
    public InsightSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a InsightSummary
     */
    @jakarta.annotation.Nonnull
    public static InsightSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InsightSummary();
    }
    /**
     * Gets the activeUsers property value. The activeUsers property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getActiveUsers() {
        return this.BackingStore.get("activeUsers");
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
     * Gets the authenticationCompletions property value. The authenticationCompletions property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getAuthenticationCompletions() {
        return this.BackingStore.get("authenticationCompletions");
    }
    /**
     * Gets the authenticationRequests property value. The authenticationRequests property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getAuthenticationRequests() {
        return this.BackingStore.get("authenticationRequests");
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
        deserializerMap.put("activeUsers", (n) -> { this.setActiveUsers(n.getLongValue()); });
        deserializerMap.put("appId", (n) -> { this.setAppId(n.getStringValue()); });
        deserializerMap.put("authenticationCompletions", (n) -> { this.setAuthenticationCompletions(n.getLongValue()); });
        deserializerMap.put("authenticationRequests", (n) -> { this.setAuthenticationRequests(n.getLongValue()); });
        deserializerMap.put("factDate", (n) -> { this.setFactDate(n.getLocalDateValue()); });
        deserializerMap.put("os", (n) -> { this.setOs(n.getStringValue()); });
        deserializerMap.put("securityTextCompletions", (n) -> { this.setSecurityTextCompletions(n.getLongValue()); });
        deserializerMap.put("securityTextRequests", (n) -> { this.setSecurityTextRequests(n.getLongValue()); });
        deserializerMap.put("securityVoiceCompletions", (n) -> { this.setSecurityVoiceCompletions(n.getLongValue()); });
        deserializerMap.put("securityVoiceRequests", (n) -> { this.setSecurityVoiceRequests(n.getLongValue()); });
        return deserializerMap;
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
     * Gets the securityTextCompletions property value. The securityTextCompletions property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSecurityTextCompletions() {
        return this.BackingStore.get("securityTextCompletions");
    }
    /**
     * Gets the securityTextRequests property value. The securityTextRequests property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSecurityTextRequests() {
        return this.BackingStore.get("securityTextRequests");
    }
    /**
     * Gets the securityVoiceCompletions property value. The securityVoiceCompletions property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSecurityVoiceCompletions() {
        return this.BackingStore.get("securityVoiceCompletions");
    }
    /**
     * Gets the securityVoiceRequests property value. The securityVoiceRequests property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getSecurityVoiceRequests() {
        return this.BackingStore.get("securityVoiceRequests");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeLongValue("activeUsers", this.getActiveUsers());
        writer.writeStringValue("appId", this.getAppId());
        writer.writeLongValue("authenticationCompletions", this.getAuthenticationCompletions());
        writer.writeLongValue("authenticationRequests", this.getAuthenticationRequests());
        writer.writeLocalDateValue("factDate", this.getFactDate());
        writer.writeStringValue("os", this.getOs());
        writer.writeLongValue("securityTextCompletions", this.getSecurityTextCompletions());
        writer.writeLongValue("securityTextRequests", this.getSecurityTextRequests());
        writer.writeLongValue("securityVoiceCompletions", this.getSecurityVoiceCompletions());
        writer.writeLongValue("securityVoiceRequests", this.getSecurityVoiceRequests());
    }
    /**
     * Sets the activeUsers property value. The activeUsers property
     * @param value Value to set for the activeUsers property.
     */
    public void setActiveUsers(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("activeUsers", value);
    }
    /**
     * Sets the appId property value. The appId property
     * @param value Value to set for the appId property.
     */
    public void setAppId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("appId", value);
    }
    /**
     * Sets the authenticationCompletions property value. The authenticationCompletions property
     * @param value Value to set for the authenticationCompletions property.
     */
    public void setAuthenticationCompletions(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("authenticationCompletions", value);
    }
    /**
     * Sets the authenticationRequests property value. The authenticationRequests property
     * @param value Value to set for the authenticationRequests property.
     */
    public void setAuthenticationRequests(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("authenticationRequests", value);
    }
    /**
     * Sets the factDate property value. The factDate property
     * @param value Value to set for the factDate property.
     */
    public void setFactDate(@jakarta.annotation.Nullable final LocalDate value) {
        this.BackingStore.set("factDate", value);
    }
    /**
     * Sets the os property value. The os property
     * @param value Value to set for the os property.
     */
    public void setOs(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("os", value);
    }
    /**
     * Sets the securityTextCompletions property value. The securityTextCompletions property
     * @param value Value to set for the securityTextCompletions property.
     */
    public void setSecurityTextCompletions(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("securityTextCompletions", value);
    }
    /**
     * Sets the securityTextRequests property value. The securityTextRequests property
     * @param value Value to set for the securityTextRequests property.
     */
    public void setSecurityTextRequests(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("securityTextRequests", value);
    }
    /**
     * Sets the securityVoiceCompletions property value. The securityVoiceCompletions property
     * @param value Value to set for the securityVoiceCompletions property.
     */
    public void setSecurityVoiceCompletions(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("securityVoiceCompletions", value);
    }
    /**
     * Sets the securityVoiceRequests property value. The securityVoiceRequests property
     * @param value Value to set for the securityVoiceRequests property.
     */
    public void setSecurityVoiceRequests(@jakarta.annotation.Nullable final Long value) {
        this.BackingStore.set("securityVoiceRequests", value);
    }
}

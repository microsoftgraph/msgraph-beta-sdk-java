package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UserEventsSummary extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UserEventsSummary} and sets the default values.
     */
    public UserEventsSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UserEventsSummary}
     */
    @jakarta.annotation.Nonnull
    public static UserEventsSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserEventsSummary();
    }
    /**
     * Gets the authMethod property value. The authMethod property
     * @return a {@link UsageAuthMethod}
     */
    @jakarta.annotation.Nullable
    public UsageAuthMethod getAuthMethod() {
        return this.backingStore.get("authMethod");
    }
    /**
     * Gets the eventDateTime property value. The date and time (UTC) when the event occurred.  The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getEventDateTime() {
        return this.backingStore.get("eventDateTime");
    }
    /**
     * Gets the failureReason property value. The specific reason why the event failed (if it was not successful.)
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getFailureReason() {
        return this.backingStore.get("failureReason");
    }
    /**
     * Gets the feature property value. The feature property
     * @return a {@link FeatureType}
     */
    @jakarta.annotation.Nullable
    public FeatureType getFeature() {
        return this.backingStore.get("feature");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("authMethod", (n) -> { this.setAuthMethod(n.getEnumValue(UsageAuthMethod::forValue)); });
        deserializerMap.put("eventDateTime", (n) -> { this.setEventDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("failureReason", (n) -> { this.setFailureReason(n.getStringValue()); });
        deserializerMap.put("feature", (n) -> { this.setFeature(n.getEnumValue(FeatureType::forValue)); });
        deserializerMap.put("isSuccess", (n) -> { this.setIsSuccess(n.getBooleanValue()); });
        deserializerMap.put("userDisplayName", (n) -> { this.setUserDisplayName(n.getStringValue()); });
        deserializerMap.put("userPrincipalName", (n) -> { this.setUserPrincipalName(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isSuccess property value. Indicates whether the event was successful or not.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSuccess() {
        return this.backingStore.get("isSuccess");
    }
    /**
     * Gets the userDisplayName property value. The user display name, such as Adele Vance. Supports $filter (eq, startsWith) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserDisplayName() {
        return this.backingStore.get("userDisplayName");
    }
    /**
     * Gets the userPrincipalName property value. The user principal name, such as AdeleV@contoso.com. Supports $filter (eq, startsWith) and $orderby.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getUserPrincipalName() {
        return this.backingStore.get("userPrincipalName");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("authMethod", this.getAuthMethod());
        writer.writeOffsetDateTimeValue("eventDateTime", this.getEventDateTime());
        writer.writeStringValue("failureReason", this.getFailureReason());
        writer.writeEnumValue("feature", this.getFeature());
        writer.writeBooleanValue("isSuccess", this.getIsSuccess());
        writer.writeStringValue("userDisplayName", this.getUserDisplayName());
        writer.writeStringValue("userPrincipalName", this.getUserPrincipalName());
    }
    /**
     * Sets the authMethod property value. The authMethod property
     * @param value Value to set for the authMethod property.
     */
    public void setAuthMethod(@jakarta.annotation.Nullable final UsageAuthMethod value) {
        this.backingStore.set("authMethod", value);
    }
    /**
     * Sets the eventDateTime property value. The date and time (UTC) when the event occurred.  The DateTimeOffset type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the eventDateTime property.
     */
    public void setEventDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("eventDateTime", value);
    }
    /**
     * Sets the failureReason property value. The specific reason why the event failed (if it was not successful.)
     * @param value Value to set for the failureReason property.
     */
    public void setFailureReason(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("failureReason", value);
    }
    /**
     * Sets the feature property value. The feature property
     * @param value Value to set for the feature property.
     */
    public void setFeature(@jakarta.annotation.Nullable final FeatureType value) {
        this.backingStore.set("feature", value);
    }
    /**
     * Sets the isSuccess property value. Indicates whether the event was successful or not.
     * @param value Value to set for the isSuccess property.
     */
    public void setIsSuccess(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isSuccess", value);
    }
    /**
     * Sets the userDisplayName property value. The user display name, such as Adele Vance. Supports $filter (eq, startsWith) and $orderby.
     * @param value Value to set for the userDisplayName property.
     */
    public void setUserDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userDisplayName", value);
    }
    /**
     * Sets the userPrincipalName property value. The user principal name, such as AdeleV@contoso.com. Supports $filter (eq, startsWith) and $orderby.
     * @param value Value to set for the userPrincipalName property.
     */
    public void setUserPrincipalName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userPrincipalName", value);
    }
}

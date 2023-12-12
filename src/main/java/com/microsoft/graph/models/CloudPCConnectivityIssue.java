package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The user experience analyte connectivity issue entity.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPCConnectivityIssue extends Entity implements Parsable {
    /**
     * Instantiates a new CloudPCConnectivityIssue and sets the default values.
     */
    public CloudPCConnectivityIssue() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPCConnectivityIssue
     */
    @jakarta.annotation.Nonnull
    public static CloudPCConnectivityIssue createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPCConnectivityIssue();
    }
    /**
     * Gets the deviceId property value. The Intune DeviceId of the device the connection is associated with.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeviceId() {
        return this.backingStore.get("deviceId");
    }
    /**
     * Gets the errorCode property value. The error code of the connectivity issue.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getErrorCode() {
        return this.backingStore.get("errorCode");
    }
    /**
     * Gets the errorDateTime property value. The time that the connection initiated. The time is shown in ISO 8601 format and Coordinated Universal Time (UTC) time.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getErrorDateTime() {
        return this.backingStore.get("errorDateTime");
    }
    /**
     * Gets the errorDescription property value. The detailed description of what went wrong.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getErrorDescription() {
        return this.backingStore.get("errorDescription");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getStringValue()); });
        deserializerMap.put("errorDateTime", (n) -> { this.setErrorDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("errorDescription", (n) -> { this.setErrorDescription(n.getStringValue()); });
        deserializerMap.put("recommendedAction", (n) -> { this.setRecommendedAction(n.getStringValue()); });
        deserializerMap.put("userId", (n) -> { this.setUserId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the recommendedAction property value. The recommended action to fix the corresponding error.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecommendedAction() {
        return this.backingStore.get("recommendedAction");
    }
    /**
     * Gets the userId property value. The unique id of user who initialize the connection.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getUserId() {
        return this.backingStore.get("userId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("errorCode", this.getErrorCode());
        writer.writeOffsetDateTimeValue("errorDateTime", this.getErrorDateTime());
        writer.writeStringValue("errorDescription", this.getErrorDescription());
        writer.writeStringValue("recommendedAction", this.getRecommendedAction());
        writer.writeStringValue("userId", this.getUserId());
    }
    /**
     * Sets the deviceId property value. The Intune DeviceId of the device the connection is associated with.
     * @param value Value to set for the deviceId property.
     */
    public void setDeviceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("deviceId", value);
    }
    /**
     * Sets the errorCode property value. The error code of the connectivity issue.
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("errorCode", value);
    }
    /**
     * Sets the errorDateTime property value. The time that the connection initiated. The time is shown in ISO 8601 format and Coordinated Universal Time (UTC) time.
     * @param value Value to set for the errorDateTime property.
     */
    public void setErrorDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("errorDateTime", value);
    }
    /**
     * Sets the errorDescription property value. The detailed description of what went wrong.
     * @param value Value to set for the errorDescription property.
     */
    public void setErrorDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("errorDescription", value);
    }
    /**
     * Sets the recommendedAction property value. The recommended action to fix the corresponding error.
     * @param value Value to set for the recommendedAction property.
     */
    public void setRecommendedAction(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recommendedAction", value);
    }
    /**
     * Sets the userId property value. The unique id of user who initialize the connection.
     * @param value Value to set for the userId property.
     */
    public void setUserId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("userId", value);
    }
}

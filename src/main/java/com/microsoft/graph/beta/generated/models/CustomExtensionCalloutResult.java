package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CustomExtensionCalloutResult extends AuthenticationEventHandlerResult implements Parsable {
    /**
     * Instantiates a new {@link CustomExtensionCalloutResult} and sets the default values.
     */
    public CustomExtensionCalloutResult() {
        super();
        this.setOdataType("#microsoft.graph.customExtensionCalloutResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CustomExtensionCalloutResult}
     */
    @jakarta.annotation.Nonnull
    public static CustomExtensionCalloutResult createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomExtensionCalloutResult();
    }
    /**
     * Gets the calloutDateTime property value. When the API transaction was initiated, the date and time information uses ISO 8601 format and is always in UTC time. Example: midnight on Jan 1, 2014, is reported as 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCalloutDateTime() {
        return this.backingStore.get("calloutDateTime");
    }
    /**
     * Gets the customExtensionId property value. Identifier of the custom extension that was called.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCustomExtensionId() {
        return this.backingStore.get("customExtensionId");
    }
    /**
     * Gets the errorCode property value. Error code that was returned when the last API attempt failed.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getErrorCode() {
        return this.backingStore.get("errorCode");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("calloutDateTime", (n) -> { this.setCalloutDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("customExtensionId", (n) -> { this.setCustomExtensionId(n.getStringValue()); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getIntegerValue()); });
        deserializerMap.put("httpStatus", (n) -> { this.setHttpStatus(n.getIntegerValue()); });
        deserializerMap.put("numberOfAttempts", (n) -> { this.setNumberOfAttempts(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the httpStatus property value. The HTTP status code that was returned by the target API endpoint after the last API attempt.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getHttpStatus() {
        return this.backingStore.get("httpStatus");
    }
    /**
     * Gets the numberOfAttempts property value. The number of API calls to the customer&apos;s API.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getNumberOfAttempts() {
        return this.backingStore.get("numberOfAttempts");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("calloutDateTime", this.getCalloutDateTime());
        writer.writeStringValue("customExtensionId", this.getCustomExtensionId());
        writer.writeIntegerValue("errorCode", this.getErrorCode());
        writer.writeIntegerValue("httpStatus", this.getHttpStatus());
        writer.writeIntegerValue("numberOfAttempts", this.getNumberOfAttempts());
    }
    /**
     * Sets the calloutDateTime property value. When the API transaction was initiated, the date and time information uses ISO 8601 format and is always in UTC time. Example: midnight on Jan 1, 2014, is reported as 2014-01-01T00:00:00Z.
     * @param value Value to set for the calloutDateTime property.
     */
    public void setCalloutDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("calloutDateTime", value);
    }
    /**
     * Sets the customExtensionId property value. Identifier of the custom extension that was called.
     * @param value Value to set for the customExtensionId property.
     */
    public void setCustomExtensionId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("customExtensionId", value);
    }
    /**
     * Sets the errorCode property value. Error code that was returned when the last API attempt failed.
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("errorCode", value);
    }
    /**
     * Sets the httpStatus property value. The HTTP status code that was returned by the target API endpoint after the last API attempt.
     * @param value Value to set for the httpStatus property.
     */
    public void setHttpStatus(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("httpStatus", value);
    }
    /**
     * Sets the numberOfAttempts property value. The number of API calls to the customer&apos;s API.
     * @param value Value to set for the numberOfAttempts property.
     */
    public void setNumberOfAttempts(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("numberOfAttempts", value);
    }
}

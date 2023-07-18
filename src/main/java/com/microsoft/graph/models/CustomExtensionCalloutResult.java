package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CustomExtensionCalloutResult extends AuthenticationEventHandlerResult implements Parsable {
    /**
     * When the API transaction was initiated, the date and time information uses ISO 8601 format and is always in UTC time. Example: midnight on Jan 1, 2014, is reported as 2014-01-01T00:00:00Z.
     */
    private OffsetDateTime calloutDateTime;
    /**
     * Identifier of the custom extension that was called.
     */
    private String customExtensionId;
    /**
     * Error code that was returned when the last API attempt failed.
     */
    private Integer errorCode;
    /**
     * The HTTP status code that was returned by the target API endpoint after the last API attempt.
     */
    private Integer httpStatus;
    /**
     * The number of API calls to the customer's API.
     */
    private Integer numberOfAttempts;
    /**
     * Instantiates a new customExtensionCalloutResult and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CustomExtensionCalloutResult() {
        super();
        this.setOdataType("#microsoft.graph.customExtensionCalloutResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a customExtensionCalloutResult
     */
    @javax.annotation.Nonnull
    public static CustomExtensionCalloutResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomExtensionCalloutResult();
    }
    /**
     * Gets the calloutDateTime property value. When the API transaction was initiated, the date and time information uses ISO 8601 format and is always in UTC time. Example: midnight on Jan 1, 2014, is reported as 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCalloutDateTime() {
        return this.calloutDateTime;
    }
    /**
     * Gets the customExtensionId property value. Identifier of the custom extension that was called.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomExtensionId() {
        return this.customExtensionId;
    }
    /**
     * Gets the errorCode property value. Error code that was returned when the last API attempt failed.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorCode() {
        return this.errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getHttpStatus() {
        return this.httpStatus;
    }
    /**
     * Gets the numberOfAttempts property value. The number of API calls to the customer's API.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfAttempts() {
        return this.numberOfAttempts;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCalloutDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.calloutDateTime = value;
    }
    /**
     * Sets the customExtensionId property value. Identifier of the custom extension that was called.
     * @param value Value to set for the customExtensionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCustomExtensionId(@javax.annotation.Nullable final String value) {
        this.customExtensionId = value;
    }
    /**
     * Sets the errorCode property value. Error code that was returned when the last API attempt failed.
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCode(@javax.annotation.Nullable final Integer value) {
        this.errorCode = value;
    }
    /**
     * Sets the httpStatus property value. The HTTP status code that was returned by the target API endpoint after the last API attempt.
     * @param value Value to set for the httpStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHttpStatus(@javax.annotation.Nullable final Integer value) {
        this.httpStatus = value;
    }
    /**
     * Sets the numberOfAttempts property value. The number of API calls to the customer's API.
     * @param value Value to set for the numberOfAttempts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNumberOfAttempts(@javax.annotation.Nullable final Integer value) {
        this.numberOfAttempts = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CustomExtensionCalloutResult extends AuthenticationEventHandlerResult implements Parsable {
    /** The calloutDateTime property */
    private OffsetDateTime _calloutDateTime;
    /** The customExtensionId property */
    private String _customExtensionId;
    /** The errorCode property */
    private Integer _errorCode;
    /** The httpStatus property */
    private Integer _httpStatus;
    /** The numberOfAttempts property */
    private Integer _numberOfAttempts;
    /**
     * Instantiates a new CustomExtensionCalloutResult and sets the default values.
     * @return a void
     */
    public CustomExtensionCalloutResult() {
        super();
        this.setOdataType("#microsoft.graph.customExtensionCalloutResult");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CustomExtensionCalloutResult
     */
    @javax.annotation.Nonnull
    public static CustomExtensionCalloutResult createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CustomExtensionCalloutResult();
    }
    /**
     * Gets the calloutDateTime property value. The calloutDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCalloutDateTime() {
        return this._calloutDateTime;
    }
    /**
     * Gets the customExtensionId property value. The customExtensionId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomExtensionId() {
        return this._customExtensionId;
    }
    /**
     * Gets the errorCode property value. The errorCode property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getErrorCode() {
        return this._errorCode;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CustomExtensionCalloutResult currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("calloutDateTime", (n) -> { currentObject.setCalloutDateTime(n.getOffsetDateTimeValue()); });
            this.put("customExtensionId", (n) -> { currentObject.setCustomExtensionId(n.getStringValue()); });
            this.put("errorCode", (n) -> { currentObject.setErrorCode(n.getIntegerValue()); });
            this.put("httpStatus", (n) -> { currentObject.setHttpStatus(n.getIntegerValue()); });
            this.put("numberOfAttempts", (n) -> { currentObject.setNumberOfAttempts(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the httpStatus property value. The httpStatus property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getHttpStatus() {
        return this._httpStatus;
    }
    /**
     * Gets the numberOfAttempts property value. The numberOfAttempts property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNumberOfAttempts() {
        return this._numberOfAttempts;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
     * Sets the calloutDateTime property value. The calloutDateTime property
     * @param value Value to set for the calloutDateTime property.
     * @return a void
     */
    public void setCalloutDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._calloutDateTime = value;
    }
    /**
     * Sets the customExtensionId property value. The customExtensionId property
     * @param value Value to set for the customExtensionId property.
     * @return a void
     */
    public void setCustomExtensionId(@javax.annotation.Nullable final String value) {
        this._customExtensionId = value;
    }
    /**
     * Sets the errorCode property value. The errorCode property
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    public void setErrorCode(@javax.annotation.Nullable final Integer value) {
        this._errorCode = value;
    }
    /**
     * Sets the httpStatus property value. The httpStatus property
     * @param value Value to set for the httpStatus property.
     * @return a void
     */
    public void setHttpStatus(@javax.annotation.Nullable final Integer value) {
        this._httpStatus = value;
    }
    /**
     * Sets the numberOfAttempts property value. The numberOfAttempts property
     * @param value Value to set for the numberOfAttempts property.
     * @return a void
     */
    public void setNumberOfAttempts(@javax.annotation.Nullable final Integer value) {
        this._numberOfAttempts = value;
    }
}

package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EducationSynchronizationError extends Entity implements Parsable {
    /**
     * Represents the sync entity (school, section, student, teacher).
     */
    private String entryType;
    /**
     * Represents the error code for this error.
     */
    private String errorCode;
    /**
     * Contains a description of the error.
     */
    private String errorMessage;
    /**
     * The unique identifier for the entry.
     */
    private String joiningValue;
    /**
     * The time of occurrence of this error.
     */
    private OffsetDateTime recordedDateTime;
    /**
     * The identifier of this error entry.
     */
    private String reportableIdentifier;
    /**
     * Instantiates a new educationSynchronizationError and sets the default values.
     */
    public EducationSynchronizationError() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationSynchronizationError
     */
    @jakarta.annotation.Nonnull
    public static EducationSynchronizationError createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSynchronizationError();
    }
    /**
     * Gets the entryType property value. Represents the sync entity (school, section, student, teacher).
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getEntryType() {
        return this.entryType;
    }
    /**
     * Gets the errorCode property value. Represents the error code for this error.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getErrorCode() {
        return this.errorCode;
    }
    /**
     * Gets the errorMessage property value. Contains a description of the error.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("entryType", (n) -> { this.setEntryType(n.getStringValue()); });
        deserializerMap.put("errorCode", (n) -> { this.setErrorCode(n.getStringValue()); });
        deserializerMap.put("errorMessage", (n) -> { this.setErrorMessage(n.getStringValue()); });
        deserializerMap.put("joiningValue", (n) -> { this.setJoiningValue(n.getStringValue()); });
        deserializerMap.put("recordedDateTime", (n) -> { this.setRecordedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("reportableIdentifier", (n) -> { this.setReportableIdentifier(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the joiningValue property value. The unique identifier for the entry.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getJoiningValue() {
        return this.joiningValue;
    }
    /**
     * Gets the recordedDateTime property value. The time of occurrence of this error.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRecordedDateTime() {
        return this.recordedDateTime;
    }
    /**
     * Gets the reportableIdentifier property value. The identifier of this error entry.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getReportableIdentifier() {
        return this.reportableIdentifier;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("entryType", this.getEntryType());
        writer.writeStringValue("errorCode", this.getErrorCode());
        writer.writeStringValue("errorMessage", this.getErrorMessage());
        writer.writeStringValue("joiningValue", this.getJoiningValue());
        writer.writeOffsetDateTimeValue("recordedDateTime", this.getRecordedDateTime());
        writer.writeStringValue("reportableIdentifier", this.getReportableIdentifier());
    }
    /**
     * Sets the entryType property value. Represents the sync entity (school, section, student, teacher).
     * @param value Value to set for the entryType property.
     */
    public void setEntryType(@jakarta.annotation.Nullable final String value) {
        this.entryType = value;
    }
    /**
     * Sets the errorCode property value. Represents the error code for this error.
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final String value) {
        this.errorCode = value;
    }
    /**
     * Sets the errorMessage property value. Contains a description of the error.
     * @param value Value to set for the errorMessage property.
     */
    public void setErrorMessage(@jakarta.annotation.Nullable final String value) {
        this.errorMessage = value;
    }
    /**
     * Sets the joiningValue property value. The unique identifier for the entry.
     * @param value Value to set for the joiningValue property.
     */
    public void setJoiningValue(@jakarta.annotation.Nullable final String value) {
        this.joiningValue = value;
    }
    /**
     * Sets the recordedDateTime property value. The time of occurrence of this error.
     * @param value Value to set for the recordedDateTime property.
     */
    public void setRecordedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.recordedDateTime = value;
    }
    /**
     * Sets the reportableIdentifier property value. The identifier of this error entry.
     * @param value Value to set for the reportableIdentifier property.
     */
    public void setReportableIdentifier(@jakarta.annotation.Nullable final String value) {
        this.reportableIdentifier = value;
    }
}

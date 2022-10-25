package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class EducationSynchronizationError extends Entity implements Parsable {
    /** Represents the sync entity (school, section, student, teacher). */
    private String _entryType;
    /** Represents the error code for this error. */
    private String _errorCode;
    /** Contains a description of the error. */
    private String _errorMessage;
    /** The unique identifier for the entry. */
    private String _joiningValue;
    /** The time of occurrence of this error. */
    private OffsetDateTime _recordedDateTime;
    /** The identifier of this error entry. */
    private String _reportableIdentifier;
    /**
     * Instantiates a new educationSynchronizationError and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EducationSynchronizationError() {
        super();
        this.setOdataType("#microsoft.graph.educationSynchronizationError");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a educationSynchronizationError
     */
    @javax.annotation.Nonnull
    public static EducationSynchronizationError createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSynchronizationError();
    }
    /**
     * Gets the entryType property value. Represents the sync entity (school, section, student, teacher).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEntryType() {
        return this._entryType;
    }
    /**
     * Gets the errorCode property value. Represents the error code for this error.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorCode() {
        return this._errorCode;
    }
    /**
     * Gets the errorMessage property value. Contains a description of the error.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getErrorMessage() {
        return this._errorMessage;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EducationSynchronizationError currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("entryType", (n) -> { currentObject.setEntryType(n.getStringValue()); });
            this.put("errorCode", (n) -> { currentObject.setErrorCode(n.getStringValue()); });
            this.put("errorMessage", (n) -> { currentObject.setErrorMessage(n.getStringValue()); });
            this.put("joiningValue", (n) -> { currentObject.setJoiningValue(n.getStringValue()); });
            this.put("recordedDateTime", (n) -> { currentObject.setRecordedDateTime(n.getOffsetDateTimeValue()); });
            this.put("reportableIdentifier", (n) -> { currentObject.setReportableIdentifier(n.getStringValue()); });
        }};
    }
    /**
     * Gets the joiningValue property value. The unique identifier for the entry.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getJoiningValue() {
        return this._joiningValue;
    }
    /**
     * Gets the recordedDateTime property value. The time of occurrence of this error.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRecordedDateTime() {
        return this._recordedDateTime;
    }
    /**
     * Gets the reportableIdentifier property value. The identifier of this error entry.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getReportableIdentifier() {
        return this._reportableIdentifier;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEntryType(@javax.annotation.Nullable final String value) {
        this._entryType = value;
    }
    /**
     * Sets the errorCode property value. Represents the error code for this error.
     * @param value Value to set for the errorCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorCode(@javax.annotation.Nullable final String value) {
        this._errorCode = value;
    }
    /**
     * Sets the errorMessage property value. Contains a description of the error.
     * @param value Value to set for the errorMessage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setErrorMessage(@javax.annotation.Nullable final String value) {
        this._errorMessage = value;
    }
    /**
     * Sets the joiningValue property value. The unique identifier for the entry.
     * @param value Value to set for the joiningValue property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setJoiningValue(@javax.annotation.Nullable final String value) {
        this._joiningValue = value;
    }
    /**
     * Sets the recordedDateTime property value. The time of occurrence of this error.
     * @param value Value to set for the recordedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRecordedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._recordedDateTime = value;
    }
    /**
     * Sets the reportableIdentifier property value. The identifier of this error entry.
     * @param value Value to set for the reportableIdentifier property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReportableIdentifier(@javax.annotation.Nullable final String value) {
        this._reportableIdentifier = value;
    }
}

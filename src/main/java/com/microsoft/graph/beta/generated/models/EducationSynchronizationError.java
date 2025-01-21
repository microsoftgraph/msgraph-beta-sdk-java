package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EducationSynchronizationError extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EducationSynchronizationError} and sets the default values.
     */
    public EducationSynchronizationError() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EducationSynchronizationError}
     */
    @jakarta.annotation.Nonnull
    public static EducationSynchronizationError createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EducationSynchronizationError();
    }
    /**
     * Gets the entryType property value. The entryType property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getEntryType() {
        return this.backingStore.get("entryType");
    }
    /**
     * Gets the errorCode property value. The errorCode property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getErrorCode() {
        return this.backingStore.get("errorCode");
    }
    /**
     * Gets the errorMessage property value. The errorMessage property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getErrorMessage() {
        return this.backingStore.get("errorMessage");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * Gets the joiningValue property value. The joiningValue property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getJoiningValue() {
        return this.backingStore.get("joiningValue");
    }
    /**
     * Gets the recordedDateTime property value. The recordedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRecordedDateTime() {
        return this.backingStore.get("recordedDateTime");
    }
    /**
     * Gets the reportableIdentifier property value. The reportableIdentifier property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getReportableIdentifier() {
        return this.backingStore.get("reportableIdentifier");
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
     * Sets the entryType property value. The entryType property
     * @param value Value to set for the entryType property.
     */
    public void setEntryType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("entryType", value);
    }
    /**
     * Sets the errorCode property value. The errorCode property
     * @param value Value to set for the errorCode property.
     */
    public void setErrorCode(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("errorCode", value);
    }
    /**
     * Sets the errorMessage property value. The errorMessage property
     * @param value Value to set for the errorMessage property.
     */
    public void setErrorMessage(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("errorMessage", value);
    }
    /**
     * Sets the joiningValue property value. The joiningValue property
     * @param value Value to set for the joiningValue property.
     */
    public void setJoiningValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("joiningValue", value);
    }
    /**
     * Sets the recordedDateTime property value. The recordedDateTime property
     * @param value Value to set for the recordedDateTime property.
     */
    public void setRecordedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("recordedDateTime", value);
    }
    /**
     * Sets the reportableIdentifier property value. The reportableIdentifier property
     * @param value Value to set for the reportableIdentifier property.
     */
    public void setReportableIdentifier(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("reportableIdentifier", value);
    }
}

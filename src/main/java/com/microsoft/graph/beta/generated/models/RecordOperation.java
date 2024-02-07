package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RecordOperation extends CommsOperation implements Parsable {
    /**
     * Instantiates a new RecordOperation and sets the default values.
     */
    public RecordOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a RecordOperation
     */
    @jakarta.annotation.Nonnull
    public static RecordOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RecordOperation();
    }
    /**
     * Gets the completionReason property value. Possible values are: operationCanceled, stopToneDetected, maxRecordDurationReached, initialSilenceTimeout, maxSilenceTimeout, playPromptFailed, playBeepFailed, mediaReceiveTimeout, unspecifiedError, none.
     * @return a RecordCompletionReason
     */
    @jakarta.annotation.Nullable
    public RecordCompletionReason getCompletionReason() {
        return this.backingStore.get("completionReason");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completionReason", (n) -> { this.setCompletionReason(n.getEnumValue(RecordCompletionReason::forValue)); });
        deserializerMap.put("recordingAccessToken", (n) -> { this.setRecordingAccessToken(n.getStringValue()); });
        deserializerMap.put("recordingLocation", (n) -> { this.setRecordingLocation(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the recordingAccessToken property value. The access token required to retrieve the recording.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecordingAccessToken() {
        return this.backingStore.get("recordingAccessToken");
    }
    /**
     * Gets the recordingLocation property value. The location where the recording is located.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRecordingLocation() {
        return this.backingStore.get("recordingLocation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("completionReason", this.getCompletionReason());
        writer.writeStringValue("recordingAccessToken", this.getRecordingAccessToken());
        writer.writeStringValue("recordingLocation", this.getRecordingLocation());
    }
    /**
     * Sets the completionReason property value. Possible values are: operationCanceled, stopToneDetected, maxRecordDurationReached, initialSilenceTimeout, maxSilenceTimeout, playPromptFailed, playBeepFailed, mediaReceiveTimeout, unspecifiedError, none.
     * @param value Value to set for the completionReason property.
     */
    public void setCompletionReason(@jakarta.annotation.Nullable final RecordCompletionReason value) {
        this.backingStore.set("completionReason", value);
    }
    /**
     * Sets the recordingAccessToken property value. The access token required to retrieve the recording.
     * @param value Value to set for the recordingAccessToken property.
     */
    public void setRecordingAccessToken(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recordingAccessToken", value);
    }
    /**
     * Sets the recordingLocation property value. The location where the recording is located.
     * @param value Value to set for the recordingLocation property.
     */
    public void setRecordingLocation(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("recordingLocation", value);
    }
}

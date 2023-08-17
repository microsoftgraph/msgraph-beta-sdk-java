package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlayPromptOperation extends CommsOperation implements Parsable {
    /**
     * Possible values are: unknown, completedSuccessfully, mediaOperationCanceled.
     */
    private PlayPromptCompletionReason completionReason;
    /**
     * Instantiates a new playPromptOperation and sets the default values.
     */
    public PlayPromptOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a playPromptOperation
     */
    @jakarta.annotation.Nonnull
    public static PlayPromptOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlayPromptOperation();
    }
    /**
     * Gets the completionReason property value. Possible values are: unknown, completedSuccessfully, mediaOperationCanceled.
     * @return a playPromptCompletionReason
     */
    @jakarta.annotation.Nullable
    public PlayPromptCompletionReason getCompletionReason() {
        return this.completionReason;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completionReason", (n) -> { this.setCompletionReason(n.getEnumValue(PlayPromptCompletionReason.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("completionReason", this.getCompletionReason());
    }
    /**
     * Sets the completionReason property value. Possible values are: unknown, completedSuccessfully, mediaOperationCanceled.
     * @param value Value to set for the completionReason property.
     */
    public void setCompletionReason(@jakarta.annotation.Nullable final PlayPromptCompletionReason value) {
        this.completionReason = value;
    }
}

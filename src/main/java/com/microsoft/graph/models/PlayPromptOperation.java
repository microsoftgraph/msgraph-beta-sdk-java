package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PlayPromptOperation extends CommsOperation implements Parsable {
    /** Possible values are: unknown, completedSuccessfully, mediaOperationCanceled. */
    private PlayPromptCompletionReason _completionReason;
    /**
     * Instantiates a new PlayPromptOperation and sets the default values.
     * @return a void
     */
    public PlayPromptOperation() {
        super();
        this.setOdataType("#microsoft.graph.playPromptOperation");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a PlayPromptOperation
     */
    @javax.annotation.Nonnull
    public static PlayPromptOperation createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlayPromptOperation();
    }
    /**
     * Gets the completionReason property value. Possible values are: unknown, completedSuccessfully, mediaOperationCanceled.
     * @return a playPromptCompletionReason
     */
    @javax.annotation.Nullable
    public PlayPromptCompletionReason getCompletionReason() {
        return this._completionReason;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PlayPromptOperation currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("completionReason", (n) -> { currentObject.setCompletionReason(n.getEnumValue(PlayPromptCompletionReason.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("completionReason", this.getCompletionReason());
    }
    /**
     * Sets the completionReason property value. Possible values are: unknown, completedSuccessfully, mediaOperationCanceled.
     * @param value Value to set for the completionReason property.
     * @return a void
     */
    public void setCompletionReason(@javax.annotation.Nullable final PlayPromptCompletionReason value) {
        this._completionReason = value;
    }
}

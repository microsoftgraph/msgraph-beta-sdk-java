package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MicrosoftManagedTrainingSetting extends TrainingSetting implements Parsable {
    /**
     * The completionDateTime property
     */
    private OffsetDateTime completionDateTime;
    /**
     * The trainingCompletionDuration property
     */
    private TrainingCompletionDuration trainingCompletionDuration;
    /**
     * Instantiates a new MicrosoftManagedTrainingSetting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MicrosoftManagedTrainingSetting() {
        super();
        this.setOdataType("#microsoft.graph.microsoftManagedTrainingSetting");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MicrosoftManagedTrainingSetting
     */
    @javax.annotation.Nonnull
    public static MicrosoftManagedTrainingSetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MicrosoftManagedTrainingSetting();
    }
    /**
     * Gets the completionDateTime property value. The completionDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCompletionDateTime() {
        return this.completionDateTime;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completionDateTime", (n) -> { this.setCompletionDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("trainingCompletionDuration", (n) -> { this.setTrainingCompletionDuration(n.getEnumValue(TrainingCompletionDuration.class)); });
        return deserializerMap;
    }
    /**
     * Gets the trainingCompletionDuration property value. The trainingCompletionDuration property
     * @return a trainingCompletionDuration
     */
    @javax.annotation.Nullable
    public TrainingCompletionDuration getTrainingCompletionDuration() {
        return this.trainingCompletionDuration;
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
        writer.writeOffsetDateTimeValue("completionDateTime", this.getCompletionDateTime());
        writer.writeEnumValue("trainingCompletionDuration", this.getTrainingCompletionDuration());
    }
    /**
     * Sets the completionDateTime property value. The completionDateTime property
     * @param value Value to set for the completionDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompletionDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.completionDateTime = value;
    }
    /**
     * Sets the trainingCompletionDuration property value. The trainingCompletionDuration property
     * @param value Value to set for the trainingCompletionDuration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrainingCompletionDuration(@javax.annotation.Nullable final TrainingCompletionDuration value) {
        this.trainingCompletionDuration = value;
    }
}

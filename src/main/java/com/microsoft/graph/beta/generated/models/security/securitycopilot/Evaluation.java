package com.microsoft.graph.beta.models.security.securitycopilot;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class Evaluation extends Entity implements Parsable {
    /**
     * Instantiates a new {@link Evaluation} and sets the default values.
     */
    public Evaluation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link Evaluation}
     */
    @jakarta.annotation.Nonnull
    public static Evaluation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Evaluation();
    }
    /**
     * Gets the completedDateTime property value. The completedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCompletedDateTime() {
        return this.backingStore.get("completedDateTime");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.backingStore.get("createdDateTime");
    }
    /**
     * Gets the executionCount property value. The executionCount property
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getExecutionCount() {
        return this.backingStore.get("executionCount");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("completedDateTime", (n) -> { this.setCompletedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("executionCount", (n) -> { this.setExecutionCount(n.getLongValue()); });
        deserializerMap.put("isCancelled", (n) -> { this.setIsCancelled(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("result", (n) -> { this.setResult(n.getObjectValue(EvaluationResult::createFromDiscriminatorValue)); });
        deserializerMap.put("runStartDateTime", (n) -> { this.setRunStartDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("state", (n) -> { this.setState(n.getEnumValue(EvaluationState::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isCancelled property value. The isCancelled property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsCancelled() {
        return this.backingStore.get("isCancelled");
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.backingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the result property value. The result property
     * @return a {@link EvaluationResult}
     */
    @jakarta.annotation.Nullable
    public EvaluationResult getResult() {
        return this.backingStore.get("result");
    }
    /**
     * Gets the runStartDateTime property value. The runStartDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getRunStartDateTime() {
        return this.backingStore.get("runStartDateTime");
    }
    /**
     * Gets the state property value. The state property
     * @return a {@link EvaluationState}
     */
    @jakarta.annotation.Nullable
    public EvaluationState getState() {
        return this.backingStore.get("state");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeOffsetDateTimeValue("completedDateTime", this.getCompletedDateTime());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeLongValue("executionCount", this.getExecutionCount());
        writer.writeBooleanValue("isCancelled", this.getIsCancelled());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeObjectValue("result", this.getResult());
        writer.writeOffsetDateTimeValue("runStartDateTime", this.getRunStartDateTime());
        writer.writeEnumValue("state", this.getState());
    }
    /**
     * Sets the completedDateTime property value. The completedDateTime property
     * @param value Value to set for the completedDateTime property.
     */
    public void setCompletedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("completedDateTime", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("createdDateTime", value);
    }
    /**
     * Sets the executionCount property value. The executionCount property
     * @param value Value to set for the executionCount property.
     */
    public void setExecutionCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("executionCount", value);
    }
    /**
     * Sets the isCancelled property value. The isCancelled property
     * @param value Value to set for the isCancelled property.
     */
    public void setIsCancelled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isCancelled", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the result property value. The result property
     * @param value Value to set for the result property.
     */
    public void setResult(@jakarta.annotation.Nullable final EvaluationResult value) {
        this.backingStore.set("result", value);
    }
    /**
     * Sets the runStartDateTime property value. The runStartDateTime property
     * @param value Value to set for the runStartDateTime property.
     */
    public void setRunStartDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("runStartDateTime", value);
    }
    /**
     * Sets the state property value. The state property
     * @param value Value to set for the state property.
     */
    public void setState(@jakarta.annotation.Nullable final EvaluationState value) {
        this.backingStore.set("state", value);
    }
}

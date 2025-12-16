package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class PlaceOperation extends Entity implements Parsable {
    /**
     * Instantiates a new {@link PlaceOperation} and sets the default values.
     */
    public PlaceOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link PlaceOperation}
     */
    @jakarta.annotation.Nonnull
    public static PlaceOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PlaceOperation();
    }
    /**
     * Gets the details property value. The detailed result of the operation, including errors and successful places.
     * @return a {@link java.util.List<PlaceExecutionResult>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PlaceExecutionResult> getDetails() {
        return this.backingStore.get("details");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("details", (n) -> { this.setDetails(n.getCollectionOfObjectValues(PlaceExecutionResult::createFromDiscriminatorValue)); });
        deserializerMap.put("progress", (n) -> { this.setProgress(n.getObjectValue(PlaceOperationProgress::createFromDiscriminatorValue)); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getEnumValue(PlaceOperationStatus::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the progress property value. The progress of the operation.
     * @return a {@link PlaceOperationProgress}
     */
    @jakarta.annotation.Nullable
    public PlaceOperationProgress getProgress() {
        return this.backingStore.get("progress");
    }
    /**
     * Gets the status property value. The status property
     * @return a {@link PlaceOperationStatus}
     */
    @jakarta.annotation.Nullable
    public PlaceOperationStatus getStatus() {
        return this.backingStore.get("status");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("details", this.getDetails());
        writer.writeObjectValue("progress", this.getProgress());
        writer.writeEnumValue("status", this.getStatus());
    }
    /**
     * Sets the details property value. The detailed result of the operation, including errors and successful places.
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final java.util.List<PlaceExecutionResult> value) {
        this.backingStore.set("details", value);
    }
    /**
     * Sets the progress property value. The progress of the operation.
     * @param value Value to set for the progress property.
     */
    public void setProgress(@jakarta.annotation.Nullable final PlaceOperationProgress value) {
        this.backingStore.set("progress", value);
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     */
    public void setStatus(@jakarta.annotation.Nullable final PlaceOperationStatus value) {
        this.backingStore.set("status", value);
    }
}

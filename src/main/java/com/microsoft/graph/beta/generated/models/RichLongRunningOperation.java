package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The status of a long-running operation.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class RichLongRunningOperation extends LongRunningOperation implements Parsable {
    /**
     * Instantiates a new {@link RichLongRunningOperation} and sets the default values.
     */
    public RichLongRunningOperation() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link RichLongRunningOperation}
     */
    @jakarta.annotation.Nonnull
    public static RichLongRunningOperation createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new RichLongRunningOperation();
    }
    /**
     * Gets the error property value. Error due to which the operation failed.
     * @return a {@link PublicError}
     */
    @jakarta.annotation.Nullable
    public PublicError getError() {
        return this.backingStore.get("error");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("error", (n) -> { this.setError(n.getObjectValue(PublicError::createFromDiscriminatorValue)); });
        deserializerMap.put("percentageComplete", (n) -> { this.setPercentageComplete(n.getIntegerValue()); });
        deserializerMap.put("resourceId", (n) -> { this.setResourceId(n.getStringValue()); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the percentageComplete property value. A value between 0 and 100 that indicates the progress of the operation.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPercentageComplete() {
        return this.backingStore.get("percentageComplete");
    }
    /**
     * Gets the resourceId property value. A unique identifier for the result.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getResourceId() {
        return this.backingStore.get("resourceId");
    }
    /**
     * Gets the type property value. Type of the operation.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.backingStore.get("type");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("error", this.getError());
        writer.writeIntegerValue("percentageComplete", this.getPercentageComplete());
        writer.writeStringValue("resourceId", this.getResourceId());
        writer.writeStringValue("type", this.getType());
    }
    /**
     * Sets the error property value. Error due to which the operation failed.
     * @param value Value to set for the error property.
     */
    public void setError(@jakarta.annotation.Nullable final PublicError value) {
        this.backingStore.set("error", value);
    }
    /**
     * Sets the percentageComplete property value. A value between 0 and 100 that indicates the progress of the operation.
     * @param value Value to set for the percentageComplete property.
     */
    public void setPercentageComplete(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("percentageComplete", value);
    }
    /**
     * Sets the resourceId property value. A unique identifier for the result.
     * @param value Value to set for the resourceId property.
     */
    public void setResourceId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("resourceId", value);
    }
    /**
     * Sets the type property value. Type of the operation.
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("type", value);
    }
}

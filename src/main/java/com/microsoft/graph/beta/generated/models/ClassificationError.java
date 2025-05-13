package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ClassificationError extends ClassifcationErrorBase implements Parsable {
    /**
     * Instantiates a new {@link ClassificationError} and sets the default values.
     */
    public ClassificationError() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ClassificationError}
     */
    @jakarta.annotation.Nonnull
    public static ClassificationError createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.processingError": return new ProcessingError();
            }
        }
        return new ClassificationError();
    }
    /**
     * Gets the details property value. A collection of more specific errors that contribute to the overall error.
     * @return a {@link java.util.List<ClassifcationErrorBase>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ClassifcationErrorBase> getDetails() {
        return this.backingStore.get("details");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("details", (n) -> { this.setDetails(n.getCollectionOfObjectValues(ClassifcationErrorBase::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("details", this.getDetails());
    }
    /**
     * Sets the details property value. A collection of more specific errors that contribute to the overall error.
     * @param value Value to set for the details property.
     */
    public void setDetails(@jakarta.annotation.Nullable final java.util.List<ClassifcationErrorBase> value) {
        this.backingStore.set("details", value);
    }
}

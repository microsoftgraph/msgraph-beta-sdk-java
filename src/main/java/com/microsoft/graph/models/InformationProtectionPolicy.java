package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InformationProtectionPolicy extends Entity implements Parsable {
    /**
     * The labels property
     */
    private java.util.List<InformationProtectionLabel> labels;
    /**
     * Instantiates a new informationProtectionPolicy and sets the default values.
     */
    public InformationProtectionPolicy() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a informationProtectionPolicy
     */
    @jakarta.annotation.Nonnull
    public static InformationProtectionPolicy createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InformationProtectionPolicy();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("labels", (n) -> { this.setLabels(n.getCollectionOfObjectValues(InformationProtectionLabel::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the labels property value. The labels property
     * @return a informationProtectionLabel
     */
    @jakarta.annotation.Nullable
    public java.util.List<InformationProtectionLabel> getLabels() {
        return this.labels;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("labels", this.getLabels());
    }
    /**
     * Sets the labels property value. The labels property
     * @param value Value to set for the labels property.
     */
    public void setLabels(@jakarta.annotation.Nullable final java.util.List<InformationProtectionLabel> value) {
        this.labels = value;
    }
}

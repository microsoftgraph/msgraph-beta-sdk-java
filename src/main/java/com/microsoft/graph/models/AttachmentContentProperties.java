package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class AttachmentContentProperties extends ContentProperties implements Parsable {
    /**
     * The currentLabel property
     */
    private CurrentLabel currentLabel;
    /**
     * Instantiates a new attachmentContentProperties and sets the default values.
     */
    public AttachmentContentProperties() {
        super();
        this.setOdataType("#microsoft.graph.attachmentContentProperties");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a attachmentContentProperties
     */
    @jakarta.annotation.Nonnull
    public static AttachmentContentProperties createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttachmentContentProperties();
    }
    /**
     * Gets the currentLabel property value. The currentLabel property
     * @return a currentLabel
     */
    @jakarta.annotation.Nullable
    public CurrentLabel getCurrentLabel() {
        return this.currentLabel;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("currentLabel", (n) -> { this.setCurrentLabel(n.getObjectValue(CurrentLabel::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("currentLabel", this.getCurrentLabel());
    }
    /**
     * Sets the currentLabel property value. The currentLabel property
     * @param value Value to set for the currentLabel property.
     */
    public void setCurrentLabel(@jakarta.annotation.Nullable final CurrentLabel value) {
        this.currentLabel = value;
    }
}

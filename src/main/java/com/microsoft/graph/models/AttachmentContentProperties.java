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
     * Instantiates a new AttachmentContentProperties and sets the default values.
     */
    public AttachmentContentProperties() {
        super();
        this.setOdataType("#microsoft.graph.attachmentContentProperties");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a AttachmentContentProperties
     */
    @jakarta.annotation.Nonnull
    public static AttachmentContentProperties createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AttachmentContentProperties();
    }
    /**
     * Gets the currentLabel property value. The currentLabel property
     * @return a CurrentLabel
     */
    @jakarta.annotation.Nullable
    public CurrentLabel getCurrentLabel() {
        return this.backingStore.get("currentLabel");
    }
    /**
     * Gets the discoveredSensitiveTypes property value. The discoveredSensitiveTypes property
     * @return a java.util.List<DiscoveredSensitiveType>
     */
    @jakarta.annotation.Nullable
    public java.util.List<DiscoveredSensitiveType> getDiscoveredSensitiveTypes() {
        return this.backingStore.get("discoveredSensitiveTypes");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("currentLabel", (n) -> { this.setCurrentLabel(n.getObjectValue(CurrentLabel::createFromDiscriminatorValue)); });
        deserializerMap.put("discoveredSensitiveTypes", (n) -> { this.setDiscoveredSensitiveTypes(n.getCollectionOfObjectValues(DiscoveredSensitiveType::createFromDiscriminatorValue)); });
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
        writer.writeCollectionOfObjectValues("discoveredSensitiveTypes", this.getDiscoveredSensitiveTypes());
    }
    /**
     * Sets the currentLabel property value. The currentLabel property
     * @param value Value to set for the currentLabel property.
     */
    public void setCurrentLabel(@jakarta.annotation.Nullable final CurrentLabel value) {
        this.backingStore.set("currentLabel", value);
    }
    /**
     * Sets the discoveredSensitiveTypes property value. The discoveredSensitiveTypes property
     * @param value Value to set for the discoveredSensitiveTypes property.
     */
    public void setDiscoveredSensitiveTypes(@jakarta.annotation.Nullable final java.util.List<DiscoveredSensitiveType> value) {
        this.backingStore.set("discoveredSensitiveTypes", value);
    }
}

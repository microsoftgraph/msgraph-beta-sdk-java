package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MetadataAction extends InformationProtectionAction implements Parsable {
    /**
     * Instantiates a new MetadataAction and sets the default values.
     */
    public MetadataAction() {
        super();
        this.setOdataType("#microsoft.graph.metadataAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MetadataAction
     */
    @jakarta.annotation.Nonnull
    public static MetadataAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MetadataAction();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("metadataToAdd", (n) -> { this.setMetadataToAdd(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
        deserializerMap.put("metadataToRemove", (n) -> { this.setMetadataToRemove(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the metadataToAdd property value. A collection of key value pairs that should be added to the file.
     * @return a java.util.List<KeyValuePair>
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getMetadataToAdd() {
        return this.backingStore.get("metadataToAdd");
    }
    /**
     * Gets the metadataToRemove property value. A collection of strings that indicate which keys to remove from the file metadata.
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMetadataToRemove() {
        return this.backingStore.get("metadataToRemove");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("metadataToAdd", this.getMetadataToAdd());
        writer.writeCollectionOfPrimitiveValues("metadataToRemove", this.getMetadataToRemove());
    }
    /**
     * Sets the metadataToAdd property value. A collection of key value pairs that should be added to the file.
     * @param value Value to set for the metadataToAdd property.
     */
    public void setMetadataToAdd(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.backingStore.set("metadataToAdd", value);
    }
    /**
     * Sets the metadataToRemove property value. A collection of strings that indicate which keys to remove from the file metadata.
     * @param value Value to set for the metadataToRemove property.
     */
    public void setMetadataToRemove(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("metadataToRemove", value);
    }
}

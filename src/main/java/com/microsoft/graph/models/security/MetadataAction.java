package com.microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MetadataAction extends InformationProtectionAction implements Parsable {
    /**
     * A collection of key-value pairs that should be added to the file.
     */
    private java.util.List<KeyValuePair> metadataToAdd;
    /**
     * A collection of strings that indicate which keys to remove from the file metadata.
     */
    private java.util.List<String> metadataToRemove;
    /**
     * Instantiates a new metadataAction and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public MetadataAction() {
        super();
        this.setOdataType("#microsoft.graph.security.metadataAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a metadataAction
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
     * Gets the metadataToAdd property value. A collection of key-value pairs that should be added to the file.
     * @return a keyValuePair
     */
    @jakarta.annotation.Nullable
    public java.util.List<KeyValuePair> getMetadataToAdd() {
        return this.metadataToAdd;
    }
    /**
     * Gets the metadataToRemove property value. A collection of strings that indicate which keys to remove from the file metadata.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getMetadataToRemove() {
        return this.metadataToRemove;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("metadataToAdd", this.getMetadataToAdd());
        writer.writeCollectionOfPrimitiveValues("metadataToRemove", this.getMetadataToRemove());
    }
    /**
     * Sets the metadataToAdd property value. A collection of key-value pairs that should be added to the file.
     * @param value Value to set for the metadataToAdd property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMetadataToAdd(@jakarta.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this.metadataToAdd = value;
    }
    /**
     * Sets the metadataToRemove property value. A collection of strings that indicate which keys to remove from the file metadata.
     * @param value Value to set for the metadataToRemove property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setMetadataToRemove(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.metadataToRemove = value;
    }
}

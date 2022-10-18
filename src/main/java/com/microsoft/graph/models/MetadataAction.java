package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MetadataAction extends InformationProtectionAction implements Parsable {
    /** A collection of key value pairs that should be added to the file. */
    private java.util.List<KeyValuePair> _metadataToAdd;
    /** A collection of strings that indicate which keys to remove from the file metadata. */
    private java.util.List<String> _metadataToRemove;
    /**
     * Instantiates a new MetadataAction and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public MetadataAction() {
        super();
        this.setOdataType("#microsoft.graph.metadataAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a MetadataAction
     */
    @javax.annotation.Nonnull
    public static MetadataAction createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MetadataAction();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MetadataAction currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("metadataToAdd", (n) -> { currentObject.setMetadataToAdd(n.getCollectionOfObjectValues(KeyValuePair::createFromDiscriminatorValue)); });
            this.put("metadataToRemove", (n) -> { currentObject.setMetadataToRemove(n.getCollectionOfPrimitiveValues(String.class)); });
        }};
    }
    /**
     * Gets the metadataToAdd property value. A collection of key value pairs that should be added to the file.
     * @return a keyValuePair
     */
    @javax.annotation.Nullable
    public java.util.List<KeyValuePair> getMetadataToAdd() {
        return this._metadataToAdd;
    }
    /**
     * Gets the metadataToRemove property value. A collection of strings that indicate which keys to remove from the file metadata.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMetadataToRemove() {
        return this._metadataToRemove;
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
        writer.writeCollectionOfObjectValues("metadataToAdd", this.getMetadataToAdd());
        writer.writeCollectionOfPrimitiveValues("metadataToRemove", this.getMetadataToRemove());
    }
    /**
     * Sets the metadataToAdd property value. A collection of key value pairs that should be added to the file.
     * @param value Value to set for the metadataToAdd property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetadataToAdd(@javax.annotation.Nullable final java.util.List<KeyValuePair> value) {
        this._metadataToAdd = value;
    }
    /**
     * Sets the metadataToRemove property value. A collection of strings that indicate which keys to remove from the file metadata.
     * @param value Value to set for the metadataToRemove property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMetadataToRemove(@javax.annotation.Nullable final java.util.List<String> value) {
        this._metadataToRemove = value;
    }
}

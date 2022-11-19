package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EncryptWithTemplate extends EncryptContent implements Parsable {
    /** The availableForEncryption property */
    private Boolean _availableForEncryption;
    /** The templateId property */
    private String _templateId;
    /**
     * Instantiates a new EncryptWithTemplate and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public EncryptWithTemplate() {
        super();
        this.setOdataType("#microsoft.graph.encryptWithTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a EncryptWithTemplate
     */
    @javax.annotation.Nonnull
    public static EncryptWithTemplate createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EncryptWithTemplate();
    }
    /**
     * Gets the availableForEncryption property value. The availableForEncryption property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAvailableForEncryption() {
        return this._availableForEncryption;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final EncryptWithTemplate currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("availableForEncryption", (n) -> { currentObject.setAvailableForEncryption(n.getBooleanValue()); });
        deserializerMap.put("templateId", (n) -> { currentObject.setTemplateId(n.getStringValue()); });
        return deserializerMap
    }
    /**
     * Gets the templateId property value. The templateId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTemplateId() {
        return this._templateId;
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
        writer.writeBooleanValue("availableForEncryption", this.getAvailableForEncryption());
        writer.writeStringValue("templateId", this.getTemplateId());
    }
    /**
     * Sets the availableForEncryption property value. The availableForEncryption property
     * @param value Value to set for the availableForEncryption property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAvailableForEncryption(@javax.annotation.Nullable final Boolean value) {
        this._availableForEncryption = value;
    }
    /**
     * Sets the templateId property value. The templateId property
     * @param value Value to set for the templateId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTemplateId(@javax.annotation.Nullable final String value) {
        this._templateId = value;
    }
}

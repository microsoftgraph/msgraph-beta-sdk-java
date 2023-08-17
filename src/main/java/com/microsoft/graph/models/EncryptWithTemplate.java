package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class EncryptWithTemplate extends EncryptContent implements Parsable {
    /**
     * The availableForEncryption property
     */
    private Boolean availableForEncryption;
    /**
     * The templateId property
     */
    private String templateId;
    /**
     * Instantiates a new encryptWithTemplate and sets the default values.
     */
    public EncryptWithTemplate() {
        super();
        this.setOdataType("#microsoft.graph.encryptWithTemplate");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a encryptWithTemplate
     */
    @jakarta.annotation.Nonnull
    public static EncryptWithTemplate createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EncryptWithTemplate();
    }
    /**
     * Gets the availableForEncryption property value. The availableForEncryption property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getAvailableForEncryption() {
        return this.availableForEncryption;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("availableForEncryption", (n) -> { this.setAvailableForEncryption(n.getBooleanValue()); });
        deserializerMap.put("templateId", (n) -> { this.setTemplateId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the templateId property value. The templateId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getTemplateId() {
        return this.templateId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("availableForEncryption", this.getAvailableForEncryption());
        writer.writeStringValue("templateId", this.getTemplateId());
    }
    /**
     * Sets the availableForEncryption property value. The availableForEncryption property
     * @param value Value to set for the availableForEncryption property.
     */
    public void setAvailableForEncryption(@jakarta.annotation.Nullable final Boolean value) {
        this.availableForEncryption = value;
    }
    /**
     * Sets the templateId property value. The templateId property
     * @param value Value to set for the templateId property.
     */
    public void setTemplateId(@jakarta.annotation.Nullable final String value) {
        this.templateId = value;
    }
}

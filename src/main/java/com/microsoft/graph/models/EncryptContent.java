package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EncryptContent extends LabelActionBase implements Parsable {
    /**
     * The encryptWith property
     */
    private EncryptWith encryptWith;
    /**
     * Instantiates a new encryptContent and sets the default values.
     */
    public EncryptContent() {
        super();
        this.setOdataType("#microsoft.graph.encryptContent");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a encryptContent
     */
    @jakarta.annotation.Nonnull
    public static EncryptContent createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.encryptWithTemplate": return new EncryptWithTemplate();
                case "#microsoft.graph.encryptWithUserDefinedRights": return new EncryptWithUserDefinedRights();
            }
        }
        return new EncryptContent();
    }
    /**
     * Gets the encryptWith property value. The encryptWith property
     * @return a encryptWith
     */
    @jakarta.annotation.Nullable
    public EncryptWith getEncryptWith() {
        return this.encryptWith;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("encryptWith", (n) -> { this.setEncryptWith(n.getEnumValue(EncryptWith.class)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("encryptWith", this.getEncryptWith());
    }
    /**
     * Sets the encryptWith property value. The encryptWith property
     * @param value Value to set for the encryptWith property.
     */
    public void setEncryptWith(@jakarta.annotation.Nullable final EncryptWith value) {
        this.encryptWith = value;
    }
}

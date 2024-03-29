package com.microsoft.graph.beta.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ProtectByTemplateAction extends InformationProtectionAction implements Parsable {
    /**
     * Instantiates a new {@link ProtectByTemplateAction} and sets the default values.
     */
    public ProtectByTemplateAction() {
        super();
        this.setOdataType("#microsoft.graph.security.protectByTemplateAction");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link ProtectByTemplateAction}
     */
    @jakarta.annotation.Nonnull
    public static ProtectByTemplateAction createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ProtectByTemplateAction();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("templateId", (n) -> { this.setTemplateId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the templateId property value. The unique identifier for a protection template in Microsoft Purview Information Protection to apply to the content.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getTemplateId() {
        return this.backingStore.get("templateId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("templateId", this.getTemplateId());
    }
    /**
     * Sets the templateId property value. The unique identifier for a protection template in Microsoft Purview Information Protection to apply to the content.
     * @param value Value to set for the templateId property.
     */
    public void setTemplateId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("templateId", value);
    }
}

package com.microsoft.graph.beta.models.security.securitycopilot;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SkillInputDescriptor extends SkillVariableDescriptor implements Parsable {
    /**
     * Instantiates a new {@link SkillInputDescriptor} and sets the default values.
     */
    public SkillInputDescriptor() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SkillInputDescriptor}
     */
    @jakarta.annotation.Nonnull
    public static SkillInputDescriptor createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SkillInputDescriptor();
    }
    /**
     * Gets the defaultValue property value. The defaultValue property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultValue() {
        return this.backingStore.get("defaultValue");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultValue", (n) -> { this.setDefaultValue(n.getStringValue()); });
        deserializerMap.put("isRequired", (n) -> { this.setIsRequired(n.getBooleanValue()); });
        deserializerMap.put("placeholderValue", (n) -> { this.setPlaceholderValue(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isRequired property value. The isRequired property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRequired() {
        return this.backingStore.get("isRequired");
    }
    /**
     * Gets the placeholderValue property value. The placeholderValue property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getPlaceholderValue() {
        return this.backingStore.get("placeholderValue");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("defaultValue", this.getDefaultValue());
        writer.writeBooleanValue("isRequired", this.getIsRequired());
        writer.writeStringValue("placeholderValue", this.getPlaceholderValue());
    }
    /**
     * Sets the defaultValue property value. The defaultValue property
     * @param value Value to set for the defaultValue property.
     */
    public void setDefaultValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultValue", value);
    }
    /**
     * Sets the isRequired property value. The isRequired property
     * @param value Value to set for the isRequired property.
     */
    public void setIsRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRequired", value);
    }
    /**
     * Sets the placeholderValue property value. The placeholderValue property
     * @param value Value to set for the placeholderValue property.
     */
    public void setPlaceholderValue(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("placeholderValue", value);
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CopilotPeopleAdminSetting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CopilotPeopleAdminSetting} and sets the default values.
     */
    public CopilotPeopleAdminSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CopilotPeopleAdminSetting}
     */
    @jakarta.annotation.Nonnull
    public static CopilotPeopleAdminSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CopilotPeopleAdminSetting();
    }
    /**
     * Gets the enhancedPersonalization property value. The enhancedPersonalization property
     * @return a {@link EnhancedPersonalizationSetting}
     */
    @jakarta.annotation.Nullable
    public EnhancedPersonalizationSetting getEnhancedPersonalization() {
        return this.backingStore.get("enhancedPersonalization");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("enhancedPersonalization", (n) -> { this.setEnhancedPersonalization(n.getObjectValue(EnhancedPersonalizationSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("enhancedPersonalization", this.getEnhancedPersonalization());
    }
    /**
     * Sets the enhancedPersonalization property value. The enhancedPersonalization property
     * @param value Value to set for the enhancedPersonalization property.
     */
    public void setEnhancedPersonalization(@jakarta.annotation.Nullable final EnhancedPersonalizationSetting value) {
        this.backingStore.set("enhancedPersonalization", value);
    }
}

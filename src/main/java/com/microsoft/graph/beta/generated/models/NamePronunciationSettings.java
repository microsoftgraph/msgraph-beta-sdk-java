package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class NamePronunciationSettings extends Entity implements Parsable {
    /**
     * Instantiates a new {@link NamePronunciationSettings} and sets the default values.
     */
    public NamePronunciationSettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link NamePronunciationSettings}
     */
    @jakarta.annotation.Nonnull
    public static NamePronunciationSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new NamePronunciationSettings();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("isEnabledInOrganization", (n) -> { this.setIsEnabledInOrganization(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabledInOrganization property value. true to enable name pronunciation in the organization; otherwise, false. The default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabledInOrganization() {
        return this.backingStore.get("isEnabledInOrganization");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("isEnabledInOrganization", this.getIsEnabledInOrganization());
    }
    /**
     * Sets the isEnabledInOrganization property value. true to enable name pronunciation in the organization; otherwise, false. The default value is false.
     * @param value Value to set for the isEnabledInOrganization property.
     */
    public void setIsEnabledInOrganization(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabledInOrganization", value);
    }
}

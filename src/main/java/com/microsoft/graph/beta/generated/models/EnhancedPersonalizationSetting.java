package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class EnhancedPersonalizationSetting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link EnhancedPersonalizationSetting} and sets the default values.
     */
    public EnhancedPersonalizationSetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link EnhancedPersonalizationSetting}
     */
    @jakarta.annotation.Nonnull
    public static EnhancedPersonalizationSetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new EnhancedPersonalizationSetting();
    }
    /**
     * Gets the disabledForGroup property value. The ID of a Microsoft Entra group to which the value is used to disable the control for populated users. The default value is null. This parameter is optional.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisabledForGroup() {
        return this.backingStore.get("disabledForGroup");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("disabledForGroup", (n) -> { this.setDisabledForGroup(n.getStringValue()); });
        deserializerMap.put("isEnabledInOrganization", (n) -> { this.setIsEnabledInOrganization(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabledInOrganization property value. If true, enables the enhanced personalization control and therefore related features as defined in control enhanced personalization privacy
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
        writer.writeStringValue("disabledForGroup", this.getDisabledForGroup());
        writer.writeBooleanValue("isEnabledInOrganization", this.getIsEnabledInOrganization());
    }
    /**
     * Sets the disabledForGroup property value. The ID of a Microsoft Entra group to which the value is used to disable the control for populated users. The default value is null. This parameter is optional.
     * @param value Value to set for the disabledForGroup property.
     */
    public void setDisabledForGroup(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("disabledForGroup", value);
    }
    /**
     * Sets the isEnabledInOrganization property value. If true, enables the enhanced personalization control and therefore related features as defined in control enhanced personalization privacy
     * @param value Value to set for the isEnabledInOrganization property.
     */
    public void setIsEnabledInOrganization(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isEnabledInOrganization", value);
    }
}

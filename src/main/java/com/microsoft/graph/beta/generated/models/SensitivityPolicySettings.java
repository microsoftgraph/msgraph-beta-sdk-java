package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class SensitivityPolicySettings extends Entity implements Parsable {
    /**
     * Instantiates a new {@link SensitivityPolicySettings} and sets the default values.
     */
    public SensitivityPolicySettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link SensitivityPolicySettings}
     */
    @jakarta.annotation.Nonnull
    public static SensitivityPolicySettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensitivityPolicySettings();
    }
    /**
     * Gets the applicableTo property value. The applicableTo property
     * @return a {@link EnumSet<SensitivityLabelTarget>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<SensitivityLabelTarget> getApplicableTo() {
        return this.backingStore.get("applicableTo");
    }
    /**
     * Gets the downgradeSensitivityRequiresJustification property value. The downgradeSensitivityRequiresJustification property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getDowngradeSensitivityRequiresJustification() {
        return this.backingStore.get("downgradeSensitivityRequiresJustification");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableTo", (n) -> { this.setApplicableTo(n.getEnumSetValue(SensitivityLabelTarget::forValue)); });
        deserializerMap.put("downgradeSensitivityRequiresJustification", (n) -> { this.setDowngradeSensitivityRequiresJustification(n.getBooleanValue()); });
        deserializerMap.put("helpWebUrl", (n) -> { this.setHelpWebUrl(n.getStringValue()); });
        deserializerMap.put("isMandatory", (n) -> { this.setIsMandatory(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the helpWebUrl property value. The helpWebUrl property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHelpWebUrl() {
        return this.backingStore.get("helpWebUrl");
    }
    /**
     * Gets the isMandatory property value. The isMandatory property
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMandatory() {
        return this.backingStore.get("isMandatory");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumSetValue("applicableTo", this.getApplicableTo());
        writer.writeBooleanValue("downgradeSensitivityRequiresJustification", this.getDowngradeSensitivityRequiresJustification());
        writer.writeStringValue("helpWebUrl", this.getHelpWebUrl());
        writer.writeBooleanValue("isMandatory", this.getIsMandatory());
    }
    /**
     * Sets the applicableTo property value. The applicableTo property
     * @param value Value to set for the applicableTo property.
     */
    public void setApplicableTo(@jakarta.annotation.Nullable final EnumSet<SensitivityLabelTarget> value) {
        this.backingStore.set("applicableTo", value);
    }
    /**
     * Sets the downgradeSensitivityRequiresJustification property value. The downgradeSensitivityRequiresJustification property
     * @param value Value to set for the downgradeSensitivityRequiresJustification property.
     */
    public void setDowngradeSensitivityRequiresJustification(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("downgradeSensitivityRequiresJustification", value);
    }
    /**
     * Sets the helpWebUrl property value. The helpWebUrl property
     * @param value Value to set for the helpWebUrl property.
     */
    public void setHelpWebUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("helpWebUrl", value);
    }
    /**
     * Sets the isMandatory property value. The isMandatory property
     * @param value Value to set for the isMandatory property.
     */
    public void setIsMandatory(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMandatory", value);
    }
}

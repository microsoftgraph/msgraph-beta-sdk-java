package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SensitivityPolicySettings extends Entity implements Parsable {
    /**
     * The applicableTo property
     */
    private SensitivityLabelTarget applicableTo;
    /**
     * The downgradeSensitivityRequiresJustification property
     */
    private Boolean downgradeSensitivityRequiresJustification;
    /**
     * The helpWebUrl property
     */
    private String helpWebUrl;
    /**
     * The isMandatory property
     */
    private Boolean isMandatory;
    /**
     * Instantiates a new sensitivityPolicySettings and sets the default values.
     */
    public SensitivityPolicySettings() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sensitivityPolicySettings
     */
    @jakarta.annotation.Nonnull
    public static SensitivityPolicySettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensitivityPolicySettings();
    }
    /**
     * Gets the applicableTo property value. The applicableTo property
     * @return a sensitivityLabelTarget
     */
    @jakarta.annotation.Nullable
    public SensitivityLabelTarget getApplicableTo() {
        return this.applicableTo;
    }
    /**
     * Gets the downgradeSensitivityRequiresJustification property value. The downgradeSensitivityRequiresJustification property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getDowngradeSensitivityRequiresJustification() {
        return this.downgradeSensitivityRequiresJustification;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableTo", (n) -> { this.setApplicableTo(n.getEnumValue(SensitivityLabelTarget.class)); });
        deserializerMap.put("downgradeSensitivityRequiresJustification", (n) -> { this.setDowngradeSensitivityRequiresJustification(n.getBooleanValue()); });
        deserializerMap.put("helpWebUrl", (n) -> { this.setHelpWebUrl(n.getStringValue()); });
        deserializerMap.put("isMandatory", (n) -> { this.setIsMandatory(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the helpWebUrl property value. The helpWebUrl property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getHelpWebUrl() {
        return this.helpWebUrl;
    }
    /**
     * Gets the isMandatory property value. The isMandatory property
     * @return a boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMandatory() {
        return this.isMandatory;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("applicableTo", this.getApplicableTo());
        writer.writeBooleanValue("downgradeSensitivityRequiresJustification", this.getDowngradeSensitivityRequiresJustification());
        writer.writeStringValue("helpWebUrl", this.getHelpWebUrl());
        writer.writeBooleanValue("isMandatory", this.getIsMandatory());
    }
    /**
     * Sets the applicableTo property value. The applicableTo property
     * @param value Value to set for the applicableTo property.
     */
    public void setApplicableTo(@jakarta.annotation.Nullable final SensitivityLabelTarget value) {
        this.applicableTo = value;
    }
    /**
     * Sets the downgradeSensitivityRequiresJustification property value. The downgradeSensitivityRequiresJustification property
     * @param value Value to set for the downgradeSensitivityRequiresJustification property.
     */
    public void setDowngradeSensitivityRequiresJustification(@jakarta.annotation.Nullable final Boolean value) {
        this.downgradeSensitivityRequiresJustification = value;
    }
    /**
     * Sets the helpWebUrl property value. The helpWebUrl property
     * @param value Value to set for the helpWebUrl property.
     */
    public void setHelpWebUrl(@jakarta.annotation.Nullable final String value) {
        this.helpWebUrl = value;
    }
    /**
     * Sets the isMandatory property value. The isMandatory property
     * @param value Value to set for the isMandatory property.
     */
    public void setIsMandatory(@jakarta.annotation.Nullable final Boolean value) {
        this.isMandatory = value;
    }
}

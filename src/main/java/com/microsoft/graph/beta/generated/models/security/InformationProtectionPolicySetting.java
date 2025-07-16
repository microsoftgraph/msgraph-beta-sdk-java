package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class InformationProtectionPolicySetting extends Entity implements Parsable {
    /**
     * Instantiates a new {@link InformationProtectionPolicySetting} and sets the default values.
     */
    public InformationProtectionPolicySetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link InformationProtectionPolicySetting}
     */
    @jakarta.annotation.Nonnull
    public static InformationProtectionPolicySetting createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InformationProtectionPolicySetting();
    }
    /**
     * Gets the defaultLabelId property value. The defaultLabelId property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDefaultLabelId() {
        return this.backingStore.get("defaultLabelId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("defaultLabelId", (n) -> { this.setDefaultLabelId(n.getStringValue()); });
        deserializerMap.put("isDowngradeJustificationRequired", (n) -> { this.setIsDowngradeJustificationRequired(n.getBooleanValue()); });
        deserializerMap.put("isMandatory", (n) -> { this.setIsMandatory(n.getBooleanValue()); });
        deserializerMap.put("moreInfoUrl", (n) -> { this.setMoreInfoUrl(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isDowngradeJustificationRequired property value. Exposes whether justification input is required on label downgrade.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsDowngradeJustificationRequired() {
        return this.backingStore.get("isDowngradeJustificationRequired");
    }
    /**
     * Gets the isMandatory property value. Exposes whether mandatory labeling is enabled.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsMandatory() {
        return this.backingStore.get("isMandatory");
    }
    /**
     * Gets the moreInfoUrl property value. Exposes the more information URL that can be configured by the administrator.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMoreInfoUrl() {
        return this.backingStore.get("moreInfoUrl");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("defaultLabelId", this.getDefaultLabelId());
        writer.writeBooleanValue("isDowngradeJustificationRequired", this.getIsDowngradeJustificationRequired());
        writer.writeBooleanValue("isMandatory", this.getIsMandatory());
        writer.writeStringValue("moreInfoUrl", this.getMoreInfoUrl());
    }
    /**
     * Sets the defaultLabelId property value. The defaultLabelId property
     * @param value Value to set for the defaultLabelId property.
     */
    public void setDefaultLabelId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("defaultLabelId", value);
    }
    /**
     * Sets the isDowngradeJustificationRequired property value. Exposes whether justification input is required on label downgrade.
     * @param value Value to set for the isDowngradeJustificationRequired property.
     */
    public void setIsDowngradeJustificationRequired(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isDowngradeJustificationRequired", value);
    }
    /**
     * Sets the isMandatory property value. Exposes whether mandatory labeling is enabled.
     * @param value Value to set for the isMandatory property.
     */
    public void setIsMandatory(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isMandatory", value);
    }
    /**
     * Sets the moreInfoUrl property value. Exposes the more information URL that can be configured by the administrator.
     * @param value Value to set for the moreInfoUrl property.
     */
    public void setMoreInfoUrl(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("moreInfoUrl", value);
    }
}

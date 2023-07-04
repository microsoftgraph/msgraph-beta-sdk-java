package com.microsoft.graph.models.security;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class InformationProtectionPolicySetting extends Entity implements Parsable {
    /**
     * The defaultLabelId property
     */
    private String defaultLabelId;
    /**
     * Exposes whether justification input is required on label downgrade.
     */
    private Boolean isDowngradeJustificationRequired;
    /**
     * Exposes whether mandatory labeling is enabled.
     */
    private Boolean isMandatory;
    /**
     * Exposes the more information URL that can be configured by the administrator.
     */
    private String moreInfoUrl;
    /**
     * Instantiates a new informationProtectionPolicySetting and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public InformationProtectionPolicySetting() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a informationProtectionPolicySetting
     */
    @javax.annotation.Nonnull
    public static InformationProtectionPolicySetting createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InformationProtectionPolicySetting();
    }
    /**
     * Gets the defaultLabelId property value. The defaultLabelId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultLabelId() {
        return this.defaultLabelId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDowngradeJustificationRequired() {
        return this.isDowngradeJustificationRequired;
    }
    /**
     * Gets the isMandatory property value. Exposes whether mandatory labeling is enabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMandatory() {
        return this.isMandatory;
    }
    /**
     * Gets the moreInfoUrl property value. Exposes the more information URL that can be configured by the administrator.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMoreInfoUrl() {
        return this.moreInfoUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultLabelId(@javax.annotation.Nullable final String value) {
        this.defaultLabelId = value;
    }
    /**
     * Sets the isDowngradeJustificationRequired property value. Exposes whether justification input is required on label downgrade.
     * @param value Value to set for the isDowngradeJustificationRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsDowngradeJustificationRequired(@javax.annotation.Nullable final Boolean value) {
        this.isDowngradeJustificationRequired = value;
    }
    /**
     * Sets the isMandatory property value. Exposes whether mandatory labeling is enabled.
     * @param value Value to set for the isMandatory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMandatory(@javax.annotation.Nullable final Boolean value) {
        this.isMandatory = value;
    }
    /**
     * Sets the moreInfoUrl property value. Exposes the more information URL that can be configured by the administrator.
     * @param value Value to set for the moreInfoUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMoreInfoUrl(@javax.annotation.Nullable final String value) {
        this.moreInfoUrl = value;
    }
}

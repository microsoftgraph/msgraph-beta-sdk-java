package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class SensitivityPolicySettings extends Entity implements Parsable {
    /** The applicableTo property */
    private SensitivityLabelTarget _applicableTo;
    /** The downgradeSensitivityRequiresJustification property */
    private Boolean _downgradeSensitivityRequiresJustification;
    /** The helpWebUrl property */
    private String _helpWebUrl;
    /** The isMandatory property */
    private Boolean _isMandatory;
    /**
     * Instantiates a new sensitivityPolicySettings and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public SensitivityPolicySettings() {
        super();
        this.setOdataType("#microsoft.graph.sensitivityPolicySettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a sensitivityPolicySettings
     */
    @javax.annotation.Nonnull
    public static SensitivityPolicySettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new SensitivityPolicySettings();
    }
    /**
     * Gets the applicableTo property value. The applicableTo property
     * @return a sensitivityLabelTarget
     */
    @javax.annotation.Nullable
    public SensitivityLabelTarget getApplicableTo() {
        return this._applicableTo;
    }
    /**
     * Gets the downgradeSensitivityRequiresJustification property value. The downgradeSensitivityRequiresJustification property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getDowngradeSensitivityRequiresJustification() {
        return this._downgradeSensitivityRequiresJustification;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final SensitivityPolicySettings currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("applicableTo", (n) -> { currentObject.setApplicableTo(n.getEnumValue(SensitivityLabelTarget.class)); });
            this.put("downgradeSensitivityRequiresJustification", (n) -> { currentObject.setDowngradeSensitivityRequiresJustification(n.getBooleanValue()); });
            this.put("helpWebUrl", (n) -> { currentObject.setHelpWebUrl(n.getStringValue()); });
            this.put("isMandatory", (n) -> { currentObject.setIsMandatory(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the helpWebUrl property value. The helpWebUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHelpWebUrl() {
        return this._helpWebUrl;
    }
    /**
     * Gets the isMandatory property value. The isMandatory property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMandatory() {
        return this._isMandatory;
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
        writer.writeEnumValue("applicableTo", this.getApplicableTo());
        writer.writeBooleanValue("downgradeSensitivityRequiresJustification", this.getDowngradeSensitivityRequiresJustification());
        writer.writeStringValue("helpWebUrl", this.getHelpWebUrl());
        writer.writeBooleanValue("isMandatory", this.getIsMandatory());
    }
    /**
     * Sets the applicableTo property value. The applicableTo property
     * @param value Value to set for the applicableTo property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApplicableTo(@javax.annotation.Nullable final SensitivityLabelTarget value) {
        this._applicableTo = value;
    }
    /**
     * Sets the downgradeSensitivityRequiresJustification property value. The downgradeSensitivityRequiresJustification property
     * @param value Value to set for the downgradeSensitivityRequiresJustification property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDowngradeSensitivityRequiresJustification(@javax.annotation.Nullable final Boolean value) {
        this._downgradeSensitivityRequiresJustification = value;
    }
    /**
     * Sets the helpWebUrl property value. The helpWebUrl property
     * @param value Value to set for the helpWebUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHelpWebUrl(@javax.annotation.Nullable final String value) {
        this._helpWebUrl = value;
    }
    /**
     * Sets the isMandatory property value. The isMandatory property
     * @param value Value to set for the isMandatory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMandatory(@javax.annotation.Nullable final Boolean value) {
        this._isMandatory = value;
    }
}

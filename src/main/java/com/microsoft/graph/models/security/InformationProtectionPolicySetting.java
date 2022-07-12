package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
public class InformationProtectionPolicySetting extends Entity implements Parsable {
    /** The defaultLabelId property */
    private String _defaultLabelId;
    /** The isDowngradeJustificationRequired property */
    private Boolean _isDowngradeJustificationRequired;
    /** The isMandatory property */
    private Boolean _isMandatory;
    /** The moreInfoUrl property */
    private String _moreInfoUrl;
    /**
     * Instantiates a new informationProtectionPolicySetting and sets the default values.
     * @return a void
     */
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
        return this._defaultLabelId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final InformationProtectionPolicySetting currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("defaultLabelId", (n) -> { currentObject.setDefaultLabelId(n.getStringValue()); });
            this.put("isDowngradeJustificationRequired", (n) -> { currentObject.setIsDowngradeJustificationRequired(n.getBooleanValue()); });
            this.put("isMandatory", (n) -> { currentObject.setIsMandatory(n.getBooleanValue()); });
            this.put("moreInfoUrl", (n) -> { currentObject.setMoreInfoUrl(n.getStringValue()); });
        }};
    }
    /**
     * Gets the isDowngradeJustificationRequired property value. The isDowngradeJustificationRequired property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsDowngradeJustificationRequired() {
        return this._isDowngradeJustificationRequired;
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
     * Gets the moreInfoUrl property value. The moreInfoUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMoreInfoUrl() {
        return this._moreInfoUrl;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
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
    public void setDefaultLabelId(@javax.annotation.Nullable final String value) {
        this._defaultLabelId = value;
    }
    /**
     * Sets the isDowngradeJustificationRequired property value. The isDowngradeJustificationRequired property
     * @param value Value to set for the isDowngradeJustificationRequired property.
     * @return a void
     */
    public void setIsDowngradeJustificationRequired(@javax.annotation.Nullable final Boolean value) {
        this._isDowngradeJustificationRequired = value;
    }
    /**
     * Sets the isMandatory property value. The isMandatory property
     * @param value Value to set for the isMandatory property.
     * @return a void
     */
    public void setIsMandatory(@javax.annotation.Nullable final Boolean value) {
        this._isMandatory = value;
    }
    /**
     * Sets the moreInfoUrl property value. The moreInfoUrl property
     * @param value Value to set for the moreInfoUrl property.
     * @return a void
     */
    public void setMoreInfoUrl(@javax.annotation.Nullable final String value) {
        this._moreInfoUrl = value;
    }
}

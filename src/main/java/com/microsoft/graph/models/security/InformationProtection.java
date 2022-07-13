package microsoft.graph.models.security;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.Entity;
public class InformationProtection extends Entity implements Parsable {
    /** The labelPolicySettings property */
    private InformationProtectionPolicySetting _labelPolicySettings;
    /** The sensitivityLabels property */
    private java.util.List<SensitivityLabel> _sensitivityLabels;
    /**
     * Instantiates a new informationProtection and sets the default values.
     * @return a void
     */
    public InformationProtection() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a informationProtection
     */
    @javax.annotation.Nonnull
    public static InformationProtection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new InformationProtection();
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final InformationProtection currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("labelPolicySettings", (n) -> { currentObject.setLabelPolicySettings(n.getObjectValue(InformationProtectionPolicySetting::createFromDiscriminatorValue)); });
            this.put("sensitivityLabels", (n) -> { currentObject.setSensitivityLabels(n.getCollectionOfObjectValues(SensitivityLabel::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the labelPolicySettings property value. The labelPolicySettings property
     * @return a informationProtectionPolicySetting
     */
    @javax.annotation.Nullable
    public InformationProtectionPolicySetting getLabelPolicySettings() {
        return this._labelPolicySettings;
    }
    /**
     * Gets the sensitivityLabels property value. The sensitivityLabels property
     * @return a sensitivityLabel
     */
    @javax.annotation.Nullable
    public java.util.List<SensitivityLabel> getSensitivityLabels() {
        return this._sensitivityLabels;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("labelPolicySettings", this.getLabelPolicySettings());
        writer.writeCollectionOfObjectValues("sensitivityLabels", this.getSensitivityLabels());
    }
    /**
     * Sets the labelPolicySettings property value. The labelPolicySettings property
     * @param value Value to set for the labelPolicySettings property.
     * @return a void
     */
    public void setLabelPolicySettings(@javax.annotation.Nullable final InformationProtectionPolicySetting value) {
        this._labelPolicySettings = value;
    }
    /**
     * Sets the sensitivityLabels property value. The sensitivityLabels property
     * @param value Value to set for the sensitivityLabels property.
     * @return a void
     */
    public void setSensitivityLabels(@javax.annotation.Nullable final java.util.List<SensitivityLabel> value) {
        this._sensitivityLabels = value;
    }
}

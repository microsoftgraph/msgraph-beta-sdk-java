package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeviceManagementApplicabilityRuleOsEdition implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Name for object.  */
    private String _name;
    /** Applicability rule OS edition type.  */
    private java.util.List<Windows10EditionType> _osEditionTypes;
    /** Applicability Rule type. Possible values are: include, exclude.  */
    private DeviceManagementApplicabilityRuleType _ruleType;
    /**
     * Instantiates a new deviceManagementApplicabilityRuleOsEdition and sets the default values.
     * @return a void
     */
    public DeviceManagementApplicabilityRuleOsEdition() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementApplicabilityRuleOsEdition
     */
    @javax.annotation.Nonnull
    public static DeviceManagementApplicabilityRuleOsEdition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementApplicabilityRuleOsEdition();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceManagementApplicabilityRuleOsEdition currentObject = this;
        return new HashMap<>(3) {{
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("osEditionTypes", (n) -> { currentObject.setOsEditionTypes(n.getCollectionOfEnumValues(Windows10EditionType.class)); });
            this.put("ruleType", (n) -> { currentObject.setRuleType(n.getEnumValue(DeviceManagementApplicabilityRuleType.class)); });
        }};
    }
    /**
     * Gets the name property value. Name for object.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the osEditionTypes property value. Applicability rule OS edition type.
     * @return a windows10EditionType
     */
    @javax.annotation.Nullable
    public java.util.List<Windows10EditionType> getOsEditionTypes() {
        return this._osEditionTypes;
    }
    /**
     * Gets the ruleType property value. Applicability Rule type. Possible values are: include, exclude.
     * @return a deviceManagementApplicabilityRuleType
     */
    @javax.annotation.Nullable
    public DeviceManagementApplicabilityRuleType getRuleType() {
        return this._ruleType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("name", this.getName());
        writer.writeCollectionOfEnumValues("osEditionTypes", this.getOsEditionTypes());
        writer.writeEnumValue("ruleType", this.getRuleType());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the name property value. Name for object.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the osEditionTypes property value. Applicability rule OS edition type.
     * @param value Value to set for the osEditionTypes property.
     * @return a void
     */
    public void setOsEditionTypes(@javax.annotation.Nullable final java.util.List<Windows10EditionType> value) {
        this._osEditionTypes = value;
    }
    /**
     * Sets the ruleType property value. Applicability Rule type. Possible values are: include, exclude.
     * @param value Value to set for the ruleType property.
     * @return a void
     */
    public void setRuleType(@javax.annotation.Nullable final DeviceManagementApplicabilityRuleType value) {
        this._ruleType = value;
    }
}

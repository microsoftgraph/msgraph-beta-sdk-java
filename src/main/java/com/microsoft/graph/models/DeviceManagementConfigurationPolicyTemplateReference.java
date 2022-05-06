package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Policy template reference information  */
public class DeviceManagementConfigurationPolicyTemplateReference implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Template Display Name of the referenced template. This property is read-only.  */
    private String _templateDisplayName;
    /** Template Display Version of the referenced Template. This property is read-only.  */
    private String _templateDisplayVersion;
    /** Template Family of the referenced Template. This property is read-only. Possible values are: none, endpointSecurityAntivirus, endpointSecurityDiskEncryption, endpointSecurityFirewall, endpointSecurityEndpointDetectionAndResponse, endpointSecurityAttackSurfaceReduction, endpointSecurityAccountProtection, endpointSecurityApplicationControl, baseline.  */
    private DeviceManagementConfigurationTemplateFamily _templateFamily;
    /** Template id  */
    private String _templateId;
    /**
     * Instantiates a new deviceManagementConfigurationPolicyTemplateReference and sets the default values.
     * @return a void
     */
    public DeviceManagementConfigurationPolicyTemplateReference() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceManagementConfigurationPolicyTemplateReference
     */
    @javax.annotation.Nonnull
    public static DeviceManagementConfigurationPolicyTemplateReference createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceManagementConfigurationPolicyTemplateReference();
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
        final DeviceManagementConfigurationPolicyTemplateReference currentObject = this;
        return new HashMap<>(4) {{
            this.put("templateDisplayName", (n) -> { currentObject.setTemplateDisplayName(n.getStringValue()); });
            this.put("templateDisplayVersion", (n) -> { currentObject.setTemplateDisplayVersion(n.getStringValue()); });
            this.put("templateFamily", (n) -> { currentObject.setTemplateFamily(n.getEnumValue(DeviceManagementConfigurationTemplateFamily.class)); });
            this.put("templateId", (n) -> { currentObject.setTemplateId(n.getStringValue()); });
        }};
    }
    /**
     * Gets the templateDisplayName property value. Template Display Name of the referenced template. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTemplateDisplayName() {
        return this._templateDisplayName;
    }
    /**
     * Gets the templateDisplayVersion property value. Template Display Version of the referenced Template. This property is read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTemplateDisplayVersion() {
        return this._templateDisplayVersion;
    }
    /**
     * Gets the templateFamily property value. Template Family of the referenced Template. This property is read-only. Possible values are: none, endpointSecurityAntivirus, endpointSecurityDiskEncryption, endpointSecurityFirewall, endpointSecurityEndpointDetectionAndResponse, endpointSecurityAttackSurfaceReduction, endpointSecurityAccountProtection, endpointSecurityApplicationControl, baseline.
     * @return a deviceManagementConfigurationTemplateFamily
     */
    @javax.annotation.Nullable
    public DeviceManagementConfigurationTemplateFamily getTemplateFamily() {
        return this._templateFamily;
    }
    /**
     * Gets the templateId property value. Template id
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTemplateId() {
        return this._templateId;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("templateDisplayName", this.getTemplateDisplayName());
        writer.writeStringValue("templateDisplayVersion", this.getTemplateDisplayVersion());
        writer.writeEnumValue("templateFamily", this.getTemplateFamily());
        writer.writeStringValue("templateId", this.getTemplateId());
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
     * Sets the templateDisplayName property value. Template Display Name of the referenced template. This property is read-only.
     * @param value Value to set for the templateDisplayName property.
     * @return a void
     */
    public void setTemplateDisplayName(@javax.annotation.Nullable final String value) {
        this._templateDisplayName = value;
    }
    /**
     * Sets the templateDisplayVersion property value. Template Display Version of the referenced Template. This property is read-only.
     * @param value Value to set for the templateDisplayVersion property.
     * @return a void
     */
    public void setTemplateDisplayVersion(@javax.annotation.Nullable final String value) {
        this._templateDisplayVersion = value;
    }
    /**
     * Sets the templateFamily property value. Template Family of the referenced Template. This property is read-only. Possible values are: none, endpointSecurityAntivirus, endpointSecurityDiskEncryption, endpointSecurityFirewall, endpointSecurityEndpointDetectionAndResponse, endpointSecurityAttackSurfaceReduction, endpointSecurityAccountProtection, endpointSecurityApplicationControl, baseline.
     * @param value Value to set for the templateFamily property.
     * @return a void
     */
    public void setTemplateFamily(@javax.annotation.Nullable final DeviceManagementConfigurationTemplateFamily value) {
        this._templateFamily = value;
    }
    /**
     * Sets the templateId property value. Template id
     * @param value Value to set for the templateId property.
     * @return a void
     */
    public void setTemplateId(@javax.annotation.Nullable final String value) {
        this._templateId = value;
    }
}

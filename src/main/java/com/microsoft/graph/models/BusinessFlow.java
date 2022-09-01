package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of approvalWorkflowProvider entities. */
public class BusinessFlow extends Entity implements Parsable {
    /** The customData property */
    private String _customData;
    /** The deDuplicationId property */
    private String _deDuplicationId;
    /** The description property */
    private String _description;
    /** The displayName property */
    private String _displayName;
    /** The policy property */
    private GovernancePolicy _policy;
    /** The policyTemplateId property */
    private String _policyTemplateId;
    /** The recordVersion property */
    private String _recordVersion;
    /** The schemaId property */
    private String _schemaId;
    /** The settings property */
    private BusinessFlowSettings _settings;
    /**
     * Instantiates a new businessFlow and sets the default values.
     * @return a void
     */
    public BusinessFlow() {
        super();
        this.setOdataType("#microsoft.graph.businessFlow");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a businessFlow
     */
    @javax.annotation.Nonnull
    public static BusinessFlow createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new BusinessFlow();
    }
    /**
     * Gets the customData property value. The customData property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCustomData() {
        return this._customData;
    }
    /**
     * Gets the deDuplicationId property value. The deDuplicationId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeDuplicationId() {
        return this._deDuplicationId;
    }
    /**
     * Gets the description property value. The description property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The displayName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final BusinessFlow currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("customData", (n) -> { currentObject.setCustomData(n.getStringValue()); });
            this.put("deDuplicationId", (n) -> { currentObject.setDeDuplicationId(n.getStringValue()); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("policy", (n) -> { currentObject.setPolicy(n.getObjectValue(GovernancePolicy::createFromDiscriminatorValue)); });
            this.put("policyTemplateId", (n) -> { currentObject.setPolicyTemplateId(n.getStringValue()); });
            this.put("recordVersion", (n) -> { currentObject.setRecordVersion(n.getStringValue()); });
            this.put("schemaId", (n) -> { currentObject.setSchemaId(n.getStringValue()); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getObjectValue(BusinessFlowSettings::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the policy property value. The policy property
     * @return a governancePolicy
     */
    @javax.annotation.Nullable
    public GovernancePolicy getPolicy() {
        return this._policy;
    }
    /**
     * Gets the policyTemplateId property value. The policyTemplateId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyTemplateId() {
        return this._policyTemplateId;
    }
    /**
     * Gets the recordVersion property value. The recordVersion property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRecordVersion() {
        return this._recordVersion;
    }
    /**
     * Gets the schemaId property value. The schemaId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSchemaId() {
        return this._schemaId;
    }
    /**
     * Gets the settings property value. The settings property
     * @return a businessFlowSettings
     */
    @javax.annotation.Nullable
    public BusinessFlowSettings getSettings() {
        return this._settings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("customData", this.getCustomData());
        writer.writeStringValue("deDuplicationId", this.getDeDuplicationId());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("policy", this.getPolicy());
        writer.writeStringValue("policyTemplateId", this.getPolicyTemplateId());
        writer.writeStringValue("recordVersion", this.getRecordVersion());
        writer.writeStringValue("schemaId", this.getSchemaId());
        writer.writeObjectValue("settings", this.getSettings());
    }
    /**
     * Sets the customData property value. The customData property
     * @param value Value to set for the customData property.
     * @return a void
     */
    public void setCustomData(@javax.annotation.Nullable final String value) {
        this._customData = value;
    }
    /**
     * Sets the deDuplicationId property value. The deDuplicationId property
     * @param value Value to set for the deDuplicationId property.
     * @return a void
     */
    public void setDeDuplicationId(@javax.annotation.Nullable final String value) {
        this._deDuplicationId = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the policy property value. The policy property
     * @param value Value to set for the policy property.
     * @return a void
     */
    public void setPolicy(@javax.annotation.Nullable final GovernancePolicy value) {
        this._policy = value;
    }
    /**
     * Sets the policyTemplateId property value. The policyTemplateId property
     * @param value Value to set for the policyTemplateId property.
     * @return a void
     */
    public void setPolicyTemplateId(@javax.annotation.Nullable final String value) {
        this._policyTemplateId = value;
    }
    /**
     * Sets the recordVersion property value. The recordVersion property
     * @param value Value to set for the recordVersion property.
     * @return a void
     */
    public void setRecordVersion(@javax.annotation.Nullable final String value) {
        this._recordVersion = value;
    }
    /**
     * Sets the schemaId property value. The schemaId property
     * @param value Value to set for the schemaId property.
     * @return a void
     */
    public void setSchemaId(@javax.annotation.Nullable final String value) {
        this._schemaId = value;
    }
    /**
     * Sets the settings property value. The settings property
     * @param value Value to set for the settings property.
     * @return a void
     */
    public void setSettings(@javax.annotation.Nullable final BusinessFlowSettings value) {
        this._settings = value;
    }
}

package com.microsoft.graph.models.devicemanagement;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class PortalNotification implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The alertImpact property */
    private AlertImpact _alertImpact;
    /** The alertRecordId property */
    private String _alertRecordId;
    /** The alertRuleId property */
    private String _alertRuleId;
    /** The alertRuleName property */
    private String _alertRuleName;
    /** The alertRuleTemplate property */
    private AlertRuleTemplate _alertRuleTemplate;
    /** The id property */
    private String _id;
    /** The isPortalNotificationSent property */
    private Boolean _isPortalNotificationSent;
    /** The OdataType property */
    private String _odataType;
    /** The severity property */
    private RuleSeverityType _severity;
    /**
     * Instantiates a new portalNotification and sets the default values.
     * @return a void
     */
    public PortalNotification() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceManagement.portalNotification");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a portalNotification
     */
    @javax.annotation.Nonnull
    public static PortalNotification createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new PortalNotification();
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
     * Gets the alertImpact property value. The alertImpact property
     * @return a alertImpact
     */
    @javax.annotation.Nullable
    public AlertImpact getAlertImpact() {
        return this._alertImpact;
    }
    /**
     * Gets the alertRecordId property value. The alertRecordId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlertRecordId() {
        return this._alertRecordId;
    }
    /**
     * Gets the alertRuleId property value. The alertRuleId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlertRuleId() {
        return this._alertRuleId;
    }
    /**
     * Gets the alertRuleName property value. The alertRuleName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlertRuleName() {
        return this._alertRuleName;
    }
    /**
     * Gets the alertRuleTemplate property value. The alertRuleTemplate property
     * @return a alertRuleTemplate
     */
    @javax.annotation.Nullable
    public AlertRuleTemplate getAlertRuleTemplate() {
        return this._alertRuleTemplate;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final PortalNotification currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(9) {{
            this.put("alertImpact", (n) -> { currentObject.setAlertImpact(n.getObjectValue(AlertImpact::createFromDiscriminatorValue)); });
            this.put("alertRecordId", (n) -> { currentObject.setAlertRecordId(n.getStringValue()); });
            this.put("alertRuleId", (n) -> { currentObject.setAlertRuleId(n.getStringValue()); });
            this.put("alertRuleName", (n) -> { currentObject.setAlertRuleName(n.getStringValue()); });
            this.put("alertRuleTemplate", (n) -> { currentObject.setAlertRuleTemplate(n.getEnumValue(AlertRuleTemplate.class)); });
            this.put("id", (n) -> { currentObject.setId(n.getStringValue()); });
            this.put("isPortalNotificationSent", (n) -> { currentObject.setIsPortalNotificationSent(n.getBooleanValue()); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
            this.put("severity", (n) -> { currentObject.setSeverity(n.getEnumValue(RuleSeverityType.class)); });
        }};
    }
    /**
     * Gets the id property value. The id property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getId() {
        return this._id;
    }
    /**
     * Gets the isPortalNotificationSent property value. The isPortalNotificationSent property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsPortalNotificationSent() {
        return this._isPortalNotificationSent;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
    }
    /**
     * Gets the severity property value. The severity property
     * @return a ruleSeverityType
     */
    @javax.annotation.Nullable
    public RuleSeverityType getSeverity() {
        return this._severity;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("alertImpact", this.getAlertImpact());
        writer.writeStringValue("alertRecordId", this.getAlertRecordId());
        writer.writeStringValue("alertRuleId", this.getAlertRuleId());
        writer.writeStringValue("alertRuleName", this.getAlertRuleName());
        writer.writeEnumValue("alertRuleTemplate", this.getAlertRuleTemplate());
        writer.writeStringValue("id", this.getId());
        writer.writeBooleanValue("isPortalNotificationSent", this.getIsPortalNotificationSent());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeEnumValue("severity", this.getSeverity());
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
     * Sets the alertImpact property value. The alertImpact property
     * @param value Value to set for the alertImpact property.
     * @return a void
     */
    public void setAlertImpact(@javax.annotation.Nullable final AlertImpact value) {
        this._alertImpact = value;
    }
    /**
     * Sets the alertRecordId property value. The alertRecordId property
     * @param value Value to set for the alertRecordId property.
     * @return a void
     */
    public void setAlertRecordId(@javax.annotation.Nullable final String value) {
        this._alertRecordId = value;
    }
    /**
     * Sets the alertRuleId property value. The alertRuleId property
     * @param value Value to set for the alertRuleId property.
     * @return a void
     */
    public void setAlertRuleId(@javax.annotation.Nullable final String value) {
        this._alertRuleId = value;
    }
    /**
     * Sets the alertRuleName property value. The alertRuleName property
     * @param value Value to set for the alertRuleName property.
     * @return a void
     */
    public void setAlertRuleName(@javax.annotation.Nullable final String value) {
        this._alertRuleName = value;
    }
    /**
     * Sets the alertRuleTemplate property value. The alertRuleTemplate property
     * @param value Value to set for the alertRuleTemplate property.
     * @return a void
     */
    public void setAlertRuleTemplate(@javax.annotation.Nullable final AlertRuleTemplate value) {
        this._alertRuleTemplate = value;
    }
    /**
     * Sets the id property value. The id property
     * @param value Value to set for the id property.
     * @return a void
     */
    public void setId(@javax.annotation.Nullable final String value) {
        this._id = value;
    }
    /**
     * Sets the isPortalNotificationSent property value. The isPortalNotificationSent property
     * @param value Value to set for the isPortalNotificationSent property.
     * @return a void
     */
    public void setIsPortalNotificationSent(@javax.annotation.Nullable final Boolean value) {
        this._isPortalNotificationSent = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     * @return a void
     */
    public void setSeverity(@javax.annotation.Nullable final RuleSeverityType value) {
        this._severity = value;
    }
}

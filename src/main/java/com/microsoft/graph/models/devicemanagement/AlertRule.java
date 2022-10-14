package com.microsoft.graph.models.devicemanagement;

import com.microsoft.graph.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReview entities. */
public class AlertRule extends Entity implements Parsable {
    /** The alertRuleTemplate property */
    private AlertRuleTemplate _alertRuleTemplate;
    /** The description property */
    private String _description;
    /** The displayName property */
    private String _displayName;
    /** The enabled property */
    private Boolean _enabled;
    /** The isSystemRule property */
    private Boolean _isSystemRule;
    /** The notificationChannels property */
    private java.util.List<NotificationChannel> _notificationChannels;
    /** The severity property */
    private RuleSeverityType _severity;
    /** The threshold property */
    private RuleThreshold _threshold;
    /**
     * Instantiates a new alertRule and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public AlertRule() {
        super();
        this.setOdataType("#microsoft.graph.deviceManagement.alertRule");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a alertRule
     */
    @javax.annotation.Nonnull
    public static AlertRule createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AlertRule();
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
     * Gets the enabled property value. The enabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return this._enabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AlertRule currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("alertRuleTemplate", (n) -> { currentObject.setAlertRuleTemplate(n.getEnumValue(AlertRuleTemplate.class)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("enabled", (n) -> { currentObject.setEnabled(n.getBooleanValue()); });
            this.put("isSystemRule", (n) -> { currentObject.setIsSystemRule(n.getBooleanValue()); });
            this.put("notificationChannels", (n) -> { currentObject.setNotificationChannels(n.getCollectionOfObjectValues(NotificationChannel::createFromDiscriminatorValue)); });
            this.put("severity", (n) -> { currentObject.setSeverity(n.getEnumValue(RuleSeverityType.class)); });
            this.put("threshold", (n) -> { currentObject.setThreshold(n.getObjectValue(RuleThreshold::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isSystemRule property value. The isSystemRule property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSystemRule() {
        return this._isSystemRule;
    }
    /**
     * Gets the notificationChannels property value. The notificationChannels property
     * @return a notificationChannel
     */
    @javax.annotation.Nullable
    public java.util.List<NotificationChannel> getNotificationChannels() {
        return this._notificationChannels;
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
     * Gets the threshold property value. The threshold property
     * @return a ruleThreshold
     */
    @javax.annotation.Nullable
    public RuleThreshold getThreshold() {
        return this._threshold;
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
        writer.writeEnumValue("alertRuleTemplate", this.getAlertRuleTemplate());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeBooleanValue("enabled", this.getEnabled());
        writer.writeBooleanValue("isSystemRule", this.getIsSystemRule());
        writer.writeCollectionOfObjectValues("notificationChannels", this.getNotificationChannels());
        writer.writeEnumValue("severity", this.getSeverity());
        writer.writeObjectValue("threshold", this.getThreshold());
    }
    /**
     * Sets the alertRuleTemplate property value. The alertRuleTemplate property
     * @param value Value to set for the alertRuleTemplate property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertRuleTemplate(@javax.annotation.Nullable final AlertRuleTemplate value) {
        this._alertRuleTemplate = value;
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The displayName property
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the enabled property value. The enabled property
     * @param value Value to set for the enabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnabled(@javax.annotation.Nullable final Boolean value) {
        this._enabled = value;
    }
    /**
     * Sets the isSystemRule property value. The isSystemRule property
     * @param value Value to set for the isSystemRule property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSystemRule(@javax.annotation.Nullable final Boolean value) {
        this._isSystemRule = value;
    }
    /**
     * Sets the notificationChannels property value. The notificationChannels property
     * @param value Value to set for the notificationChannels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNotificationChannels(@javax.annotation.Nullable final java.util.List<NotificationChannel> value) {
        this._notificationChannels = value;
    }
    /**
     * Sets the severity property value. The severity property
     * @param value Value to set for the severity property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeverity(@javax.annotation.Nullable final RuleSeverityType value) {
        this._severity = value;
    }
    /**
     * Sets the threshold property value. The threshold property
     * @param value Value to set for the threshold property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setThreshold(@javax.annotation.Nullable final RuleThreshold value) {
        this._threshold = value;
    }
}

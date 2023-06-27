package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleManagementAlertDefinition extends Entity implements Parsable {
    /**
     * The description of the alert.
     */
    private String description;
    /**
     * The friendly display name that renders in Privileged Identity Management (PIM) alerts in the Azure portal.
     */
    private String displayName;
    /**
     * Long-form text that indicates the ways to prevent the alert from being triggered in your tenant.
     */
    private String howToPrevent;
    /**
     * true if the alert configuration can be customized in the tenant, and false otherwise. For example, the number and percentage thresholds of the 'There are too many global administrators' alert can be configured by users, while the 'This organization does not have Azure AD Premium P2' cannot be configured, because the criteria is restricted.
     */
    private Boolean isConfigurable;
    /**
     * true if the alert can be remediated, and false otherwise.
     */
    private Boolean isRemediatable;
    /**
     * The methods to mitigate the alert when it's triggered in the tenant. For example, to mitigate the 'There are too many global administrators', you could remove redundant privileged role assignments.
     */
    private String mitigationSteps;
    /**
     * The identifier of the scope where the alert is related. / is the only supported one for the tenant. Supports $filter (eq, ne).
     */
    private String scopeId;
    /**
     * The type of scope where the alert is created. DirectoryRole is the only currently supported scope type for Azure AD Roles.
     */
    private String scopeType;
    /**
     * Security impact of the alert. For example, it could be information leaks or unauthorized access.
     */
    private String securityImpact;
    /**
     * Severity level of the alert. The possible values are: unknown, informational, low, medium, high, unknownFutureValue.
     */
    private AlertSeverity severityLevel;
    /**
     * Instantiates a new unifiedRoleManagementAlertDefinition and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRoleManagementAlertDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleManagementAlertDefinition
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleManagementAlertDefinition createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementAlertDefinition();
    }
    /**
     * Gets the description property value. The description of the alert.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. The friendly display name that renders in Privileged Identity Management (PIM) alerts in the Azure portal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("howToPrevent", (n) -> { this.setHowToPrevent(n.getStringValue()); });
        deserializerMap.put("isConfigurable", (n) -> { this.setIsConfigurable(n.getBooleanValue()); });
        deserializerMap.put("isRemediatable", (n) -> { this.setIsRemediatable(n.getBooleanValue()); });
        deserializerMap.put("mitigationSteps", (n) -> { this.setMitigationSteps(n.getStringValue()); });
        deserializerMap.put("scopeId", (n) -> { this.setScopeId(n.getStringValue()); });
        deserializerMap.put("scopeType", (n) -> { this.setScopeType(n.getStringValue()); });
        deserializerMap.put("securityImpact", (n) -> { this.setSecurityImpact(n.getStringValue()); });
        deserializerMap.put("severityLevel", (n) -> { this.setSeverityLevel(n.getEnumValue(AlertSeverity.class)); });
        return deserializerMap;
    }
    /**
     * Gets the howToPrevent property value. Long-form text that indicates the ways to prevent the alert from being triggered in your tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getHowToPrevent() {
        return this.howToPrevent;
    }
    /**
     * Gets the isConfigurable property value. true if the alert configuration can be customized in the tenant, and false otherwise. For example, the number and percentage thresholds of the 'There are too many global administrators' alert can be configured by users, while the 'This organization does not have Azure AD Premium P2' cannot be configured, because the criteria is restricted.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsConfigurable() {
        return this.isConfigurable;
    }
    /**
     * Gets the isRemediatable property value. true if the alert can be remediated, and false otherwise.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRemediatable() {
        return this.isRemediatable;
    }
    /**
     * Gets the mitigationSteps property value. The methods to mitigate the alert when it's triggered in the tenant. For example, to mitigate the 'There are too many global administrators', you could remove redundant privileged role assignments.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMitigationSteps() {
        return this.mitigationSteps;
    }
    /**
     * Gets the scopeId property value. The identifier of the scope where the alert is related. / is the only supported one for the tenant. Supports $filter (eq, ne).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScopeId() {
        return this.scopeId;
    }
    /**
     * Gets the scopeType property value. The type of scope where the alert is created. DirectoryRole is the only currently supported scope type for Azure AD Roles.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScopeType() {
        return this.scopeType;
    }
    /**
     * Gets the securityImpact property value. Security impact of the alert. For example, it could be information leaks or unauthorized access.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSecurityImpact() {
        return this.securityImpact;
    }
    /**
     * Gets the severityLevel property value. Severity level of the alert. The possible values are: unknown, informational, low, medium, high, unknownFutureValue.
     * @return a alertSeverity
     */
    @javax.annotation.Nullable
    public AlertSeverity getSeverityLevel() {
        return this.severityLevel;
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
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("howToPrevent", this.getHowToPrevent());
        writer.writeBooleanValue("isConfigurable", this.getIsConfigurable());
        writer.writeBooleanValue("isRemediatable", this.getIsRemediatable());
        writer.writeStringValue("mitigationSteps", this.getMitigationSteps());
        writer.writeStringValue("scopeId", this.getScopeId());
        writer.writeStringValue("scopeType", this.getScopeType());
        writer.writeStringValue("securityImpact", this.getSecurityImpact());
        writer.writeEnumValue("severityLevel", this.getSeverityLevel());
    }
    /**
     * Sets the description property value. The description of the alert.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. The friendly display name that renders in Privileged Identity Management (PIM) alerts in the Azure portal.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the howToPrevent property value. Long-form text that indicates the ways to prevent the alert from being triggered in your tenant.
     * @param value Value to set for the howToPrevent property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHowToPrevent(@javax.annotation.Nullable final String value) {
        this.howToPrevent = value;
    }
    /**
     * Sets the isConfigurable property value. true if the alert configuration can be customized in the tenant, and false otherwise. For example, the number and percentage thresholds of the 'There are too many global administrators' alert can be configured by users, while the 'This organization does not have Azure AD Premium P2' cannot be configured, because the criteria is restricted.
     * @param value Value to set for the isConfigurable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsConfigurable(@javax.annotation.Nullable final Boolean value) {
        this.isConfigurable = value;
    }
    /**
     * Sets the isRemediatable property value. true if the alert can be remediated, and false otherwise.
     * @param value Value to set for the isRemediatable property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRemediatable(@javax.annotation.Nullable final Boolean value) {
        this.isRemediatable = value;
    }
    /**
     * Sets the mitigationSteps property value. The methods to mitigate the alert when it's triggered in the tenant. For example, to mitigate the 'There are too many global administrators', you could remove redundant privileged role assignments.
     * @param value Value to set for the mitigationSteps property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMitigationSteps(@javax.annotation.Nullable final String value) {
        this.mitigationSteps = value;
    }
    /**
     * Sets the scopeId property value. The identifier of the scope where the alert is related. / is the only supported one for the tenant. Supports $filter (eq, ne).
     * @param value Value to set for the scopeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScopeId(@javax.annotation.Nullable final String value) {
        this.scopeId = value;
    }
    /**
     * Sets the scopeType property value. The type of scope where the alert is created. DirectoryRole is the only currently supported scope type for Azure AD Roles.
     * @param value Value to set for the scopeType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScopeType(@javax.annotation.Nullable final String value) {
        this.scopeType = value;
    }
    /**
     * Sets the securityImpact property value. Security impact of the alert. For example, it could be information leaks or unauthorized access.
     * @param value Value to set for the securityImpact property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityImpact(@javax.annotation.Nullable final String value) {
        this.securityImpact = value;
    }
    /**
     * Sets the severityLevel property value. Severity level of the alert. The possible values are: unknown, informational, low, medium, high, unknownFutureValue.
     * @param value Value to set for the severityLevel property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSeverityLevel(@javax.annotation.Nullable final AlertSeverity value) {
        this.severityLevel = value;
    }
}

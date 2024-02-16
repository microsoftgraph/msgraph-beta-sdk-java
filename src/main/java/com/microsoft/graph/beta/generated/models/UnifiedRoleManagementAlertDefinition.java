package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleManagementAlertDefinition extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UnifiedRoleManagementAlertDefinition} and sets the default values.
     */
    public UnifiedRoleManagementAlertDefinition() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UnifiedRoleManagementAlertDefinition}
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleManagementAlertDefinition createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UnifiedRoleManagementAlertDefinition();
    }
    /**
     * Gets the description property value. The description of the alert.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The friendly display name that renders in Privileged Identity Management (PIM) alerts in the Microsoft Entra admin center.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
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
        deserializerMap.put("severityLevel", (n) -> { this.setSeverityLevel(n.getEnumValue(AlertSeverity::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the howToPrevent property value. Long-form text that indicates the ways to prevent the alert from being triggered in your tenant.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getHowToPrevent() {
        return this.backingStore.get("howToPrevent");
    }
    /**
     * Gets the isConfigurable property value. true if the alert configuration can be customized in the tenant, and false otherwise. For example, the number and percentage thresholds of the 'There are too many global administrators' alert can be configured by users, while the 'This organization doesn't have Microsoft Entra ID P2' can't be configured, because the criteria are restricted.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsConfigurable() {
        return this.backingStore.get("isConfigurable");
    }
    /**
     * Gets the isRemediatable property value. true if the alert can be remediated, and false otherwise.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsRemediatable() {
        return this.backingStore.get("isRemediatable");
    }
    /**
     * Gets the mitigationSteps property value. The methods to mitigate the alert when it's triggered in the tenant. For example, to mitigate the 'There are too many global administrators', you could remove redundant privileged role assignments.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getMitigationSteps() {
        return this.backingStore.get("mitigationSteps");
    }
    /**
     * Gets the scopeId property value. The identifier of the scope where the alert is related. / is the only supported one for the tenant. Supports $filter (eq, ne).
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScopeId() {
        return this.backingStore.get("scopeId");
    }
    /**
     * Gets the scopeType property value. The type of scope where the alert is created. DirectoryRole is the only currently supported scope type for Microsoft Entra roles.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getScopeType() {
        return this.backingStore.get("scopeType");
    }
    /**
     * Gets the securityImpact property value. Security impact of the alert. For example, it could be information leaks or unauthorized access.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getSecurityImpact() {
        return this.backingStore.get("securityImpact");
    }
    /**
     * Gets the severityLevel property value. Severity level of the alert. The possible values are: unknown, informational, low, medium, high, unknownFutureValue.
     * @return a {@link AlertSeverity}
     */
    @jakarta.annotation.Nullable
    public AlertSeverity getSeverityLevel() {
        return this.backingStore.get("severityLevel");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The friendly display name that renders in Privileged Identity Management (PIM) alerts in the Microsoft Entra admin center.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the howToPrevent property value. Long-form text that indicates the ways to prevent the alert from being triggered in your tenant.
     * @param value Value to set for the howToPrevent property.
     */
    public void setHowToPrevent(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("howToPrevent", value);
    }
    /**
     * Sets the isConfigurable property value. true if the alert configuration can be customized in the tenant, and false otherwise. For example, the number and percentage thresholds of the 'There are too many global administrators' alert can be configured by users, while the 'This organization doesn't have Microsoft Entra ID P2' can't be configured, because the criteria are restricted.
     * @param value Value to set for the isConfigurable property.
     */
    public void setIsConfigurable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isConfigurable", value);
    }
    /**
     * Sets the isRemediatable property value. true if the alert can be remediated, and false otherwise.
     * @param value Value to set for the isRemediatable property.
     */
    public void setIsRemediatable(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isRemediatable", value);
    }
    /**
     * Sets the mitigationSteps property value. The methods to mitigate the alert when it's triggered in the tenant. For example, to mitigate the 'There are too many global administrators', you could remove redundant privileged role assignments.
     * @param value Value to set for the mitigationSteps property.
     */
    public void setMitigationSteps(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("mitigationSteps", value);
    }
    /**
     * Sets the scopeId property value. The identifier of the scope where the alert is related. / is the only supported one for the tenant. Supports $filter (eq, ne).
     * @param value Value to set for the scopeId property.
     */
    public void setScopeId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scopeId", value);
    }
    /**
     * Sets the scopeType property value. The type of scope where the alert is created. DirectoryRole is the only currently supported scope type for Microsoft Entra roles.
     * @param value Value to set for the scopeType property.
     */
    public void setScopeType(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("scopeType", value);
    }
    /**
     * Sets the securityImpact property value. Security impact of the alert. For example, it could be information leaks or unauthorized access.
     * @param value Value to set for the securityImpact property.
     */
    public void setSecurityImpact(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("securityImpact", value);
    }
    /**
     * Sets the severityLevel property value. Severity level of the alert. The possible values are: unknown, informational, low, medium, high, unknownFutureValue.
     * @param value Value to set for the severityLevel property.
     */
    public void setSeverityLevel(@jakarta.annotation.Nullable final AlertSeverity value) {
        this.backingStore.set("severityLevel", value);
    }
}

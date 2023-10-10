package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UnifiedRoleManagementAlertConfiguration extends Entity implements Parsable {
    /**
     * The definition of the alert that contains its description, impact, and measures to mitigate or prevent it. Supports $expand.
     */
    private UnifiedRoleManagementAlertDefinition alertDefinition;
    /**
     * The identifier of an alert definition. Supports $filter (eq, ne).
     */
    private String alertDefinitionId;
    /**
     * true if the alert is enabled. Setting it to false disables PIM scanning the tenant to identify instances that trigger the alert.
     */
    private Boolean isEnabled;
    /**
     * The identifier of the scope to which the alert is related. Only / is supported to represent the tenant scope. Supports $filter (eq, ne).
     */
    private String scopeId;
    /**
     * The type of scope where the alert is created. DirectoryRole is the only currently supported scope type for Azure AD roles.
     */
    private String scopeType;
    /**
     * Instantiates a new UnifiedRoleManagementAlertConfiguration and sets the default values.
     */
    public UnifiedRoleManagementAlertConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a UnifiedRoleManagementAlertConfiguration
     */
    @jakarta.annotation.Nonnull
    public static UnifiedRoleManagementAlertConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.invalidLicenseAlertConfiguration": return new InvalidLicenseAlertConfiguration();
                case "#microsoft.graph.noMfaOnRoleActivationAlertConfiguration": return new NoMfaOnRoleActivationAlertConfiguration();
                case "#microsoft.graph.redundantAssignmentAlertConfiguration": return new RedundantAssignmentAlertConfiguration();
                case "#microsoft.graph.rolesAssignedOutsidePrivilegedIdentityManagementAlertConfiguration": return new RolesAssignedOutsidePrivilegedIdentityManagementAlertConfiguration();
                case "#microsoft.graph.sequentialActivationRenewalsAlertConfiguration": return new SequentialActivationRenewalsAlertConfiguration();
                case "#microsoft.graph.staleSignInAlertConfiguration": return new StaleSignInAlertConfiguration();
                case "#microsoft.graph.tooManyGlobalAdminsAssignedToTenantAlertConfiguration": return new TooManyGlobalAdminsAssignedToTenantAlertConfiguration();
            }
        }
        return new UnifiedRoleManagementAlertConfiguration();
    }
    /**
     * Gets the alertDefinition property value. The definition of the alert that contains its description, impact, and measures to mitigate or prevent it. Supports $expand.
     * @return a UnifiedRoleManagementAlertDefinition
     */
    @jakarta.annotation.Nullable
    public UnifiedRoleManagementAlertDefinition getAlertDefinition() {
        return this.alertDefinition;
    }
    /**
     * Gets the alertDefinitionId property value. The identifier of an alert definition. Supports $filter (eq, ne).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAlertDefinitionId() {
        return this.alertDefinitionId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alertDefinition", (n) -> { this.setAlertDefinition(n.getObjectValue(UnifiedRoleManagementAlertDefinition::createFromDiscriminatorValue)); });
        deserializerMap.put("alertDefinitionId", (n) -> { this.setAlertDefinitionId(n.getStringValue()); });
        deserializerMap.put("isEnabled", (n) -> { this.setIsEnabled(n.getBooleanValue()); });
        deserializerMap.put("scopeId", (n) -> { this.setScopeId(n.getStringValue()); });
        deserializerMap.put("scopeType", (n) -> { this.setScopeType(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isEnabled property value. true if the alert is enabled. Setting it to false disables PIM scanning the tenant to identify instances that trigger the alert.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Gets the scopeId property value. The identifier of the scope to which the alert is related. Only / is supported to represent the tenant scope. Supports $filter (eq, ne).
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getScopeId() {
        return this.scopeId;
    }
    /**
     * Gets the scopeType property value. The type of scope where the alert is created. DirectoryRole is the only currently supported scope type for Azure AD roles.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getScopeType() {
        return this.scopeType;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("alertDefinition", this.getAlertDefinition());
        writer.writeStringValue("alertDefinitionId", this.getAlertDefinitionId());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeStringValue("scopeId", this.getScopeId());
        writer.writeStringValue("scopeType", this.getScopeType());
    }
    /**
     * Sets the alertDefinition property value. The definition of the alert that contains its description, impact, and measures to mitigate or prevent it. Supports $expand.
     * @param value Value to set for the alertDefinition property.
     */
    public void setAlertDefinition(@jakarta.annotation.Nullable final UnifiedRoleManagementAlertDefinition value) {
        this.alertDefinition = value;
    }
    /**
     * Sets the alertDefinitionId property value. The identifier of an alert definition. Supports $filter (eq, ne).
     * @param value Value to set for the alertDefinitionId property.
     */
    public void setAlertDefinitionId(@jakarta.annotation.Nullable final String value) {
        this.alertDefinitionId = value;
    }
    /**
     * Sets the isEnabled property value. true if the alert is enabled. Setting it to false disables PIM scanning the tenant to identify instances that trigger the alert.
     * @param value Value to set for the isEnabled property.
     */
    public void setIsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
    /**
     * Sets the scopeId property value. The identifier of the scope to which the alert is related. Only / is supported to represent the tenant scope. Supports $filter (eq, ne).
     * @param value Value to set for the scopeId property.
     */
    public void setScopeId(@jakarta.annotation.Nullable final String value) {
        this.scopeId = value;
    }
    /**
     * Sets the scopeType property value. The type of scope where the alert is created. DirectoryRole is the only currently supported scope type for Azure AD roles.
     * @param value Value to set for the scopeType property.
     */
    public void setScopeType(@jakarta.annotation.Nullable final String value) {
        this.scopeType = value;
    }
}

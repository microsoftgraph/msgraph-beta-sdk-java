package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class UnifiedRoleManagementAlertConfiguration extends Entity implements Parsable {
    /** The alertDefinition property */
    private UnifiedRoleManagementAlertDefinition alertDefinition;
    /** The alertDefinitionId property */
    private String alertDefinitionId;
    /** The isEnabled property */
    private Boolean isEnabled;
    /** The scopeId property */
    private String scopeId;
    /** The scopeType property */
    private String scopeType;
    /**
     * Instantiates a new unifiedRoleManagementAlertConfiguration and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public UnifiedRoleManagementAlertConfiguration() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a unifiedRoleManagementAlertConfiguration
     */
    @javax.annotation.Nonnull
    public static UnifiedRoleManagementAlertConfiguration createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * Gets the alertDefinition property value. The alertDefinition property
     * @return a unifiedRoleManagementAlertDefinition
     */
    @javax.annotation.Nullable
    public UnifiedRoleManagementAlertDefinition getAlertDefinition() {
        return this.alertDefinition;
    }
    /**
     * Gets the alertDefinitionId property value. The alertDefinitionId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlertDefinitionId() {
        return this.alertDefinitionId;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * Gets the isEnabled property value. The isEnabled property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * Gets the scopeId property value. The scopeId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScopeId() {
        return this.scopeId;
    }
    /**
     * Gets the scopeType property value. The scopeType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getScopeType() {
        return this.scopeType;
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
        writer.writeObjectValue("alertDefinition", this.getAlertDefinition());
        writer.writeStringValue("alertDefinitionId", this.getAlertDefinitionId());
        writer.writeBooleanValue("isEnabled", this.getIsEnabled());
        writer.writeStringValue("scopeId", this.getScopeId());
        writer.writeStringValue("scopeType", this.getScopeType());
    }
    /**
     * Sets the alertDefinition property value. The alertDefinition property
     * @param value Value to set for the alertDefinition property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertDefinition(@javax.annotation.Nullable final UnifiedRoleManagementAlertDefinition value) {
        this.alertDefinition = value;
    }
    /**
     * Sets the alertDefinitionId property value. The alertDefinitionId property
     * @param value Value to set for the alertDefinitionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlertDefinitionId(@javax.annotation.Nullable final String value) {
        this.alertDefinitionId = value;
    }
    /**
     * Sets the isEnabled property value. The isEnabled property
     * @param value Value to set for the isEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsEnabled(@javax.annotation.Nullable final Boolean value) {
        this.isEnabled = value;
    }
    /**
     * Sets the scopeId property value. The scopeId property
     * @param value Value to set for the scopeId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScopeId(@javax.annotation.Nullable final String value) {
        this.scopeId = value;
    }
    /**
     * Sets the scopeType property value. The scopeType property
     * @param value Value to set for the scopeType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setScopeType(@javax.annotation.Nullable final String value) {
        this.scopeType = value;
    }
}

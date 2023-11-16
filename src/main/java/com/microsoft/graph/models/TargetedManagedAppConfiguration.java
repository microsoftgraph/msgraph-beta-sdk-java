package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Configuration used to deliver a set of custom settings as-is to all users in the targeted security group
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TargetedManagedAppConfiguration extends ManagedAppConfiguration implements Parsable {
    /**
     * Instantiates a new TargetedManagedAppConfiguration and sets the default values.
     */
    public TargetedManagedAppConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.targetedManagedAppConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TargetedManagedAppConfiguration
     */
    @jakarta.annotation.Nonnull
    public static TargetedManagedAppConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new TargetedManagedAppConfiguration();
    }
    /**
     * Gets the appGroupType property value. Indicates a collection of apps to target which can be one of several pre-defined lists of apps or a manually selected list of apps
     * @return a TargetedManagedAppGroupType
     */
    @jakarta.annotation.Nullable
    public TargetedManagedAppGroupType getAppGroupType() {
        return this.BackingStore.get("appGroupType");
    }
    /**
     * Gets the apps property value. List of apps to which the policy is deployed.
     * @return a java.util.List<ManagedMobileApp>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ManagedMobileApp> getApps() {
        return this.BackingStore.get("apps");
    }
    /**
     * Gets the assignments property value. Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
     * @return a java.util.List<TargetedManagedAppPolicyAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<TargetedManagedAppPolicyAssignment> getAssignments() {
        return this.BackingStore.get("assignments");
    }
    /**
     * Gets the deployedAppCount property value. Count of apps to which the current policy is deployed.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeployedAppCount() {
        return this.BackingStore.get("deployedAppCount");
    }
    /**
     * Gets the deploymentSummary property value. Navigation property to deployment summary of the configuration.
     * @return a ManagedAppPolicyDeploymentSummary
     */
    @jakarta.annotation.Nullable
    public ManagedAppPolicyDeploymentSummary getDeploymentSummary() {
        return this.BackingStore.get("deploymentSummary");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appGroupType", (n) -> { this.setAppGroupType(n.getEnumValue(TargetedManagedAppGroupType.class)); });
        deserializerMap.put("apps", (n) -> { this.setApps(n.getCollectionOfObjectValues(ManagedMobileApp::createFromDiscriminatorValue)); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(TargetedManagedAppPolicyAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("deployedAppCount", (n) -> { this.setDeployedAppCount(n.getIntegerValue()); });
        deserializerMap.put("deploymentSummary", (n) -> { this.setDeploymentSummary(n.getObjectValue(ManagedAppPolicyDeploymentSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("isAssigned", (n) -> { this.setIsAssigned(n.getBooleanValue()); });
        deserializerMap.put("targetedAppManagementLevels", (n) -> { this.setTargetedAppManagementLevels(n.getEnumSetValue(AppManagementLevel.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isAssigned property value. Indicates if the policy is deployed to any inclusion groups or not.
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAssigned() {
        return this.BackingStore.get("isAssigned");
    }
    /**
     * Gets the targetedAppManagementLevels property value. Management levels for apps
     * @return a EnumSet<AppManagementLevel>
     */
    @jakarta.annotation.Nullable
    public EnumSet<AppManagementLevel> getTargetedAppManagementLevels() {
        return this.BackingStore.get("targetedAppManagementLevels");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("appGroupType", this.getAppGroupType());
        writer.writeCollectionOfObjectValues("apps", this.getApps());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeIntegerValue("deployedAppCount", this.getDeployedAppCount());
        writer.writeObjectValue("deploymentSummary", this.getDeploymentSummary());
        writer.writeBooleanValue("isAssigned", this.getIsAssigned());
        writer.writeEnumSetValue("targetedAppManagementLevels", this.getTargetedAppManagementLevels());
    }
    /**
     * Sets the appGroupType property value. Indicates a collection of apps to target which can be one of several pre-defined lists of apps or a manually selected list of apps
     * @param value Value to set for the appGroupType property.
     */
    public void setAppGroupType(@jakarta.annotation.Nullable final TargetedManagedAppGroupType value) {
        this.BackingStore.set("appGroupType", value);
    }
    /**
     * Sets the apps property value. List of apps to which the policy is deployed.
     * @param value Value to set for the apps property.
     */
    public void setApps(@jakarta.annotation.Nullable final java.util.List<ManagedMobileApp> value) {
        this.BackingStore.set("apps", value);
    }
    /**
     * Sets the assignments property value. Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<TargetedManagedAppPolicyAssignment> value) {
        this.BackingStore.set("assignments", value);
    }
    /**
     * Sets the deployedAppCount property value. Count of apps to which the current policy is deployed.
     * @param value Value to set for the deployedAppCount property.
     */
    public void setDeployedAppCount(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("deployedAppCount", value);
    }
    /**
     * Sets the deploymentSummary property value. Navigation property to deployment summary of the configuration.
     * @param value Value to set for the deploymentSummary property.
     */
    public void setDeploymentSummary(@jakarta.annotation.Nullable final ManagedAppPolicyDeploymentSummary value) {
        this.BackingStore.set("deploymentSummary", value);
    }
    /**
     * Sets the isAssigned property value. Indicates if the policy is deployed to any inclusion groups or not.
     * @param value Value to set for the isAssigned property.
     */
    public void setIsAssigned(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isAssigned", value);
    }
    /**
     * Sets the targetedAppManagementLevels property value. Management levels for apps
     * @param value Value to set for the targetedAppManagementLevels property.
     */
    public void setTargetedAppManagementLevels(@jakarta.annotation.Nullable final EnumSet<AppManagementLevel> value) {
        this.BackingStore.set("targetedAppManagementLevels", value);
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Policy used to configure detailed management settings targeted to specific security groups
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class TargetedManagedAppProtection extends ManagedAppProtection implements Parsable {
    /**
     * Instantiates a new {@link TargetedManagedAppProtection} and sets the default values.
     */
    public TargetedManagedAppProtection() {
        super();
        this.setOdataType("#microsoft.graph.targetedManagedAppProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link TargetedManagedAppProtection}
     */
    @jakarta.annotation.Nonnull
    public static TargetedManagedAppProtection createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.androidManagedAppProtection": return new AndroidManagedAppProtection();
                case "#microsoft.graph.iosManagedAppProtection": return new IosManagedAppProtection();
            }
        }
        return new TargetedManagedAppProtection();
    }
    /**
     * Gets the appGroupType property value. Indicates a collection of apps to target which can be one of several pre-defined lists of apps or a manually selected list of apps
     * @return a {@link TargetedManagedAppGroupType}
     */
    @jakarta.annotation.Nullable
    public TargetedManagedAppGroupType getAppGroupType() {
        return this.backingStore.get("appGroupType");
    }
    /**
     * Gets the assignments property value. Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
     * @return a {@link java.util.List<TargetedManagedAppPolicyAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<TargetedManagedAppPolicyAssignment> getAssignments() {
        return this.backingStore.get("assignments");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appGroupType", (n) -> { this.setAppGroupType(n.getEnumValue(TargetedManagedAppGroupType::forValue)); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(TargetedManagedAppPolicyAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("isAssigned", (n) -> { this.setIsAssigned(n.getBooleanValue()); });
        deserializerMap.put("targetedAppManagementLevels", (n) -> { this.setTargetedAppManagementLevels(n.getEnumSetValue(AppManagementLevel::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isAssigned property value. Indicates if the policy is deployed to any inclusion groups or not.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsAssigned() {
        return this.backingStore.get("isAssigned");
    }
    /**
     * Gets the targetedAppManagementLevels property value. Management levels for apps
     * @return a {@link EnumSet<AppManagementLevel>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<AppManagementLevel> getTargetedAppManagementLevels() {
        return this.backingStore.get("targetedAppManagementLevels");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("appGroupType", this.getAppGroupType());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeBooleanValue("isAssigned", this.getIsAssigned());
        writer.writeEnumSetValue("targetedAppManagementLevels", this.getTargetedAppManagementLevels());
    }
    /**
     * Sets the appGroupType property value. Indicates a collection of apps to target which can be one of several pre-defined lists of apps or a manually selected list of apps
     * @param value Value to set for the appGroupType property.
     */
    public void setAppGroupType(@jakarta.annotation.Nullable final TargetedManagedAppGroupType value) {
        this.backingStore.set("appGroupType", value);
    }
    /**
     * Sets the assignments property value. Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
     * @param value Value to set for the assignments property.
     */
    public void setAssignments(@jakarta.annotation.Nullable final java.util.List<TargetedManagedAppPolicyAssignment> value) {
        this.backingStore.set("assignments", value);
    }
    /**
     * Sets the isAssigned property value. Indicates if the policy is deployed to any inclusion groups or not.
     * @param value Value to set for the isAssigned property.
     */
    public void setIsAssigned(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isAssigned", value);
    }
    /**
     * Sets the targetedAppManagementLevels property value. Management levels for apps
     * @param value Value to set for the targetedAppManagementLevels property.
     */
    public void setTargetedAppManagementLevels(@jakarta.annotation.Nullable final EnumSet<AppManagementLevel> value) {
        this.backingStore.set("targetedAppManagementLevels", value);
    }
}

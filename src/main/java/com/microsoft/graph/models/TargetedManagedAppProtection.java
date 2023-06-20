package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class TargetedManagedAppProtection extends ManagedAppProtection implements Parsable {
    /** Indicates a collection of apps to target which can be one of several pre-defined lists of apps or a manually selected list of apps */
    private TargetedManagedAppGroupType appGroupType;
    /** Navigation property to list of inclusion and exclusion groups to which the policy is deployed. */
    private java.util.List<TargetedManagedAppPolicyAssignment> assignments;
    /** Indicates if the policy is deployed to any inclusion groups or not. */
    private Boolean isAssigned;
    /** Management levels for apps */
    private AppManagementLevel targetedAppManagementLevels;
    /**
     * Instantiates a new TargetedManagedAppProtection and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public TargetedManagedAppProtection() {
        super();
        this.setOdataType("#microsoft.graph.targetedManagedAppProtection");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a TargetedManagedAppProtection
     */
    @javax.annotation.Nonnull
    public static TargetedManagedAppProtection createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
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
     * @return a TargetedManagedAppGroupType
     */
    @javax.annotation.Nullable
    public TargetedManagedAppGroupType getAppGroupType() {
        return this.appGroupType;
    }
    /**
     * Gets the assignments property value. Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
     * @return a targetedManagedAppPolicyAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<TargetedManagedAppPolicyAssignment> getAssignments() {
        return this.assignments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appGroupType", (n) -> { this.setAppGroupType(n.getEnumValue(TargetedManagedAppGroupType.class)); });
        deserializerMap.put("assignments", (n) -> { this.setAssignments(n.getCollectionOfObjectValues(TargetedManagedAppPolicyAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("isAssigned", (n) -> { this.setIsAssigned(n.getBooleanValue()); });
        deserializerMap.put("targetedAppManagementLevels", (n) -> { this.setTargetedAppManagementLevels(n.getEnumValue(AppManagementLevel.class)); });
        return deserializerMap;
    }
    /**
     * Gets the isAssigned property value. Indicates if the policy is deployed to any inclusion groups or not.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsAssigned() {
        return this.isAssigned;
    }
    /**
     * Gets the targetedAppManagementLevels property value. Management levels for apps
     * @return a AppManagementLevel
     */
    @javax.annotation.Nullable
    public AppManagementLevel getTargetedAppManagementLevels() {
        return this.targetedAppManagementLevels;
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
        writer.writeEnumValue("appGroupType", this.getAppGroupType());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeBooleanValue("isAssigned", this.getIsAssigned());
        writer.writeEnumValue("targetedAppManagementLevels", this.getTargetedAppManagementLevels());
    }
    /**
     * Sets the appGroupType property value. Indicates a collection of apps to target which can be one of several pre-defined lists of apps or a manually selected list of apps
     * @param value Value to set for the appGroupType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAppGroupType(@javax.annotation.Nullable final TargetedManagedAppGroupType value) {
        this.appGroupType = value;
    }
    /**
     * Sets the assignments property value. Navigation property to list of inclusion and exclusion groups to which the policy is deployed.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<TargetedManagedAppPolicyAssignment> value) {
        this.assignments = value;
    }
    /**
     * Sets the isAssigned property value. Indicates if the policy is deployed to any inclusion groups or not.
     * @param value Value to set for the isAssigned property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsAssigned(@javax.annotation.Nullable final Boolean value) {
        this.isAssigned = value;
    }
    /**
     * Sets the targetedAppManagementLevels property value. Management levels for apps
     * @param value Value to set for the targetedAppManagementLevels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetedAppManagementLevels(@javax.annotation.Nullable final AppManagementLevel value) {
        this.targetedAppManagementLevels = value;
    }
}

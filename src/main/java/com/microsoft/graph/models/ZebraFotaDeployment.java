package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The Zebra FOTA deployment entity that describes settings, deployment device groups required to create a FOTA deployment, and deployment status.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class ZebraFotaDeployment extends Entity implements Parsable {
    /**
     * Instantiates a new ZebraFotaDeployment and sets the default values.
     */
    public ZebraFotaDeployment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ZebraFotaDeployment
     */
    @jakarta.annotation.Nonnull
    public static ZebraFotaDeployment createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ZebraFotaDeployment();
    }
    /**
     * Gets the deploymentAssignments property value. Collection of Android FOTA Assignment
     * @return a java.util.List<AndroidFotaDeploymentAssignment>
     */
    @jakarta.annotation.Nullable
    public java.util.List<AndroidFotaDeploymentAssignment> getDeploymentAssignments() {
        return this.BackingStore.get("deploymentAssignments");
    }
    /**
     * Gets the deploymentSettings property value. The Zebra FOTA deployment complex type that describes the settings required to create a FOTA deployment.
     * @return a ZebraFotaDeploymentSettings
     */
    @jakarta.annotation.Nullable
    public ZebraFotaDeploymentSettings getDeploymentSettings() {
        return this.BackingStore.get("deploymentSettings");
    }
    /**
     * Gets the deploymentStatus property value. Represents the deployment status from Zebra. The status is a high level status of the deployment as opposed being a detailed status per device.
     * @return a ZebraFotaDeploymentStatus
     */
    @jakarta.annotation.Nullable
    public ZebraFotaDeploymentStatus getDeploymentStatus() {
        return this.BackingStore.get("deploymentStatus");
    }
    /**
     * Gets the description property value. A human readable description of the deployment.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.BackingStore.get("description");
    }
    /**
     * Gets the displayName property value. A human readable name of the deployment.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.BackingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("deploymentAssignments", (n) -> { this.setDeploymentAssignments(n.getCollectionOfObjectValues(AndroidFotaDeploymentAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("deploymentSettings", (n) -> { this.setDeploymentSettings(n.getObjectValue(ZebraFotaDeploymentSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("deploymentStatus", (n) -> { this.setDeploymentStatus(n.getObjectValue(ZebraFotaDeploymentStatus::createFromDiscriminatorValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("roleScopeTagIds", (n) -> { this.setRoleScopeTagIds(n.getCollectionOfPrimitiveValues(String.class)); });
        return deserializerMap;
    }
    /**
     * Gets the roleScopeTagIds property value. List of Scope Tags for this Entity instance
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.BackingStore.get("roleScopeTagIds");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("deploymentAssignments", this.getDeploymentAssignments());
        writer.writeObjectValue("deploymentSettings", this.getDeploymentSettings());
        writer.writeObjectValue("deploymentStatus", this.getDeploymentStatus());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("roleScopeTagIds", this.getRoleScopeTagIds());
    }
    /**
     * Sets the deploymentAssignments property value. Collection of Android FOTA Assignment
     * @param value Value to set for the deploymentAssignments property.
     */
    public void setDeploymentAssignments(@jakarta.annotation.Nullable final java.util.List<AndroidFotaDeploymentAssignment> value) {
        this.BackingStore.set("deploymentAssignments", value);
    }
    /**
     * Sets the deploymentSettings property value. The Zebra FOTA deployment complex type that describes the settings required to create a FOTA deployment.
     * @param value Value to set for the deploymentSettings property.
     */
    public void setDeploymentSettings(@jakarta.annotation.Nullable final ZebraFotaDeploymentSettings value) {
        this.BackingStore.set("deploymentSettings", value);
    }
    /**
     * Sets the deploymentStatus property value. Represents the deployment status from Zebra. The status is a high level status of the deployment as opposed being a detailed status per device.
     * @param value Value to set for the deploymentStatus property.
     */
    public void setDeploymentStatus(@jakarta.annotation.Nullable final ZebraFotaDeploymentStatus value) {
        this.BackingStore.set("deploymentStatus", value);
    }
    /**
     * Sets the description property value. A human readable description of the deployment.
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. A human readable name of the deployment.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("displayName", value);
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance
     * @param value Value to set for the roleScopeTagIds property.
     */
    public void setRoleScopeTagIds(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("roleScopeTagIds", value);
    }
}

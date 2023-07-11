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
public class ZebraFotaDeployment extends Entity implements Parsable {
    /**
     * Collection of Android FOTA Assignment
     */
    private java.util.List<AndroidFotaDeploymentAssignment> deploymentAssignments;
    /**
     * The Zebra FOTA deployment complex type that describes the settings required to create a FOTA deployment.
     */
    private ZebraFotaDeploymentSettings deploymentSettings;
    /**
     * Represents the deployment status from Zebra. The status is a high level status of the deployment as opposed being a detailed status per device.
     */
    private ZebraFotaDeploymentStatus deploymentStatus;
    /**
     * A human readable description of the deployment.
     */
    private String description;
    /**
     * A human readable name of the deployment.
     */
    private String displayName;
    /**
     * List of Scope Tags for this Entity instance
     */
    private java.util.List<String> roleScopeTagIds;
    /**
     * Instantiates a new zebraFotaDeployment and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ZebraFotaDeployment() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a zebraFotaDeployment
     */
    @javax.annotation.Nonnull
    public static ZebraFotaDeployment createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ZebraFotaDeployment();
    }
    /**
     * Gets the deploymentAssignments property value. Collection of Android FOTA Assignment
     * @return a androidFotaDeploymentAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<AndroidFotaDeploymentAssignment> getDeploymentAssignments() {
        return this.deploymentAssignments;
    }
    /**
     * Gets the deploymentSettings property value. The Zebra FOTA deployment complex type that describes the settings required to create a FOTA deployment.
     * @return a zebraFotaDeploymentSettings
     */
    @javax.annotation.Nullable
    public ZebraFotaDeploymentSettings getDeploymentSettings() {
        return this.deploymentSettings;
    }
    /**
     * Gets the deploymentStatus property value. Represents the deployment status from Zebra. The status is a high level status of the deployment as opposed being a detailed status per device.
     * @return a zebraFotaDeploymentStatus
     */
    @javax.annotation.Nullable
    public ZebraFotaDeploymentStatus getDeploymentStatus() {
        return this.deploymentStatus;
    }
    /**
     * Gets the description property value. A human readable description of the deployment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this.description;
    }
    /**
     * Gets the displayName property value. A human readable name of the deployment.
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
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getRoleScopeTagIds() {
        return this.roleScopeTagIds;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploymentAssignments(@javax.annotation.Nullable final java.util.List<AndroidFotaDeploymentAssignment> value) {
        this.deploymentAssignments = value;
    }
    /**
     * Sets the deploymentSettings property value. The Zebra FOTA deployment complex type that describes the settings required to create a FOTA deployment.
     * @param value Value to set for the deploymentSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploymentSettings(@javax.annotation.Nullable final ZebraFotaDeploymentSettings value) {
        this.deploymentSettings = value;
    }
    /**
     * Sets the deploymentStatus property value. Represents the deployment status from Zebra. The status is a high level status of the deployment as opposed being a detailed status per device.
     * @param value Value to set for the deploymentStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploymentStatus(@javax.annotation.Nullable final ZebraFotaDeploymentStatus value) {
        this.deploymentStatus = value;
    }
    /**
     * Sets the description property value. A human readable description of the deployment.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this.description = value;
    }
    /**
     * Sets the displayName property value. A human readable name of the deployment.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the roleScopeTagIds property value. List of Scope Tags for this Entity instance
     * @param value Value to set for the roleScopeTagIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRoleScopeTagIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this.roleScopeTagIds = value;
    }
}

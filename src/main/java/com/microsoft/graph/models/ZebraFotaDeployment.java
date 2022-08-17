package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class ZebraFotaDeployment extends Entity implements Parsable {
    /** Collection of Android FOTA Assignment */
    private java.util.List<AndroidFotaDeploymentAssignment> _deploymentAssignments;
    /** The Zebra FOTA deployment complex type that describes the settings required to create a FOTA deployment. */
    private ZebraFotaDeploymentSettings _deploymentSettings;
    /** Represents the deployment status from Zebra. The status is a high level status of the deployment as opposed being a detailed status per device. */
    private ZebraFotaDeploymentStatus _deploymentStatus;
    /** A human readable description of the deployment. */
    private String _description;
    /** A human readable name of the deployment. */
    private String _displayName;
    /**
     * Instantiates a new ZebraFotaDeployment and sets the default values.
     * @return a void
     */
    public ZebraFotaDeployment() {
        super();
        this.setOdataType("#microsoft.graph.zebraFotaDeployment");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ZebraFotaDeployment
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
        return this._deploymentAssignments;
    }
    /**
     * Gets the deploymentSettings property value. The Zebra FOTA deployment complex type that describes the settings required to create a FOTA deployment.
     * @return a zebraFotaDeploymentSettings
     */
    @javax.annotation.Nullable
    public ZebraFotaDeploymentSettings getDeploymentSettings() {
        return this._deploymentSettings;
    }
    /**
     * Gets the deploymentStatus property value. Represents the deployment status from Zebra. The status is a high level status of the deployment as opposed being a detailed status per device.
     * @return a zebraFotaDeploymentStatus
     */
    @javax.annotation.Nullable
    public ZebraFotaDeploymentStatus getDeploymentStatus() {
        return this._deploymentStatus;
    }
    /**
     * Gets the description property value. A human readable description of the deployment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. A human readable name of the deployment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ZebraFotaDeployment currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deploymentAssignments", (n) -> { currentObject.setDeploymentAssignments(n.getCollectionOfObjectValues(AndroidFotaDeploymentAssignment::createFromDiscriminatorValue)); });
            this.put("deploymentSettings", (n) -> { currentObject.setDeploymentSettings(n.getObjectValue(ZebraFotaDeploymentSettings::createFromDiscriminatorValue)); });
            this.put("deploymentStatus", (n) -> { currentObject.setDeploymentStatus(n.getObjectValue(ZebraFotaDeploymentStatus::createFromDiscriminatorValue)); });
            this.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("deploymentAssignments", this.getDeploymentAssignments());
        writer.writeObjectValue("deploymentSettings", this.getDeploymentSettings());
        writer.writeObjectValue("deploymentStatus", this.getDeploymentStatus());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
    }
    /**
     * Sets the deploymentAssignments property value. Collection of Android FOTA Assignment
     * @param value Value to set for the deploymentAssignments property.
     * @return a void
     */
    public void setDeploymentAssignments(@javax.annotation.Nullable final java.util.List<AndroidFotaDeploymentAssignment> value) {
        this._deploymentAssignments = value;
    }
    /**
     * Sets the deploymentSettings property value. The Zebra FOTA deployment complex type that describes the settings required to create a FOTA deployment.
     * @param value Value to set for the deploymentSettings property.
     * @return a void
     */
    public void setDeploymentSettings(@javax.annotation.Nullable final ZebraFotaDeploymentSettings value) {
        this._deploymentSettings = value;
    }
    /**
     * Sets the deploymentStatus property value. Represents the deployment status from Zebra. The status is a high level status of the deployment as opposed being a detailed status per device.
     * @param value Value to set for the deploymentStatus property.
     * @return a void
     */
    public void setDeploymentStatus(@javax.annotation.Nullable final ZebraFotaDeploymentStatus value) {
        this._deploymentStatus = value;
    }
    /**
     * Sets the description property value. A human readable description of the deployment.
     * @param value Value to set for the description property.
     * @return a void
     */
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. A human readable name of the deployment.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
}

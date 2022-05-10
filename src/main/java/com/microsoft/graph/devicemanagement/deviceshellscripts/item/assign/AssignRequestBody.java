package microsoft.graph.devicemanagement.deviceshellscripts.item.assign;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import microsoft.graph.models.DeviceManagementScriptAssignment;
import microsoft.graph.models.DeviceManagementScriptGroupAssignment;
/** Provides operations to call the assign method. */
public class AssignRequestBody implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The deviceManagementScriptAssignments property */
    private java.util.List<DeviceManagementScriptAssignment> _deviceManagementScriptAssignments;
    /** The deviceManagementScriptGroupAssignments property */
    private java.util.List<DeviceManagementScriptGroupAssignment> _deviceManagementScriptGroupAssignments;
    /**
     * Instantiates a new assignRequestBody and sets the default values.
     * @return a void
     */
    public AssignRequestBody() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a assignRequestBody
     */
    @javax.annotation.Nonnull
    public static AssignRequestBody createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new AssignRequestBody();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this._additionalData;
    }
    /**
     * Gets the deviceManagementScriptAssignments property value. The deviceManagementScriptAssignments property
     * @return a deviceManagementScriptAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementScriptAssignment> getDeviceManagementScriptAssignments() {
        return this._deviceManagementScriptAssignments;
    }
    /**
     * Gets the deviceManagementScriptGroupAssignments property value. The deviceManagementScriptGroupAssignments property
     * @return a deviceManagementScriptGroupAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<DeviceManagementScriptGroupAssignment> getDeviceManagementScriptGroupAssignments() {
        return this._deviceManagementScriptGroupAssignments;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final AssignRequestBody currentObject = this;
        return new HashMap<>(2) {{
            this.put("deviceManagementScriptAssignments", (n) -> { currentObject.setDeviceManagementScriptAssignments(n.getCollectionOfObjectValues(DeviceManagementScriptAssignment::createFromDiscriminatorValue)); });
            this.put("deviceManagementScriptGroupAssignments", (n) -> { currentObject.setDeviceManagementScriptGroupAssignments(n.getCollectionOfObjectValues(DeviceManagementScriptGroupAssignment::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeCollectionOfObjectValues("deviceManagementScriptAssignments", this.getDeviceManagementScriptAssignments());
        writer.writeCollectionOfObjectValues("deviceManagementScriptGroupAssignments", this.getDeviceManagementScriptGroupAssignments());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the deviceManagementScriptAssignments property value. The deviceManagementScriptAssignments property
     * @param value Value to set for the deviceManagementScriptAssignments property.
     * @return a void
     */
    public void setDeviceManagementScriptAssignments(@javax.annotation.Nullable final java.util.List<DeviceManagementScriptAssignment> value) {
        this._deviceManagementScriptAssignments = value;
    }
    /**
     * Sets the deviceManagementScriptGroupAssignments property value. The deviceManagementScriptGroupAssignments property
     * @param value Value to set for the deviceManagementScriptGroupAssignments property.
     * @return a void
     */
    public void setDeviceManagementScriptGroupAssignments(@javax.annotation.Nullable final java.util.List<DeviceManagementScriptGroupAssignment> value) {
        this._deviceManagementScriptGroupAssignments = value;
    }
}

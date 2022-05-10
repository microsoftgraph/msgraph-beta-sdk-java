package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Base type for assignment targets. */
public class DeviceAndAppManagementAssignmentTarget implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The Id of the filter for the target assignment. */
    private String _deviceAndAppManagementAssignmentFilterId;
    /** The type of filter of the target assignment i.e. Exclude or Include. Possible values are: none, include, exclude. */
    private DeviceAndAppManagementAssignmentFilterType _deviceAndAppManagementAssignmentFilterType;
    /**
     * Instantiates a new deviceAndAppManagementAssignmentTarget and sets the default values.
     * @return a void
     */
    public DeviceAndAppManagementAssignmentTarget() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceAndAppManagementAssignmentTarget
     */
    @javax.annotation.Nonnull
    public static DeviceAndAppManagementAssignmentTarget createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceAndAppManagementAssignmentTarget();
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
     * Gets the deviceAndAppManagementAssignmentFilterId property value. The Id of the filter for the target assignment.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceAndAppManagementAssignmentFilterId() {
        return this._deviceAndAppManagementAssignmentFilterId;
    }
    /**
     * Gets the deviceAndAppManagementAssignmentFilterType property value. The type of filter of the target assignment i.e. Exclude or Include. Possible values are: none, include, exclude.
     * @return a deviceAndAppManagementAssignmentFilterType
     */
    @javax.annotation.Nullable
    public DeviceAndAppManagementAssignmentFilterType getDeviceAndAppManagementAssignmentFilterType() {
        return this._deviceAndAppManagementAssignmentFilterType;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeviceAndAppManagementAssignmentTarget currentObject = this;
        return new HashMap<>(2) {{
            this.put("deviceAndAppManagementAssignmentFilterId", (n) -> { currentObject.setDeviceAndAppManagementAssignmentFilterId(n.getStringValue()); });
            this.put("deviceAndAppManagementAssignmentFilterType", (n) -> { currentObject.setDeviceAndAppManagementAssignmentFilterType(n.getEnumValue(DeviceAndAppManagementAssignmentFilterType.class)); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeStringValue("deviceAndAppManagementAssignmentFilterId", this.getDeviceAndAppManagementAssignmentFilterId());
        writer.writeEnumValue("deviceAndAppManagementAssignmentFilterType", this.getDeviceAndAppManagementAssignmentFilterType());
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
     * Sets the deviceAndAppManagementAssignmentFilterId property value. The Id of the filter for the target assignment.
     * @param value Value to set for the deviceAndAppManagementAssignmentFilterId property.
     * @return a void
     */
    public void setDeviceAndAppManagementAssignmentFilterId(@javax.annotation.Nullable final String value) {
        this._deviceAndAppManagementAssignmentFilterId = value;
    }
    /**
     * Sets the deviceAndAppManagementAssignmentFilterType property value. The type of filter of the target assignment i.e. Exclude or Include. Possible values are: none, include, exclude.
     * @param value Value to set for the deviceAndAppManagementAssignmentFilterType property.
     * @return a void
     */
    public void setDeviceAndAppManagementAssignmentFilterType(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentFilterType value) {
        this._deviceAndAppManagementAssignmentFilterType = value;
    }
}

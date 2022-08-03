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
    /** Represents type of the assignment filter. */
    private DeviceAndAppManagementAssignmentFilterType _deviceAndAppManagementAssignmentFilterType;
    /** The OdataType property */
    private String _odataType;
    /**
     * Instantiates a new deviceAndAppManagementAssignmentTarget and sets the default values.
     * @return a void
     */
    public DeviceAndAppManagementAssignmentTarget() {
        this.setAdditionalData(new HashMap<>());
        this.setOdataType("#microsoft.graph.deviceAndAppManagementAssignmentTarget");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deviceAndAppManagementAssignmentTarget
     */
    @javax.annotation.Nonnull
    public static DeviceAndAppManagementAssignmentTarget createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.allDevicesAssignmentTarget": return new AllDevicesAssignmentTarget();
                case "#microsoft.graph.allLicensedUsersAssignmentTarget": return new AllLicensedUsersAssignmentTarget();
                case "#microsoft.graph.configurationManagerCollectionAssignmentTarget": return new ConfigurationManagerCollectionAssignmentTarget();
                case "#microsoft.graph.exclusionGroupAssignmentTarget": return new ExclusionGroupAssignmentTarget();
                case "#microsoft.graph.groupAssignmentTarget": return new GroupAssignmentTarget();
            }
        }
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
     * Gets the deviceAndAppManagementAssignmentFilterType property value. Represents type of the assignment filter.
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
        return new HashMap<>(3) {{
            this.put("deviceAndAppManagementAssignmentFilterId", (n) -> { currentObject.setDeviceAndAppManagementAssignmentFilterId(n.getStringValue()); });
            this.put("deviceAndAppManagementAssignmentFilterType", (n) -> { currentObject.setDeviceAndAppManagementAssignmentFilterType(n.getEnumValue(DeviceAndAppManagementAssignmentFilterType.class)); });
            this.put("@odata.type", (n) -> { currentObject.setOdataType(n.getStringValue()); });
        }};
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this._odataType;
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
        writer.writeStringValue("@odata.type", this.getOdataType());
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
     * Sets the deviceAndAppManagementAssignmentFilterType property value. Represents type of the assignment filter.
     * @param value Value to set for the deviceAndAppManagementAssignmentFilterType property.
     * @return a void
     */
    public void setDeviceAndAppManagementAssignmentFilterType(@javax.annotation.Nullable final DeviceAndAppManagementAssignmentFilterType value) {
        this._deviceAndAppManagementAssignmentFilterType = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the OdataType property.
     * @return a void
     */
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this._odataType = value;
    }
}

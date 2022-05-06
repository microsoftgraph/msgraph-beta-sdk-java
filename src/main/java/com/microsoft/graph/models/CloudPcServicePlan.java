package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcServicePlan extends Entity implements Parsable {
    /** The name for the service plan. Read-only.  */
    private String _displayName;
    /** The size of the RAM in GB. Read-only.  */
    private Integer _ramInGB;
    /** The size of the OS Disk in GB. Read-only.  */
    private Integer _storageInGB;
    /** The type of the service plan. Possible values are: enterprise, business, unknownFutureValue. Read-only.  */
    private CloudPcServicePlanType _type;
    /** The size of the user profile disk in GB. Read-only.  */
    private Integer _userProfileInGB;
    /** The number of vCPUs. Read-only.  */
    private Integer _vCpuCount;
    /**
     * Instantiates a new cloudPcServicePlan and sets the default values.
     * @return a void
     */
    public CloudPcServicePlan() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcServicePlan
     */
    @javax.annotation.Nonnull
    public static CloudPcServicePlan createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcServicePlan();
    }
    /**
     * Gets the displayName property value. The name for the service plan. Read-only.
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
        final CloudPcServicePlan currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("ramInGB", (n) -> { currentObject.setRamInGB(n.getIntegerValue()); });
            this.put("storageInGB", (n) -> { currentObject.setStorageInGB(n.getIntegerValue()); });
            this.put("type", (n) -> { currentObject.setType(n.getEnumValue(CloudPcServicePlanType.class)); });
            this.put("userProfileInGB", (n) -> { currentObject.setUserProfileInGB(n.getIntegerValue()); });
            this.put("vCpuCount", (n) -> { currentObject.setVCpuCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the ramInGB property value. The size of the RAM in GB. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getRamInGB() {
        return this._ramInGB;
    }
    /**
     * Gets the storageInGB property value. The size of the OS Disk in GB. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getStorageInGB() {
        return this._storageInGB;
    }
    /**
     * Gets the type property value. The type of the service plan. Possible values are: enterprise, business, unknownFutureValue. Read-only.
     * @return a cloudPcServicePlanType
     */
    @javax.annotation.Nullable
    public CloudPcServicePlanType getType() {
        return this._type;
    }
    /**
     * Gets the userProfileInGB property value. The size of the user profile disk in GB. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getUserProfileInGB() {
        return this._userProfileInGB;
    }
    /**
     * Gets the vCpuCount property value. The number of vCPUs. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getVCpuCount() {
        return this._vCpuCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeIntegerValue("ramInGB", this.getRamInGB());
        writer.writeIntegerValue("storageInGB", this.getStorageInGB());
        writer.writeEnumValue("type", this.getType());
        writer.writeIntegerValue("userProfileInGB", this.getUserProfileInGB());
        writer.writeIntegerValue("vCpuCount", this.getVCpuCount());
    }
    /**
     * Sets the displayName property value. The name for the service plan. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the ramInGB property value. The size of the RAM in GB. Read-only.
     * @param value Value to set for the ramInGB property.
     * @return a void
     */
    public void setRamInGB(@javax.annotation.Nullable final Integer value) {
        this._ramInGB = value;
    }
    /**
     * Sets the storageInGB property value. The size of the OS Disk in GB. Read-only.
     * @param value Value to set for the storageInGB property.
     * @return a void
     */
    public void setStorageInGB(@javax.annotation.Nullable final Integer value) {
        this._storageInGB = value;
    }
    /**
     * Sets the type property value. The type of the service plan. Possible values are: enterprise, business, unknownFutureValue. Read-only.
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setType(@javax.annotation.Nullable final CloudPcServicePlanType value) {
        this._type = value;
    }
    /**
     * Sets the userProfileInGB property value. The size of the user profile disk in GB. Read-only.
     * @param value Value to set for the userProfileInGB property.
     * @return a void
     */
    public void setUserProfileInGB(@javax.annotation.Nullable final Integer value) {
        this._userProfileInGB = value;
    }
    /**
     * Sets the vCpuCount property value. The number of vCPUs. Read-only.
     * @param value Value to set for the vCpuCount property.
     * @return a void
     */
    public void setVCpuCount(@javax.annotation.Nullable final Integer value) {
        this._vCpuCount = value;
    }
}

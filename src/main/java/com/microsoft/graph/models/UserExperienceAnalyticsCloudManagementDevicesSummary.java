package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** The user experience work from anywhere Cloud management devices summary.  */
public class UserExperienceAnalyticsCloudManagementDevicesSummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.  */
    private Map<String, Object> _additionalData;
    /** Total number of  co-managed devices.  */
    private Integer _coManagedDeviceCount;
    /** The count of intune devices that are not autopilot registerd.  */
    private Integer _intuneDeviceCount;
    /** Total count of tenant attach devices.  */
    private Integer _tenantAttachDeviceCount;
    /**
     * Instantiates a new userExperienceAnalyticsCloudManagementDevicesSummary and sets the default values.
     * @return a void
     */
    public UserExperienceAnalyticsCloudManagementDevicesSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a userExperienceAnalyticsCloudManagementDevicesSummary
     */
    @javax.annotation.Nonnull
    public static UserExperienceAnalyticsCloudManagementDevicesSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UserExperienceAnalyticsCloudManagementDevicesSummary();
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
     * Gets the coManagedDeviceCount property value. Total number of  co-managed devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCoManagedDeviceCount() {
        return this._coManagedDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final UserExperienceAnalyticsCloudManagementDevicesSummary currentObject = this;
        return new HashMap<>(3) {{
            this.put("coManagedDeviceCount", (n) -> { currentObject.setCoManagedDeviceCount(n.getIntegerValue()); });
            this.put("intuneDeviceCount", (n) -> { currentObject.setIntuneDeviceCount(n.getIntegerValue()); });
            this.put("tenantAttachDeviceCount", (n) -> { currentObject.setTenantAttachDeviceCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the intuneDeviceCount property value. The count of intune devices that are not autopilot registerd.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getIntuneDeviceCount() {
        return this._intuneDeviceCount;
    }
    /**
     * Gets the tenantAttachDeviceCount property value. Total count of tenant attach devices.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTenantAttachDeviceCount() {
        return this._tenantAttachDeviceCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("coManagedDeviceCount", this.getCoManagedDeviceCount());
        writer.writeIntegerValue("intuneDeviceCount", this.getIntuneDeviceCount());
        writer.writeIntegerValue("tenantAttachDeviceCount", this.getTenantAttachDeviceCount());
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
     * Sets the coManagedDeviceCount property value. Total number of  co-managed devices.
     * @param value Value to set for the coManagedDeviceCount property.
     * @return a void
     */
    public void setCoManagedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._coManagedDeviceCount = value;
    }
    /**
     * Sets the intuneDeviceCount property value. The count of intune devices that are not autopilot registerd.
     * @param value Value to set for the intuneDeviceCount property.
     * @return a void
     */
    public void setIntuneDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._intuneDeviceCount = value;
    }
    /**
     * Sets the tenantAttachDeviceCount property value. Total count of tenant attach devices.
     * @param value Value to set for the tenantAttachDeviceCount property.
     * @return a void
     */
    public void setTenantAttachDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._tenantAttachDeviceCount = value;
    }
}

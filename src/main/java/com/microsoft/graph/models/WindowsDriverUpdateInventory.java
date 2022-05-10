package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsDriverUpdateInventory extends Entity implements Parsable {
    /** The number of devices for which this driver is applicable. */
    private Integer _applicableDeviceCount;
    /** The approval status for this driver. Possible values are: needsReview, declined, approved, suspended. */
    private DriverApprovalStatus _approvalStatus;
    /** The category for this driver. Possible values are: recommended, previouslyApproved, other. */
    private DriverCategory _category;
    /** The date time when a driver should be deployed if approvalStatus is approved. */
    private OffsetDateTime _deployDateTime;
    /** The class of the driver. */
    private String _driverClass;
    /** The manufacturer of the driver. */
    private String _manufacturer;
    /** The name of the driver. */
    private String _name;
    /** The release date time of the driver. */
    private OffsetDateTime _releaseDateTime;
    /** The version of the driver. */
    private String _version;
    /**
     * Instantiates a new windowsDriverUpdateInventory and sets the default values.
     * @return a void
     */
    public WindowsDriverUpdateInventory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsDriverUpdateInventory
     */
    @javax.annotation.Nonnull
    public static WindowsDriverUpdateInventory createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDriverUpdateInventory();
    }
    /**
     * Gets the applicableDeviceCount property value. The number of devices for which this driver is applicable.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getApplicableDeviceCount() {
        return this._applicableDeviceCount;
    }
    /**
     * Gets the approvalStatus property value. The approval status for this driver. Possible values are: needsReview, declined, approved, suspended.
     * @return a driverApprovalStatus
     */
    @javax.annotation.Nullable
    public DriverApprovalStatus getApprovalStatus() {
        return this._approvalStatus;
    }
    /**
     * Gets the category property value. The category for this driver. Possible values are: recommended, previouslyApproved, other.
     * @return a driverCategory
     */
    @javax.annotation.Nullable
    public DriverCategory getCategory() {
        return this._category;
    }
    /**
     * Gets the deployDateTime property value. The date time when a driver should be deployed if approvalStatus is approved.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getDeployDateTime() {
        return this._deployDateTime;
    }
    /**
     * Gets the driverClass property value. The class of the driver.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDriverClass() {
        return this._driverClass;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final WindowsDriverUpdateInventory currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("applicableDeviceCount", (n) -> { currentObject.setApplicableDeviceCount(n.getIntegerValue()); });
            this.put("approvalStatus", (n) -> { currentObject.setApprovalStatus(n.getEnumValue(DriverApprovalStatus.class)); });
            this.put("category", (n) -> { currentObject.setCategory(n.getEnumValue(DriverCategory.class)); });
            this.put("deployDateTime", (n) -> { currentObject.setDeployDateTime(n.getOffsetDateTimeValue()); });
            this.put("driverClass", (n) -> { currentObject.setDriverClass(n.getStringValue()); });
            this.put("manufacturer", (n) -> { currentObject.setManufacturer(n.getStringValue()); });
            this.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
            this.put("releaseDateTime", (n) -> { currentObject.setReleaseDateTime(n.getOffsetDateTimeValue()); });
            this.put("version", (n) -> { currentObject.setVersion(n.getStringValue()); });
        }};
    }
    /**
     * Gets the manufacturer property value. The manufacturer of the driver.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the name property value. The name of the driver.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the releaseDateTime property value. The release date time of the driver.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getReleaseDateTime() {
        return this._releaseDateTime;
    }
    /**
     * Gets the version property value. The version of the driver.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getVersion() {
        return this._version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("applicableDeviceCount", this.getApplicableDeviceCount());
        writer.writeEnumValue("approvalStatus", this.getApprovalStatus());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeOffsetDateTimeValue("deployDateTime", this.getDeployDateTime());
        writer.writeStringValue("driverClass", this.getDriverClass());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("name", this.getName());
        writer.writeOffsetDateTimeValue("releaseDateTime", this.getReleaseDateTime());
        writer.writeStringValue("version", this.getVersion());
    }
    /**
     * Sets the applicableDeviceCount property value. The number of devices for which this driver is applicable.
     * @param value Value to set for the applicableDeviceCount property.
     * @return a void
     */
    public void setApplicableDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._applicableDeviceCount = value;
    }
    /**
     * Sets the approvalStatus property value. The approval status for this driver. Possible values are: needsReview, declined, approved, suspended.
     * @param value Value to set for the approvalStatus property.
     * @return a void
     */
    public void setApprovalStatus(@javax.annotation.Nullable final DriverApprovalStatus value) {
        this._approvalStatus = value;
    }
    /**
     * Sets the category property value. The category for this driver. Possible values are: recommended, previouslyApproved, other.
     * @param value Value to set for the category property.
     * @return a void
     */
    public void setCategory(@javax.annotation.Nullable final DriverCategory value) {
        this._category = value;
    }
    /**
     * Sets the deployDateTime property value. The date time when a driver should be deployed if approvalStatus is approved.
     * @param value Value to set for the deployDateTime property.
     * @return a void
     */
    public void setDeployDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._deployDateTime = value;
    }
    /**
     * Sets the driverClass property value. The class of the driver.
     * @param value Value to set for the driverClass property.
     * @return a void
     */
    public void setDriverClass(@javax.annotation.Nullable final String value) {
        this._driverClass = value;
    }
    /**
     * Sets the manufacturer property value. The manufacturer of the driver.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the name property value. The name of the driver.
     * @param value Value to set for the name property.
     * @return a void
     */
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the releaseDateTime property value. The release date time of the driver.
     * @param value Value to set for the releaseDateTime property.
     * @return a void
     */
    public void setReleaseDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._releaseDateTime = value;
    }
    /**
     * Sets the version property value. The version of the driver.
     * @param value Value to set for the version property.
     * @return a void
     */
    public void setVersion(@javax.annotation.Nullable final String value) {
        this._version = value;
    }
}

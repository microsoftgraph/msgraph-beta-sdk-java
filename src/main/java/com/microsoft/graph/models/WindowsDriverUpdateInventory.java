package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A new entity to represent driver inventories.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class WindowsDriverUpdateInventory extends Entity implements Parsable {
    /**
     * The number of devices for which this driver is applicable.
     */
    private Integer applicableDeviceCount;
    /**
     * An enum type to represent approval status of a driver.
     */
    private DriverApprovalStatus approvalStatus;
    /**
     * An enum type to represent which category a driver belongs to.
     */
    private DriverCategory category;
    /**
     * The date time when a driver should be deployed if approvalStatus is approved.
     */
    private OffsetDateTime deployDateTime;
    /**
     * The class of the driver.
     */
    private String driverClass;
    /**
     * The manufacturer of the driver.
     */
    private String manufacturer;
    /**
     * The name of the driver.
     */
    private String name;
    /**
     * The release date time of the driver.
     */
    private OffsetDateTime releaseDateTime;
    /**
     * The version of the driver.
     */
    private String version;
    /**
     * Instantiates a new WindowsDriverUpdateInventory and sets the default values.
     */
    public WindowsDriverUpdateInventory() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a WindowsDriverUpdateInventory
     */
    @jakarta.annotation.Nonnull
    public static WindowsDriverUpdateInventory createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDriverUpdateInventory();
    }
    /**
     * Gets the applicableDeviceCount property value. The number of devices for which this driver is applicable.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getApplicableDeviceCount() {
        return this.applicableDeviceCount;
    }
    /**
     * Gets the approvalStatus property value. An enum type to represent approval status of a driver.
     * @return a DriverApprovalStatus
     */
    @jakarta.annotation.Nullable
    public DriverApprovalStatus getApprovalStatus() {
        return this.approvalStatus;
    }
    /**
     * Gets the category property value. An enum type to represent which category a driver belongs to.
     * @return a DriverCategory
     */
    @jakarta.annotation.Nullable
    public DriverCategory getCategory() {
        return this.category;
    }
    /**
     * Gets the deployDateTime property value. The date time when a driver should be deployed if approvalStatus is approved.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDeployDateTime() {
        return this.deployDateTime;
    }
    /**
     * Gets the driverClass property value. The class of the driver.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDriverClass() {
        return this.driverClass;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableDeviceCount", (n) -> { this.setApplicableDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("approvalStatus", (n) -> { this.setApprovalStatus(n.getEnumValue(DriverApprovalStatus.class)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(DriverCategory.class)); });
        deserializerMap.put("deployDateTime", (n) -> { this.setDeployDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("driverClass", (n) -> { this.setDriverClass(n.getStringValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("releaseDateTime", (n) -> { this.setReleaseDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the manufacturer property value. The manufacturer of the driver.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManufacturer() {
        return this.manufacturer;
    }
    /**
     * Gets the name property value. The name of the driver.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the releaseDateTime property value. The release date time of the driver.
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getReleaseDateTime() {
        return this.releaseDateTime;
    }
    /**
     * Gets the version property value. The version of the driver.
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getVersion() {
        return this.version;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
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
     */
    public void setApplicableDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.applicableDeviceCount = value;
    }
    /**
     * Sets the approvalStatus property value. An enum type to represent approval status of a driver.
     * @param value Value to set for the approvalStatus property.
     */
    public void setApprovalStatus(@jakarta.annotation.Nullable final DriverApprovalStatus value) {
        this.approvalStatus = value;
    }
    /**
     * Sets the category property value. An enum type to represent which category a driver belongs to.
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final DriverCategory value) {
        this.category = value;
    }
    /**
     * Sets the deployDateTime property value. The date time when a driver should be deployed if approvalStatus is approved.
     * @param value Value to set for the deployDateTime property.
     */
    public void setDeployDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.deployDateTime = value;
    }
    /**
     * Sets the driverClass property value. The class of the driver.
     * @param value Value to set for the driverClass property.
     */
    public void setDriverClass(@jakarta.annotation.Nullable final String value) {
        this.driverClass = value;
    }
    /**
     * Sets the manufacturer property value. The manufacturer of the driver.
     * @param value Value to set for the manufacturer property.
     */
    public void setManufacturer(@jakarta.annotation.Nullable final String value) {
        this.manufacturer = value;
    }
    /**
     * Sets the name property value. The name of the driver.
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the releaseDateTime property value. The release date time of the driver.
     * @param value Value to set for the releaseDateTime property.
     */
    public void setReleaseDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.releaseDateTime = value;
    }
    /**
     * Sets the version property value. The version of the driver.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final String value) {
        this.version = value;
    }
}

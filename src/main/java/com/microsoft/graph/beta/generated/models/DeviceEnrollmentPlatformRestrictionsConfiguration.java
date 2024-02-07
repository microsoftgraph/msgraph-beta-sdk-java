package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Device Enrollment Configuration that restricts the types of devices a user can enroll
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DeviceEnrollmentPlatformRestrictionsConfiguration extends DeviceEnrollmentConfiguration implements Parsable {
    /**
     * Instantiates a new DeviceEnrollmentPlatformRestrictionsConfiguration and sets the default values.
     */
    public DeviceEnrollmentPlatformRestrictionsConfiguration() {
        super();
        this.setOdataType("#microsoft.graph.deviceEnrollmentPlatformRestrictionsConfiguration");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DeviceEnrollmentPlatformRestrictionsConfiguration
     */
    @jakarta.annotation.Nonnull
    public static DeviceEnrollmentPlatformRestrictionsConfiguration createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DeviceEnrollmentPlatformRestrictionsConfiguration();
    }
    /**
     * Gets the androidForWorkRestriction property value. Android for work restrictions based on platform, platform operating system version, and device ownership
     * @return a DeviceEnrollmentPlatformRestriction
     */
    @jakarta.annotation.Nullable
    public DeviceEnrollmentPlatformRestriction getAndroidForWorkRestriction() {
        return this.backingStore.get("androidForWorkRestriction");
    }
    /**
     * Gets the androidRestriction property value. Android restrictions based on platform, platform operating system version, and device ownership
     * @return a DeviceEnrollmentPlatformRestriction
     */
    @jakarta.annotation.Nullable
    public DeviceEnrollmentPlatformRestriction getAndroidRestriction() {
        return this.backingStore.get("androidRestriction");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("androidForWorkRestriction", (n) -> { this.setAndroidForWorkRestriction(n.getObjectValue(DeviceEnrollmentPlatformRestriction::createFromDiscriminatorValue)); });
        deserializerMap.put("androidRestriction", (n) -> { this.setAndroidRestriction(n.getObjectValue(DeviceEnrollmentPlatformRestriction::createFromDiscriminatorValue)); });
        deserializerMap.put("iosRestriction", (n) -> { this.setIosRestriction(n.getObjectValue(DeviceEnrollmentPlatformRestriction::createFromDiscriminatorValue)); });
        deserializerMap.put("macOSRestriction", (n) -> { this.setMacOSRestriction(n.getObjectValue(DeviceEnrollmentPlatformRestriction::createFromDiscriminatorValue)); });
        deserializerMap.put("macRestriction", (n) -> { this.setMacRestriction(n.getObjectValue(DeviceEnrollmentPlatformRestriction::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsHomeSkuRestriction", (n) -> { this.setWindowsHomeSkuRestriction(n.getObjectValue(DeviceEnrollmentPlatformRestriction::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsMobileRestriction", (n) -> { this.setWindowsMobileRestriction(n.getObjectValue(DeviceEnrollmentPlatformRestriction::createFromDiscriminatorValue)); });
        deserializerMap.put("windowsRestriction", (n) -> { this.setWindowsRestriction(n.getObjectValue(DeviceEnrollmentPlatformRestriction::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the iosRestriction property value. Ios restrictions based on platform, platform operating system version, and device ownership
     * @return a DeviceEnrollmentPlatformRestriction
     */
    @jakarta.annotation.Nullable
    public DeviceEnrollmentPlatformRestriction getIosRestriction() {
        return this.backingStore.get("iosRestriction");
    }
    /**
     * Gets the macOSRestriction property value. Mac restrictions based on platform, platform operating system version, and device ownership
     * @return a DeviceEnrollmentPlatformRestriction
     */
    @jakarta.annotation.Nullable
    public DeviceEnrollmentPlatformRestriction getMacOSRestriction() {
        return this.backingStore.get("macOSRestriction");
    }
    /**
     * Gets the macRestriction property value. Mac restrictions based on platform, platform operating system version, and device ownership
     * @return a DeviceEnrollmentPlatformRestriction
     */
    @jakarta.annotation.Nullable
    public DeviceEnrollmentPlatformRestriction getMacRestriction() {
        return this.backingStore.get("macRestriction");
    }
    /**
     * Gets the windowsHomeSkuRestriction property value. Windows Home Sku restrictions based on platform, platform operating system version, and device ownership
     * @return a DeviceEnrollmentPlatformRestriction
     */
    @jakarta.annotation.Nullable
    public DeviceEnrollmentPlatformRestriction getWindowsHomeSkuRestriction() {
        return this.backingStore.get("windowsHomeSkuRestriction");
    }
    /**
     * Gets the windowsMobileRestriction property value. Windows mobile restrictions based on platform, platform operating system version, and device ownership
     * @return a DeviceEnrollmentPlatformRestriction
     */
    @jakarta.annotation.Nullable
    public DeviceEnrollmentPlatformRestriction getWindowsMobileRestriction() {
        return this.backingStore.get("windowsMobileRestriction");
    }
    /**
     * Gets the windowsRestriction property value. Windows restrictions based on platform, platform operating system version, and device ownership
     * @return a DeviceEnrollmentPlatformRestriction
     */
    @jakarta.annotation.Nullable
    public DeviceEnrollmentPlatformRestriction getWindowsRestriction() {
        return this.backingStore.get("windowsRestriction");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("androidForWorkRestriction", this.getAndroidForWorkRestriction());
        writer.writeObjectValue("androidRestriction", this.getAndroidRestriction());
        writer.writeObjectValue("iosRestriction", this.getIosRestriction());
        writer.writeObjectValue("macOSRestriction", this.getMacOSRestriction());
        writer.writeObjectValue("macRestriction", this.getMacRestriction());
        writer.writeObjectValue("windowsHomeSkuRestriction", this.getWindowsHomeSkuRestriction());
        writer.writeObjectValue("windowsMobileRestriction", this.getWindowsMobileRestriction());
        writer.writeObjectValue("windowsRestriction", this.getWindowsRestriction());
    }
    /**
     * Sets the androidForWorkRestriction property value. Android for work restrictions based on platform, platform operating system version, and device ownership
     * @param value Value to set for the androidForWorkRestriction property.
     */
    public void setAndroidForWorkRestriction(@jakarta.annotation.Nullable final DeviceEnrollmentPlatformRestriction value) {
        this.backingStore.set("androidForWorkRestriction", value);
    }
    /**
     * Sets the androidRestriction property value. Android restrictions based on platform, platform operating system version, and device ownership
     * @param value Value to set for the androidRestriction property.
     */
    public void setAndroidRestriction(@jakarta.annotation.Nullable final DeviceEnrollmentPlatformRestriction value) {
        this.backingStore.set("androidRestriction", value);
    }
    /**
     * Sets the iosRestriction property value. Ios restrictions based on platform, platform operating system version, and device ownership
     * @param value Value to set for the iosRestriction property.
     */
    public void setIosRestriction(@jakarta.annotation.Nullable final DeviceEnrollmentPlatformRestriction value) {
        this.backingStore.set("iosRestriction", value);
    }
    /**
     * Sets the macOSRestriction property value. Mac restrictions based on platform, platform operating system version, and device ownership
     * @param value Value to set for the macOSRestriction property.
     */
    public void setMacOSRestriction(@jakarta.annotation.Nullable final DeviceEnrollmentPlatformRestriction value) {
        this.backingStore.set("macOSRestriction", value);
    }
    /**
     * Sets the macRestriction property value. Mac restrictions based on platform, platform operating system version, and device ownership
     * @param value Value to set for the macRestriction property.
     */
    public void setMacRestriction(@jakarta.annotation.Nullable final DeviceEnrollmentPlatformRestriction value) {
        this.backingStore.set("macRestriction", value);
    }
    /**
     * Sets the windowsHomeSkuRestriction property value. Windows Home Sku restrictions based on platform, platform operating system version, and device ownership
     * @param value Value to set for the windowsHomeSkuRestriction property.
     */
    public void setWindowsHomeSkuRestriction(@jakarta.annotation.Nullable final DeviceEnrollmentPlatformRestriction value) {
        this.backingStore.set("windowsHomeSkuRestriction", value);
    }
    /**
     * Sets the windowsMobileRestriction property value. Windows mobile restrictions based on platform, platform operating system version, and device ownership
     * @param value Value to set for the windowsMobileRestriction property.
     */
    public void setWindowsMobileRestriction(@jakarta.annotation.Nullable final DeviceEnrollmentPlatformRestriction value) {
        this.backingStore.set("windowsMobileRestriction", value);
    }
    /**
     * Sets the windowsRestriction property value. Windows restrictions based on platform, platform operating system version, and device ownership
     * @param value Value to set for the windowsRestriction property.
     */
    public void setWindowsRestriction(@jakarta.annotation.Nullable final DeviceEnrollmentPlatformRestriction value) {
        this.backingStore.set("windowsRestriction", value);
    }
}

package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties used to assign a macOS Declarative Device Management (DDM) VPP mobile app to a group.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MacOsDdmVppAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /**
     * Instantiates a new {@link MacOsDdmVppAppAssignmentSettings} and sets the default values.
     */
    public MacOsDdmVppAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.macOsDdmVppAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MacOsDdmVppAppAssignmentSettings}
     */
    @jakarta.annotation.Nonnull
    public static MacOsDdmVppAppAssignmentSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MacOsDdmVppAppAssignmentSettings();
    }
    /**
     * Gets the automaticAppUpdates property value. Specifies whether the device automatically updates the app. Possible values are: &apos;alwaysOn&apos;, &apos;alwaysOff&apos;, &apos;storeSettings&apos;. By default, this value is set to &apos;storeSettings&apos;.
     * @return a {@link DdmAppAutomaticAppUpdates}
     */
    @jakarta.annotation.Nullable
    public DdmAppAutomaticAppUpdates getAutomaticAppUpdates() {
        return this.backingStore.get("automaticAppUpdates");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("automaticAppUpdates", (n) -> { this.setAutomaticAppUpdates(n.getEnumValue(DdmAppAutomaticAppUpdates::forValue)); });
        deserializerMap.put("isIosApp", (n) -> { this.setIsIosApp(n.getBooleanValue()); });
        deserializerMap.put("useDeviceLicensing", (n) -> { this.setUseDeviceLicensing(n.getBooleanValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isIosApp property value. If true, the device installs an iOS or iPadOS app that runs on a Mac with Apple Silicon. This is only used when the app is a VPP app. Default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIsIosApp() {
        return this.backingStore.get("isIosApp");
    }
    /**
     * Gets the useDeviceLicensing property value. When TRUE, indicates that the app should be assigned using device licensing. When FALSE, indicates that the app should be assigned using user licensing. By default, this property is set to FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getUseDeviceLicensing() {
        return this.backingStore.get("useDeviceLicensing");
    }
    /**
     * Gets the version property value. Specifies the version of the VPP app to install. When not set, the device installs the latest version. When set, the device installs the specified version. The device never installs an older version of the app over a newer version. This property maps to the Version key in Apple&apos;s AppManagedInstallBehaviorObject declaration.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getVersion() {
        return this.backingStore.get("version");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("automaticAppUpdates", this.getAutomaticAppUpdates());
        writer.writeBooleanValue("isIosApp", this.getIsIosApp());
        writer.writeBooleanValue("useDeviceLicensing", this.getUseDeviceLicensing());
        writer.writeIntegerValue("version", this.getVersion());
    }
    /**
     * Sets the automaticAppUpdates property value. Specifies whether the device automatically updates the app. Possible values are: &apos;alwaysOn&apos;, &apos;alwaysOff&apos;, &apos;storeSettings&apos;. By default, this value is set to &apos;storeSettings&apos;.
     * @param value Value to set for the automaticAppUpdates property.
     */
    public void setAutomaticAppUpdates(@jakarta.annotation.Nullable final DdmAppAutomaticAppUpdates value) {
        this.backingStore.set("automaticAppUpdates", value);
    }
    /**
     * Sets the isIosApp property value. If true, the device installs an iOS or iPadOS app that runs on a Mac with Apple Silicon. This is only used when the app is a VPP app. Default is false.
     * @param value Value to set for the isIosApp property.
     */
    public void setIsIosApp(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("isIosApp", value);
    }
    /**
     * Sets the useDeviceLicensing property value. When TRUE, indicates that the app should be assigned using device licensing. When FALSE, indicates that the app should be assigned using user licensing. By default, this property is set to FALSE.
     * @param value Value to set for the useDeviceLicensing property.
     */
    public void setUseDeviceLicensing(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("useDeviceLicensing", value);
    }
    /**
     * Sets the version property value. Specifies the version of the VPP app to install. When not set, the device installs the latest version. When set, the device installs the specified version. The device never installs an older version of the app over a newer version. This property maps to the Version key in Apple&apos;s AppManagedInstallBehaviorObject declaration.
     * @param value Value to set for the version property.
     */
    public void setVersion(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("version", value);
    }
}

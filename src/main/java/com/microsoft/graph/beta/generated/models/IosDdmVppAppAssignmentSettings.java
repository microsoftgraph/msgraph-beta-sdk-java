package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Contains properties used to assign an iOS Declarative Device Management (DDM) VPP mobile app to a group.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IosDdmVppAppAssignmentSettings extends MobileAppAssignmentSettings implements Parsable {
    /**
     * Instantiates a new {@link IosDdmVppAppAssignmentSettings} and sets the default values.
     */
    public IosDdmVppAppAssignmentSettings() {
        super();
        this.setOdataType("#microsoft.graph.iosDdmVppAppAssignmentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link IosDdmVppAppAssignmentSettings}
     */
    @jakarta.annotation.Nonnull
    public static IosDdmVppAppAssignmentSettings createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IosDdmVppAppAssignmentSettings();
    }
    /**
     * Gets the allowDownloadsOverCellular property value. Specifies whether the app may be downloaded over cellular connections. Possible values are: &apos;alwaysOn&apos;, &apos;alwaysOff&apos;, &apos;storeSettings&apos;. By default, this value is set to &apos;storeSettings&apos;.
     * @return a {@link DdmAppAllowDownloadsOverCellular}
     */
    @jakarta.annotation.Nullable
    public DdmAppAllowDownloadsOverCellular getAllowDownloadsOverCellular() {
        return this.backingStore.get("allowDownloadsOverCellular");
    }
    /**
     * Gets the associatedDomains property value. Domain names to associate with the app
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getAssociatedDomains() {
        return this.backingStore.get("associatedDomains");
    }
    /**
     * Gets the associatedDomainsDirectDownloadAllowed property value. When true, the system allows direct downloads for the AssociatedDomains. When false, the system will not allow direct downloads for the AssociatedDomains. Default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAssociatedDomainsDirectDownloadAllowed() {
        return this.backingStore.get("associatedDomainsDirectDownloadAllowed");
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
     * Gets the cellularSliceConfigurationId property value. The cellular slice identifier, which can be the data network name (DNN) or app category. For DNN, encode the value as &apos;DNN:name&apos;, where &apos;name&apos; is the carrier-provided DNN name. For app category, encode the value as &apos;AppCategory:category&apos;, where &apos;category&apos; is a carrier-provided string such as &apos;Enterprise1&apos;.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getCellularSliceConfigurationId() {
        return this.backingStore.get("cellularSliceConfigurationId");
    }
    /**
     * Gets the contentFilterConfigurationId property value. The unique identifier of the content filter to associate with the app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getContentFilterConfigurationId() {
        return this.backingStore.get("contentFilterConfigurationId");
    }
    /**
     * Gets the dnsProxyConfigurationId property value. The unique identifier of the DNS proxy to associate with the app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDnsProxyConfigurationId() {
        return this.backingStore.get("dnsProxyConfigurationId");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowDownloadsOverCellular", (n) -> { this.setAllowDownloadsOverCellular(n.getEnumValue(DdmAppAllowDownloadsOverCellular::forValue)); });
        deserializerMap.put("associatedDomains", (n) -> { this.setAssociatedDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("associatedDomainsDirectDownloadAllowed", (n) -> { this.setAssociatedDomainsDirectDownloadAllowed(n.getBooleanValue()); });
        deserializerMap.put("automaticAppUpdates", (n) -> { this.setAutomaticAppUpdates(n.getEnumValue(DdmAppAutomaticAppUpdates::forValue)); });
        deserializerMap.put("cellularSliceConfigurationId", (n) -> { this.setCellularSliceConfigurationId(n.getStringValue()); });
        deserializerMap.put("contentFilterConfigurationId", (n) -> { this.setContentFilterConfigurationId(n.getStringValue()); });
        deserializerMap.put("dnsProxyConfigurationId", (n) -> { this.setDnsProxyConfigurationId(n.getStringValue()); });
        deserializerMap.put("preventManagedAppBackup", (n) -> { this.setPreventManagedAppBackup(n.getBooleanValue()); });
        deserializerMap.put("relayConfigurationId", (n) -> { this.setRelayConfigurationId(n.getStringValue()); });
        deserializerMap.put("tapToPayScreenLockEnabled", (n) -> { this.setTapToPayScreenLockEnabled(n.getBooleanValue()); });
        deserializerMap.put("useDeviceLicensing", (n) -> { this.setUseDeviceLicensing(n.getBooleanValue()); });
        deserializerMap.put("version", (n) -> { this.setVersion(n.getIntegerValue()); });
        deserializerMap.put("vpnConfigurationId", (n) -> { this.setVpnConfigurationId(n.getStringValue()); });
        return deserializerMap;
    }
    /**
     * Gets the preventManagedAppBackup property value. When true, indicates that the app should not be backed up to iCloud. When false, indicates that the app may be backed up to iCloud. Default is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPreventManagedAppBackup() {
        return this.backingStore.get("preventManagedAppBackup");
    }
    /**
     * Gets the relayConfigurationId property value. The unique identifier of the relay to associate with the app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getRelayConfigurationId() {
        return this.backingStore.get("relayConfigurationId");
    }
    /**
     * Gets the tapToPayScreenLockEnabled property value. When true, the device locks its screen after every transaction that requires a customer&apos;s card PIN. When false, the user can choose the behavior. Default value is false.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getTapToPayScreenLockEnabled() {
        return this.backingStore.get("tapToPayScreenLockEnabled");
    }
    /**
     * Gets the useDeviceLicensing property value. Whether or not to use device licensing.
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
     * Gets the vpnConfigurationId property value. The unique identifier of the VPN Configuration to apply to the app.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getVpnConfigurationId() {
        return this.backingStore.get("vpnConfigurationId");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeEnumValue("allowDownloadsOverCellular", this.getAllowDownloadsOverCellular());
        writer.writeCollectionOfPrimitiveValues("associatedDomains", this.getAssociatedDomains());
        writer.writeBooleanValue("associatedDomainsDirectDownloadAllowed", this.getAssociatedDomainsDirectDownloadAllowed());
        writer.writeEnumValue("automaticAppUpdates", this.getAutomaticAppUpdates());
        writer.writeStringValue("cellularSliceConfigurationId", this.getCellularSliceConfigurationId());
        writer.writeStringValue("contentFilterConfigurationId", this.getContentFilterConfigurationId());
        writer.writeStringValue("dnsProxyConfigurationId", this.getDnsProxyConfigurationId());
        writer.writeBooleanValue("preventManagedAppBackup", this.getPreventManagedAppBackup());
        writer.writeStringValue("relayConfigurationId", this.getRelayConfigurationId());
        writer.writeBooleanValue("tapToPayScreenLockEnabled", this.getTapToPayScreenLockEnabled());
        writer.writeBooleanValue("useDeviceLicensing", this.getUseDeviceLicensing());
        writer.writeIntegerValue("version", this.getVersion());
        writer.writeStringValue("vpnConfigurationId", this.getVpnConfigurationId());
    }
    /**
     * Sets the allowDownloadsOverCellular property value. Specifies whether the app may be downloaded over cellular connections. Possible values are: &apos;alwaysOn&apos;, &apos;alwaysOff&apos;, &apos;storeSettings&apos;. By default, this value is set to &apos;storeSettings&apos;.
     * @param value Value to set for the allowDownloadsOverCellular property.
     */
    public void setAllowDownloadsOverCellular(@jakarta.annotation.Nullable final DdmAppAllowDownloadsOverCellular value) {
        this.backingStore.set("allowDownloadsOverCellular", value);
    }
    /**
     * Sets the associatedDomains property value. Domain names to associate with the app
     * @param value Value to set for the associatedDomains property.
     */
    public void setAssociatedDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("associatedDomains", value);
    }
    /**
     * Sets the associatedDomainsDirectDownloadAllowed property value. When true, the system allows direct downloads for the AssociatedDomains. When false, the system will not allow direct downloads for the AssociatedDomains. Default is false.
     * @param value Value to set for the associatedDomainsDirectDownloadAllowed property.
     */
    public void setAssociatedDomainsDirectDownloadAllowed(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("associatedDomainsDirectDownloadAllowed", value);
    }
    /**
     * Sets the automaticAppUpdates property value. Specifies whether the device automatically updates the app. Possible values are: &apos;alwaysOn&apos;, &apos;alwaysOff&apos;, &apos;storeSettings&apos;. By default, this value is set to &apos;storeSettings&apos;.
     * @param value Value to set for the automaticAppUpdates property.
     */
    public void setAutomaticAppUpdates(@jakarta.annotation.Nullable final DdmAppAutomaticAppUpdates value) {
        this.backingStore.set("automaticAppUpdates", value);
    }
    /**
     * Sets the cellularSliceConfigurationId property value. The cellular slice identifier, which can be the data network name (DNN) or app category. For DNN, encode the value as &apos;DNN:name&apos;, where &apos;name&apos; is the carrier-provided DNN name. For app category, encode the value as &apos;AppCategory:category&apos;, where &apos;category&apos; is a carrier-provided string such as &apos;Enterprise1&apos;.
     * @param value Value to set for the cellularSliceConfigurationId property.
     */
    public void setCellularSliceConfigurationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("cellularSliceConfigurationId", value);
    }
    /**
     * Sets the contentFilterConfigurationId property value. The unique identifier of the content filter to associate with the app.
     * @param value Value to set for the contentFilterConfigurationId property.
     */
    public void setContentFilterConfigurationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("contentFilterConfigurationId", value);
    }
    /**
     * Sets the dnsProxyConfigurationId property value. The unique identifier of the DNS proxy to associate with the app.
     * @param value Value to set for the dnsProxyConfigurationId property.
     */
    public void setDnsProxyConfigurationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("dnsProxyConfigurationId", value);
    }
    /**
     * Sets the preventManagedAppBackup property value. When true, indicates that the app should not be backed up to iCloud. When false, indicates that the app may be backed up to iCloud. Default is false.
     * @param value Value to set for the preventManagedAppBackup property.
     */
    public void setPreventManagedAppBackup(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("preventManagedAppBackup", value);
    }
    /**
     * Sets the relayConfigurationId property value. The unique identifier of the relay to associate with the app.
     * @param value Value to set for the relayConfigurationId property.
     */
    public void setRelayConfigurationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("relayConfigurationId", value);
    }
    /**
     * Sets the tapToPayScreenLockEnabled property value. When true, the device locks its screen after every transaction that requires a customer&apos;s card PIN. When false, the user can choose the behavior. Default value is false.
     * @param value Value to set for the tapToPayScreenLockEnabled property.
     */
    public void setTapToPayScreenLockEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("tapToPayScreenLockEnabled", value);
    }
    /**
     * Sets the useDeviceLicensing property value. Whether or not to use device licensing.
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
    /**
     * Sets the vpnConfigurationId property value. The unique identifier of the VPN Configuration to apply to the app.
     * @param value Value to set for the vpnConfigurationId property.
     */
    public void setVpnConfigurationId(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("vpnConfigurationId", value);
    }
}

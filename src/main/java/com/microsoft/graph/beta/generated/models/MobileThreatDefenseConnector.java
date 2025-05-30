package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Entity which represents a connection to Mobile Threat Defense partner.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class MobileThreatDefenseConnector extends Entity implements Parsable {
    /**
     * Instantiates a new {@link MobileThreatDefenseConnector} and sets the default values.
     */
    public MobileThreatDefenseConnector() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link MobileThreatDefenseConnector}
     */
    @jakarta.annotation.Nonnull
    public static MobileThreatDefenseConnector createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileThreatDefenseConnector();
    }
    /**
     * Gets the allowPartnerToCollectIOSApplicationMetadata property value. When TRUE, indicates the Mobile Threat Defense partner may collect metadata about installed applications from Intune for iOS devices. When FALSE, indicates the Mobile Threat Defense partner may not collect metadata about installed applications from Intune for iOS devices. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowPartnerToCollectIOSApplicationMetadata() {
        return this.backingStore.get("allowPartnerToCollectIOSApplicationMetadata");
    }
    /**
     * Gets the allowPartnerToCollectIosCertificateMetadata property value. When TRUE, allows the Mobile Threat Defense partner to request a list of installed certificates on iOS/iPadOS devices from Intune to use for threat analysis. This list of installed certificates will be sent from enrolled iOS/iPadOS devices and will include unmanaged certificates (certificates not deployed through Intune). When FALSE, indicates that metadata about installed certificates will not be collected. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowPartnerToCollectIosCertificateMetadata() {
        return this.backingStore.get("allowPartnerToCollectIosCertificateMetadata");
    }
    /**
     * Gets the allowPartnerToCollectIOSPersonalApplicationMetadata property value. When TRUE, indicates the Mobile Threat Defense partner may collect metadata about personally installed applications from Intune for iOS devices. When FALSE, indicates the Mobile Threat Defense partner may not collect metadata about personally installed applications from Intune for iOS devices. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowPartnerToCollectIOSPersonalApplicationMetadata() {
        return this.backingStore.get("allowPartnerToCollectIOSPersonalApplicationMetadata");
    }
    /**
     * Gets the allowPartnerToCollectIosPersonalCertificateMetadata property value. When TRUE, allows the Mobile Threat Defense partner to request a list of installed certificates on personally owned iOS/iPadOS devices from Intune to use for threat analysis. This list of installed certificates will be sent from enrolled personally owned iOS/iPadOS devices and will include unmanaged certificates (certificates not deployed through Intune). When FALSE, no metadata for installed certificates is sent for personally owned iOS/iPadOS devices. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAllowPartnerToCollectIosPersonalCertificateMetadata() {
        return this.backingStore.get("allowPartnerToCollectIosPersonalCertificateMetadata");
    }
    /**
     * Gets the androidDeviceBlockedOnMissingPartnerData property value. When TRUE, indicates that Intune must receive data from the Mobile Threat Defense partner prior to marking an Android device compliant. When FALSE, indicates that Intune may mark an Android device compliant before receiving data from the Mobile Threat Defense partner.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAndroidDeviceBlockedOnMissingPartnerData() {
        return this.backingStore.get("androidDeviceBlockedOnMissingPartnerData");
    }
    /**
     * Gets the androidEnabled property value. When TRUE, indicates that data from the Mobile Threat Defense partner will be used during compliance evaluations for Android devices. When FALSE, indicates that data from the Mobile Threat Defense partner will not be used during compliance evaluations for Android devices. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAndroidEnabled() {
        return this.backingStore.get("androidEnabled");
    }
    /**
     * Gets the androidMobileApplicationManagementEnabled property value. When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during Mobile Application Management (MAM) evaluations for Android devices. When FALSE, inidicates that data from the Mobile Threat Defense partner should not be used during Mobile Application Management (MAM) evaluations for Android devices. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getAndroidMobileApplicationManagementEnabled() {
        return this.backingStore.get("androidMobileApplicationManagementEnabled");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("allowPartnerToCollectIOSApplicationMetadata", (n) -> { this.setAllowPartnerToCollectIOSApplicationMetadata(n.getBooleanValue()); });
        deserializerMap.put("allowPartnerToCollectIosCertificateMetadata", (n) -> { this.setAllowPartnerToCollectIosCertificateMetadata(n.getBooleanValue()); });
        deserializerMap.put("allowPartnerToCollectIOSPersonalApplicationMetadata", (n) -> { this.setAllowPartnerToCollectIOSPersonalApplicationMetadata(n.getBooleanValue()); });
        deserializerMap.put("allowPartnerToCollectIosPersonalCertificateMetadata", (n) -> { this.setAllowPartnerToCollectIosPersonalCertificateMetadata(n.getBooleanValue()); });
        deserializerMap.put("androidDeviceBlockedOnMissingPartnerData", (n) -> { this.setAndroidDeviceBlockedOnMissingPartnerData(n.getBooleanValue()); });
        deserializerMap.put("androidEnabled", (n) -> { this.setAndroidEnabled(n.getBooleanValue()); });
        deserializerMap.put("androidMobileApplicationManagementEnabled", (n) -> { this.setAndroidMobileApplicationManagementEnabled(n.getBooleanValue()); });
        deserializerMap.put("iosDeviceBlockedOnMissingPartnerData", (n) -> { this.setIosDeviceBlockedOnMissingPartnerData(n.getBooleanValue()); });
        deserializerMap.put("iosEnabled", (n) -> { this.setIosEnabled(n.getBooleanValue()); });
        deserializerMap.put("iosMobileApplicationManagementEnabled", (n) -> { this.setIosMobileApplicationManagementEnabled(n.getBooleanValue()); });
        deserializerMap.put("lastHeartbeatDateTime", (n) -> { this.setLastHeartbeatDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("macDeviceBlockedOnMissingPartnerData", (n) -> { this.setMacDeviceBlockedOnMissingPartnerData(n.getBooleanValue()); });
        deserializerMap.put("macEnabled", (n) -> { this.setMacEnabled(n.getBooleanValue()); });
        deserializerMap.put("microsoftDefenderForEndpointAttachEnabled", (n) -> { this.setMicrosoftDefenderForEndpointAttachEnabled(n.getBooleanValue()); });
        deserializerMap.put("partnerState", (n) -> { this.setPartnerState(n.getEnumValue(MobileThreatPartnerTenantState::forValue)); });
        deserializerMap.put("partnerUnresponsivenessThresholdInDays", (n) -> { this.setPartnerUnresponsivenessThresholdInDays(n.getIntegerValue()); });
        deserializerMap.put("partnerUnsupportedOsVersionBlocked", (n) -> { this.setPartnerUnsupportedOsVersionBlocked(n.getBooleanValue()); });
        deserializerMap.put("windowsDeviceBlockedOnMissingPartnerData", (n) -> { this.setWindowsDeviceBlockedOnMissingPartnerData(n.getBooleanValue()); });
        deserializerMap.put("windowsEnabled", (n) -> { this.setWindowsEnabled(n.getBooleanValue()); });
        deserializerMap.put("windowsMobileApplicationManagementEnabled", (n) -> { this.setWindowsMobileApplicationManagementEnabled(n.getBooleanValue()); });
        return deserializerMap;
    }
    /**
     * Gets the iosDeviceBlockedOnMissingPartnerData property value. When TRUE, indicates that Intune must receive data from the Mobile Threat Defense partner prior to marking a device compliant. When FALSE, indicates that Intune may not recieve data from Mobile Threat Defense partner prior to making device compliant. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIosDeviceBlockedOnMissingPartnerData() {
        return this.backingStore.get("iosDeviceBlockedOnMissingPartnerData");
    }
    /**
     * Gets the iosEnabled property value. When TRUE, indicates that data from the Mobile Threat Defense partner will be used during compliance evaluations for iOS devices. When FALSE, indicates that data from the Mobile Threat Defense partner will not be used during compliance evaluations for iOS devices. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIosEnabled() {
        return this.backingStore.get("iosEnabled");
    }
    /**
     * Gets the iosMobileApplicationManagementEnabled property value. When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during Mobile Application Management (MAM) evaluations for iOS devices. When FALSE, inidicates that data from the Mobile Threat Defense partner should not be used during Mobile Application Management (MAM) evaluations for iOS devices. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getIosMobileApplicationManagementEnabled() {
        return this.backingStore.get("iosMobileApplicationManagementEnabled");
    }
    /**
     * Gets the lastHeartbeatDateTime property value. DateTime of last Heartbeat recieved from the Mobile Threat Defense partner
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastHeartbeatDateTime() {
        return this.backingStore.get("lastHeartbeatDateTime");
    }
    /**
     * Gets the macDeviceBlockedOnMissingPartnerData property value. When TRUE, indicates that Intune must receive data from the Mobile Threat Defense partner prior to marking a Mac device compliant. When FALSE, indicates that Intune may mark a Mac device compliant prior to receiving data from the Mobile Threat Defense partner. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMacDeviceBlockedOnMissingPartnerData() {
        return this.backingStore.get("macDeviceBlockedOnMissingPartnerData");
    }
    /**
     * Gets the macEnabled property value. When TRUE, indicates that data from the Mobile Threat Defense partner will be used during compliance evaluations for Mac devices. When FALSE, indicates that data from the Mobile Threat Defense partner will not be used during compliance evaluations for Mac devices. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMacEnabled() {
        return this.backingStore.get("macEnabled");
    }
    /**
     * Gets the microsoftDefenderForEndpointAttachEnabled property value. When TRUE, inidicates that configuration profile management via Microsoft Defender for Endpoint is enabled. When FALSE, inidicates that configuration profile management via Microsoft Defender for Endpoint is disabled. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getMicrosoftDefenderForEndpointAttachEnabled() {
        return this.backingStore.get("microsoftDefenderForEndpointAttachEnabled");
    }
    /**
     * Gets the partnerState property value. Partner state of this tenant.
     * @return a {@link MobileThreatPartnerTenantState}
     */
    @jakarta.annotation.Nullable
    public MobileThreatPartnerTenantState getPartnerState() {
        return this.backingStore.get("partnerState");
    }
    /**
     * Gets the partnerUnresponsivenessThresholdInDays property value. Indicates the number of days without receiving a heartbeat from a Mobile Threat Defense partner before the partner is marked as unresponsive. Intune will the ignore the data from this Mobile Threat Defense Partner for next compliance calculation.
     * @return a {@link Integer}
     */
    @jakarta.annotation.Nullable
    public Integer getPartnerUnresponsivenessThresholdInDays() {
        return this.backingStore.get("partnerUnresponsivenessThresholdInDays");
    }
    /**
     * Gets the partnerUnsupportedOsVersionBlocked property value. When TRUE, indicates that Intune will mark devices noncompliant on enabled platforms that do not meet the minimum version requirements of the Mobile Threat Defense partner. When FALSE, indicates that Intune will not mark devices noncompliant on enabled platforms that do not meet the minimum version requirements of the Mobile Threat Defense partner. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getPartnerUnsupportedOsVersionBlocked() {
        return this.backingStore.get("partnerUnsupportedOsVersionBlocked");
    }
    /**
     * Gets the windowsDeviceBlockedOnMissingPartnerData property value. When TRUE, indicates that Intune must receive data from the data sync partner prior to marking a device compliant for Windows. When FALSE, indicates that Intune may mark a device compliant without receiving data from the data sync partner for Windows. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWindowsDeviceBlockedOnMissingPartnerData() {
        return this.backingStore.get("windowsDeviceBlockedOnMissingPartnerData");
    }
    /**
     * Gets the windowsEnabled property value. When TRUE, indicates that data from the Mobile Threat Defense partner will be used during compliance evaluations for Windows. When FALSE, indicates that data from the Mobile Threat Defense partner will not be used during compliance evaluations for Windows. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWindowsEnabled() {
        return this.backingStore.get("windowsEnabled");
    }
    /**
     * Gets the windowsMobileApplicationManagementEnabled property value. When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during Mobile Application Management (MAM) evaluations for iOS devices. When FALSE, inidicates that data from the Mobile Threat Defense partner should not be used during Mobile Application Management (MAM) evaluations for iOS devices. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation. Default value is FALSE.
     * @return a {@link Boolean}
     */
    @jakarta.annotation.Nullable
    public Boolean getWindowsMobileApplicationManagementEnabled() {
        return this.backingStore.get("windowsMobileApplicationManagementEnabled");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowPartnerToCollectIOSApplicationMetadata", this.getAllowPartnerToCollectIOSApplicationMetadata());
        writer.writeBooleanValue("allowPartnerToCollectIosCertificateMetadata", this.getAllowPartnerToCollectIosCertificateMetadata());
        writer.writeBooleanValue("allowPartnerToCollectIOSPersonalApplicationMetadata", this.getAllowPartnerToCollectIOSPersonalApplicationMetadata());
        writer.writeBooleanValue("allowPartnerToCollectIosPersonalCertificateMetadata", this.getAllowPartnerToCollectIosPersonalCertificateMetadata());
        writer.writeBooleanValue("androidDeviceBlockedOnMissingPartnerData", this.getAndroidDeviceBlockedOnMissingPartnerData());
        writer.writeBooleanValue("androidEnabled", this.getAndroidEnabled());
        writer.writeBooleanValue("androidMobileApplicationManagementEnabled", this.getAndroidMobileApplicationManagementEnabled());
        writer.writeBooleanValue("iosDeviceBlockedOnMissingPartnerData", this.getIosDeviceBlockedOnMissingPartnerData());
        writer.writeBooleanValue("iosEnabled", this.getIosEnabled());
        writer.writeBooleanValue("iosMobileApplicationManagementEnabled", this.getIosMobileApplicationManagementEnabled());
        writer.writeOffsetDateTimeValue("lastHeartbeatDateTime", this.getLastHeartbeatDateTime());
        writer.writeBooleanValue("macDeviceBlockedOnMissingPartnerData", this.getMacDeviceBlockedOnMissingPartnerData());
        writer.writeBooleanValue("macEnabled", this.getMacEnabled());
        writer.writeBooleanValue("microsoftDefenderForEndpointAttachEnabled", this.getMicrosoftDefenderForEndpointAttachEnabled());
        writer.writeEnumValue("partnerState", this.getPartnerState());
        writer.writeIntegerValue("partnerUnresponsivenessThresholdInDays", this.getPartnerUnresponsivenessThresholdInDays());
        writer.writeBooleanValue("partnerUnsupportedOsVersionBlocked", this.getPartnerUnsupportedOsVersionBlocked());
        writer.writeBooleanValue("windowsDeviceBlockedOnMissingPartnerData", this.getWindowsDeviceBlockedOnMissingPartnerData());
        writer.writeBooleanValue("windowsEnabled", this.getWindowsEnabled());
        writer.writeBooleanValue("windowsMobileApplicationManagementEnabled", this.getWindowsMobileApplicationManagementEnabled());
    }
    /**
     * Sets the allowPartnerToCollectIOSApplicationMetadata property value. When TRUE, indicates the Mobile Threat Defense partner may collect metadata about installed applications from Intune for iOS devices. When FALSE, indicates the Mobile Threat Defense partner may not collect metadata about installed applications from Intune for iOS devices. Default value is FALSE.
     * @param value Value to set for the allowPartnerToCollectIOSApplicationMetadata property.
     */
    public void setAllowPartnerToCollectIOSApplicationMetadata(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowPartnerToCollectIOSApplicationMetadata", value);
    }
    /**
     * Sets the allowPartnerToCollectIosCertificateMetadata property value. When TRUE, allows the Mobile Threat Defense partner to request a list of installed certificates on iOS/iPadOS devices from Intune to use for threat analysis. This list of installed certificates will be sent from enrolled iOS/iPadOS devices and will include unmanaged certificates (certificates not deployed through Intune). When FALSE, indicates that metadata about installed certificates will not be collected. Default value is FALSE.
     * @param value Value to set for the allowPartnerToCollectIosCertificateMetadata property.
     */
    public void setAllowPartnerToCollectIosCertificateMetadata(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowPartnerToCollectIosCertificateMetadata", value);
    }
    /**
     * Sets the allowPartnerToCollectIOSPersonalApplicationMetadata property value. When TRUE, indicates the Mobile Threat Defense partner may collect metadata about personally installed applications from Intune for iOS devices. When FALSE, indicates the Mobile Threat Defense partner may not collect metadata about personally installed applications from Intune for iOS devices. Default value is FALSE.
     * @param value Value to set for the allowPartnerToCollectIOSPersonalApplicationMetadata property.
     */
    public void setAllowPartnerToCollectIOSPersonalApplicationMetadata(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowPartnerToCollectIOSPersonalApplicationMetadata", value);
    }
    /**
     * Sets the allowPartnerToCollectIosPersonalCertificateMetadata property value. When TRUE, allows the Mobile Threat Defense partner to request a list of installed certificates on personally owned iOS/iPadOS devices from Intune to use for threat analysis. This list of installed certificates will be sent from enrolled personally owned iOS/iPadOS devices and will include unmanaged certificates (certificates not deployed through Intune). When FALSE, no metadata for installed certificates is sent for personally owned iOS/iPadOS devices. Default value is FALSE.
     * @param value Value to set for the allowPartnerToCollectIosPersonalCertificateMetadata property.
     */
    public void setAllowPartnerToCollectIosPersonalCertificateMetadata(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("allowPartnerToCollectIosPersonalCertificateMetadata", value);
    }
    /**
     * Sets the androidDeviceBlockedOnMissingPartnerData property value. When TRUE, indicates that Intune must receive data from the Mobile Threat Defense partner prior to marking an Android device compliant. When FALSE, indicates that Intune may mark an Android device compliant before receiving data from the Mobile Threat Defense partner.
     * @param value Value to set for the androidDeviceBlockedOnMissingPartnerData property.
     */
    public void setAndroidDeviceBlockedOnMissingPartnerData(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("androidDeviceBlockedOnMissingPartnerData", value);
    }
    /**
     * Sets the androidEnabled property value. When TRUE, indicates that data from the Mobile Threat Defense partner will be used during compliance evaluations for Android devices. When FALSE, indicates that data from the Mobile Threat Defense partner will not be used during compliance evaluations for Android devices. Default value is FALSE.
     * @param value Value to set for the androidEnabled property.
     */
    public void setAndroidEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("androidEnabled", value);
    }
    /**
     * Sets the androidMobileApplicationManagementEnabled property value. When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during Mobile Application Management (MAM) evaluations for Android devices. When FALSE, inidicates that data from the Mobile Threat Defense partner should not be used during Mobile Application Management (MAM) evaluations for Android devices. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation. Default value is FALSE.
     * @param value Value to set for the androidMobileApplicationManagementEnabled property.
     */
    public void setAndroidMobileApplicationManagementEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("androidMobileApplicationManagementEnabled", value);
    }
    /**
     * Sets the iosDeviceBlockedOnMissingPartnerData property value. When TRUE, indicates that Intune must receive data from the Mobile Threat Defense partner prior to marking a device compliant. When FALSE, indicates that Intune may not recieve data from Mobile Threat Defense partner prior to making device compliant. Default value is FALSE.
     * @param value Value to set for the iosDeviceBlockedOnMissingPartnerData property.
     */
    public void setIosDeviceBlockedOnMissingPartnerData(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iosDeviceBlockedOnMissingPartnerData", value);
    }
    /**
     * Sets the iosEnabled property value. When TRUE, indicates that data from the Mobile Threat Defense partner will be used during compliance evaluations for iOS devices. When FALSE, indicates that data from the Mobile Threat Defense partner will not be used during compliance evaluations for iOS devices. Default value is FALSE.
     * @param value Value to set for the iosEnabled property.
     */
    public void setIosEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iosEnabled", value);
    }
    /**
     * Sets the iosMobileApplicationManagementEnabled property value. When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during Mobile Application Management (MAM) evaluations for iOS devices. When FALSE, inidicates that data from the Mobile Threat Defense partner should not be used during Mobile Application Management (MAM) evaluations for iOS devices. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation. Default value is FALSE.
     * @param value Value to set for the iosMobileApplicationManagementEnabled property.
     */
    public void setIosMobileApplicationManagementEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("iosMobileApplicationManagementEnabled", value);
    }
    /**
     * Sets the lastHeartbeatDateTime property value. DateTime of last Heartbeat recieved from the Mobile Threat Defense partner
     * @param value Value to set for the lastHeartbeatDateTime property.
     */
    public void setLastHeartbeatDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastHeartbeatDateTime", value);
    }
    /**
     * Sets the macDeviceBlockedOnMissingPartnerData property value. When TRUE, indicates that Intune must receive data from the Mobile Threat Defense partner prior to marking a Mac device compliant. When FALSE, indicates that Intune may mark a Mac device compliant prior to receiving data from the Mobile Threat Defense partner. Default value is FALSE.
     * @param value Value to set for the macDeviceBlockedOnMissingPartnerData property.
     */
    public void setMacDeviceBlockedOnMissingPartnerData(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("macDeviceBlockedOnMissingPartnerData", value);
    }
    /**
     * Sets the macEnabled property value. When TRUE, indicates that data from the Mobile Threat Defense partner will be used during compliance evaluations for Mac devices. When FALSE, indicates that data from the Mobile Threat Defense partner will not be used during compliance evaluations for Mac devices. Default value is FALSE.
     * @param value Value to set for the macEnabled property.
     */
    public void setMacEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("macEnabled", value);
    }
    /**
     * Sets the microsoftDefenderForEndpointAttachEnabled property value. When TRUE, inidicates that configuration profile management via Microsoft Defender for Endpoint is enabled. When FALSE, inidicates that configuration profile management via Microsoft Defender for Endpoint is disabled. Default value is FALSE.
     * @param value Value to set for the microsoftDefenderForEndpointAttachEnabled property.
     */
    public void setMicrosoftDefenderForEndpointAttachEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("microsoftDefenderForEndpointAttachEnabled", value);
    }
    /**
     * Sets the partnerState property value. Partner state of this tenant.
     * @param value Value to set for the partnerState property.
     */
    public void setPartnerState(@jakarta.annotation.Nullable final MobileThreatPartnerTenantState value) {
        this.backingStore.set("partnerState", value);
    }
    /**
     * Sets the partnerUnresponsivenessThresholdInDays property value. Indicates the number of days without receiving a heartbeat from a Mobile Threat Defense partner before the partner is marked as unresponsive. Intune will the ignore the data from this Mobile Threat Defense Partner for next compliance calculation.
     * @param value Value to set for the partnerUnresponsivenessThresholdInDays property.
     */
    public void setPartnerUnresponsivenessThresholdInDays(@jakarta.annotation.Nullable final Integer value) {
        this.backingStore.set("partnerUnresponsivenessThresholdInDays", value);
    }
    /**
     * Sets the partnerUnsupportedOsVersionBlocked property value. When TRUE, indicates that Intune will mark devices noncompliant on enabled platforms that do not meet the minimum version requirements of the Mobile Threat Defense partner. When FALSE, indicates that Intune will not mark devices noncompliant on enabled platforms that do not meet the minimum version requirements of the Mobile Threat Defense partner. Default value is FALSE.
     * @param value Value to set for the partnerUnsupportedOsVersionBlocked property.
     */
    public void setPartnerUnsupportedOsVersionBlocked(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("partnerUnsupportedOsVersionBlocked", value);
    }
    /**
     * Sets the windowsDeviceBlockedOnMissingPartnerData property value. When TRUE, indicates that Intune must receive data from the data sync partner prior to marking a device compliant for Windows. When FALSE, indicates that Intune may mark a device compliant without receiving data from the data sync partner for Windows. Default value is FALSE.
     * @param value Value to set for the windowsDeviceBlockedOnMissingPartnerData property.
     */
    public void setWindowsDeviceBlockedOnMissingPartnerData(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("windowsDeviceBlockedOnMissingPartnerData", value);
    }
    /**
     * Sets the windowsEnabled property value. When TRUE, indicates that data from the Mobile Threat Defense partner will be used during compliance evaluations for Windows. When FALSE, indicates that data from the Mobile Threat Defense partner will not be used during compliance evaluations for Windows. Default value is FALSE.
     * @param value Value to set for the windowsEnabled property.
     */
    public void setWindowsEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("windowsEnabled", value);
    }
    /**
     * Sets the windowsMobileApplicationManagementEnabled property value. When TRUE, inidicates that data from the Mobile Threat Defense partner can be used during Mobile Application Management (MAM) evaluations for iOS devices. When FALSE, inidicates that data from the Mobile Threat Defense partner should not be used during Mobile Application Management (MAM) evaluations for iOS devices. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation. Default value is FALSE.
     * @param value Value to set for the windowsMobileApplicationManagementEnabled property.
     */
    public void setWindowsMobileApplicationManagementEnabled(@jakarta.annotation.Nullable final Boolean value) {
        this.backingStore.set("windowsMobileApplicationManagementEnabled", value);
    }
}

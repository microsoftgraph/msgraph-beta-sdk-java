package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class MobileThreatDefenseConnector extends Entity implements Parsable {
    /** For IOS devices, allows the admin to configure whether the data sync partner may also collect metadata about installed applications from Intune */
    private Boolean _allowPartnerToCollectIOSApplicationMetadata;
    /** For IOS devices, allows the admin to configure whether the data sync partner may also collect metadata about personally installed applications from Intune */
    private Boolean _allowPartnerToCollectIOSPersonalApplicationMetadata;
    /** For Android, set whether Intune must receive data from the data sync partner prior to marking a device compliant */
    private Boolean _androidDeviceBlockedOnMissingPartnerData;
    /** For Android, set whether data from the data sync partner should be used during compliance evaluations */
    private Boolean _androidEnabled;
    /** For Android, set whether data from the data sync partner should be used during Mobile Application Management (MAM) evaluations. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation. */
    private Boolean _androidMobileApplicationManagementEnabled;
    /** For IOS, set whether Intune must receive data from the data sync partner prior to marking a device compliant */
    private Boolean _iosDeviceBlockedOnMissingPartnerData;
    /** For IOS, get or set whether data from the data sync partner should be used during compliance evaluations */
    private Boolean _iosEnabled;
    /** For IOS, get or set whether data from the data sync partner should be used during Mobile Application Management (MAM) evaluations. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation. */
    private Boolean _iosMobileApplicationManagementEnabled;
    /** DateTime of last Heartbeat recieved from the Data Sync Partner */
    private OffsetDateTime _lastHeartbeatDateTime;
    /** For Mac, get or set whether Intune must receive data from the data sync partner prior to marking a device compliant */
    private Boolean _macDeviceBlockedOnMissingPartnerData;
    /** For Mac, get or set whether data from the data sync partner should be used during compliance evaluations */
    private Boolean _macEnabled;
    /** When TRUE, configuration profile management via Microsoft Defender for Endpoint is enabled. When FALSE, configuration profile management via Microsoft Defender for Endpoint is disabled. */
    private Boolean _microsoftDefenderForEndpointAttachEnabled;
    /** Data Sync Partner state for this account. Possible values are: unavailable, available, enabled, unresponsive. */
    private MobileThreatPartnerTenantState _partnerState;
    /** Get or Set days the per tenant tolerance to unresponsiveness for this partner integration */
    private Integer _partnerUnresponsivenessThresholdInDays;
    /** Get or set whether to block devices on the enabled platforms that do not meet the minimum version requirements of the Data Sync Partner */
    private Boolean _partnerUnsupportedOsVersionBlocked;
    /** For Windows, set whether Intune must receive data from the data sync partner prior to marking a device compliant */
    private Boolean _windowsDeviceBlockedOnMissingPartnerData;
    /** For Windows, get or set whether data from the data sync partner should be used during compliance evaluations */
    private Boolean _windowsEnabled;
    /**
     * Instantiates a new mobileThreatDefenseConnector and sets the default values.
     * @return a void
     */
    public MobileThreatDefenseConnector() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a mobileThreatDefenseConnector
     */
    @javax.annotation.Nonnull
    public static MobileThreatDefenseConnector createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new MobileThreatDefenseConnector();
    }
    /**
     * Gets the allowPartnerToCollectIOSApplicationMetadata property value. For IOS devices, allows the admin to configure whether the data sync partner may also collect metadata about installed applications from Intune
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowPartnerToCollectIOSApplicationMetadata() {
        return this._allowPartnerToCollectIOSApplicationMetadata;
    }
    /**
     * Gets the allowPartnerToCollectIOSPersonalApplicationMetadata property value. For IOS devices, allows the admin to configure whether the data sync partner may also collect metadata about personally installed applications from Intune
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAllowPartnerToCollectIOSPersonalApplicationMetadata() {
        return this._allowPartnerToCollectIOSPersonalApplicationMetadata;
    }
    /**
     * Gets the androidDeviceBlockedOnMissingPartnerData property value. For Android, set whether Intune must receive data from the data sync partner prior to marking a device compliant
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAndroidDeviceBlockedOnMissingPartnerData() {
        return this._androidDeviceBlockedOnMissingPartnerData;
    }
    /**
     * Gets the androidEnabled property value. For Android, set whether data from the data sync partner should be used during compliance evaluations
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAndroidEnabled() {
        return this._androidEnabled;
    }
    /**
     * Gets the androidMobileApplicationManagementEnabled property value. For Android, set whether data from the data sync partner should be used during Mobile Application Management (MAM) evaluations. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAndroidMobileApplicationManagementEnabled() {
        return this._androidMobileApplicationManagementEnabled;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final MobileThreatDefenseConnector currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("allowPartnerToCollectIOSApplicationMetadata", (n) -> { currentObject.setAllowPartnerToCollectIOSApplicationMetadata(n.getBooleanValue()); });
            this.put("allowPartnerToCollectIOSPersonalApplicationMetadata", (n) -> { currentObject.setAllowPartnerToCollectIOSPersonalApplicationMetadata(n.getBooleanValue()); });
            this.put("androidDeviceBlockedOnMissingPartnerData", (n) -> { currentObject.setAndroidDeviceBlockedOnMissingPartnerData(n.getBooleanValue()); });
            this.put("androidEnabled", (n) -> { currentObject.setAndroidEnabled(n.getBooleanValue()); });
            this.put("androidMobileApplicationManagementEnabled", (n) -> { currentObject.setAndroidMobileApplicationManagementEnabled(n.getBooleanValue()); });
            this.put("iosDeviceBlockedOnMissingPartnerData", (n) -> { currentObject.setIosDeviceBlockedOnMissingPartnerData(n.getBooleanValue()); });
            this.put("iosEnabled", (n) -> { currentObject.setIosEnabled(n.getBooleanValue()); });
            this.put("iosMobileApplicationManagementEnabled", (n) -> { currentObject.setIosMobileApplicationManagementEnabled(n.getBooleanValue()); });
            this.put("lastHeartbeatDateTime", (n) -> { currentObject.setLastHeartbeatDateTime(n.getOffsetDateTimeValue()); });
            this.put("macDeviceBlockedOnMissingPartnerData", (n) -> { currentObject.setMacDeviceBlockedOnMissingPartnerData(n.getBooleanValue()); });
            this.put("macEnabled", (n) -> { currentObject.setMacEnabled(n.getBooleanValue()); });
            this.put("microsoftDefenderForEndpointAttachEnabled", (n) -> { currentObject.setMicrosoftDefenderForEndpointAttachEnabled(n.getBooleanValue()); });
            this.put("partnerState", (n) -> { currentObject.setPartnerState(n.getEnumValue(MobileThreatPartnerTenantState.class)); });
            this.put("partnerUnresponsivenessThresholdInDays", (n) -> { currentObject.setPartnerUnresponsivenessThresholdInDays(n.getIntegerValue()); });
            this.put("partnerUnsupportedOsVersionBlocked", (n) -> { currentObject.setPartnerUnsupportedOsVersionBlocked(n.getBooleanValue()); });
            this.put("windowsDeviceBlockedOnMissingPartnerData", (n) -> { currentObject.setWindowsDeviceBlockedOnMissingPartnerData(n.getBooleanValue()); });
            this.put("windowsEnabled", (n) -> { currentObject.setWindowsEnabled(n.getBooleanValue()); });
        }};
    }
    /**
     * Gets the iosDeviceBlockedOnMissingPartnerData property value. For IOS, set whether Intune must receive data from the data sync partner prior to marking a device compliant
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIosDeviceBlockedOnMissingPartnerData() {
        return this._iosDeviceBlockedOnMissingPartnerData;
    }
    /**
     * Gets the iosEnabled property value. For IOS, get or set whether data from the data sync partner should be used during compliance evaluations
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIosEnabled() {
        return this._iosEnabled;
    }
    /**
     * Gets the iosMobileApplicationManagementEnabled property value. For IOS, get or set whether data from the data sync partner should be used during Mobile Application Management (MAM) evaluations. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIosMobileApplicationManagementEnabled() {
        return this._iosMobileApplicationManagementEnabled;
    }
    /**
     * Gets the lastHeartbeatDateTime property value. DateTime of last Heartbeat recieved from the Data Sync Partner
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastHeartbeatDateTime() {
        return this._lastHeartbeatDateTime;
    }
    /**
     * Gets the macDeviceBlockedOnMissingPartnerData property value. For Mac, get or set whether Intune must receive data from the data sync partner prior to marking a device compliant
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMacDeviceBlockedOnMissingPartnerData() {
        return this._macDeviceBlockedOnMissingPartnerData;
    }
    /**
     * Gets the macEnabled property value. For Mac, get or set whether data from the data sync partner should be used during compliance evaluations
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMacEnabled() {
        return this._macEnabled;
    }
    /**
     * Gets the microsoftDefenderForEndpointAttachEnabled property value. When TRUE, configuration profile management via Microsoft Defender for Endpoint is enabled. When FALSE, configuration profile management via Microsoft Defender for Endpoint is disabled.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getMicrosoftDefenderForEndpointAttachEnabled() {
        return this._microsoftDefenderForEndpointAttachEnabled;
    }
    /**
     * Gets the partnerState property value. Data Sync Partner state for this account. Possible values are: unavailable, available, enabled, unresponsive.
     * @return a mobileThreatPartnerTenantState
     */
    @javax.annotation.Nullable
    public MobileThreatPartnerTenantState getPartnerState() {
        return this._partnerState;
    }
    /**
     * Gets the partnerUnresponsivenessThresholdInDays property value. Get or Set days the per tenant tolerance to unresponsiveness for this partner integration
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPartnerUnresponsivenessThresholdInDays() {
        return this._partnerUnresponsivenessThresholdInDays;
    }
    /**
     * Gets the partnerUnsupportedOsVersionBlocked property value. Get or set whether to block devices on the enabled platforms that do not meet the minimum version requirements of the Data Sync Partner
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getPartnerUnsupportedOsVersionBlocked() {
        return this._partnerUnsupportedOsVersionBlocked;
    }
    /**
     * Gets the windowsDeviceBlockedOnMissingPartnerData property value. For Windows, set whether Intune must receive data from the data sync partner prior to marking a device compliant
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsDeviceBlockedOnMissingPartnerData() {
        return this._windowsDeviceBlockedOnMissingPartnerData;
    }
    /**
     * Gets the windowsEnabled property value. For Windows, get or set whether data from the data sync partner should be used during compliance evaluations
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getWindowsEnabled() {
        return this._windowsEnabled;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("allowPartnerToCollectIOSApplicationMetadata", this.getAllowPartnerToCollectIOSApplicationMetadata());
        writer.writeBooleanValue("allowPartnerToCollectIOSPersonalApplicationMetadata", this.getAllowPartnerToCollectIOSPersonalApplicationMetadata());
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
    }
    /**
     * Sets the allowPartnerToCollectIOSApplicationMetadata property value. For IOS devices, allows the admin to configure whether the data sync partner may also collect metadata about installed applications from Intune
     * @param value Value to set for the allowPartnerToCollectIOSApplicationMetadata property.
     * @return a void
     */
    public void setAllowPartnerToCollectIOSApplicationMetadata(@javax.annotation.Nullable final Boolean value) {
        this._allowPartnerToCollectIOSApplicationMetadata = value;
    }
    /**
     * Sets the allowPartnerToCollectIOSPersonalApplicationMetadata property value. For IOS devices, allows the admin to configure whether the data sync partner may also collect metadata about personally installed applications from Intune
     * @param value Value to set for the allowPartnerToCollectIOSPersonalApplicationMetadata property.
     * @return a void
     */
    public void setAllowPartnerToCollectIOSPersonalApplicationMetadata(@javax.annotation.Nullable final Boolean value) {
        this._allowPartnerToCollectIOSPersonalApplicationMetadata = value;
    }
    /**
     * Sets the androidDeviceBlockedOnMissingPartnerData property value. For Android, set whether Intune must receive data from the data sync partner prior to marking a device compliant
     * @param value Value to set for the androidDeviceBlockedOnMissingPartnerData property.
     * @return a void
     */
    public void setAndroidDeviceBlockedOnMissingPartnerData(@javax.annotation.Nullable final Boolean value) {
        this._androidDeviceBlockedOnMissingPartnerData = value;
    }
    /**
     * Sets the androidEnabled property value. For Android, set whether data from the data sync partner should be used during compliance evaluations
     * @param value Value to set for the androidEnabled property.
     * @return a void
     */
    public void setAndroidEnabled(@javax.annotation.Nullable final Boolean value) {
        this._androidEnabled = value;
    }
    /**
     * Sets the androidMobileApplicationManagementEnabled property value. For Android, set whether data from the data sync partner should be used during Mobile Application Management (MAM) evaluations. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation.
     * @param value Value to set for the androidMobileApplicationManagementEnabled property.
     * @return a void
     */
    public void setAndroidMobileApplicationManagementEnabled(@javax.annotation.Nullable final Boolean value) {
        this._androidMobileApplicationManagementEnabled = value;
    }
    /**
     * Sets the iosDeviceBlockedOnMissingPartnerData property value. For IOS, set whether Intune must receive data from the data sync partner prior to marking a device compliant
     * @param value Value to set for the iosDeviceBlockedOnMissingPartnerData property.
     * @return a void
     */
    public void setIosDeviceBlockedOnMissingPartnerData(@javax.annotation.Nullable final Boolean value) {
        this._iosDeviceBlockedOnMissingPartnerData = value;
    }
    /**
     * Sets the iosEnabled property value. For IOS, get or set whether data from the data sync partner should be used during compliance evaluations
     * @param value Value to set for the iosEnabled property.
     * @return a void
     */
    public void setIosEnabled(@javax.annotation.Nullable final Boolean value) {
        this._iosEnabled = value;
    }
    /**
     * Sets the iosMobileApplicationManagementEnabled property value. For IOS, get or set whether data from the data sync partner should be used during Mobile Application Management (MAM) evaluations. Only one partner per platform may be enabled for Mobile Application Management (MAM) evaluation.
     * @param value Value to set for the iosMobileApplicationManagementEnabled property.
     * @return a void
     */
    public void setIosMobileApplicationManagementEnabled(@javax.annotation.Nullable final Boolean value) {
        this._iosMobileApplicationManagementEnabled = value;
    }
    /**
     * Sets the lastHeartbeatDateTime property value. DateTime of last Heartbeat recieved from the Data Sync Partner
     * @param value Value to set for the lastHeartbeatDateTime property.
     * @return a void
     */
    public void setLastHeartbeatDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastHeartbeatDateTime = value;
    }
    /**
     * Sets the macDeviceBlockedOnMissingPartnerData property value. For Mac, get or set whether Intune must receive data from the data sync partner prior to marking a device compliant
     * @param value Value to set for the macDeviceBlockedOnMissingPartnerData property.
     * @return a void
     */
    public void setMacDeviceBlockedOnMissingPartnerData(@javax.annotation.Nullable final Boolean value) {
        this._macDeviceBlockedOnMissingPartnerData = value;
    }
    /**
     * Sets the macEnabled property value. For Mac, get or set whether data from the data sync partner should be used during compliance evaluations
     * @param value Value to set for the macEnabled property.
     * @return a void
     */
    public void setMacEnabled(@javax.annotation.Nullable final Boolean value) {
        this._macEnabled = value;
    }
    /**
     * Sets the microsoftDefenderForEndpointAttachEnabled property value. When TRUE, configuration profile management via Microsoft Defender for Endpoint is enabled. When FALSE, configuration profile management via Microsoft Defender for Endpoint is disabled.
     * @param value Value to set for the microsoftDefenderForEndpointAttachEnabled property.
     * @return a void
     */
    public void setMicrosoftDefenderForEndpointAttachEnabled(@javax.annotation.Nullable final Boolean value) {
        this._microsoftDefenderForEndpointAttachEnabled = value;
    }
    /**
     * Sets the partnerState property value. Data Sync Partner state for this account. Possible values are: unavailable, available, enabled, unresponsive.
     * @param value Value to set for the partnerState property.
     * @return a void
     */
    public void setPartnerState(@javax.annotation.Nullable final MobileThreatPartnerTenantState value) {
        this._partnerState = value;
    }
    /**
     * Sets the partnerUnresponsivenessThresholdInDays property value. Get or Set days the per tenant tolerance to unresponsiveness for this partner integration
     * @param value Value to set for the partnerUnresponsivenessThresholdInDays property.
     * @return a void
     */
    public void setPartnerUnresponsivenessThresholdInDays(@javax.annotation.Nullable final Integer value) {
        this._partnerUnresponsivenessThresholdInDays = value;
    }
    /**
     * Sets the partnerUnsupportedOsVersionBlocked property value. Get or set whether to block devices on the enabled platforms that do not meet the minimum version requirements of the Data Sync Partner
     * @param value Value to set for the partnerUnsupportedOsVersionBlocked property.
     * @return a void
     */
    public void setPartnerUnsupportedOsVersionBlocked(@javax.annotation.Nullable final Boolean value) {
        this._partnerUnsupportedOsVersionBlocked = value;
    }
    /**
     * Sets the windowsDeviceBlockedOnMissingPartnerData property value. For Windows, set whether Intune must receive data from the data sync partner prior to marking a device compliant
     * @param value Value to set for the windowsDeviceBlockedOnMissingPartnerData property.
     * @return a void
     */
    public void setWindowsDeviceBlockedOnMissingPartnerData(@javax.annotation.Nullable final Boolean value) {
        this._windowsDeviceBlockedOnMissingPartnerData = value;
    }
    /**
     * Sets the windowsEnabled property value. For Windows, get or set whether data from the data sync partner should be used during compliance evaluations
     * @param value Value to set for the windowsEnabled property.
     * @return a void
     */
    public void setWindowsEnabled(@javax.annotation.Nullable final Boolean value) {
        this._windowsEnabled = value;
    }
}

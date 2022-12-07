package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Device extends DirectoryObject implements Parsable {
    /** true if the account is enabled; otherwise, false. Default is true.  Supports $filter (eq, ne, not, in). Only callers in Global Administrator and Cloud Device Administrator roles can set this property. */
    private Boolean _accountEnabled;
    /** For internal use only. Not nullable. Supports $filter (eq, not, ge, le). */
    private java.util.List<AlternativeSecurityId> _alternativeSecurityIds;
    /** The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. Supports $filter (eq, ne, not, ge, le, and eq on null values) and $orderBy. */
    private OffsetDateTime _approximateLastSignInDateTime;
    /** Set of commands sent to this device. */
    private java.util.List<Command> _commands;
    /** The timestamp when the device is no longer deemed compliant. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime _complianceExpirationDateTime;
    /** User-defined property set by Intune to automatically add devices to groups and simplify managing devices. */
    private String _deviceCategory;
    /** Unique Identifier set by Azure Device Registration Service at the time of registration. This is an alternate key that can be used to reference the device object. Also Supports $filter (eq, ne, not, startsWith). */
    private String _deviceId;
    /** For internal use only. Set to null. */
    private String _deviceMetadata;
    /** Ownership of the device. This property is set by Intune. Possible values are: unknown, company, personal. */
    private String _deviceOwnership;
    /** For internal use only. */
    private Integer _deviceVersion;
    /** The display name for the device. Required. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy. */
    private String _displayName;
    /** The on-premises domain name of Hybrid Azure AD joined devices. This property is set by Intune. */
    private String _domainName;
    /** Enrollment profile applied to the device. For example, Apple Device Enrollment Profile, Device enrollment - Corporate device identifiers, or Windows Autopilot profile name. This property is set by Intune. */
    private String _enrollmentProfileName;
    /** Enrollment type of the device. This property is set by Intune. Possible values are: unknown, userEnrollment, deviceEnrollmentManager, appleBulkWithUser, appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless, windowsAutoEnrollment, windowsBulkAzureDomainJoin, windowsCoManagement. */
    private String _enrollmentType;
    /** Contains extension attributes 1-15 for the device. The individual extension attributes are not selectable. These properties are mastered in cloud and can be set during creation or update of a device object in Azure AD. Supports $filter (eq, not, startsWith, and eq on null values). */
    private OnPremisesExtensionAttributes _extensionAttributes;
    /** The collection of open extensions defined for the device. Read-only. Nullable. */
    private java.util.List<Extension> _extensions;
    /** List of hostNames for the device. */
    private java.util.List<String> _hostnames;
    /** true if the device complies with Mobile Device Management (MDM) policies; otherwise, false. Read-only. This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices. Supports $filter (eq, ne, not). */
    private Boolean _isCompliant;
    /** true if the device is managed by a Mobile Device Management (MDM) app; otherwise, false. This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices. Supports $filter (eq, ne, not). */
    private Boolean _isManaged;
    /** The isManagementRestricted property */
    private Boolean _isManagementRestricted;
    /** true if device is rooted; false if device is jail-broken. This can only be updated by Intune. */
    private Boolean _isRooted;
    /** Form factor of device. Only returned if user signs in with a Microsoft account as part of Project Rome. */
    private String _kind;
    /** Management channel of the device.  This property is set by Intune. Possible values are: eas, mdm, easMdm, intuneClient, easIntuneClient, configurationManagerClient, configurationManagerClientMdm, configurationManagerClientMdmEas, unknown, jamf, googleCloudDevicePolicyController. */
    private String _managementType;
    /** Manufacturer of the device. Read-only. */
    private String _manufacturer;
    /** Application identifier used to register device into MDM. Read-only. Supports $filter (eq, ne, not, startsWith). */
    private String _mdmAppId;
    /** Groups and administrative units that this device is a member of. Read-only. Nullable. Supports $expand. */
    private java.util.List<DirectoryObject> _memberOf;
    /** Model of the device. Read-only. */
    private String _model;
    /** Friendly name of a device. Only returned if user signs in with a Microsoft account as part of Project Rome. */
    private String _name;
    /** The last time at which the object was synced with the on-premises directory. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z Read-only. Supports $filter (eq, ne, not, ge, le, in). */
    private OffsetDateTime _onPremisesLastSyncDateTime;
    /** true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Read-only. Supports $filter (eq, ne, not, in, and eq on null values). */
    private Boolean _onPremisesSyncEnabled;
    /** The type of operating system on the device. Required. Supports $filter (eq, ne, not, ge, le, startsWith, and eq on null values). */
    private String _operatingSystem;
    /** Operating system version of the device. Required. Supports $filter (eq, ne, not, ge, le, startsWith, and eq on null values). */
    private String _operatingSystemVersion;
    /** For internal use only. Not nullable. Supports $filter (eq, not, ge, le, startsWith, /$count eq 0, /$count ne 0. */
    private java.util.List<String> _physicalIds;
    /** Platform of device. Only returned if user signs in with a Microsoft account as part of Project Rome. Only returned if user signs in with a Microsoft account as part of Project Rome. */
    private String _platform;
    /** The profile type of the device. Possible values: RegisteredDevice (default), SecureVM, Printer, Shared, IoT. */
    private String _profileType;
    /** The user that cloud joined the device or registered their personal device. The registered owner is set at the time of registration. Currently, there can be only one owner. Read-only. Nullable. Supports $expand. */
    private java.util.List<DirectoryObject> _registeredOwners;
    /** Collection of registered users of the device. For cloud joined devices and registered personal devices, registered users are set to the same value as registered owners at the time of registration. Read-only. Nullable. Supports $expand. */
    private java.util.List<DirectoryObject> _registeredUsers;
    /** Date and time of when the device was registered. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime _registrationDateTime;
    /** Device is online or offline. Only returned if user signs in with a Microsoft account as part of Project Rome. */
    private String _status;
    /** List of labels applied to the device by the system. Supports $filter (/$count eq 0, /$count ne 0). */
    private java.util.List<String> _systemLabels;
    /** Groups and administrative units that this device is a member of. This operation is transitive. Supports $expand. */
    private java.util.List<DirectoryObject> _transitiveMemberOf;
    /** Type of trust for the joined device. Read-only. Possible values: Workplace (indicates bring your own personal devices), AzureAd (Cloud only joined devices), ServerAd (on-premises domain joined devices joined to Azure AD). For more details, see Introduction to device management in Azure Active Directory */
    private String _trustType;
    /** Represents the usage rights a device has been granted. */
    private java.util.List<UsageRight> _usageRights;
    /**
     * Instantiates a new device and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Device() {
        super();
        this.setOdataType("#microsoft.graph.device");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a device
     */
    @javax.annotation.Nonnull
    public static Device createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Device();
    }
    /**
     * Gets the accountEnabled property value. true if the account is enabled; otherwise, false. Default is true.  Supports $filter (eq, ne, not, in). Only callers in Global Administrator and Cloud Device Administrator roles can set this property.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getAccountEnabled() {
        return this._accountEnabled;
    }
    /**
     * Gets the alternativeSecurityIds property value. For internal use only. Not nullable. Supports $filter (eq, not, ge, le).
     * @return a alternativeSecurityId
     */
    @javax.annotation.Nullable
    public java.util.List<AlternativeSecurityId> getAlternativeSecurityIds() {
        return this._alternativeSecurityIds;
    }
    /**
     * Gets the approximateLastSignInDateTime property value. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. Supports $filter (eq, ne, not, ge, le, and eq on null values) and $orderBy.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getApproximateLastSignInDateTime() {
        return this._approximateLastSignInDateTime;
    }
    /**
     * Gets the commands property value. Set of commands sent to this device.
     * @return a command
     */
    @javax.annotation.Nullable
    public java.util.List<Command> getCommands() {
        return this._commands;
    }
    /**
     * Gets the complianceExpirationDateTime property value. The timestamp when the device is no longer deemed compliant. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getComplianceExpirationDateTime() {
        return this._complianceExpirationDateTime;
    }
    /**
     * Gets the deviceCategory property value. User-defined property set by Intune to automatically add devices to groups and simplify managing devices.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceCategory() {
        return this._deviceCategory;
    }
    /**
     * Gets the deviceId property value. Unique Identifier set by Azure Device Registration Service at the time of registration. This is an alternate key that can be used to reference the device object. Also Supports $filter (eq, ne, not, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceId() {
        return this._deviceId;
    }
    /**
     * Gets the deviceMetadata property value. For internal use only. Set to null.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceMetadata() {
        return this._deviceMetadata;
    }
    /**
     * Gets the deviceOwnership property value. Ownership of the device. This property is set by Intune. Possible values are: unknown, company, personal.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeviceOwnership() {
        return this._deviceOwnership;
    }
    /**
     * Gets the deviceVersion property value. For internal use only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeviceVersion() {
        return this._deviceVersion;
    }
    /**
     * Gets the displayName property value. The display name for the device. Required. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the domainName property value. The on-premises domain name of Hybrid Azure AD joined devices. This property is set by Intune.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDomainName() {
        return this._domainName;
    }
    /**
     * Gets the enrollmentProfileName property value. Enrollment profile applied to the device. For example, Apple Device Enrollment Profile, Device enrollment - Corporate device identifiers, or Windows Autopilot profile name. This property is set by Intune.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnrollmentProfileName() {
        return this._enrollmentProfileName;
    }
    /**
     * Gets the enrollmentType property value. Enrollment type of the device. This property is set by Intune. Possible values are: unknown, userEnrollment, deviceEnrollmentManager, appleBulkWithUser, appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless, windowsAutoEnrollment, windowsBulkAzureDomainJoin, windowsCoManagement.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getEnrollmentType() {
        return this._enrollmentType;
    }
    /**
     * Gets the extensionAttributes property value. Contains extension attributes 1-15 for the device. The individual extension attributes are not selectable. These properties are mastered in cloud and can be set during creation or update of a device object in Azure AD. Supports $filter (eq, not, startsWith, and eq on null values).
     * @return a onPremisesExtensionAttributes
     */
    @javax.annotation.Nullable
    public OnPremisesExtensionAttributes getExtensionAttributes() {
        return this._extensionAttributes;
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the device. Read-only. Nullable.
     * @return a extension
     */
    @javax.annotation.Nullable
    public java.util.List<Extension> getExtensions() {
        return this._extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("accountEnabled", (n) -> { this.setAccountEnabled(n.getBooleanValue()); });
        deserializerMap.put("alternativeSecurityIds", (n) -> { this.setAlternativeSecurityIds(n.getCollectionOfObjectValues(AlternativeSecurityId::createFromDiscriminatorValue)); });
        deserializerMap.put("approximateLastSignInDateTime", (n) -> { this.setApproximateLastSignInDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("commands", (n) -> { this.setCommands(n.getCollectionOfObjectValues(Command::createFromDiscriminatorValue)); });
        deserializerMap.put("complianceExpirationDateTime", (n) -> { this.setComplianceExpirationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deviceCategory", (n) -> { this.setDeviceCategory(n.getStringValue()); });
        deserializerMap.put("deviceId", (n) -> { this.setDeviceId(n.getStringValue()); });
        deserializerMap.put("deviceMetadata", (n) -> { this.setDeviceMetadata(n.getStringValue()); });
        deserializerMap.put("deviceOwnership", (n) -> { this.setDeviceOwnership(n.getStringValue()); });
        deserializerMap.put("deviceVersion", (n) -> { this.setDeviceVersion(n.getIntegerValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("domainName", (n) -> { this.setDomainName(n.getStringValue()); });
        deserializerMap.put("enrollmentProfileName", (n) -> { this.setEnrollmentProfileName(n.getStringValue()); });
        deserializerMap.put("enrollmentType", (n) -> { this.setEnrollmentType(n.getStringValue()); });
        deserializerMap.put("extensionAttributes", (n) -> { this.setExtensionAttributes(n.getObjectValue(OnPremisesExtensionAttributes::createFromDiscriminatorValue)); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
        deserializerMap.put("hostnames", (n) -> { this.setHostnames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("isCompliant", (n) -> { this.setIsCompliant(n.getBooleanValue()); });
        deserializerMap.put("isManaged", (n) -> { this.setIsManaged(n.getBooleanValue()); });
        deserializerMap.put("isManagementRestricted", (n) -> { this.setIsManagementRestricted(n.getBooleanValue()); });
        deserializerMap.put("isRooted", (n) -> { this.setIsRooted(n.getBooleanValue()); });
        deserializerMap.put("kind", (n) -> { this.setKind(n.getStringValue()); });
        deserializerMap.put("managementType", (n) -> { this.setManagementType(n.getStringValue()); });
        deserializerMap.put("manufacturer", (n) -> { this.setManufacturer(n.getStringValue()); });
        deserializerMap.put("mdmAppId", (n) -> { this.setMdmAppId(n.getStringValue()); });
        deserializerMap.put("memberOf", (n) -> { this.setMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("model", (n) -> { this.setModel(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("onPremisesLastSyncDateTime", (n) -> { this.setOnPremisesLastSyncDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("onPremisesSyncEnabled", (n) -> { this.setOnPremisesSyncEnabled(n.getBooleanValue()); });
        deserializerMap.put("operatingSystem", (n) -> { this.setOperatingSystem(n.getStringValue()); });
        deserializerMap.put("operatingSystemVersion", (n) -> { this.setOperatingSystemVersion(n.getStringValue()); });
        deserializerMap.put("physicalIds", (n) -> { this.setPhysicalIds(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getStringValue()); });
        deserializerMap.put("profileType", (n) -> { this.setProfileType(n.getStringValue()); });
        deserializerMap.put("registeredOwners", (n) -> { this.setRegisteredOwners(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("registeredUsers", (n) -> { this.setRegisteredUsers(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("registrationDateTime", (n) -> { this.setRegistrationDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("systemLabels", (n) -> { this.setSystemLabels(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("transitiveMemberOf", (n) -> { this.setTransitiveMemberOf(n.getCollectionOfObjectValues(DirectoryObject::createFromDiscriminatorValue)); });
        deserializerMap.put("trustType", (n) -> { this.setTrustType(n.getStringValue()); });
        deserializerMap.put("usageRights", (n) -> { this.setUsageRights(n.getCollectionOfObjectValues(UsageRight::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the hostnames property value. List of hostNames for the device.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getHostnames() {
        return this._hostnames;
    }
    /**
     * Gets the isCompliant property value. true if the device complies with Mobile Device Management (MDM) policies; otherwise, false. Read-only. This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices. Supports $filter (eq, ne, not).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsCompliant() {
        return this._isCompliant;
    }
    /**
     * Gets the isManaged property value. true if the device is managed by a Mobile Device Management (MDM) app; otherwise, false. This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices. Supports $filter (eq, ne, not).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsManaged() {
        return this._isManaged;
    }
    /**
     * Gets the isManagementRestricted property value. The isManagementRestricted property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsManagementRestricted() {
        return this._isManagementRestricted;
    }
    /**
     * Gets the isRooted property value. true if device is rooted; false if device is jail-broken. This can only be updated by Intune.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsRooted() {
        return this._isRooted;
    }
    /**
     * Gets the kind property value. Form factor of device. Only returned if user signs in with a Microsoft account as part of Project Rome.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getKind() {
        return this._kind;
    }
    /**
     * Gets the managementType property value. Management channel of the device.  This property is set by Intune. Possible values are: eas, mdm, easMdm, intuneClient, easIntuneClient, configurationManagerClient, configurationManagerClientMdm, configurationManagerClientMdmEas, unknown, jamf, googleCloudDevicePolicyController.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManagementType() {
        return this._managementType;
    }
    /**
     * Gets the manufacturer property value. Manufacturer of the device. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManufacturer() {
        return this._manufacturer;
    }
    /**
     * Gets the mdmAppId property value. Application identifier used to register device into MDM. Read-only. Supports $filter (eq, ne, not, startsWith).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMdmAppId() {
        return this._mdmAppId;
    }
    /**
     * Gets the memberOf property value. Groups and administrative units that this device is a member of. Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getMemberOf() {
        return this._memberOf;
    }
    /**
     * Gets the model property value. Model of the device. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getModel() {
        return this._model;
    }
    /**
     * Gets the name property value. Friendly name of a device. Only returned if user signs in with a Microsoft account as part of Project Rome.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the onPremisesLastSyncDateTime property value. The last time at which the object was synced with the on-premises directory. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z Read-only. Supports $filter (eq, ne, not, ge, le, in).
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOnPremisesLastSyncDateTime() {
        return this._onPremisesLastSyncDateTime;
    }
    /**
     * Gets the onPremisesSyncEnabled property value. true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Read-only. Supports $filter (eq, ne, not, in, and eq on null values).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOnPremisesSyncEnabled() {
        return this._onPremisesSyncEnabled;
    }
    /**
     * Gets the operatingSystem property value. The type of operating system on the device. Required. Supports $filter (eq, ne, not, ge, le, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystem() {
        return this._operatingSystem;
    }
    /**
     * Gets the operatingSystemVersion property value. Operating system version of the device. Required. Supports $filter (eq, ne, not, ge, le, startsWith, and eq on null values).
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOperatingSystemVersion() {
        return this._operatingSystemVersion;
    }
    /**
     * Gets the physicalIds property value. For internal use only. Not nullable. Supports $filter (eq, not, ge, le, startsWith, /$count eq 0, /$count ne 0.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getPhysicalIds() {
        return this._physicalIds;
    }
    /**
     * Gets the platform property value. Platform of device. Only returned if user signs in with a Microsoft account as part of Project Rome. Only returned if user signs in with a Microsoft account as part of Project Rome.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPlatform() {
        return this._platform;
    }
    /**
     * Gets the profileType property value. The profile type of the device. Possible values: RegisteredDevice (default), SecureVM, Printer, Shared, IoT.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getProfileType() {
        return this._profileType;
    }
    /**
     * Gets the registeredOwners property value. The user that cloud joined the device or registered their personal device. The registered owner is set at the time of registration. Currently, there can be only one owner. Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getRegisteredOwners() {
        return this._registeredOwners;
    }
    /**
     * Gets the registeredUsers property value. Collection of registered users of the device. For cloud joined devices and registered personal devices, registered users are set to the same value as registered owners at the time of registration. Read-only. Nullable. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getRegisteredUsers() {
        return this._registeredUsers;
    }
    /**
     * Gets the registrationDateTime property value. Date and time of when the device was registered. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getRegistrationDateTime() {
        return this._registrationDateTime;
    }
    /**
     * Gets the status property value. Device is online or offline. Only returned if user signs in with a Microsoft account as part of Project Rome.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this._status;
    }
    /**
     * Gets the systemLabels property value. List of labels applied to the device by the system. Supports $filter (/$count eq 0, /$count ne 0).
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSystemLabels() {
        return this._systemLabels;
    }
    /**
     * Gets the transitiveMemberOf property value. Groups and administrative units that this device is a member of. This operation is transitive. Supports $expand.
     * @return a directoryObject
     */
    @javax.annotation.Nullable
    public java.util.List<DirectoryObject> getTransitiveMemberOf() {
        return this._transitiveMemberOf;
    }
    /**
     * Gets the trustType property value. Type of trust for the joined device. Read-only. Possible values: Workplace (indicates bring your own personal devices), AzureAd (Cloud only joined devices), ServerAd (on-premises domain joined devices joined to Azure AD). For more details, see Introduction to device management in Azure Active Directory
     * @return a string
     */
    @javax.annotation.Nullable
    public String getTrustType() {
        return this._trustType;
    }
    /**
     * Gets the usageRights property value. Represents the usage rights a device has been granted.
     * @return a usageRight
     */
    @javax.annotation.Nullable
    public java.util.List<UsageRight> getUsageRights() {
        return this._usageRights;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeBooleanValue("accountEnabled", this.getAccountEnabled());
        writer.writeCollectionOfObjectValues("alternativeSecurityIds", this.getAlternativeSecurityIds());
        writer.writeOffsetDateTimeValue("approximateLastSignInDateTime", this.getApproximateLastSignInDateTime());
        writer.writeCollectionOfObjectValues("commands", this.getCommands());
        writer.writeOffsetDateTimeValue("complianceExpirationDateTime", this.getComplianceExpirationDateTime());
        writer.writeStringValue("deviceCategory", this.getDeviceCategory());
        writer.writeStringValue("deviceId", this.getDeviceId());
        writer.writeStringValue("deviceMetadata", this.getDeviceMetadata());
        writer.writeStringValue("deviceOwnership", this.getDeviceOwnership());
        writer.writeIntegerValue("deviceVersion", this.getDeviceVersion());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeStringValue("domainName", this.getDomainName());
        writer.writeStringValue("enrollmentProfileName", this.getEnrollmentProfileName());
        writer.writeStringValue("enrollmentType", this.getEnrollmentType());
        writer.writeObjectValue("extensionAttributes", this.getExtensionAttributes());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeCollectionOfPrimitiveValues("hostnames", this.getHostnames());
        writer.writeBooleanValue("isCompliant", this.getIsCompliant());
        writer.writeBooleanValue("isManaged", this.getIsManaged());
        writer.writeBooleanValue("isManagementRestricted", this.getIsManagementRestricted());
        writer.writeBooleanValue("isRooted", this.getIsRooted());
        writer.writeStringValue("kind", this.getKind());
        writer.writeStringValue("managementType", this.getManagementType());
        writer.writeStringValue("manufacturer", this.getManufacturer());
        writer.writeStringValue("mdmAppId", this.getMdmAppId());
        writer.writeCollectionOfObjectValues("memberOf", this.getMemberOf());
        writer.writeStringValue("model", this.getModel());
        writer.writeStringValue("name", this.getName());
        writer.writeOffsetDateTimeValue("onPremisesLastSyncDateTime", this.getOnPremisesLastSyncDateTime());
        writer.writeBooleanValue("onPremisesSyncEnabled", this.getOnPremisesSyncEnabled());
        writer.writeStringValue("operatingSystem", this.getOperatingSystem());
        writer.writeStringValue("operatingSystemVersion", this.getOperatingSystemVersion());
        writer.writeCollectionOfPrimitiveValues("physicalIds", this.getPhysicalIds());
        writer.writeStringValue("platform", this.getPlatform());
        writer.writeStringValue("profileType", this.getProfileType());
        writer.writeCollectionOfObjectValues("registeredOwners", this.getRegisteredOwners());
        writer.writeCollectionOfObjectValues("registeredUsers", this.getRegisteredUsers());
        writer.writeOffsetDateTimeValue("registrationDateTime", this.getRegistrationDateTime());
        writer.writeStringValue("status", this.getStatus());
        writer.writeCollectionOfPrimitiveValues("systemLabels", this.getSystemLabels());
        writer.writeCollectionOfObjectValues("transitiveMemberOf", this.getTransitiveMemberOf());
        writer.writeStringValue("trustType", this.getTrustType());
        writer.writeCollectionOfObjectValues("usageRights", this.getUsageRights());
    }
    /**
     * Sets the accountEnabled property value. true if the account is enabled; otherwise, false. Default is true.  Supports $filter (eq, ne, not, in). Only callers in Global Administrator and Cloud Device Administrator roles can set this property.
     * @param value Value to set for the accountEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAccountEnabled(@javax.annotation.Nullable final Boolean value) {
        this._accountEnabled = value;
    }
    /**
     * Sets the alternativeSecurityIds property value. For internal use only. Not nullable. Supports $filter (eq, not, ge, le).
     * @param value Value to set for the alternativeSecurityIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlternativeSecurityIds(@javax.annotation.Nullable final java.util.List<AlternativeSecurityId> value) {
        this._alternativeSecurityIds = value;
    }
    /**
     * Sets the approximateLastSignInDateTime property value. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. Supports $filter (eq, ne, not, ge, le, and eq on null values) and $orderBy.
     * @param value Value to set for the approximateLastSignInDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setApproximateLastSignInDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._approximateLastSignInDateTime = value;
    }
    /**
     * Sets the commands property value. Set of commands sent to this device.
     * @param value Value to set for the commands property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCommands(@javax.annotation.Nullable final java.util.List<Command> value) {
        this._commands = value;
    }
    /**
     * Sets the complianceExpirationDateTime property value. The timestamp when the device is no longer deemed compliant. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the complianceExpirationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setComplianceExpirationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._complianceExpirationDateTime = value;
    }
    /**
     * Sets the deviceCategory property value. User-defined property set by Intune to automatically add devices to groups and simplify managing devices.
     * @param value Value to set for the deviceCategory property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceCategory(@javax.annotation.Nullable final String value) {
        this._deviceCategory = value;
    }
    /**
     * Sets the deviceId property value. Unique Identifier set by Azure Device Registration Service at the time of registration. This is an alternate key that can be used to reference the device object. Also Supports $filter (eq, ne, not, startsWith).
     * @param value Value to set for the deviceId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceId(@javax.annotation.Nullable final String value) {
        this._deviceId = value;
    }
    /**
     * Sets the deviceMetadata property value. For internal use only. Set to null.
     * @param value Value to set for the deviceMetadata property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceMetadata(@javax.annotation.Nullable final String value) {
        this._deviceMetadata = value;
    }
    /**
     * Sets the deviceOwnership property value. Ownership of the device. This property is set by Intune. Possible values are: unknown, company, personal.
     * @param value Value to set for the deviceOwnership property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceOwnership(@javax.annotation.Nullable final String value) {
        this._deviceOwnership = value;
    }
    /**
     * Sets the deviceVersion property value. For internal use only.
     * @param value Value to set for the deviceVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceVersion(@javax.annotation.Nullable final Integer value) {
        this._deviceVersion = value;
    }
    /**
     * Sets the displayName property value. The display name for the device. Required. Supports $filter (eq, ne, not, ge, le, in, startsWith, and eq on null values), $search, and $orderBy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the domainName property value. The on-premises domain name of Hybrid Azure AD joined devices. This property is set by Intune.
     * @param value Value to set for the domainName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomainName(@javax.annotation.Nullable final String value) {
        this._domainName = value;
    }
    /**
     * Sets the enrollmentProfileName property value. Enrollment profile applied to the device. For example, Apple Device Enrollment Profile, Device enrollment - Corporate device identifiers, or Windows Autopilot profile name. This property is set by Intune.
     * @param value Value to set for the enrollmentProfileName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentProfileName(@javax.annotation.Nullable final String value) {
        this._enrollmentProfileName = value;
    }
    /**
     * Sets the enrollmentType property value. Enrollment type of the device. This property is set by Intune. Possible values are: unknown, userEnrollment, deviceEnrollmentManager, appleBulkWithUser, appleBulkWithoutUser, windowsAzureADJoin, windowsBulkUserless, windowsAutoEnrollment, windowsBulkAzureDomainJoin, windowsCoManagement.
     * @param value Value to set for the enrollmentType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnrollmentType(@javax.annotation.Nullable final String value) {
        this._enrollmentType = value;
    }
    /**
     * Sets the extensionAttributes property value. Contains extension attributes 1-15 for the device. The individual extension attributes are not selectable. These properties are mastered in cloud and can be set during creation or update of a device object in Azure AD. Supports $filter (eq, not, startsWith, and eq on null values).
     * @param value Value to set for the extensionAttributes property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtensionAttributes(@javax.annotation.Nullable final OnPremisesExtensionAttributes value) {
        this._extensionAttributes = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the device. Read-only. Nullable.
     * @param value Value to set for the extensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtensions(@javax.annotation.Nullable final java.util.List<Extension> value) {
        this._extensions = value;
    }
    /**
     * Sets the hostnames property value. List of hostNames for the device.
     * @param value Value to set for the hostnames property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setHostnames(@javax.annotation.Nullable final java.util.List<String> value) {
        this._hostnames = value;
    }
    /**
     * Sets the isCompliant property value. true if the device complies with Mobile Device Management (MDM) policies; otherwise, false. Read-only. This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices. Supports $filter (eq, ne, not).
     * @param value Value to set for the isCompliant property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsCompliant(@javax.annotation.Nullable final Boolean value) {
        this._isCompliant = value;
    }
    /**
     * Sets the isManaged property value. true if the device is managed by a Mobile Device Management (MDM) app; otherwise, false. This can only be updated by Intune for any device OS type or by an approved MDM app for Windows OS devices. Supports $filter (eq, ne, not).
     * @param value Value to set for the isManaged property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsManaged(@javax.annotation.Nullable final Boolean value) {
        this._isManaged = value;
    }
    /**
     * Sets the isManagementRestricted property value. The isManagementRestricted property
     * @param value Value to set for the isManagementRestricted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsManagementRestricted(@javax.annotation.Nullable final Boolean value) {
        this._isManagementRestricted = value;
    }
    /**
     * Sets the isRooted property value. true if device is rooted; false if device is jail-broken. This can only be updated by Intune.
     * @param value Value to set for the isRooted property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsRooted(@javax.annotation.Nullable final Boolean value) {
        this._isRooted = value;
    }
    /**
     * Sets the kind property value. Form factor of device. Only returned if user signs in with a Microsoft account as part of Project Rome.
     * @param value Value to set for the kind property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setKind(@javax.annotation.Nullable final String value) {
        this._kind = value;
    }
    /**
     * Sets the managementType property value. Management channel of the device.  This property is set by Intune. Possible values are: eas, mdm, easMdm, intuneClient, easIntuneClient, configurationManagerClient, configurationManagerClientMdm, configurationManagerClientMdmEas, unknown, jamf, googleCloudDevicePolicyController.
     * @param value Value to set for the managementType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagementType(@javax.annotation.Nullable final String value) {
        this._managementType = value;
    }
    /**
     * Sets the manufacturer property value. Manufacturer of the device. Read-only.
     * @param value Value to set for the manufacturer property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManufacturer(@javax.annotation.Nullable final String value) {
        this._manufacturer = value;
    }
    /**
     * Sets the mdmAppId property value. Application identifier used to register device into MDM. Read-only. Supports $filter (eq, ne, not, startsWith).
     * @param value Value to set for the mdmAppId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMdmAppId(@javax.annotation.Nullable final String value) {
        this._mdmAppId = value;
    }
    /**
     * Sets the memberOf property value. Groups and administrative units that this device is a member of. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the memberOf property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMemberOf(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._memberOf = value;
    }
    /**
     * Sets the model property value. Model of the device. Read-only.
     * @param value Value to set for the model property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setModel(@javax.annotation.Nullable final String value) {
        this._model = value;
    }
    /**
     * Sets the name property value. Friendly name of a device. Only returned if user signs in with a Microsoft account as part of Project Rome.
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the onPremisesLastSyncDateTime property value. The last time at which the object was synced with the on-premises directory. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z Read-only. Supports $filter (eq, ne, not, ge, le, in).
     * @param value Value to set for the onPremisesLastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._onPremisesLastSyncDateTime = value;
    }
    /**
     * Sets the onPremisesSyncEnabled property value. true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced; null if this object has never been synced from an on-premises directory (default). Read-only. Supports $filter (eq, ne, not, in, and eq on null values).
     * @param value Value to set for the onPremisesSyncEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesSyncEnabled(@javax.annotation.Nullable final Boolean value) {
        this._onPremisesSyncEnabled = value;
    }
    /**
     * Sets the operatingSystem property value. The type of operating system on the device. Required. Supports $filter (eq, ne, not, ge, le, startsWith, and eq on null values).
     * @param value Value to set for the operatingSystem property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatingSystem(@javax.annotation.Nullable final String value) {
        this._operatingSystem = value;
    }
    /**
     * Sets the operatingSystemVersion property value. Operating system version of the device. Required. Supports $filter (eq, ne, not, ge, le, startsWith, and eq on null values).
     * @param value Value to set for the operatingSystemVersion property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOperatingSystemVersion(@javax.annotation.Nullable final String value) {
        this._operatingSystemVersion = value;
    }
    /**
     * Sets the physicalIds property value. For internal use only. Not nullable. Supports $filter (eq, not, ge, le, startsWith, /$count eq 0, /$count ne 0.
     * @param value Value to set for the physicalIds property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPhysicalIds(@javax.annotation.Nullable final java.util.List<String> value) {
        this._physicalIds = value;
    }
    /**
     * Sets the platform property value. Platform of device. Only returned if user signs in with a Microsoft account as part of Project Rome. Only returned if user signs in with a Microsoft account as part of Project Rome.
     * @param value Value to set for the platform property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatform(@javax.annotation.Nullable final String value) {
        this._platform = value;
    }
    /**
     * Sets the profileType property value. The profile type of the device. Possible values: RegisteredDevice (default), SecureVM, Printer, Shared, IoT.
     * @param value Value to set for the profileType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProfileType(@javax.annotation.Nullable final String value) {
        this._profileType = value;
    }
    /**
     * Sets the registeredOwners property value. The user that cloud joined the device or registered their personal device. The registered owner is set at the time of registration. Currently, there can be only one owner. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the registeredOwners property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegisteredOwners(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._registeredOwners = value;
    }
    /**
     * Sets the registeredUsers property value. Collection of registered users of the device. For cloud joined devices and registered personal devices, registered users are set to the same value as registered owners at the time of registration. Read-only. Nullable. Supports $expand.
     * @param value Value to set for the registeredUsers property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegisteredUsers(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._registeredUsers = value;
    }
    /**
     * Sets the registrationDateTime property value. Date and time of when the device was registered. The timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the registrationDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegistrationDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._registrationDateTime = value;
    }
    /**
     * Sets the status property value. Device is online or offline. Only returned if user signs in with a Microsoft account as part of Project Rome.
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this._status = value;
    }
    /**
     * Sets the systemLabels property value. List of labels applied to the device by the system. Supports $filter (/$count eq 0, /$count ne 0).
     * @param value Value to set for the systemLabels property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSystemLabels(@javax.annotation.Nullable final java.util.List<String> value) {
        this._systemLabels = value;
    }
    /**
     * Sets the transitiveMemberOf property value. Groups and administrative units that this device is a member of. This operation is transitive. Supports $expand.
     * @param value Value to set for the transitiveMemberOf property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTransitiveMemberOf(@javax.annotation.Nullable final java.util.List<DirectoryObject> value) {
        this._transitiveMemberOf = value;
    }
    /**
     * Sets the trustType property value. Type of trust for the joined device. Read-only. Possible values: Workplace (indicates bring your own personal devices), AzureAd (Cloud only joined devices), ServerAd (on-premises domain joined devices joined to Azure AD). For more details, see Introduction to device management in Azure Active Directory
     * @param value Value to set for the trustType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTrustType(@javax.annotation.Nullable final String value) {
        this._trustType = value;
    }
    /**
     * Sets the usageRights property value. Represents the usage rights a device has been granted.
     * @param value Value to set for the usageRights property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUsageRights(@javax.annotation.Nullable final java.util.List<UsageRight> value) {
        this._usageRights = value;
    }
}

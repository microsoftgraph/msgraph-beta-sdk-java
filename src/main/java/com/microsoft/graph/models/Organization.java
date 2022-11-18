package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class Organization extends DirectoryObject implements Parsable {
    /** The collection of service plans associated with the tenant. Not nullable. */
    private java.util.List<AssignedPlan> _assignedPlans;
    /** Resource to manage the default branding for the organization. Nullable. */
    private OrganizationalBranding _branding;
    /** Telephone number for the organization. Although this is a string collection, only one number can be set for this property. */
    private java.util.List<String> _businessPhones;
    /** Navigation property to manage certificate-based authentication configuration. Only a single instance of certificateBasedAuthConfiguration can be created in the collection. */
    private java.util.List<CertificateBasedAuthConfiguration> _certificateBasedAuthConfiguration;
    /** Certificate connector setting. */
    private CertificateConnectorSetting _certificateConnectorSetting;
    /** City name of the address for the organization. */
    private String _city;
    /** Country/region name of the address for the organization. */
    private String _country;
    /** Country or region abbreviation for the organization in ISO 3166-2 format. */
    private String _countryLetterCode;
    /** Timestamp of when the organization was created. The value cannot be modified and is automatically populated when the organization is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only. */
    private OffsetDateTime _createdDateTime;
    /** Two-letter ISO 3166 country code indicating the default service usage location of an organization. */
    private String _defaultUsageLocation;
    /** The directory size quota information of an organization. */
    private DirectorySizeQuota _directorySizeQuota;
    /** The display name for the tenant. */
    private String _displayName;
    /** The collection of open extensions defined for the organization resource. Nullable. */
    private java.util.List<Extension> _extensions;
    /** true if organization is Multi-Geo enabled; false if organization is not Multi-Geo enabled; null (default). Read-only. For more information, see OneDrive Online Multi-Geo. */
    private Boolean _isMultipleDataLocationsForServicesEnabled;
    /** Not nullable. */
    private java.util.List<String> _marketingNotificationEmails;
    /** Mobile device management authority. */
    private MdmAuthority _mobileDeviceManagementAuthority;
    /** The time and date at which the tenant was last synced with the on-premises directory. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. */
    private OffsetDateTime _onPremisesLastSyncDateTime;
    /** true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced; Nullable. null if this object has never been synced from an on-premises directory (default). */
    private Boolean _onPremisesSyncEnabled;
    /** Postal code of the address for the organization. */
    private String _postalCode;
    /** The preferred language for the organization. Should follow ISO 639-1 Code; for example en. */
    private String _preferredLanguage;
    /** The privacy profile of an organization. */
    private PrivacyProfile _privacyProfile;
    /** Not nullable. */
    private java.util.List<ProvisionedPlan> _provisionedPlans;
    /** The securityComplianceNotificationMails property */
    private java.util.List<String> _securityComplianceNotificationMails;
    /** The securityComplianceNotificationPhones property */
    private java.util.List<String> _securityComplianceNotificationPhones;
    /** Retrieve the properties and relationships of organizationSettings object. Nullable. */
    private OrganizationSettings _settings;
    /** State name of the address for the organization. */
    private String _state;
    /** Street name of the address for organization. */
    private String _street;
    /** Not nullable. */
    private java.util.List<String> _technicalNotificationMails;
    /** The collection of domains associated with this tenant. Not nullable. */
    private java.util.List<VerifiedDomain> _verifiedDomains;
    /**
     * Instantiates a new Organization and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public Organization() {
        super();
        this.setOdataType("#microsoft.graph.organization");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a Organization
     */
    @javax.annotation.Nonnull
    public static Organization createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new Organization();
    }
    /**
     * Gets the assignedPlans property value. The collection of service plans associated with the tenant. Not nullable.
     * @return a assignedPlan
     */
    @javax.annotation.Nullable
    public java.util.List<AssignedPlan> getAssignedPlans() {
        return this._assignedPlans;
    }
    /**
     * Gets the branding property value. Resource to manage the default branding for the organization. Nullable.
     * @return a organizationalBranding
     */
    @javax.annotation.Nullable
    public OrganizationalBranding getBranding() {
        return this._branding;
    }
    /**
     * Gets the businessPhones property value. Telephone number for the organization. Although this is a string collection, only one number can be set for this property.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getBusinessPhones() {
        return this._businessPhones;
    }
    /**
     * Gets the certificateBasedAuthConfiguration property value. Navigation property to manage certificate-based authentication configuration. Only a single instance of certificateBasedAuthConfiguration can be created in the collection.
     * @return a certificateBasedAuthConfiguration
     */
    @javax.annotation.Nullable
    public java.util.List<CertificateBasedAuthConfiguration> getCertificateBasedAuthConfiguration() {
        return this._certificateBasedAuthConfiguration;
    }
    /**
     * Gets the certificateConnectorSetting property value. Certificate connector setting.
     * @return a certificateConnectorSetting
     */
    @javax.annotation.Nullable
    public CertificateConnectorSetting getCertificateConnectorSetting() {
        return this._certificateConnectorSetting;
    }
    /**
     * Gets the city property value. City name of the address for the organization.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCity() {
        return this._city;
    }
    /**
     * Gets the country property value. Country/region name of the address for the organization.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountry() {
        return this._country;
    }
    /**
     * Gets the countryLetterCode property value. Country or region abbreviation for the organization in ISO 3166-2 format.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCountryLetterCode() {
        return this._countryLetterCode;
    }
    /**
     * Gets the createdDateTime property value. Timestamp of when the organization was created. The value cannot be modified and is automatically populated when the organization is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the defaultUsageLocation property value. Two-letter ISO 3166 country code indicating the default service usage location of an organization.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDefaultUsageLocation() {
        return this._defaultUsageLocation;
    }
    /**
     * Gets the directorySizeQuota property value. The directory size quota information of an organization.
     * @return a directorySizeQuota
     */
    @javax.annotation.Nullable
    public DirectorySizeQuota getDirectorySizeQuota() {
        return this._directorySizeQuota;
    }
    /**
     * Gets the displayName property value. The display name for the tenant.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the extensions property value. The collection of open extensions defined for the organization resource. Nullable.
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
        final Organization currentObject = this;
        return new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers()) {{
            this.put("assignedPlans", (n) -> { currentObject.setAssignedPlans(n.getCollectionOfObjectValues(AssignedPlan::createFromDiscriminatorValue)); });
            this.put("branding", (n) -> { currentObject.setBranding(n.getObjectValue(OrganizationalBranding::createFromDiscriminatorValue)); });
            this.put("businessPhones", (n) -> { currentObject.setBusinessPhones(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("certificateBasedAuthConfiguration", (n) -> { currentObject.setCertificateBasedAuthConfiguration(n.getCollectionOfObjectValues(CertificateBasedAuthConfiguration::createFromDiscriminatorValue)); });
            this.put("certificateConnectorSetting", (n) -> { currentObject.setCertificateConnectorSetting(n.getObjectValue(CertificateConnectorSetting::createFromDiscriminatorValue)); });
            this.put("city", (n) -> { currentObject.setCity(n.getStringValue()); });
            this.put("country", (n) -> { currentObject.setCountry(n.getStringValue()); });
            this.put("countryLetterCode", (n) -> { currentObject.setCountryLetterCode(n.getStringValue()); });
            this.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
            this.put("defaultUsageLocation", (n) -> { currentObject.setDefaultUsageLocation(n.getStringValue()); });
            this.put("directorySizeQuota", (n) -> { currentObject.setDirectorySizeQuota(n.getObjectValue(DirectorySizeQuota::createFromDiscriminatorValue)); });
            this.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
            this.put("extensions", (n) -> { currentObject.setExtensions(n.getCollectionOfObjectValues(Extension::createFromDiscriminatorValue)); });
            this.put("isMultipleDataLocationsForServicesEnabled", (n) -> { currentObject.setIsMultipleDataLocationsForServicesEnabled(n.getBooleanValue()); });
            this.put("marketingNotificationEmails", (n) -> { currentObject.setMarketingNotificationEmails(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("mobileDeviceManagementAuthority", (n) -> { currentObject.setMobileDeviceManagementAuthority(n.getEnumValue(MdmAuthority.class)); });
            this.put("onPremisesLastSyncDateTime", (n) -> { currentObject.setOnPremisesLastSyncDateTime(n.getOffsetDateTimeValue()); });
            this.put("onPremisesSyncEnabled", (n) -> { currentObject.setOnPremisesSyncEnabled(n.getBooleanValue()); });
            this.put("postalCode", (n) -> { currentObject.setPostalCode(n.getStringValue()); });
            this.put("preferredLanguage", (n) -> { currentObject.setPreferredLanguage(n.getStringValue()); });
            this.put("privacyProfile", (n) -> { currentObject.setPrivacyProfile(n.getObjectValue(PrivacyProfile::createFromDiscriminatorValue)); });
            this.put("provisionedPlans", (n) -> { currentObject.setProvisionedPlans(n.getCollectionOfObjectValues(ProvisionedPlan::createFromDiscriminatorValue)); });
            this.put("securityComplianceNotificationMails", (n) -> { currentObject.setSecurityComplianceNotificationMails(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("securityComplianceNotificationPhones", (n) -> { currentObject.setSecurityComplianceNotificationPhones(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("settings", (n) -> { currentObject.setSettings(n.getObjectValue(OrganizationSettings::createFromDiscriminatorValue)); });
            this.put("state", (n) -> { currentObject.setState(n.getStringValue()); });
            this.put("street", (n) -> { currentObject.setStreet(n.getStringValue()); });
            this.put("technicalNotificationMails", (n) -> { currentObject.setTechnicalNotificationMails(n.getCollectionOfPrimitiveValues(String.class)); });
            this.put("verifiedDomains", (n) -> { currentObject.setVerifiedDomains(n.getCollectionOfObjectValues(VerifiedDomain::createFromDiscriminatorValue)); });
        }};
    }
    /**
     * Gets the isMultipleDataLocationsForServicesEnabled property value. true if organization is Multi-Geo enabled; false if organization is not Multi-Geo enabled; null (default). Read-only. For more information, see OneDrive Online Multi-Geo.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsMultipleDataLocationsForServicesEnabled() {
        return this._isMultipleDataLocationsForServicesEnabled;
    }
    /**
     * Gets the marketingNotificationEmails property value. Not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getMarketingNotificationEmails() {
        return this._marketingNotificationEmails;
    }
    /**
     * Gets the mobileDeviceManagementAuthority property value. Mobile device management authority.
     * @return a mdmAuthority
     */
    @javax.annotation.Nullable
    public MdmAuthority getMobileDeviceManagementAuthority() {
        return this._mobileDeviceManagementAuthority;
    }
    /**
     * Gets the onPremisesLastSyncDateTime property value. The time and date at which the tenant was last synced with the on-premises directory. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getOnPremisesLastSyncDateTime() {
        return this._onPremisesLastSyncDateTime;
    }
    /**
     * Gets the onPremisesSyncEnabled property value. true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced; Nullable. null if this object has never been synced from an on-premises directory (default).
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getOnPremisesSyncEnabled() {
        return this._onPremisesSyncEnabled;
    }
    /**
     * Gets the postalCode property value. Postal code of the address for the organization.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPostalCode() {
        return this._postalCode;
    }
    /**
     * Gets the preferredLanguage property value. The preferred language for the organization. Should follow ISO 639-1 Code; for example en.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPreferredLanguage() {
        return this._preferredLanguage;
    }
    /**
     * Gets the privacyProfile property value. The privacy profile of an organization.
     * @return a privacyProfile
     */
    @javax.annotation.Nullable
    public PrivacyProfile getPrivacyProfile() {
        return this._privacyProfile;
    }
    /**
     * Gets the provisionedPlans property value. Not nullable.
     * @return a provisionedPlan
     */
    @javax.annotation.Nullable
    public java.util.List<ProvisionedPlan> getProvisionedPlans() {
        return this._provisionedPlans;
    }
    /**
     * Gets the securityComplianceNotificationMails property value. The securityComplianceNotificationMails property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSecurityComplianceNotificationMails() {
        return this._securityComplianceNotificationMails;
    }
    /**
     * Gets the securityComplianceNotificationPhones property value. The securityComplianceNotificationPhones property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getSecurityComplianceNotificationPhones() {
        return this._securityComplianceNotificationPhones;
    }
    /**
     * Gets the settings property value. Retrieve the properties and relationships of organizationSettings object. Nullable.
     * @return a organizationSettings
     */
    @javax.annotation.Nullable
    public OrganizationSettings getSettings() {
        return this._settings;
    }
    /**
     * Gets the state property value. State name of the address for the organization.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getState() {
        return this._state;
    }
    /**
     * Gets the street property value. Street name of the address for organization.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStreet() {
        return this._street;
    }
    /**
     * Gets the technicalNotificationMails property value. Not nullable.
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTechnicalNotificationMails() {
        return this._technicalNotificationMails;
    }
    /**
     * Gets the verifiedDomains property value. The collection of domains associated with this tenant. Not nullable.
     * @return a verifiedDomain
     */
    @javax.annotation.Nullable
    public java.util.List<VerifiedDomain> getVerifiedDomains() {
        return this._verifiedDomains;
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
        writer.writeCollectionOfObjectValues("assignedPlans", this.getAssignedPlans());
        writer.writeObjectValue("branding", this.getBranding());
        writer.writeCollectionOfPrimitiveValues("businessPhones", this.getBusinessPhones());
        writer.writeCollectionOfObjectValues("certificateBasedAuthConfiguration", this.getCertificateBasedAuthConfiguration());
        writer.writeObjectValue("certificateConnectorSetting", this.getCertificateConnectorSetting());
        writer.writeStringValue("city", this.getCity());
        writer.writeStringValue("country", this.getCountry());
        writer.writeStringValue("countryLetterCode", this.getCountryLetterCode());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("defaultUsageLocation", this.getDefaultUsageLocation());
        writer.writeObjectValue("directorySizeQuota", this.getDirectorySizeQuota());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfObjectValues("extensions", this.getExtensions());
        writer.writeBooleanValue("isMultipleDataLocationsForServicesEnabled", this.getIsMultipleDataLocationsForServicesEnabled());
        writer.writeCollectionOfPrimitiveValues("marketingNotificationEmails", this.getMarketingNotificationEmails());
        writer.writeEnumValue("mobileDeviceManagementAuthority", this.getMobileDeviceManagementAuthority());
        writer.writeOffsetDateTimeValue("onPremisesLastSyncDateTime", this.getOnPremisesLastSyncDateTime());
        writer.writeBooleanValue("onPremisesSyncEnabled", this.getOnPremisesSyncEnabled());
        writer.writeStringValue("postalCode", this.getPostalCode());
        writer.writeStringValue("preferredLanguage", this.getPreferredLanguage());
        writer.writeObjectValue("privacyProfile", this.getPrivacyProfile());
        writer.writeCollectionOfObjectValues("provisionedPlans", this.getProvisionedPlans());
        writer.writeCollectionOfPrimitiveValues("securityComplianceNotificationMails", this.getSecurityComplianceNotificationMails());
        writer.writeCollectionOfPrimitiveValues("securityComplianceNotificationPhones", this.getSecurityComplianceNotificationPhones());
        writer.writeObjectValue("settings", this.getSettings());
        writer.writeStringValue("state", this.getState());
        writer.writeStringValue("street", this.getStreet());
        writer.writeCollectionOfPrimitiveValues("technicalNotificationMails", this.getTechnicalNotificationMails());
        writer.writeCollectionOfObjectValues("verifiedDomains", this.getVerifiedDomains());
    }
    /**
     * Sets the assignedPlans property value. The collection of service plans associated with the tenant. Not nullable.
     * @param value Value to set for the assignedPlans property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignedPlans(@javax.annotation.Nullable final java.util.List<AssignedPlan> value) {
        this._assignedPlans = value;
    }
    /**
     * Sets the branding property value. Resource to manage the default branding for the organization. Nullable.
     * @param value Value to set for the branding property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBranding(@javax.annotation.Nullable final OrganizationalBranding value) {
        this._branding = value;
    }
    /**
     * Sets the businessPhones property value. Telephone number for the organization. Although this is a string collection, only one number can be set for this property.
     * @param value Value to set for the businessPhones property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBusinessPhones(@javax.annotation.Nullable final java.util.List<String> value) {
        this._businessPhones = value;
    }
    /**
     * Sets the certificateBasedAuthConfiguration property value. Navigation property to manage certificate-based authentication configuration. Only a single instance of certificateBasedAuthConfiguration can be created in the collection.
     * @param value Value to set for the certificateBasedAuthConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateBasedAuthConfiguration(@javax.annotation.Nullable final java.util.List<CertificateBasedAuthConfiguration> value) {
        this._certificateBasedAuthConfiguration = value;
    }
    /**
     * Sets the certificateConnectorSetting property value. Certificate connector setting.
     * @param value Value to set for the certificateConnectorSetting property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCertificateConnectorSetting(@javax.annotation.Nullable final CertificateConnectorSetting value) {
        this._certificateConnectorSetting = value;
    }
    /**
     * Sets the city property value. City name of the address for the organization.
     * @param value Value to set for the city property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCity(@javax.annotation.Nullable final String value) {
        this._city = value;
    }
    /**
     * Sets the country property value. Country/region name of the address for the organization.
     * @param value Value to set for the country property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountry(@javax.annotation.Nullable final String value) {
        this._country = value;
    }
    /**
     * Sets the countryLetterCode property value. Country or region abbreviation for the organization in ISO 3166-2 format.
     * @param value Value to set for the countryLetterCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountryLetterCode(@javax.annotation.Nullable final String value) {
        this._countryLetterCode = value;
    }
    /**
     * Sets the createdDateTime property value. Timestamp of when the organization was created. The value cannot be modified and is automatically populated when the organization is created. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z. Read-only.
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the defaultUsageLocation property value. Two-letter ISO 3166 country code indicating the default service usage location of an organization.
     * @param value Value to set for the defaultUsageLocation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDefaultUsageLocation(@javax.annotation.Nullable final String value) {
        this._defaultUsageLocation = value;
    }
    /**
     * Sets the directorySizeQuota property value. The directory size quota information of an organization.
     * @param value Value to set for the directorySizeQuota property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDirectorySizeQuota(@javax.annotation.Nullable final DirectorySizeQuota value) {
        this._directorySizeQuota = value;
    }
    /**
     * Sets the displayName property value. The display name for the tenant.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the extensions property value. The collection of open extensions defined for the organization resource. Nullable.
     * @param value Value to set for the extensions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExtensions(@javax.annotation.Nullable final java.util.List<Extension> value) {
        this._extensions = value;
    }
    /**
     * Sets the isMultipleDataLocationsForServicesEnabled property value. true if organization is Multi-Geo enabled; false if organization is not Multi-Geo enabled; null (default). Read-only. For more information, see OneDrive Online Multi-Geo.
     * @param value Value to set for the isMultipleDataLocationsForServicesEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsMultipleDataLocationsForServicesEnabled(@javax.annotation.Nullable final Boolean value) {
        this._isMultipleDataLocationsForServicesEnabled = value;
    }
    /**
     * Sets the marketingNotificationEmails property value. Not nullable.
     * @param value Value to set for the marketingNotificationEmails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMarketingNotificationEmails(@javax.annotation.Nullable final java.util.List<String> value) {
        this._marketingNotificationEmails = value;
    }
    /**
     * Sets the mobileDeviceManagementAuthority property value. Mobile device management authority.
     * @param value Value to set for the mobileDeviceManagementAuthority property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMobileDeviceManagementAuthority(@javax.annotation.Nullable final MdmAuthority value) {
        this._mobileDeviceManagementAuthority = value;
    }
    /**
     * Sets the onPremisesLastSyncDateTime property value. The time and date at which the tenant was last synced with the on-premises directory. The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the onPremisesLastSyncDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesLastSyncDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._onPremisesLastSyncDateTime = value;
    }
    /**
     * Sets the onPremisesSyncEnabled property value. true if this object is synced from an on-premises directory; false if this object was originally synced from an on-premises directory but is no longer synced; Nullable. null if this object has never been synced from an on-premises directory (default).
     * @param value Value to set for the onPremisesSyncEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesSyncEnabled(@javax.annotation.Nullable final Boolean value) {
        this._onPremisesSyncEnabled = value;
    }
    /**
     * Sets the postalCode property value. Postal code of the address for the organization.
     * @param value Value to set for the postalCode property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPostalCode(@javax.annotation.Nullable final String value) {
        this._postalCode = value;
    }
    /**
     * Sets the preferredLanguage property value. The preferred language for the organization. Should follow ISO 639-1 Code; for example en.
     * @param value Value to set for the preferredLanguage property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPreferredLanguage(@javax.annotation.Nullable final String value) {
        this._preferredLanguage = value;
    }
    /**
     * Sets the privacyProfile property value. The privacy profile of an organization.
     * @param value Value to set for the privacyProfile property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPrivacyProfile(@javax.annotation.Nullable final PrivacyProfile value) {
        this._privacyProfile = value;
    }
    /**
     * Sets the provisionedPlans property value. Not nullable.
     * @param value Value to set for the provisionedPlans property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvisionedPlans(@javax.annotation.Nullable final java.util.List<ProvisionedPlan> value) {
        this._provisionedPlans = value;
    }
    /**
     * Sets the securityComplianceNotificationMails property value. The securityComplianceNotificationMails property
     * @param value Value to set for the securityComplianceNotificationMails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityComplianceNotificationMails(@javax.annotation.Nullable final java.util.List<String> value) {
        this._securityComplianceNotificationMails = value;
    }
    /**
     * Sets the securityComplianceNotificationPhones property value. The securityComplianceNotificationPhones property
     * @param value Value to set for the securityComplianceNotificationPhones property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSecurityComplianceNotificationPhones(@javax.annotation.Nullable final java.util.List<String> value) {
        this._securityComplianceNotificationPhones = value;
    }
    /**
     * Sets the settings property value. Retrieve the properties and relationships of organizationSettings object. Nullable.
     * @param value Value to set for the settings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSettings(@javax.annotation.Nullable final OrganizationSettings value) {
        this._settings = value;
    }
    /**
     * Sets the state property value. State name of the address for the organization.
     * @param value Value to set for the state property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setState(@javax.annotation.Nullable final String value) {
        this._state = value;
    }
    /**
     * Sets the street property value. Street name of the address for organization.
     * @param value Value to set for the street property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStreet(@javax.annotation.Nullable final String value) {
        this._street = value;
    }
    /**
     * Sets the technicalNotificationMails property value. Not nullable.
     * @param value Value to set for the technicalNotificationMails property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTechnicalNotificationMails(@javax.annotation.Nullable final java.util.List<String> value) {
        this._technicalNotificationMails = value;
    }
    /**
     * Sets the verifiedDomains property value. The collection of domains associated with this tenant. Not nullable.
     * @param value Value to set for the verifiedDomains property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVerifiedDomains(@javax.annotation.Nullable final java.util.List<VerifiedDomain> value) {
        this._verifiedDomains = value;
    }
}

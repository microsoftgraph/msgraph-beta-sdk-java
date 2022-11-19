package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcProvisioningPolicy extends Entity implements Parsable {
    /** The URL of the alternate resource that links to this provisioning policy. Read-only. */
    private String _alternateResourceUrl;
    /** A defined collection of provisioning policy assignments. Represents the set of Microsoft 365 groups and security groups in Azure AD that have provisioning policy assigned. Returned only on $expand. See an example of getting the assignments relationship. */
    private java.util.List<CloudPcProvisioningPolicyAssignment> _assignments;
    /** The display name of the Cloud PC group that the Cloud PCs reside in. Read-only. */
    private String _cloudPcGroupDisplayName;
    /** The provisioning policy description. */
    private String _description;
    /** The display name for the provisioning policy. */
    private String _displayName;
    /** Specifies how Cloud PCs will join Azure Active Directory. */
    private CloudPcDomainJoinConfiguration _domainJoinConfiguration;
    /** The number of hours to wait before reprovisioning/deprovisioning happens. Read-only. */
    private Integer _gracePeriodInHours;
    /** The display name for the OS image youre provisioning. */
    private String _imageDisplayName;
    /** The ID of the OS image you want to provision on Cloud PCs. The format for a gallery type image is: {publisher_offer_sku}. Supported values for each of the parameters are as follows:publisher: Microsoftwindowsdesktop. offer: windows-ent-cpc. sku: 21h1-ent-cpc-m365, 21h1-ent-cpc-os, 20h2-ent-cpc-m365, 20h2-ent-cpc-os, 20h1-ent-cpc-m365, 20h1-ent-cpc-os, 19h2-ent-cpc-m365 and 19h2-ent-cpc-os. */
    private String _imageId;
    /** The imageType property */
    private CloudPcProvisioningPolicyImageType _imageType;
    /** Indicates whether the local admin option is enabled. If the local admin option is enabled, the end user can be an admin of the Cloud PC device. Read-only. */
    private Boolean _localAdminEnabled;
    /** The managedBy property */
    private CloudPcManagementService _managedBy;
    /** The specific settings for the Microsoft Managed Desktop, which enables customers to get a managed device experience for the Cloud PC. Before you can enable Microsoft Managed Desktop, an admin must configure it. */
    private MicrosoftManagedDesktop _microsoftManagedDesktop;
    /** The ID of the cloudPcOnPremisesConnection. To ensure that Cloud PCs have network connectivity and that they domain join, choose a connection with a virtual network thats validated by the Cloud PC service. */
    private String _onPremisesConnectionId;
    /** The provisioningType property */
    private CloudPcProvisioningType _provisioningType;
    /** Specific Windows settings to configure while creating Cloud PCs for this provisioning policy. */
    private CloudPcWindowsSettings _windowsSettings;
    /**
     * Instantiates a new CloudPcProvisioningPolicy and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcProvisioningPolicy() {
        super();
        this.setOdataType("#microsoft.graph.cloudPcProvisioningPolicy");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcProvisioningPolicy
     */
    @javax.annotation.Nonnull
    public static CloudPcProvisioningPolicy createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcProvisioningPolicy();
    }
    /**
     * Gets the alternateResourceUrl property value. The URL of the alternate resource that links to this provisioning policy. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAlternateResourceUrl() {
        return this._alternateResourceUrl;
    }
    /**
     * Gets the assignments property value. A defined collection of provisioning policy assignments. Represents the set of Microsoft 365 groups and security groups in Azure AD that have provisioning policy assigned. Returned only on $expand. See an example of getting the assignments relationship.
     * @return a cloudPcProvisioningPolicyAssignment
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcProvisioningPolicyAssignment> getAssignments() {
        return this._assignments;
    }
    /**
     * Gets the cloudPcGroupDisplayName property value. The display name of the Cloud PC group that the Cloud PCs reside in. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getCloudPcGroupDisplayName() {
        return this._cloudPcGroupDisplayName;
    }
    /**
     * Gets the description property value. The provisioning policy description.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return this._description;
    }
    /**
     * Gets the displayName property value. The display name for the provisioning policy.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * Gets the domainJoinConfiguration property value. Specifies how Cloud PCs will join Azure Active Directory.
     * @return a cloudPcDomainJoinConfiguration
     */
    @javax.annotation.Nullable
    public CloudPcDomainJoinConfiguration getDomainJoinConfiguration() {
        return this._domainJoinConfiguration;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudPcProvisioningPolicy currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("alternateResourceUrl", (n) -> { currentObject.setAlternateResourceUrl(n.getStringValue()); });
        deserializerMap.put("assignments", (n) -> { currentObject.setAssignments(n.getCollectionOfObjectValues(CloudPcProvisioningPolicyAssignment::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudPcGroupDisplayName", (n) -> { currentObject.setCloudPcGroupDisplayName(n.getStringValue()); });
        deserializerMap.put("description", (n) -> { currentObject.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { currentObject.setDisplayName(n.getStringValue()); });
        deserializerMap.put("domainJoinConfiguration", (n) -> { currentObject.setDomainJoinConfiguration(n.getObjectValue(CloudPcDomainJoinConfiguration::createFromDiscriminatorValue)); });
        deserializerMap.put("gracePeriodInHours", (n) -> { currentObject.setGracePeriodInHours(n.getIntegerValue()); });
        deserializerMap.put("imageDisplayName", (n) -> { currentObject.setImageDisplayName(n.getStringValue()); });
        deserializerMap.put("imageId", (n) -> { currentObject.setImageId(n.getStringValue()); });
        deserializerMap.put("imageType", (n) -> { currentObject.setImageType(n.getEnumValue(CloudPcProvisioningPolicyImageType.class)); });
        deserializerMap.put("localAdminEnabled", (n) -> { currentObject.setLocalAdminEnabled(n.getBooleanValue()); });
        deserializerMap.put("managedBy", (n) -> { currentObject.setManagedBy(n.getEnumValue(CloudPcManagementService.class)); });
        deserializerMap.put("microsoftManagedDesktop", (n) -> { currentObject.setMicrosoftManagedDesktop(n.getObjectValue(MicrosoftManagedDesktop::createFromDiscriminatorValue)); });
        deserializerMap.put("onPremisesConnectionId", (n) -> { currentObject.setOnPremisesConnectionId(n.getStringValue()); });
        deserializerMap.put("provisioningType", (n) -> { currentObject.setProvisioningType(n.getEnumValue(CloudPcProvisioningType.class)); });
        deserializerMap.put("windowsSettings", (n) -> { currentObject.setWindowsSettings(n.getObjectValue(CloudPcWindowsSettings::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the gracePeriodInHours property value. The number of hours to wait before reprovisioning/deprovisioning happens. Read-only.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getGracePeriodInHours() {
        return this._gracePeriodInHours;
    }
    /**
     * Gets the imageDisplayName property value. The display name for the OS image youre provisioning.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getImageDisplayName() {
        return this._imageDisplayName;
    }
    /**
     * Gets the imageId property value. The ID of the OS image you want to provision on Cloud PCs. The format for a gallery type image is: {publisher_offer_sku}. Supported values for each of the parameters are as follows:publisher: Microsoftwindowsdesktop. offer: windows-ent-cpc. sku: 21h1-ent-cpc-m365, 21h1-ent-cpc-os, 20h2-ent-cpc-m365, 20h2-ent-cpc-os, 20h1-ent-cpc-m365, 20h1-ent-cpc-os, 19h2-ent-cpc-m365 and 19h2-ent-cpc-os.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getImageId() {
        return this._imageId;
    }
    /**
     * Gets the imageType property value. The imageType property
     * @return a cloudPcProvisioningPolicyImageType
     */
    @javax.annotation.Nullable
    public CloudPcProvisioningPolicyImageType getImageType() {
        return this._imageType;
    }
    /**
     * Gets the localAdminEnabled property value. Indicates whether the local admin option is enabled. If the local admin option is enabled, the end user can be an admin of the Cloud PC device. Read-only.
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getLocalAdminEnabled() {
        return this._localAdminEnabled;
    }
    /**
     * Gets the managedBy property value. The managedBy property
     * @return a cloudPcManagementService
     */
    @javax.annotation.Nullable
    public CloudPcManagementService getManagedBy() {
        return this._managedBy;
    }
    /**
     * Gets the microsoftManagedDesktop property value. The specific settings for the Microsoft Managed Desktop, which enables customers to get a managed device experience for the Cloud PC. Before you can enable Microsoft Managed Desktop, an admin must configure it.
     * @return a microsoftManagedDesktop
     */
    @javax.annotation.Nullable
    public MicrosoftManagedDesktop getMicrosoftManagedDesktop() {
        return this._microsoftManagedDesktop;
    }
    /**
     * Gets the onPremisesConnectionId property value. The ID of the cloudPcOnPremisesConnection. To ensure that Cloud PCs have network connectivity and that they domain join, choose a connection with a virtual network thats validated by the Cloud PC service.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOnPremisesConnectionId() {
        return this._onPremisesConnectionId;
    }
    /**
     * Gets the provisioningType property value. The provisioningType property
     * @return a cloudPcProvisioningType
     */
    @javax.annotation.Nullable
    public CloudPcProvisioningType getProvisioningType() {
        return this._provisioningType;
    }
    /**
     * Gets the windowsSettings property value. Specific Windows settings to configure while creating Cloud PCs for this provisioning policy.
     * @return a cloudPcWindowsSettings
     */
    @javax.annotation.Nullable
    public CloudPcWindowsSettings getWindowsSettings() {
        return this._windowsSettings;
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
        writer.writeStringValue("alternateResourceUrl", this.getAlternateResourceUrl());
        writer.writeCollectionOfObjectValues("assignments", this.getAssignments());
        writer.writeStringValue("cloudPcGroupDisplayName", this.getCloudPcGroupDisplayName());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeObjectValue("domainJoinConfiguration", this.getDomainJoinConfiguration());
        writer.writeIntegerValue("gracePeriodInHours", this.getGracePeriodInHours());
        writer.writeStringValue("imageDisplayName", this.getImageDisplayName());
        writer.writeStringValue("imageId", this.getImageId());
        writer.writeEnumValue("imageType", this.getImageType());
        writer.writeBooleanValue("localAdminEnabled", this.getLocalAdminEnabled());
        writer.writeEnumValue("managedBy", this.getManagedBy());
        writer.writeObjectValue("microsoftManagedDesktop", this.getMicrosoftManagedDesktop());
        writer.writeStringValue("onPremisesConnectionId", this.getOnPremisesConnectionId());
        writer.writeEnumValue("provisioningType", this.getProvisioningType());
        writer.writeObjectValue("windowsSettings", this.getWindowsSettings());
    }
    /**
     * Sets the alternateResourceUrl property value. The URL of the alternate resource that links to this provisioning policy. Read-only.
     * @param value Value to set for the alternateResourceUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAlternateResourceUrl(@javax.annotation.Nullable final String value) {
        this._alternateResourceUrl = value;
    }
    /**
     * Sets the assignments property value. A defined collection of provisioning policy assignments. Represents the set of Microsoft 365 groups and security groups in Azure AD that have provisioning policy assigned. Returned only on $expand. See an example of getting the assignments relationship.
     * @param value Value to set for the assignments property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAssignments(@javax.annotation.Nullable final java.util.List<CloudPcProvisioningPolicyAssignment> value) {
        this._assignments = value;
    }
    /**
     * Sets the cloudPcGroupDisplayName property value. The display name of the Cloud PC group that the Cloud PCs reside in. Read-only.
     * @param value Value to set for the cloudPcGroupDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudPcGroupDisplayName(@javax.annotation.Nullable final String value) {
        this._cloudPcGroupDisplayName = value;
    }
    /**
     * Sets the description property value. The provisioning policy description.
     * @param value Value to set for the description property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDescription(@javax.annotation.Nullable final String value) {
        this._description = value;
    }
    /**
     * Sets the displayName property value. The display name for the provisioning policy.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the domainJoinConfiguration property value. Specifies how Cloud PCs will join Azure Active Directory.
     * @param value Value to set for the domainJoinConfiguration property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDomainJoinConfiguration(@javax.annotation.Nullable final CloudPcDomainJoinConfiguration value) {
        this._domainJoinConfiguration = value;
    }
    /**
     * Sets the gracePeriodInHours property value. The number of hours to wait before reprovisioning/deprovisioning happens. Read-only.
     * @param value Value to set for the gracePeriodInHours property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGracePeriodInHours(@javax.annotation.Nullable final Integer value) {
        this._gracePeriodInHours = value;
    }
    /**
     * Sets the imageDisplayName property value. The display name for the OS image youre provisioning.
     * @param value Value to set for the imageDisplayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImageDisplayName(@javax.annotation.Nullable final String value) {
        this._imageDisplayName = value;
    }
    /**
     * Sets the imageId property value. The ID of the OS image you want to provision on Cloud PCs. The format for a gallery type image is: {publisher_offer_sku}. Supported values for each of the parameters are as follows:publisher: Microsoftwindowsdesktop. offer: windows-ent-cpc. sku: 21h1-ent-cpc-m365, 21h1-ent-cpc-os, 20h2-ent-cpc-m365, 20h2-ent-cpc-os, 20h1-ent-cpc-m365, 20h1-ent-cpc-os, 19h2-ent-cpc-m365 and 19h2-ent-cpc-os.
     * @param value Value to set for the imageId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImageId(@javax.annotation.Nullable final String value) {
        this._imageId = value;
    }
    /**
     * Sets the imageType property value. The imageType property
     * @param value Value to set for the imageType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setImageType(@javax.annotation.Nullable final CloudPcProvisioningPolicyImageType value) {
        this._imageType = value;
    }
    /**
     * Sets the localAdminEnabled property value. Indicates whether the local admin option is enabled. If the local admin option is enabled, the end user can be an admin of the Cloud PC device. Read-only.
     * @param value Value to set for the localAdminEnabled property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLocalAdminEnabled(@javax.annotation.Nullable final Boolean value) {
        this._localAdminEnabled = value;
    }
    /**
     * Sets the managedBy property value. The managedBy property
     * @param value Value to set for the managedBy property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManagedBy(@javax.annotation.Nullable final CloudPcManagementService value) {
        this._managedBy = value;
    }
    /**
     * Sets the microsoftManagedDesktop property value. The specific settings for the Microsoft Managed Desktop, which enables customers to get a managed device experience for the Cloud PC. Before you can enable Microsoft Managed Desktop, an admin must configure it.
     * @param value Value to set for the microsoftManagedDesktop property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setMicrosoftManagedDesktop(@javax.annotation.Nullable final MicrosoftManagedDesktop value) {
        this._microsoftManagedDesktop = value;
    }
    /**
     * Sets the onPremisesConnectionId property value. The ID of the cloudPcOnPremisesConnection. To ensure that Cloud PCs have network connectivity and that they domain join, choose a connection with a virtual network thats validated by the Cloud PC service.
     * @param value Value to set for the onPremisesConnectionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesConnectionId(@javax.annotation.Nullable final String value) {
        this._onPremisesConnectionId = value;
    }
    /**
     * Sets the provisioningType property value. The provisioningType property
     * @param value Value to set for the provisioningType property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvisioningType(@javax.annotation.Nullable final CloudPcProvisioningType value) {
        this._provisioningType = value;
    }
    /**
     * Sets the windowsSettings property value. Specific Windows settings to configure while creating Cloud PCs for this provisioning policy.
     * @param value Value to set for the windowsSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setWindowsSettings(@javax.annotation.Nullable final CloudPcWindowsSettings value) {
        this._windowsSettings = value;
    }
}

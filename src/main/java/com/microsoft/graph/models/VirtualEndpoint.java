package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class VirtualEndpoint extends Entity implements Parsable {
    /** Cloud PC audit event. */
    private java.util.List<CloudPcAuditEvent> auditEvents;
    /** The bulkActions property */
    private java.util.List<CloudPcBulkAction> bulkActions;
    /** Cloud managed virtual desktops. */
    private java.util.List<CloudPC> cloudPCs;
    /** Cloud PC organization mapping between public and US Government Community Cloud (GCC) organizations. */
    private CloudPcCrossCloudGovernmentOrganizationMapping crossCloudGovernmentOrganizationMapping;
    /** The image resource on Cloud PC. */
    private java.util.List<CloudPcDeviceImage> deviceImages;
    /** The external partner settings on a Cloud PC. */
    private java.util.List<CloudPcExternalPartnerSetting> externalPartnerSettings;
    /** The gallery image resource on Cloud PC. */
    private java.util.List<CloudPcGalleryImage> galleryImages;
    /** A defined collection of Azure resource information that can be used to establish on-premises network connectivity for Cloud PCs. */
    private java.util.List<CloudPcOnPremisesConnection> onPremisesConnections;
    /** The Cloud PC organization settings for a tenant. */
    private CloudPcOrganizationSettings organizationSettings;
    /** Cloud PC provisioning policy. */
    private java.util.List<CloudPcProvisioningPolicy> provisioningPolicies;
    /** Cloud PC related reports. */
    private CloudPcReports reports;
    /** Cloud PC service plans. */
    private java.util.List<CloudPcServicePlan> servicePlans;
    /** Cloud PC shared-use service plans. */
    private java.util.List<CloudPcSharedUseServicePlan> sharedUseServicePlans;
    /** Cloud PC snapshots. */
    private java.util.List<CloudPcSnapshot> snapshots;
    /** Cloud PC supported regions. */
    private java.util.List<CloudPcSupportedRegion> supportedRegions;
    /** Cloud PC user settings. */
    private java.util.List<CloudPcUserSetting> userSettings;
    /**
     * Instantiates a new virtualEndpoint and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public VirtualEndpoint() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a virtualEndpoint
     */
    @javax.annotation.Nonnull
    public static VirtualEndpoint createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEndpoint();
    }
    /**
     * Gets the auditEvents property value. Cloud PC audit event.
     * @return a cloudPcAuditEvent
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcAuditEvent> getAuditEvents() {
        return this.auditEvents;
    }
    /**
     * Gets the bulkActions property value. The bulkActions property
     * @return a cloudPcBulkAction
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcBulkAction> getBulkActions() {
        return this.bulkActions;
    }
    /**
     * Gets the cloudPCs property value. Cloud managed virtual desktops.
     * @return a cloudPC
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPC> getCloudPCs() {
        return this.cloudPCs;
    }
    /**
     * Gets the crossCloudGovernmentOrganizationMapping property value. Cloud PC organization mapping between public and US Government Community Cloud (GCC) organizations.
     * @return a cloudPcCrossCloudGovernmentOrganizationMapping
     */
    @javax.annotation.Nullable
    public CloudPcCrossCloudGovernmentOrganizationMapping getCrossCloudGovernmentOrganizationMapping() {
        return this.crossCloudGovernmentOrganizationMapping;
    }
    /**
     * Gets the deviceImages property value. The image resource on Cloud PC.
     * @return a cloudPcDeviceImage
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcDeviceImage> getDeviceImages() {
        return this.deviceImages;
    }
    /**
     * Gets the externalPartnerSettings property value. The external partner settings on a Cloud PC.
     * @return a cloudPcExternalPartnerSetting
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcExternalPartnerSetting> getExternalPartnerSettings() {
        return this.externalPartnerSettings;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("auditEvents", (n) -> { this.setAuditEvents(n.getCollectionOfObjectValues(CloudPcAuditEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("bulkActions", (n) -> { this.setBulkActions(n.getCollectionOfObjectValues(CloudPcBulkAction::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudPCs", (n) -> { this.setCloudPCs(n.getCollectionOfObjectValues(CloudPC::createFromDiscriminatorValue)); });
        deserializerMap.put("crossCloudGovernmentOrganizationMapping", (n) -> { this.setCrossCloudGovernmentOrganizationMapping(n.getObjectValue(CloudPcCrossCloudGovernmentOrganizationMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceImages", (n) -> { this.setDeviceImages(n.getCollectionOfObjectValues(CloudPcDeviceImage::createFromDiscriminatorValue)); });
        deserializerMap.put("externalPartnerSettings", (n) -> { this.setExternalPartnerSettings(n.getCollectionOfObjectValues(CloudPcExternalPartnerSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("galleryImages", (n) -> { this.setGalleryImages(n.getCollectionOfObjectValues(CloudPcGalleryImage::createFromDiscriminatorValue)); });
        deserializerMap.put("onPremisesConnections", (n) -> { this.setOnPremisesConnections(n.getCollectionOfObjectValues(CloudPcOnPremisesConnection::createFromDiscriminatorValue)); });
        deserializerMap.put("organizationSettings", (n) -> { this.setOrganizationSettings(n.getObjectValue(CloudPcOrganizationSettings::createFromDiscriminatorValue)); });
        deserializerMap.put("provisioningPolicies", (n) -> { this.setProvisioningPolicies(n.getCollectionOfObjectValues(CloudPcProvisioningPolicy::createFromDiscriminatorValue)); });
        deserializerMap.put("reports", (n) -> { this.setReports(n.getObjectValue(CloudPcReports::createFromDiscriminatorValue)); });
        deserializerMap.put("servicePlans", (n) -> { this.setServicePlans(n.getCollectionOfObjectValues(CloudPcServicePlan::createFromDiscriminatorValue)); });
        deserializerMap.put("sharedUseServicePlans", (n) -> { this.setSharedUseServicePlans(n.getCollectionOfObjectValues(CloudPcSharedUseServicePlan::createFromDiscriminatorValue)); });
        deserializerMap.put("snapshots", (n) -> { this.setSnapshots(n.getCollectionOfObjectValues(CloudPcSnapshot::createFromDiscriminatorValue)); });
        deserializerMap.put("supportedRegions", (n) -> { this.setSupportedRegions(n.getCollectionOfObjectValues(CloudPcSupportedRegion::createFromDiscriminatorValue)); });
        deserializerMap.put("userSettings", (n) -> { this.setUserSettings(n.getCollectionOfObjectValues(CloudPcUserSetting::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the galleryImages property value. The gallery image resource on Cloud PC.
     * @return a cloudPcGalleryImage
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcGalleryImage> getGalleryImages() {
        return this.galleryImages;
    }
    /**
     * Gets the onPremisesConnections property value. A defined collection of Azure resource information that can be used to establish on-premises network connectivity for Cloud PCs.
     * @return a cloudPcOnPremisesConnection
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcOnPremisesConnection> getOnPremisesConnections() {
        return this.onPremisesConnections;
    }
    /**
     * Gets the organizationSettings property value. The Cloud PC organization settings for a tenant.
     * @return a cloudPcOrganizationSettings
     */
    @javax.annotation.Nullable
    public CloudPcOrganizationSettings getOrganizationSettings() {
        return this.organizationSettings;
    }
    /**
     * Gets the provisioningPolicies property value. Cloud PC provisioning policy.
     * @return a cloudPcProvisioningPolicy
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcProvisioningPolicy> getProvisioningPolicies() {
        return this.provisioningPolicies;
    }
    /**
     * Gets the reports property value. Cloud PC related reports.
     * @return a cloudPcReports
     */
    @javax.annotation.Nullable
    public CloudPcReports getReports() {
        return this.reports;
    }
    /**
     * Gets the servicePlans property value. Cloud PC service plans.
     * @return a cloudPcServicePlan
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcServicePlan> getServicePlans() {
        return this.servicePlans;
    }
    /**
     * Gets the sharedUseServicePlans property value. Cloud PC shared-use service plans.
     * @return a cloudPcSharedUseServicePlan
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcSharedUseServicePlan> getSharedUseServicePlans() {
        return this.sharedUseServicePlans;
    }
    /**
     * Gets the snapshots property value. Cloud PC snapshots.
     * @return a cloudPcSnapshot
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcSnapshot> getSnapshots() {
        return this.snapshots;
    }
    /**
     * Gets the supportedRegions property value. Cloud PC supported regions.
     * @return a cloudPcSupportedRegion
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcSupportedRegion> getSupportedRegions() {
        return this.supportedRegions;
    }
    /**
     * Gets the userSettings property value. Cloud PC user settings.
     * @return a cloudPcUserSetting
     */
    @javax.annotation.Nullable
    public java.util.List<CloudPcUserSetting> getUserSettings() {
        return this.userSettings;
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
        writer.writeCollectionOfObjectValues("auditEvents", this.getAuditEvents());
        writer.writeCollectionOfObjectValues("bulkActions", this.getBulkActions());
        writer.writeCollectionOfObjectValues("cloudPCs", this.getCloudPCs());
        writer.writeObjectValue("crossCloudGovernmentOrganizationMapping", this.getCrossCloudGovernmentOrganizationMapping());
        writer.writeCollectionOfObjectValues("deviceImages", this.getDeviceImages());
        writer.writeCollectionOfObjectValues("externalPartnerSettings", this.getExternalPartnerSettings());
        writer.writeCollectionOfObjectValues("galleryImages", this.getGalleryImages());
        writer.writeCollectionOfObjectValues("onPremisesConnections", this.getOnPremisesConnections());
        writer.writeObjectValue("organizationSettings", this.getOrganizationSettings());
        writer.writeCollectionOfObjectValues("provisioningPolicies", this.getProvisioningPolicies());
        writer.writeObjectValue("reports", this.getReports());
        writer.writeCollectionOfObjectValues("servicePlans", this.getServicePlans());
        writer.writeCollectionOfObjectValues("sharedUseServicePlans", this.getSharedUseServicePlans());
        writer.writeCollectionOfObjectValues("snapshots", this.getSnapshots());
        writer.writeCollectionOfObjectValues("supportedRegions", this.getSupportedRegions());
        writer.writeCollectionOfObjectValues("userSettings", this.getUserSettings());
    }
    /**
     * Sets the auditEvents property value. Cloud PC audit event.
     * @param value Value to set for the auditEvents property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAuditEvents(@javax.annotation.Nullable final java.util.List<CloudPcAuditEvent> value) {
        this.auditEvents = value;
    }
    /**
     * Sets the bulkActions property value. The bulkActions property
     * @param value Value to set for the bulkActions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setBulkActions(@javax.annotation.Nullable final java.util.List<CloudPcBulkAction> value) {
        this.bulkActions = value;
    }
    /**
     * Sets the cloudPCs property value. Cloud managed virtual desktops.
     * @param value Value to set for the cloudPCs property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCloudPCs(@javax.annotation.Nullable final java.util.List<CloudPC> value) {
        this.cloudPCs = value;
    }
    /**
     * Sets the crossCloudGovernmentOrganizationMapping property value. Cloud PC organization mapping between public and US Government Community Cloud (GCC) organizations.
     * @param value Value to set for the crossCloudGovernmentOrganizationMapping property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCrossCloudGovernmentOrganizationMapping(@javax.annotation.Nullable final CloudPcCrossCloudGovernmentOrganizationMapping value) {
        this.crossCloudGovernmentOrganizationMapping = value;
    }
    /**
     * Sets the deviceImages property value. The image resource on Cloud PC.
     * @param value Value to set for the deviceImages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeviceImages(@javax.annotation.Nullable final java.util.List<CloudPcDeviceImage> value) {
        this.deviceImages = value;
    }
    /**
     * Sets the externalPartnerSettings property value. The external partner settings on a Cloud PC.
     * @param value Value to set for the externalPartnerSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setExternalPartnerSettings(@javax.annotation.Nullable final java.util.List<CloudPcExternalPartnerSetting> value) {
        this.externalPartnerSettings = value;
    }
    /**
     * Sets the galleryImages property value. The gallery image resource on Cloud PC.
     * @param value Value to set for the galleryImages property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setGalleryImages(@javax.annotation.Nullable final java.util.List<CloudPcGalleryImage> value) {
        this.galleryImages = value;
    }
    /**
     * Sets the onPremisesConnections property value. A defined collection of Azure resource information that can be used to establish on-premises network connectivity for Cloud PCs.
     * @param value Value to set for the onPremisesConnections property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOnPremisesConnections(@javax.annotation.Nullable final java.util.List<CloudPcOnPremisesConnection> value) {
        this.onPremisesConnections = value;
    }
    /**
     * Sets the organizationSettings property value. The Cloud PC organization settings for a tenant.
     * @param value Value to set for the organizationSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOrganizationSettings(@javax.annotation.Nullable final CloudPcOrganizationSettings value) {
        this.organizationSettings = value;
    }
    /**
     * Sets the provisioningPolicies property value. Cloud PC provisioning policy.
     * @param value Value to set for the provisioningPolicies property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setProvisioningPolicies(@javax.annotation.Nullable final java.util.List<CloudPcProvisioningPolicy> value) {
        this.provisioningPolicies = value;
    }
    /**
     * Sets the reports property value. Cloud PC related reports.
     * @param value Value to set for the reports property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setReports(@javax.annotation.Nullable final CloudPcReports value) {
        this.reports = value;
    }
    /**
     * Sets the servicePlans property value. Cloud PC service plans.
     * @param value Value to set for the servicePlans property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServicePlans(@javax.annotation.Nullable final java.util.List<CloudPcServicePlan> value) {
        this.servicePlans = value;
    }
    /**
     * Sets the sharedUseServicePlans property value. Cloud PC shared-use service plans.
     * @param value Value to set for the sharedUseServicePlans property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSharedUseServicePlans(@javax.annotation.Nullable final java.util.List<CloudPcSharedUseServicePlan> value) {
        this.sharedUseServicePlans = value;
    }
    /**
     * Sets the snapshots property value. Cloud PC snapshots.
     * @param value Value to set for the snapshots property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSnapshots(@javax.annotation.Nullable final java.util.List<CloudPcSnapshot> value) {
        this.snapshots = value;
    }
    /**
     * Sets the supportedRegions property value. Cloud PC supported regions.
     * @param value Value to set for the supportedRegions property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportedRegions(@javax.annotation.Nullable final java.util.List<CloudPcSupportedRegion> value) {
        this.supportedRegions = value;
    }
    /**
     * Sets the userSettings property value. Cloud PC user settings.
     * @param value Value to set for the userSettings property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setUserSettings(@javax.annotation.Nullable final java.util.List<CloudPcUserSetting> value) {
        this.userSettings = value;
    }
}

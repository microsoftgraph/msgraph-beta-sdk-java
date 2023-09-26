package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEndpoint extends Entity implements Parsable {
    /**
     * Cloud PC audit event.
     */
    private java.util.List<CloudPcAuditEvent> auditEvents;
    /**
     * The bulkActions property
     */
    private java.util.List<CloudPcBulkAction> bulkActions;
    /**
     * Cloud managed virtual desktops.
     */
    private java.util.List<CloudPC> cloudPCs;
    /**
     * Cloud PC organization mapping between public and US Government Community Cloud (GCC) organizations.
     */
    private CloudPcCrossCloudGovernmentOrganizationMapping crossCloudGovernmentOrganizationMapping;
    /**
     * The image resource on Cloud PC.
     */
    private java.util.List<CloudPcDeviceImage> deviceImages;
    /**
     * The external partner settings on a Cloud PC.
     */
    private java.util.List<CloudPcExternalPartnerSetting> externalPartnerSettings;
    /**
     * The frontLineServicePlans property
     */
    private java.util.List<CloudPcFrontLineServicePlan> frontLineServicePlans;
    /**
     * The gallery image resource on Cloud PC.
     */
    private java.util.List<CloudPcGalleryImage> galleryImages;
    /**
     * A defined collection of Azure resource information that can be used to establish on-premises network connectivity for Cloud PCs.
     */
    private java.util.List<CloudPcOnPremisesConnection> onPremisesConnections;
    /**
     * The Cloud PC organization settings for a tenant.
     */
    private CloudPcOrganizationSettings organizationSettings;
    /**
     * Cloud PC provisioning policy.
     */
    private java.util.List<CloudPcProvisioningPolicy> provisioningPolicies;
    /**
     * Cloud PC related reports.
     */
    private CloudPcReports reports;
    /**
     * Cloud PC service plans.
     */
    private java.util.List<CloudPcServicePlan> servicePlans;
    /**
     * Cloud PC shared-use service plans.
     */
    private java.util.List<CloudPcSharedUseServicePlan> sharedUseServicePlans;
    /**
     * Cloud PC snapshots.
     */
    private java.util.List<CloudPcSnapshot> snapshots;
    /**
     * Cloud PC supported regions.
     */
    private java.util.List<CloudPcSupportedRegion> supportedRegions;
    /**
     * Cloud PC user settings.
     */
    private java.util.List<CloudPcUserSetting> userSettings;
    /**
     * Instantiates a new VirtualEndpoint and sets the default values.
     */
    public VirtualEndpoint() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a VirtualEndpoint
     */
    @jakarta.annotation.Nonnull
    public static VirtualEndpoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEndpoint();
    }
    /**
     * Gets the auditEvents property value. Cloud PC audit event.
     * @return a java.util.List<CloudPcAuditEvent>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcAuditEvent> getAuditEvents() {
        return this.auditEvents;
    }
    /**
     * Gets the bulkActions property value. The bulkActions property
     * @return a java.util.List<CloudPcBulkAction>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcBulkAction> getBulkActions() {
        return this.bulkActions;
    }
    /**
     * Gets the cloudPCs property value. Cloud managed virtual desktops.
     * @return a java.util.List<CloudPC>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPC> getCloudPCs() {
        return this.cloudPCs;
    }
    /**
     * Gets the crossCloudGovernmentOrganizationMapping property value. Cloud PC organization mapping between public and US Government Community Cloud (GCC) organizations.
     * @return a CloudPcCrossCloudGovernmentOrganizationMapping
     */
    @jakarta.annotation.Nullable
    public CloudPcCrossCloudGovernmentOrganizationMapping getCrossCloudGovernmentOrganizationMapping() {
        return this.crossCloudGovernmentOrganizationMapping;
    }
    /**
     * Gets the deviceImages property value. The image resource on Cloud PC.
     * @return a java.util.List<CloudPcDeviceImage>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcDeviceImage> getDeviceImages() {
        return this.deviceImages;
    }
    /**
     * Gets the externalPartnerSettings property value. The external partner settings on a Cloud PC.
     * @return a java.util.List<CloudPcExternalPartnerSetting>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcExternalPartnerSetting> getExternalPartnerSettings() {
        return this.externalPartnerSettings;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("auditEvents", (n) -> { this.setAuditEvents(n.getCollectionOfObjectValues(CloudPcAuditEvent::createFromDiscriminatorValue)); });
        deserializerMap.put("bulkActions", (n) -> { this.setBulkActions(n.getCollectionOfObjectValues(CloudPcBulkAction::createFromDiscriminatorValue)); });
        deserializerMap.put("cloudPCs", (n) -> { this.setCloudPCs(n.getCollectionOfObjectValues(CloudPC::createFromDiscriminatorValue)); });
        deserializerMap.put("crossCloudGovernmentOrganizationMapping", (n) -> { this.setCrossCloudGovernmentOrganizationMapping(n.getObjectValue(CloudPcCrossCloudGovernmentOrganizationMapping::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceImages", (n) -> { this.setDeviceImages(n.getCollectionOfObjectValues(CloudPcDeviceImage::createFromDiscriminatorValue)); });
        deserializerMap.put("externalPartnerSettings", (n) -> { this.setExternalPartnerSettings(n.getCollectionOfObjectValues(CloudPcExternalPartnerSetting::createFromDiscriminatorValue)); });
        deserializerMap.put("frontLineServicePlans", (n) -> { this.setFrontLineServicePlans(n.getCollectionOfObjectValues(CloudPcFrontLineServicePlan::createFromDiscriminatorValue)); });
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
     * Gets the frontLineServicePlans property value. The frontLineServicePlans property
     * @return a java.util.List<CloudPcFrontLineServicePlan>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcFrontLineServicePlan> getFrontLineServicePlans() {
        return this.frontLineServicePlans;
    }
    /**
     * Gets the galleryImages property value. The gallery image resource on Cloud PC.
     * @return a java.util.List<CloudPcGalleryImage>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcGalleryImage> getGalleryImages() {
        return this.galleryImages;
    }
    /**
     * Gets the onPremisesConnections property value. A defined collection of Azure resource information that can be used to establish on-premises network connectivity for Cloud PCs.
     * @return a java.util.List<CloudPcOnPremisesConnection>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcOnPremisesConnection> getOnPremisesConnections() {
        return this.onPremisesConnections;
    }
    /**
     * Gets the organizationSettings property value. The Cloud PC organization settings for a tenant.
     * @return a CloudPcOrganizationSettings
     */
    @jakarta.annotation.Nullable
    public CloudPcOrganizationSettings getOrganizationSettings() {
        return this.organizationSettings;
    }
    /**
     * Gets the provisioningPolicies property value. Cloud PC provisioning policy.
     * @return a java.util.List<CloudPcProvisioningPolicy>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcProvisioningPolicy> getProvisioningPolicies() {
        return this.provisioningPolicies;
    }
    /**
     * Gets the reports property value. Cloud PC related reports.
     * @return a CloudPcReports
     */
    @jakarta.annotation.Nullable
    public CloudPcReports getReports() {
        return this.reports;
    }
    /**
     * Gets the servicePlans property value. Cloud PC service plans.
     * @return a java.util.List<CloudPcServicePlan>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcServicePlan> getServicePlans() {
        return this.servicePlans;
    }
    /**
     * Gets the sharedUseServicePlans property value. Cloud PC shared-use service plans.
     * @return a java.util.List<CloudPcSharedUseServicePlan>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcSharedUseServicePlan> getSharedUseServicePlans() {
        return this.sharedUseServicePlans;
    }
    /**
     * Gets the snapshots property value. Cloud PC snapshots.
     * @return a java.util.List<CloudPcSnapshot>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcSnapshot> getSnapshots() {
        return this.snapshots;
    }
    /**
     * Gets the supportedRegions property value. Cloud PC supported regions.
     * @return a java.util.List<CloudPcSupportedRegion>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcSupportedRegion> getSupportedRegions() {
        return this.supportedRegions;
    }
    /**
     * Gets the userSettings property value. Cloud PC user settings.
     * @return a java.util.List<CloudPcUserSetting>
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcUserSetting> getUserSettings() {
        return this.userSettings;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("auditEvents", this.getAuditEvents());
        writer.writeCollectionOfObjectValues("bulkActions", this.getBulkActions());
        writer.writeCollectionOfObjectValues("cloudPCs", this.getCloudPCs());
        writer.writeObjectValue("crossCloudGovernmentOrganizationMapping", this.getCrossCloudGovernmentOrganizationMapping());
        writer.writeCollectionOfObjectValues("deviceImages", this.getDeviceImages());
        writer.writeCollectionOfObjectValues("externalPartnerSettings", this.getExternalPartnerSettings());
        writer.writeCollectionOfObjectValues("frontLineServicePlans", this.getFrontLineServicePlans());
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
     */
    public void setAuditEvents(@jakarta.annotation.Nullable final java.util.List<CloudPcAuditEvent> value) {
        this.auditEvents = value;
    }
    /**
     * Sets the bulkActions property value. The bulkActions property
     * @param value Value to set for the bulkActions property.
     */
    public void setBulkActions(@jakarta.annotation.Nullable final java.util.List<CloudPcBulkAction> value) {
        this.bulkActions = value;
    }
    /**
     * Sets the cloudPCs property value. Cloud managed virtual desktops.
     * @param value Value to set for the cloudPCs property.
     */
    public void setCloudPCs(@jakarta.annotation.Nullable final java.util.List<CloudPC> value) {
        this.cloudPCs = value;
    }
    /**
     * Sets the crossCloudGovernmentOrganizationMapping property value. Cloud PC organization mapping between public and US Government Community Cloud (GCC) organizations.
     * @param value Value to set for the crossCloudGovernmentOrganizationMapping property.
     */
    public void setCrossCloudGovernmentOrganizationMapping(@jakarta.annotation.Nullable final CloudPcCrossCloudGovernmentOrganizationMapping value) {
        this.crossCloudGovernmentOrganizationMapping = value;
    }
    /**
     * Sets the deviceImages property value. The image resource on Cloud PC.
     * @param value Value to set for the deviceImages property.
     */
    public void setDeviceImages(@jakarta.annotation.Nullable final java.util.List<CloudPcDeviceImage> value) {
        this.deviceImages = value;
    }
    /**
     * Sets the externalPartnerSettings property value. The external partner settings on a Cloud PC.
     * @param value Value to set for the externalPartnerSettings property.
     */
    public void setExternalPartnerSettings(@jakarta.annotation.Nullable final java.util.List<CloudPcExternalPartnerSetting> value) {
        this.externalPartnerSettings = value;
    }
    /**
     * Sets the frontLineServicePlans property value. The frontLineServicePlans property
     * @param value Value to set for the frontLineServicePlans property.
     */
    public void setFrontLineServicePlans(@jakarta.annotation.Nullable final java.util.List<CloudPcFrontLineServicePlan> value) {
        this.frontLineServicePlans = value;
    }
    /**
     * Sets the galleryImages property value. The gallery image resource on Cloud PC.
     * @param value Value to set for the galleryImages property.
     */
    public void setGalleryImages(@jakarta.annotation.Nullable final java.util.List<CloudPcGalleryImage> value) {
        this.galleryImages = value;
    }
    /**
     * Sets the onPremisesConnections property value. A defined collection of Azure resource information that can be used to establish on-premises network connectivity for Cloud PCs.
     * @param value Value to set for the onPremisesConnections property.
     */
    public void setOnPremisesConnections(@jakarta.annotation.Nullable final java.util.List<CloudPcOnPremisesConnection> value) {
        this.onPremisesConnections = value;
    }
    /**
     * Sets the organizationSettings property value. The Cloud PC organization settings for a tenant.
     * @param value Value to set for the organizationSettings property.
     */
    public void setOrganizationSettings(@jakarta.annotation.Nullable final CloudPcOrganizationSettings value) {
        this.organizationSettings = value;
    }
    /**
     * Sets the provisioningPolicies property value. Cloud PC provisioning policy.
     * @param value Value to set for the provisioningPolicies property.
     */
    public void setProvisioningPolicies(@jakarta.annotation.Nullable final java.util.List<CloudPcProvisioningPolicy> value) {
        this.provisioningPolicies = value;
    }
    /**
     * Sets the reports property value. Cloud PC related reports.
     * @param value Value to set for the reports property.
     */
    public void setReports(@jakarta.annotation.Nullable final CloudPcReports value) {
        this.reports = value;
    }
    /**
     * Sets the servicePlans property value. Cloud PC service plans.
     * @param value Value to set for the servicePlans property.
     */
    public void setServicePlans(@jakarta.annotation.Nullable final java.util.List<CloudPcServicePlan> value) {
        this.servicePlans = value;
    }
    /**
     * Sets the sharedUseServicePlans property value. Cloud PC shared-use service plans.
     * @param value Value to set for the sharedUseServicePlans property.
     */
    public void setSharedUseServicePlans(@jakarta.annotation.Nullable final java.util.List<CloudPcSharedUseServicePlan> value) {
        this.sharedUseServicePlans = value;
    }
    /**
     * Sets the snapshots property value. Cloud PC snapshots.
     * @param value Value to set for the snapshots property.
     */
    public void setSnapshots(@jakarta.annotation.Nullable final java.util.List<CloudPcSnapshot> value) {
        this.snapshots = value;
    }
    /**
     * Sets the supportedRegions property value. Cloud PC supported regions.
     * @param value Value to set for the supportedRegions property.
     */
    public void setSupportedRegions(@jakarta.annotation.Nullable final java.util.List<CloudPcSupportedRegion> value) {
        this.supportedRegions = value;
    }
    /**
     * Sets the userSettings property value. Cloud PC user settings.
     * @param value Value to set for the userSettings property.
     */
    public void setUserSettings(@jakarta.annotation.Nullable final java.util.List<CloudPcUserSetting> value) {
        this.userSettings = value;
    }
}

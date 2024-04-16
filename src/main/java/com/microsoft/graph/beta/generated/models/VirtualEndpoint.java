package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class VirtualEndpoint extends Entity implements Parsable {
    /**
     * Instantiates a new {@link VirtualEndpoint} and sets the default values.
     */
    public VirtualEndpoint() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link VirtualEndpoint}
     */
    @jakarta.annotation.Nonnull
    public static VirtualEndpoint createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new VirtualEndpoint();
    }
    /**
     * Gets the auditEvents property value. Cloud PC audit event.
     * @return a {@link java.util.List<CloudPcAuditEvent>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcAuditEvent> getAuditEvents() {
        return this.backingStore.get("auditEvents");
    }
    /**
     * Gets the bulkActions property value. Bulk actions applied to a Cloud PC.
     * @return a {@link java.util.List<CloudPcBulkAction>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcBulkAction> getBulkActions() {
        return this.backingStore.get("bulkActions");
    }
    /**
     * Gets the cloudPCs property value. Cloud managed virtual desktops.
     * @return a {@link java.util.List<CloudPC>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPC> getCloudPCs() {
        return this.backingStore.get("cloudPCs");
    }
    /**
     * Gets the crossCloudGovernmentOrganizationMapping property value. Cloud PC organization mapping between public and US Government Community Cloud (GCC) organizations.
     * @return a {@link CloudPcCrossCloudGovernmentOrganizationMapping}
     */
    @jakarta.annotation.Nullable
    public CloudPcCrossCloudGovernmentOrganizationMapping getCrossCloudGovernmentOrganizationMapping() {
        return this.backingStore.get("crossCloudGovernmentOrganizationMapping");
    }
    /**
     * Gets the deviceImages property value. The image resource on Cloud PC.
     * @return a {@link java.util.List<CloudPcDeviceImage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcDeviceImage> getDeviceImages() {
        return this.backingStore.get("deviceImages");
    }
    /**
     * Gets the externalPartnerSettings property value. The external partner settings on a Cloud PC.
     * @return a {@link java.util.List<CloudPcExternalPartnerSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcExternalPartnerSetting> getExternalPartnerSettings() {
        return this.backingStore.get("externalPartnerSettings");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
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
     * Gets the frontLineServicePlans property value. Front-line service plans for a Cloud PC.
     * @return a {@link java.util.List<CloudPcFrontLineServicePlan>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcFrontLineServicePlan> getFrontLineServicePlans() {
        return this.backingStore.get("frontLineServicePlans");
    }
    /**
     * Gets the galleryImages property value. The gallery image resource on Cloud PC.
     * @return a {@link java.util.List<CloudPcGalleryImage>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcGalleryImage> getGalleryImages() {
        return this.backingStore.get("galleryImages");
    }
    /**
     * Gets the onPremisesConnections property value. A defined collection of Azure resource information that can be used to establish on-premises network connectivity for Cloud PCs.
     * @return a {@link java.util.List<CloudPcOnPremisesConnection>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcOnPremisesConnection> getOnPremisesConnections() {
        return this.backingStore.get("onPremisesConnections");
    }
    /**
     * Gets the organizationSettings property value. The Cloud PC organization settings for a tenant.
     * @return a {@link CloudPcOrganizationSettings}
     */
    @jakarta.annotation.Nullable
    public CloudPcOrganizationSettings getOrganizationSettings() {
        return this.backingStore.get("organizationSettings");
    }
    /**
     * Gets the provisioningPolicies property value. Cloud PC provisioning policy.
     * @return a {@link java.util.List<CloudPcProvisioningPolicy>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcProvisioningPolicy> getProvisioningPolicies() {
        return this.backingStore.get("provisioningPolicies");
    }
    /**
     * Gets the reports property value. Cloud PC related reports.
     * @return a {@link CloudPcReports}
     */
    @jakarta.annotation.Nullable
    public CloudPcReports getReports() {
        return this.backingStore.get("reports");
    }
    /**
     * Gets the servicePlans property value. Cloud PC service plans.
     * @return a {@link java.util.List<CloudPcServicePlan>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcServicePlan> getServicePlans() {
        return this.backingStore.get("servicePlans");
    }
    /**
     * Gets the sharedUseServicePlans property value. The sharedUseServicePlans property
     * @return a {@link java.util.List<CloudPcSharedUseServicePlan>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcSharedUseServicePlan> getSharedUseServicePlans() {
        return this.backingStore.get("sharedUseServicePlans");
    }
    /**
     * Gets the snapshots property value. Cloud PC snapshots.
     * @return a {@link java.util.List<CloudPcSnapshot>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcSnapshot> getSnapshots() {
        return this.backingStore.get("snapshots");
    }
    /**
     * Gets the supportedRegions property value. Cloud PC supported regions.
     * @return a {@link java.util.List<CloudPcSupportedRegion>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcSupportedRegion> getSupportedRegions() {
        return this.backingStore.get("supportedRegions");
    }
    /**
     * Gets the userSettings property value. Cloud PC user settings.
     * @return a {@link java.util.List<CloudPcUserSetting>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CloudPcUserSetting> getUserSettings() {
        return this.backingStore.get("userSettings");
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
        this.backingStore.set("auditEvents", value);
    }
    /**
     * Sets the bulkActions property value. Bulk actions applied to a Cloud PC.
     * @param value Value to set for the bulkActions property.
     */
    public void setBulkActions(@jakarta.annotation.Nullable final java.util.List<CloudPcBulkAction> value) {
        this.backingStore.set("bulkActions", value);
    }
    /**
     * Sets the cloudPCs property value. Cloud managed virtual desktops.
     * @param value Value to set for the cloudPCs property.
     */
    public void setCloudPCs(@jakarta.annotation.Nullable final java.util.List<CloudPC> value) {
        this.backingStore.set("cloudPCs", value);
    }
    /**
     * Sets the crossCloudGovernmentOrganizationMapping property value. Cloud PC organization mapping between public and US Government Community Cloud (GCC) organizations.
     * @param value Value to set for the crossCloudGovernmentOrganizationMapping property.
     */
    public void setCrossCloudGovernmentOrganizationMapping(@jakarta.annotation.Nullable final CloudPcCrossCloudGovernmentOrganizationMapping value) {
        this.backingStore.set("crossCloudGovernmentOrganizationMapping", value);
    }
    /**
     * Sets the deviceImages property value. The image resource on Cloud PC.
     * @param value Value to set for the deviceImages property.
     */
    public void setDeviceImages(@jakarta.annotation.Nullable final java.util.List<CloudPcDeviceImage> value) {
        this.backingStore.set("deviceImages", value);
    }
    /**
     * Sets the externalPartnerSettings property value. The external partner settings on a Cloud PC.
     * @param value Value to set for the externalPartnerSettings property.
     */
    public void setExternalPartnerSettings(@jakarta.annotation.Nullable final java.util.List<CloudPcExternalPartnerSetting> value) {
        this.backingStore.set("externalPartnerSettings", value);
    }
    /**
     * Sets the frontLineServicePlans property value. Front-line service plans for a Cloud PC.
     * @param value Value to set for the frontLineServicePlans property.
     */
    public void setFrontLineServicePlans(@jakarta.annotation.Nullable final java.util.List<CloudPcFrontLineServicePlan> value) {
        this.backingStore.set("frontLineServicePlans", value);
    }
    /**
     * Sets the galleryImages property value. The gallery image resource on Cloud PC.
     * @param value Value to set for the galleryImages property.
     */
    public void setGalleryImages(@jakarta.annotation.Nullable final java.util.List<CloudPcGalleryImage> value) {
        this.backingStore.set("galleryImages", value);
    }
    /**
     * Sets the onPremisesConnections property value. A defined collection of Azure resource information that can be used to establish on-premises network connectivity for Cloud PCs.
     * @param value Value to set for the onPremisesConnections property.
     */
    public void setOnPremisesConnections(@jakarta.annotation.Nullable final java.util.List<CloudPcOnPremisesConnection> value) {
        this.backingStore.set("onPremisesConnections", value);
    }
    /**
     * Sets the organizationSettings property value. The Cloud PC organization settings for a tenant.
     * @param value Value to set for the organizationSettings property.
     */
    public void setOrganizationSettings(@jakarta.annotation.Nullable final CloudPcOrganizationSettings value) {
        this.backingStore.set("organizationSettings", value);
    }
    /**
     * Sets the provisioningPolicies property value. Cloud PC provisioning policy.
     * @param value Value to set for the provisioningPolicies property.
     */
    public void setProvisioningPolicies(@jakarta.annotation.Nullable final java.util.List<CloudPcProvisioningPolicy> value) {
        this.backingStore.set("provisioningPolicies", value);
    }
    /**
     * Sets the reports property value. Cloud PC related reports.
     * @param value Value to set for the reports property.
     */
    public void setReports(@jakarta.annotation.Nullable final CloudPcReports value) {
        this.backingStore.set("reports", value);
    }
    /**
     * Sets the servicePlans property value. Cloud PC service plans.
     * @param value Value to set for the servicePlans property.
     */
    public void setServicePlans(@jakarta.annotation.Nullable final java.util.List<CloudPcServicePlan> value) {
        this.backingStore.set("servicePlans", value);
    }
    /**
     * Sets the sharedUseServicePlans property value. The sharedUseServicePlans property
     * @param value Value to set for the sharedUseServicePlans property.
     */
    public void setSharedUseServicePlans(@jakarta.annotation.Nullable final java.util.List<CloudPcSharedUseServicePlan> value) {
        this.backingStore.set("sharedUseServicePlans", value);
    }
    /**
     * Sets the snapshots property value. Cloud PC snapshots.
     * @param value Value to set for the snapshots property.
     */
    public void setSnapshots(@jakarta.annotation.Nullable final java.util.List<CloudPcSnapshot> value) {
        this.backingStore.set("snapshots", value);
    }
    /**
     * Sets the supportedRegions property value. Cloud PC supported regions.
     * @param value Value to set for the supportedRegions property.
     */
    public void setSupportedRegions(@jakarta.annotation.Nullable final java.util.List<CloudPcSupportedRegion> value) {
        this.backingStore.set("supportedRegions", value);
    }
    /**
     * Sets the userSettings property value. Cloud PC user settings.
     * @param value Value to set for the userSettings property.
     */
    public void setUserSettings(@jakarta.annotation.Nullable final java.util.List<CloudPcUserSetting> value) {
        this.backingStore.set("userSettings", value);
    }
}

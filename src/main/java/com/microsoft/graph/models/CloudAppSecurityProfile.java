package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudAppSecurityProfile extends Entity implements Parsable {
    /**
     * Instantiates a new CloudAppSecurityProfile and sets the default values.
     */
    public CloudAppSecurityProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudAppSecurityProfile
     */
    @jakarta.annotation.Nonnull
    public static CloudAppSecurityProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudAppSecurityProfile();
    }
    /**
     * Gets the azureSubscriptionId property value. The azureSubscriptionId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureSubscriptionId() {
        return this.BackingStore.get("azureSubscriptionId");
    }
    /**
     * Gets the azureTenantId property value. The azureTenantId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAzureTenantId() {
        return this.BackingStore.get("azureTenantId");
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.BackingStore.get("createdDateTime");
    }
    /**
     * Gets the deploymentPackageUrl property value. The deploymentPackageUrl property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDeploymentPackageUrl() {
        return this.BackingStore.get("deploymentPackageUrl");
    }
    /**
     * Gets the destinationServiceName property value. The destinationServiceName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getDestinationServiceName() {
        return this.BackingStore.get("destinationServiceName");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureSubscriptionId", (n) -> { this.setAzureSubscriptionId(n.getStringValue()); });
        deserializerMap.put("azureTenantId", (n) -> { this.setAzureTenantId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deploymentPackageUrl", (n) -> { this.setDeploymentPackageUrl(n.getStringValue()); });
        deserializerMap.put("destinationServiceName", (n) -> { this.setDestinationServiceName(n.getStringValue()); });
        deserializerMap.put("isSigned", (n) -> { this.setIsSigned(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { this.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("manifest", (n) -> { this.setManifest(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("permissionsRequired", (n) -> { this.setPermissionsRequired(n.getEnumValue(ApplicationPermissionsRequired.class)); });
        deserializerMap.put("platform", (n) -> { this.setPlatform(n.getStringValue()); });
        deserializerMap.put("policyName", (n) -> { this.setPolicyName(n.getStringValue()); });
        deserializerMap.put("publisher", (n) -> { this.setPublisher(n.getStringValue()); });
        deserializerMap.put("riskScore", (n) -> { this.setRiskScore(n.getStringValue()); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("type", (n) -> { this.setType(n.getStringValue()); });
        deserializerMap.put("vendorInformation", (n) -> { this.setVendorInformation(n.getObjectValue(SecurityVendorInformation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isSigned property value. The isSigned property
     * @return a Boolean
     */
    @jakarta.annotation.Nullable
    public Boolean getIsSigned() {
        return this.BackingStore.get("isSigned");
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.BackingStore.get("lastModifiedDateTime");
    }
    /**
     * Gets the manifest property value. The manifest property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getManifest() {
        return this.BackingStore.get("manifest");
    }
    /**
     * Gets the name property value. The name property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getName() {
        return this.BackingStore.get("name");
    }
    /**
     * Gets the permissionsRequired property value. The permissionsRequired property
     * @return a ApplicationPermissionsRequired
     */
    @jakarta.annotation.Nullable
    public ApplicationPermissionsRequired getPermissionsRequired() {
        return this.BackingStore.get("permissionsRequired");
    }
    /**
     * Gets the platform property value. The platform property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPlatform() {
        return this.BackingStore.get("platform");
    }
    /**
     * Gets the policyName property value. The policyName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPolicyName() {
        return this.BackingStore.get("policyName");
    }
    /**
     * Gets the publisher property value. The publisher property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getPublisher() {
        return this.BackingStore.get("publisher");
    }
    /**
     * Gets the riskScore property value. The riskScore property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getRiskScore() {
        return this.BackingStore.get("riskScore");
    }
    /**
     * Gets the tags property value. The tags property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.BackingStore.get("tags");
    }
    /**
     * Gets the type property value. The type property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return this.BackingStore.get("type");
    }
    /**
     * Gets the vendorInformation property value. The vendorInformation property
     * @return a SecurityVendorInformation
     */
    @jakarta.annotation.Nullable
    public SecurityVendorInformation getVendorInformation() {
        return this.BackingStore.get("vendorInformation");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("azureSubscriptionId", this.getAzureSubscriptionId());
        writer.writeStringValue("azureTenantId", this.getAzureTenantId());
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeStringValue("deploymentPackageUrl", this.getDeploymentPackageUrl());
        writer.writeStringValue("destinationServiceName", this.getDestinationServiceName());
        writer.writeBooleanValue("isSigned", this.getIsSigned());
        writer.writeOffsetDateTimeValue("lastModifiedDateTime", this.getLastModifiedDateTime());
        writer.writeStringValue("manifest", this.getManifest());
        writer.writeStringValue("name", this.getName());
        writer.writeEnumValue("permissionsRequired", this.getPermissionsRequired());
        writer.writeStringValue("platform", this.getPlatform());
        writer.writeStringValue("policyName", this.getPolicyName());
        writer.writeStringValue("publisher", this.getPublisher());
        writer.writeStringValue("riskScore", this.getRiskScore());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeStringValue("type", this.getType());
        writer.writeObjectValue("vendorInformation", this.getVendorInformation());
    }
    /**
     * Sets the azureSubscriptionId property value. The azureSubscriptionId property
     * @param value Value to set for the azureSubscriptionId property.
     */
    public void setAzureSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("azureSubscriptionId", value);
    }
    /**
     * Sets the azureTenantId property value. The azureTenantId property
     * @param value Value to set for the azureTenantId property.
     */
    public void setAzureTenantId(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("azureTenantId", value);
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     */
    public void setCreatedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("createdDateTime", value);
    }
    /**
     * Sets the deploymentPackageUrl property value. The deploymentPackageUrl property
     * @param value Value to set for the deploymentPackageUrl property.
     */
    public void setDeploymentPackageUrl(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("deploymentPackageUrl", value);
    }
    /**
     * Sets the destinationServiceName property value. The destinationServiceName property
     * @param value Value to set for the destinationServiceName property.
     */
    public void setDestinationServiceName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("destinationServiceName", value);
    }
    /**
     * Sets the isSigned property value. The isSigned property
     * @param value Value to set for the isSigned property.
     */
    public void setIsSigned(@jakarta.annotation.Nullable final Boolean value) {
        this.BackingStore.set("isSigned", value);
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     */
    public void setLastModifiedDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastModifiedDateTime", value);
    }
    /**
     * Sets the manifest property value. The manifest property
     * @param value Value to set for the manifest property.
     */
    public void setManifest(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("manifest", value);
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("name", value);
    }
    /**
     * Sets the permissionsRequired property value. The permissionsRequired property
     * @param value Value to set for the permissionsRequired property.
     */
    public void setPermissionsRequired(@jakarta.annotation.Nullable final ApplicationPermissionsRequired value) {
        this.BackingStore.set("permissionsRequired", value);
    }
    /**
     * Sets the platform property value. The platform property
     * @param value Value to set for the platform property.
     */
    public void setPlatform(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("platform", value);
    }
    /**
     * Sets the policyName property value. The policyName property
     * @param value Value to set for the policyName property.
     */
    public void setPolicyName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("policyName", value);
    }
    /**
     * Sets the publisher property value. The publisher property
     * @param value Value to set for the publisher property.
     */
    public void setPublisher(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("publisher", value);
    }
    /**
     * Sets the riskScore property value. The riskScore property
     * @param value Value to set for the riskScore property.
     */
    public void setRiskScore(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("riskScore", value);
    }
    /**
     * Sets the tags property value. The tags property
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("tags", value);
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     */
    public void setType(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("type", value);
    }
    /**
     * Sets the vendorInformation property value. The vendorInformation property
     * @param value Value to set for the vendorInformation property.
     */
    public void setVendorInformation(@jakarta.annotation.Nullable final SecurityVendorInformation value) {
        this.BackingStore.set("vendorInformation", value);
    }
}

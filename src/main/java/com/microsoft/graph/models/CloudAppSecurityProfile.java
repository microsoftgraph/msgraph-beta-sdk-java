package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudAppSecurityProfile extends Entity implements Parsable {
    /** The azureSubscriptionId property */
    private String azureSubscriptionId;
    /** The azureTenantId property */
    private String azureTenantId;
    /** The createdDateTime property */
    private OffsetDateTime createdDateTime;
    /** The deploymentPackageUrl property */
    private String deploymentPackageUrl;
    /** The destinationServiceName property */
    private String destinationServiceName;
    /** The isSigned property */
    private Boolean isSigned;
    /** The lastModifiedDateTime property */
    private OffsetDateTime lastModifiedDateTime;
    /** The manifest property */
    private String manifest;
    /** The name property */
    private String name;
    /** The permissionsRequired property */
    private ApplicationPermissionsRequired permissionsRequired;
    /** The platform property */
    private String platform;
    /** The policyName property */
    private String policyName;
    /** The publisher property */
    private String publisher;
    /** The riskScore property */
    private String riskScore;
    /** The tags property */
    private java.util.List<String> tags;
    /** The type property */
    private String type;
    /** The vendorInformation property */
    private SecurityVendorInformation vendorInformation;
    /**
     * Instantiates a new CloudAppSecurityProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudAppSecurityProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudAppSecurityProfile
     */
    @javax.annotation.Nonnull
    public static CloudAppSecurityProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudAppSecurityProfile();
    }
    /**
     * Gets the azureSubscriptionId property value. The azureSubscriptionId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureSubscriptionId() {
        return this.azureSubscriptionId;
    }
    /**
     * Gets the azureTenantId property value. The azureTenantId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureTenantId() {
        return this.azureTenantId;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }
    /**
     * Gets the deploymentPackageUrl property value. The deploymentPackageUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeploymentPackageUrl() {
        return this.deploymentPackageUrl;
    }
    /**
     * Gets the destinationServiceName property value. The destinationServiceName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationServiceName() {
        return this.destinationServiceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
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
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSigned() {
        return this.isSigned;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }
    /**
     * Gets the manifest property value. The manifest property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManifest() {
        return this.manifest;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this.name;
    }
    /**
     * Gets the permissionsRequired property value. The permissionsRequired property
     * @return a applicationPermissionsRequired
     */
    @javax.annotation.Nullable
    public ApplicationPermissionsRequired getPermissionsRequired() {
        return this.permissionsRequired;
    }
    /**
     * Gets the platform property value. The platform property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPlatform() {
        return this.platform;
    }
    /**
     * Gets the policyName property value. The policyName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyName() {
        return this.policyName;
    }
    /**
     * Gets the publisher property value. The publisher property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this.publisher;
    }
    /**
     * Gets the riskScore property value. The riskScore property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRiskScore() {
        return this.riskScore;
    }
    /**
     * Gets the tags property value. The tags property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.tags;
    }
    /**
     * Gets the type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this.type;
    }
    /**
     * Gets the vendorInformation property value. The vendorInformation property
     * @return a securityVendorInformation
     */
    @javax.annotation.Nullable
    public SecurityVendorInformation getVendorInformation() {
        return this.vendorInformation;
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
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureSubscriptionId(@javax.annotation.Nullable final String value) {
        this.azureSubscriptionId = value;
    }
    /**
     * Sets the azureTenantId property value. The azureTenantId property
     * @param value Value to set for the azureTenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureTenantId(@javax.annotation.Nullable final String value) {
        this.azureTenantId = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.createdDateTime = value;
    }
    /**
     * Sets the deploymentPackageUrl property value. The deploymentPackageUrl property
     * @param value Value to set for the deploymentPackageUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploymentPackageUrl(@javax.annotation.Nullable final String value) {
        this.deploymentPackageUrl = value;
    }
    /**
     * Sets the destinationServiceName property value. The destinationServiceName property
     * @param value Value to set for the destinationServiceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDestinationServiceName(@javax.annotation.Nullable final String value) {
        this.destinationServiceName = value;
    }
    /**
     * Sets the isSigned property value. The isSigned property
     * @param value Value to set for the isSigned property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSigned(@javax.annotation.Nullable final Boolean value) {
        this.isSigned = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastModifiedDateTime = value;
    }
    /**
     * Sets the manifest property value. The manifest property
     * @param value Value to set for the manifest property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManifest(@javax.annotation.Nullable final String value) {
        this.manifest = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this.name = value;
    }
    /**
     * Sets the permissionsRequired property value. The permissionsRequired property
     * @param value Value to set for the permissionsRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermissionsRequired(@javax.annotation.Nullable final ApplicationPermissionsRequired value) {
        this.permissionsRequired = value;
    }
    /**
     * Sets the platform property value. The platform property
     * @param value Value to set for the platform property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatform(@javax.annotation.Nullable final String value) {
        this.platform = value;
    }
    /**
     * Sets the policyName property value. The policyName property
     * @param value Value to set for the policyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyName(@javax.annotation.Nullable final String value) {
        this.policyName = value;
    }
    /**
     * Sets the publisher property value. The publisher property
     * @param value Value to set for the publisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this.publisher = value;
    }
    /**
     * Sets the riskScore property value. The riskScore property
     * @param value Value to set for the riskScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRiskScore(@javax.annotation.Nullable final String value) {
        this.riskScore = value;
    }
    /**
     * Sets the tags property value. The tags property
     * @param value Value to set for the tags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this.tags = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this.type = value;
    }
    /**
     * Sets the vendorInformation property value. The vendorInformation property
     * @param value Value to set for the vendorInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVendorInformation(@javax.annotation.Nullable final SecurityVendorInformation value) {
        this.vendorInformation = value;
    }
}

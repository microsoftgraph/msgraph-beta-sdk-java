package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** Provides operations to manage the collection of accessReviewDecision entities. */
public class CloudAppSecurityProfile extends Entity implements Parsable {
    /** The azureSubscriptionId property */
    private String _azureSubscriptionId;
    /** The azureTenantId property */
    private String _azureTenantId;
    /** The createdDateTime property */
    private OffsetDateTime _createdDateTime;
    /** The deploymentPackageUrl property */
    private String _deploymentPackageUrl;
    /** The destinationServiceName property */
    private String _destinationServiceName;
    /** The isSigned property */
    private Boolean _isSigned;
    /** The lastModifiedDateTime property */
    private OffsetDateTime _lastModifiedDateTime;
    /** The manifest property */
    private String _manifest;
    /** The name property */
    private String _name;
    /** The permissionsRequired property */
    private ApplicationPermissionsRequired _permissionsRequired;
    /** The platform property */
    private String _platform;
    /** The policyName property */
    private String _policyName;
    /** The publisher property */
    private String _publisher;
    /** The riskScore property */
    private String _riskScore;
    /** The tags property */
    private java.util.List<String> _tags;
    /** The type property */
    private String _type;
    /** The vendorInformation property */
    private SecurityVendorInformation _vendorInformation;
    /**
     * Instantiates a new cloudAppSecurityProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudAppSecurityProfile() {
        super();
        this.setOdataType("#microsoft.graph.cloudAppSecurityProfile");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudAppSecurityProfile
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
        return this._azureSubscriptionId;
    }
    /**
     * Gets the azureTenantId property value. The azureTenantId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAzureTenantId() {
        return this._azureTenantId;
    }
    /**
     * Gets the createdDateTime property value. The createdDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getCreatedDateTime() {
        return this._createdDateTime;
    }
    /**
     * Gets the deploymentPackageUrl property value. The deploymentPackageUrl property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDeploymentPackageUrl() {
        return this._deploymentPackageUrl;
    }
    /**
     * Gets the destinationServiceName property value. The destinationServiceName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDestinationServiceName() {
        return this._destinationServiceName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final CloudAppSecurityProfile currentObject = this;
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("azureSubscriptionId", (n) -> { currentObject.setAzureSubscriptionId(n.getStringValue()); });
        deserializerMap.put("azureTenantId", (n) -> { currentObject.setAzureTenantId(n.getStringValue()); });
        deserializerMap.put("createdDateTime", (n) -> { currentObject.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("deploymentPackageUrl", (n) -> { currentObject.setDeploymentPackageUrl(n.getStringValue()); });
        deserializerMap.put("destinationServiceName", (n) -> { currentObject.setDestinationServiceName(n.getStringValue()); });
        deserializerMap.put("isSigned", (n) -> { currentObject.setIsSigned(n.getBooleanValue()); });
        deserializerMap.put("lastModifiedDateTime", (n) -> { currentObject.setLastModifiedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("manifest", (n) -> { currentObject.setManifest(n.getStringValue()); });
        deserializerMap.put("name", (n) -> { currentObject.setName(n.getStringValue()); });
        deserializerMap.put("permissionsRequired", (n) -> { currentObject.setPermissionsRequired(n.getEnumValue(ApplicationPermissionsRequired.class)); });
        deserializerMap.put("platform", (n) -> { currentObject.setPlatform(n.getStringValue()); });
        deserializerMap.put("policyName", (n) -> { currentObject.setPolicyName(n.getStringValue()); });
        deserializerMap.put("publisher", (n) -> { currentObject.setPublisher(n.getStringValue()); });
        deserializerMap.put("riskScore", (n) -> { currentObject.setRiskScore(n.getStringValue()); });
        deserializerMap.put("tags", (n) -> { currentObject.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("type", (n) -> { currentObject.setType(n.getStringValue()); });
        deserializerMap.put("vendorInformation", (n) -> { currentObject.setVendorInformation(n.getObjectValue(SecurityVendorInformation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the isSigned property value. The isSigned property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsSigned() {
        return this._isSigned;
    }
    /**
     * Gets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastModifiedDateTime() {
        return this._lastModifiedDateTime;
    }
    /**
     * Gets the manifest property value. The manifest property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getManifest() {
        return this._manifest;
    }
    /**
     * Gets the name property value. The name property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getName() {
        return this._name;
    }
    /**
     * Gets the permissionsRequired property value. The permissionsRequired property
     * @return a applicationPermissionsRequired
     */
    @javax.annotation.Nullable
    public ApplicationPermissionsRequired getPermissionsRequired() {
        return this._permissionsRequired;
    }
    /**
     * Gets the platform property value. The platform property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPlatform() {
        return this._platform;
    }
    /**
     * Gets the policyName property value. The policyName property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPolicyName() {
        return this._policyName;
    }
    /**
     * Gets the publisher property value. The publisher property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getPublisher() {
        return this._publisher;
    }
    /**
     * Gets the riskScore property value. The riskScore property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getRiskScore() {
        return this._riskScore;
    }
    /**
     * Gets the tags property value. The tags property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getTags() {
        return this._tags;
    }
    /**
     * Gets the type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getType() {
        return this._type;
    }
    /**
     * Gets the vendorInformation property value. The vendorInformation property
     * @return a securityVendorInformation
     */
    @javax.annotation.Nullable
    public SecurityVendorInformation getVendorInformation() {
        return this._vendorInformation;
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
        this._azureSubscriptionId = value;
    }
    /**
     * Sets the azureTenantId property value. The azureTenantId property
     * @param value Value to set for the azureTenantId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAzureTenantId(@javax.annotation.Nullable final String value) {
        this._azureTenantId = value;
    }
    /**
     * Sets the createdDateTime property value. The createdDateTime property
     * @param value Value to set for the createdDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCreatedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._createdDateTime = value;
    }
    /**
     * Sets the deploymentPackageUrl property value. The deploymentPackageUrl property
     * @param value Value to set for the deploymentPackageUrl property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDeploymentPackageUrl(@javax.annotation.Nullable final String value) {
        this._deploymentPackageUrl = value;
    }
    /**
     * Sets the destinationServiceName property value. The destinationServiceName property
     * @param value Value to set for the destinationServiceName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDestinationServiceName(@javax.annotation.Nullable final String value) {
        this._destinationServiceName = value;
    }
    /**
     * Sets the isSigned property value. The isSigned property
     * @param value Value to set for the isSigned property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsSigned(@javax.annotation.Nullable final Boolean value) {
        this._isSigned = value;
    }
    /**
     * Sets the lastModifiedDateTime property value. The lastModifiedDateTime property
     * @param value Value to set for the lastModifiedDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastModifiedDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this._lastModifiedDateTime = value;
    }
    /**
     * Sets the manifest property value. The manifest property
     * @param value Value to set for the manifest property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setManifest(@javax.annotation.Nullable final String value) {
        this._manifest = value;
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setName(@javax.annotation.Nullable final String value) {
        this._name = value;
    }
    /**
     * Sets the permissionsRequired property value. The permissionsRequired property
     * @param value Value to set for the permissionsRequired property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPermissionsRequired(@javax.annotation.Nullable final ApplicationPermissionsRequired value) {
        this._permissionsRequired = value;
    }
    /**
     * Sets the platform property value. The platform property
     * @param value Value to set for the platform property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPlatform(@javax.annotation.Nullable final String value) {
        this._platform = value;
    }
    /**
     * Sets the policyName property value. The policyName property
     * @param value Value to set for the policyName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPolicyName(@javax.annotation.Nullable final String value) {
        this._policyName = value;
    }
    /**
     * Sets the publisher property value. The publisher property
     * @param value Value to set for the publisher property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPublisher(@javax.annotation.Nullable final String value) {
        this._publisher = value;
    }
    /**
     * Sets the riskScore property value. The riskScore property
     * @param value Value to set for the riskScore property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRiskScore(@javax.annotation.Nullable final String value) {
        this._riskScore = value;
    }
    /**
     * Sets the tags property value. The tags property
     * @param value Value to set for the tags property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTags(@javax.annotation.Nullable final java.util.List<String> value) {
        this._tags = value;
    }
    /**
     * Sets the type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setType(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
    /**
     * Sets the vendorInformation property value. The vendorInformation property
     * @param value Value to set for the vendorInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVendorInformation(@javax.annotation.Nullable final SecurityVendorInformation value) {
        this._vendorInformation = value;
    }
}

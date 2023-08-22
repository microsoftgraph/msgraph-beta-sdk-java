package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class FileSecurityProfile extends Entity implements Parsable {
    /**
     * The activityGroupNames property
     */
    private java.util.List<String> activityGroupNames;
    /**
     * The azureSubscriptionId property
     */
    private String azureSubscriptionId;
    /**
     * The azureTenantId property
     */
    private String azureTenantId;
    /**
     * The certificateThumbprint property
     */
    private String certificateThumbprint;
    /**
     * The extensions property
     */
    private java.util.List<String> extensions;
    /**
     * The fileType property
     */
    private String fileType;
    /**
     * The firstSeenDateTime property
     */
    private OffsetDateTime firstSeenDateTime;
    /**
     * The hashes property
     */
    private java.util.List<FileHash> hashes;
    /**
     * The lastSeenDateTime property
     */
    private OffsetDateTime lastSeenDateTime;
    /**
     * The malwareStates property
     */
    private java.util.List<MalwareState> malwareStates;
    /**
     * The names property
     */
    private java.util.List<String> names;
    /**
     * The riskScore property
     */
    private String riskScore;
    /**
     * The size property
     */
    private Long size;
    /**
     * The tags property
     */
    private java.util.List<String> tags;
    /**
     * The vendorInformation property
     */
    private SecurityVendorInformation vendorInformation;
    /**
     * The vulnerabilityStates property
     */
    private java.util.List<VulnerabilityState> vulnerabilityStates;
    /**
     * Instantiates a new fileSecurityProfile and sets the default values.
     */
    public FileSecurityProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a fileSecurityProfile
     */
    @jakarta.annotation.Nonnull
    public static FileSecurityProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new FileSecurityProfile();
    }
    /**
     * Gets the activityGroupNames property value. The activityGroupNames property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getActivityGroupNames() {
        return this.activityGroupNames;
    }
    /**
     * Gets the azureSubscriptionId property value. The azureSubscriptionId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAzureSubscriptionId() {
        return this.azureSubscriptionId;
    }
    /**
     * Gets the azureTenantId property value. The azureTenantId property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getAzureTenantId() {
        return this.azureTenantId;
    }
    /**
     * Gets the certificateThumbprint property value. The certificateThumbprint property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getCertificateThumbprint() {
        return this.certificateThumbprint;
    }
    /**
     * Gets the extensions property value. The extensions property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getExtensions() {
        return this.extensions;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activityGroupNames", (n) -> { this.setActivityGroupNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("azureSubscriptionId", (n) -> { this.setAzureSubscriptionId(n.getStringValue()); });
        deserializerMap.put("azureTenantId", (n) -> { this.setAzureTenantId(n.getStringValue()); });
        deserializerMap.put("certificateThumbprint", (n) -> { this.setCertificateThumbprint(n.getStringValue()); });
        deserializerMap.put("extensions", (n) -> { this.setExtensions(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("fileType", (n) -> { this.setFileType(n.getStringValue()); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("hashes", (n) -> { this.setHashes(n.getCollectionOfObjectValues(FileHash::createFromDiscriminatorValue)); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("malwareStates", (n) -> { this.setMalwareStates(n.getCollectionOfObjectValues(MalwareState::createFromDiscriminatorValue)); });
        deserializerMap.put("names", (n) -> { this.setNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("riskScore", (n) -> { this.setRiskScore(n.getStringValue()); });
        deserializerMap.put("size", (n) -> { this.setSize(n.getLongValue()); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("vendorInformation", (n) -> { this.setVendorInformation(n.getObjectValue(SecurityVendorInformation::createFromDiscriminatorValue)); });
        deserializerMap.put("vulnerabilityStates", (n) -> { this.setVulnerabilityStates(n.getCollectionOfObjectValues(VulnerabilityState::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fileType property value. The fileType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getFileType() {
        return this.fileType;
    }
    /**
     * Gets the firstSeenDateTime property value. The firstSeenDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.firstSeenDateTime;
    }
    /**
     * Gets the hashes property value. The hashes property
     * @return a fileHash
     */
    @jakarta.annotation.Nullable
    public java.util.List<FileHash> getHashes() {
        return this.hashes;
    }
    /**
     * Gets the lastSeenDateTime property value. The lastSeenDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.lastSeenDateTime;
    }
    /**
     * Gets the malwareStates property value. The malwareStates property
     * @return a malwareState
     */
    @jakarta.annotation.Nullable
    public java.util.List<MalwareState> getMalwareStates() {
        return this.malwareStates;
    }
    /**
     * Gets the names property value. The names property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getNames() {
        return this.names;
    }
    /**
     * Gets the riskScore property value. The riskScore property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getRiskScore() {
        return this.riskScore;
    }
    /**
     * Gets the size property value. The size property
     * @return a int64
     */
    @jakarta.annotation.Nullable
    public Long getSize() {
        return this.size;
    }
    /**
     * Gets the tags property value. The tags property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.tags;
    }
    /**
     * Gets the vendorInformation property value. The vendorInformation property
     * @return a securityVendorInformation
     */
    @jakarta.annotation.Nullable
    public SecurityVendorInformation getVendorInformation() {
        return this.vendorInformation;
    }
    /**
     * Gets the vulnerabilityStates property value. The vulnerabilityStates property
     * @return a vulnerabilityState
     */
    @jakarta.annotation.Nullable
    public java.util.List<VulnerabilityState> getVulnerabilityStates() {
        return this.vulnerabilityStates;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfPrimitiveValues("activityGroupNames", this.getActivityGroupNames());
        writer.writeStringValue("azureSubscriptionId", this.getAzureSubscriptionId());
        writer.writeStringValue("azureTenantId", this.getAzureTenantId());
        writer.writeStringValue("certificateThumbprint", this.getCertificateThumbprint());
        writer.writeCollectionOfPrimitiveValues("extensions", this.getExtensions());
        writer.writeStringValue("fileType", this.getFileType());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeCollectionOfObjectValues("hashes", this.getHashes());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeCollectionOfObjectValues("malwareStates", this.getMalwareStates());
        writer.writeCollectionOfPrimitiveValues("names", this.getNames());
        writer.writeStringValue("riskScore", this.getRiskScore());
        writer.writeLongValue("size", this.getSize());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeObjectValue("vendorInformation", this.getVendorInformation());
        writer.writeCollectionOfObjectValues("vulnerabilityStates", this.getVulnerabilityStates());
    }
    /**
     * Sets the activityGroupNames property value. The activityGroupNames property
     * @param value Value to set for the activityGroupNames property.
     */
    public void setActivityGroupNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.activityGroupNames = value;
    }
    /**
     * Sets the azureSubscriptionId property value. The azureSubscriptionId property
     * @param value Value to set for the azureSubscriptionId property.
     */
    public void setAzureSubscriptionId(@jakarta.annotation.Nullable final String value) {
        this.azureSubscriptionId = value;
    }
    /**
     * Sets the azureTenantId property value. The azureTenantId property
     * @param value Value to set for the azureTenantId property.
     */
    public void setAzureTenantId(@jakarta.annotation.Nullable final String value) {
        this.azureTenantId = value;
    }
    /**
     * Sets the certificateThumbprint property value. The certificateThumbprint property
     * @param value Value to set for the certificateThumbprint property.
     */
    public void setCertificateThumbprint(@jakarta.annotation.Nullable final String value) {
        this.certificateThumbprint = value;
    }
    /**
     * Sets the extensions property value. The extensions property
     * @param value Value to set for the extensions property.
     */
    public void setExtensions(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.extensions = value;
    }
    /**
     * Sets the fileType property value. The fileType property
     * @param value Value to set for the fileType property.
     */
    public void setFileType(@jakarta.annotation.Nullable final String value) {
        this.fileType = value;
    }
    /**
     * Sets the firstSeenDateTime property value. The firstSeenDateTime property
     * @param value Value to set for the firstSeenDateTime property.
     */
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.firstSeenDateTime = value;
    }
    /**
     * Sets the hashes property value. The hashes property
     * @param value Value to set for the hashes property.
     */
    public void setHashes(@jakarta.annotation.Nullable final java.util.List<FileHash> value) {
        this.hashes = value;
    }
    /**
     * Sets the lastSeenDateTime property value. The lastSeenDateTime property
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastSeenDateTime = value;
    }
    /**
     * Sets the malwareStates property value. The malwareStates property
     * @param value Value to set for the malwareStates property.
     */
    public void setMalwareStates(@jakarta.annotation.Nullable final java.util.List<MalwareState> value) {
        this.malwareStates = value;
    }
    /**
     * Sets the names property value. The names property
     * @param value Value to set for the names property.
     */
    public void setNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.names = value;
    }
    /**
     * Sets the riskScore property value. The riskScore property
     * @param value Value to set for the riskScore property.
     */
    public void setRiskScore(@jakarta.annotation.Nullable final String value) {
        this.riskScore = value;
    }
    /**
     * Sets the size property value. The size property
     * @param value Value to set for the size property.
     */
    public void setSize(@jakarta.annotation.Nullable final Long value) {
        this.size = value;
    }
    /**
     * Sets the tags property value. The tags property
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.tags = value;
    }
    /**
     * Sets the vendorInformation property value. The vendorInformation property
     * @param value Value to set for the vendorInformation property.
     */
    public void setVendorInformation(@jakarta.annotation.Nullable final SecurityVendorInformation value) {
        this.vendorInformation = value;
    }
    /**
     * Sets the vulnerabilityStates property value. The vulnerabilityStates property
     * @param value Value to set for the vulnerabilityStates property.
     */
    public void setVulnerabilityStates(@jakarta.annotation.Nullable final java.util.List<VulnerabilityState> value) {
        this.vulnerabilityStates = value;
    }
}

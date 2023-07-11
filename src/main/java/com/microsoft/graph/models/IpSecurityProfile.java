package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class IpSecurityProfile extends Entity implements Parsable {
    /**
     * The activityGroupNames property
     */
    private java.util.List<String> activityGroupNames;
    /**
     * The address property
     */
    private String address;
    /**
     * The azureSubscriptionId property
     */
    private String azureSubscriptionId;
    /**
     * The azureTenantId property
     */
    private String azureTenantId;
    /**
     * The countHits property
     */
    private Integer countHits;
    /**
     * The countHosts property
     */
    private Integer countHosts;
    /**
     * The firstSeenDateTime property
     */
    private OffsetDateTime firstSeenDateTime;
    /**
     * The ipCategories property
     */
    private java.util.List<IpCategory> ipCategories;
    /**
     * The ipReferenceData property
     */
    private java.util.List<IpReferenceData> ipReferenceData;
    /**
     * The lastSeenDateTime property
     */
    private OffsetDateTime lastSeenDateTime;
    /**
     * The riskScore property
     */
    private String riskScore;
    /**
     * The tags property
     */
    private java.util.List<String> tags;
    /**
     * The vendorInformation property
     */
    private SecurityVendorInformation vendorInformation;
    /**
     * Instantiates a new ipSecurityProfile and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public IpSecurityProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ipSecurityProfile
     */
    @javax.annotation.Nonnull
    public static IpSecurityProfile createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IpSecurityProfile();
    }
    /**
     * Gets the activityGroupNames property value. The activityGroupNames property
     * @return a string
     */
    @javax.annotation.Nullable
    public java.util.List<String> getActivityGroupNames() {
        return this.activityGroupNames;
    }
    /**
     * Gets the address property value. The address property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getAddress() {
        return this.address;
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
     * Gets the countHits property value. The countHits property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCountHits() {
        return this.countHits;
    }
    /**
     * Gets the countHosts property value. The countHosts property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCountHosts() {
        return this.countHosts;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("activityGroupNames", (n) -> { this.setActivityGroupNames(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("address", (n) -> { this.setAddress(n.getStringValue()); });
        deserializerMap.put("azureSubscriptionId", (n) -> { this.setAzureSubscriptionId(n.getStringValue()); });
        deserializerMap.put("azureTenantId", (n) -> { this.setAzureTenantId(n.getStringValue()); });
        deserializerMap.put("countHits", (n) -> { this.setCountHits(n.getIntegerValue()); });
        deserializerMap.put("countHosts", (n) -> { this.setCountHosts(n.getIntegerValue()); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("ipCategories", (n) -> { this.setIpCategories(n.getCollectionOfObjectValues(IpCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("ipReferenceData", (n) -> { this.setIpReferenceData(n.getCollectionOfObjectValues(IpReferenceData::createFromDiscriminatorValue)); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("riskScore", (n) -> { this.setRiskScore(n.getStringValue()); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("vendorInformation", (n) -> { this.setVendorInformation(n.getObjectValue(SecurityVendorInformation::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstSeenDateTime property value. The firstSeenDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.firstSeenDateTime;
    }
    /**
     * Gets the ipCategories property value. The ipCategories property
     * @return a ipCategory
     */
    @javax.annotation.Nullable
    public java.util.List<IpCategory> getIpCategories() {
        return this.ipCategories;
    }
    /**
     * Gets the ipReferenceData property value. The ipReferenceData property
     * @return a ipReferenceData
     */
    @javax.annotation.Nullable
    public java.util.List<IpReferenceData> getIpReferenceData() {
        return this.ipReferenceData;
    }
    /**
     * Gets the lastSeenDateTime property value. The lastSeenDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.lastSeenDateTime;
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
        writer.writeCollectionOfPrimitiveValues("activityGroupNames", this.getActivityGroupNames());
        writer.writeStringValue("address", this.getAddress());
        writer.writeStringValue("azureSubscriptionId", this.getAzureSubscriptionId());
        writer.writeStringValue("azureTenantId", this.getAzureTenantId());
        writer.writeIntegerValue("countHits", this.getCountHits());
        writer.writeIntegerValue("countHosts", this.getCountHosts());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeCollectionOfObjectValues("ipCategories", this.getIpCategories());
        writer.writeCollectionOfObjectValues("ipReferenceData", this.getIpReferenceData());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeStringValue("riskScore", this.getRiskScore());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeObjectValue("vendorInformation", this.getVendorInformation());
    }
    /**
     * Sets the activityGroupNames property value. The activityGroupNames property
     * @param value Value to set for the activityGroupNames property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setActivityGroupNames(@javax.annotation.Nullable final java.util.List<String> value) {
        this.activityGroupNames = value;
    }
    /**
     * Sets the address property value. The address property
     * @param value Value to set for the address property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAddress(@javax.annotation.Nullable final String value) {
        this.address = value;
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
     * Sets the countHits property value. The countHits property
     * @param value Value to set for the countHits property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountHits(@javax.annotation.Nullable final Integer value) {
        this.countHits = value;
    }
    /**
     * Sets the countHosts property value. The countHosts property
     * @param value Value to set for the countHosts property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCountHosts(@javax.annotation.Nullable final Integer value) {
        this.countHosts = value;
    }
    /**
     * Sets the firstSeenDateTime property value. The firstSeenDateTime property
     * @param value Value to set for the firstSeenDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFirstSeenDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.firstSeenDateTime = value;
    }
    /**
     * Sets the ipCategories property value. The ipCategories property
     * @param value Value to set for the ipCategories property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIpCategories(@javax.annotation.Nullable final java.util.List<IpCategory> value) {
        this.ipCategories = value;
    }
    /**
     * Sets the ipReferenceData property value. The ipReferenceData property
     * @param value Value to set for the ipReferenceData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIpReferenceData(@javax.annotation.Nullable final java.util.List<IpReferenceData> value) {
        this.ipReferenceData = value;
    }
    /**
     * Sets the lastSeenDateTime property value. The lastSeenDateTime property
     * @param value Value to set for the lastSeenDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setLastSeenDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.lastSeenDateTime = value;
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
     * Sets the vendorInformation property value. The vendorInformation property
     * @param value Value to set for the vendorInformation property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setVendorInformation(@javax.annotation.Nullable final SecurityVendorInformation value) {
        this.vendorInformation = value;
    }
}

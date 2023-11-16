package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class IpSecurityProfile extends Entity implements Parsable {
    /**
     * Instantiates a new IpSecurityProfile and sets the default values.
     */
    public IpSecurityProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a IpSecurityProfile
     */
    @jakarta.annotation.Nonnull
    public static IpSecurityProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new IpSecurityProfile();
    }
    /**
     * Gets the activityGroupNames property value. The activityGroupNames property
     * @return a java.util.List<String>
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getActivityGroupNames() {
        return this.BackingStore.get("activityGroupNames");
    }
    /**
     * Gets the address property value. The address property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getAddress() {
        return this.BackingStore.get("address");
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
     * Gets the countHits property value. The countHits property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCountHits() {
        return this.BackingStore.get("countHits");
    }
    /**
     * Gets the countHosts property value. The countHosts property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCountHosts() {
        return this.BackingStore.get("countHosts");
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
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
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.BackingStore.get("firstSeenDateTime");
    }
    /**
     * Gets the ipCategories property value. The ipCategories property
     * @return a java.util.List<IpCategory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IpCategory> getIpCategories() {
        return this.BackingStore.get("ipCategories");
    }
    /**
     * Gets the ipReferenceData property value. The ipReferenceData property
     * @return a java.util.List<IpReferenceData>
     */
    @jakarta.annotation.Nullable
    public java.util.List<IpReferenceData> getIpReferenceData() {
        return this.BackingStore.get("ipReferenceData");
    }
    /**
     * Gets the lastSeenDateTime property value. The lastSeenDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.BackingStore.get("lastSeenDateTime");
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
     */
    public void setActivityGroupNames(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.BackingStore.set("activityGroupNames", value);
    }
    /**
     * Sets the address property value. The address property
     * @param value Value to set for the address property.
     */
    public void setAddress(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("address", value);
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
     * Sets the countHits property value. The countHits property
     * @param value Value to set for the countHits property.
     */
    public void setCountHits(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("countHits", value);
    }
    /**
     * Sets the countHosts property value. The countHosts property
     * @param value Value to set for the countHosts property.
     */
    public void setCountHosts(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("countHosts", value);
    }
    /**
     * Sets the firstSeenDateTime property value. The firstSeenDateTime property
     * @param value Value to set for the firstSeenDateTime property.
     */
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("firstSeenDateTime", value);
    }
    /**
     * Sets the ipCategories property value. The ipCategories property
     * @param value Value to set for the ipCategories property.
     */
    public void setIpCategories(@jakarta.annotation.Nullable final java.util.List<IpCategory> value) {
        this.BackingStore.set("ipCategories", value);
    }
    /**
     * Sets the ipReferenceData property value. The ipReferenceData property
     * @param value Value to set for the ipReferenceData property.
     */
    public void setIpReferenceData(@jakarta.annotation.Nullable final java.util.List<IpReferenceData> value) {
        this.BackingStore.set("ipReferenceData", value);
    }
    /**
     * Sets the lastSeenDateTime property value. The lastSeenDateTime property
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastSeenDateTime", value);
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
     * Sets the vendorInformation property value. The vendorInformation property
     * @param value Value to set for the vendorInformation property.
     */
    public void setVendorInformation(@jakarta.annotation.Nullable final SecurityVendorInformation value) {
        this.BackingStore.set("vendorInformation", value);
    }
}

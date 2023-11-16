package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DomainSecurityProfile extends Entity implements Parsable {
    /**
     * Instantiates a new DomainSecurityProfile and sets the default values.
     */
    public DomainSecurityProfile() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a DomainSecurityProfile
     */
    @jakarta.annotation.Nonnull
    public static DomainSecurityProfile createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new DomainSecurityProfile();
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
     * Gets the countInOrg property value. The countInOrg property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getCountInOrg() {
        return this.BackingStore.get("countInOrg");
    }
    /**
     * Gets the domainCategories property value. The domainCategories property
     * @return a java.util.List<ReputationCategory>
     */
    @jakarta.annotation.Nullable
    public java.util.List<ReputationCategory> getDomainCategories() {
        return this.BackingStore.get("domainCategories");
    }
    /**
     * Gets the domainRegisteredDateTime property value. The domainRegisteredDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getDomainRegisteredDateTime() {
        return this.BackingStore.get("domainRegisteredDateTime");
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
        deserializerMap.put("countHits", (n) -> { this.setCountHits(n.getIntegerValue()); });
        deserializerMap.put("countInOrg", (n) -> { this.setCountInOrg(n.getIntegerValue()); });
        deserializerMap.put("domainCategories", (n) -> { this.setDomainCategories(n.getCollectionOfObjectValues(ReputationCategory::createFromDiscriminatorValue)); });
        deserializerMap.put("domainRegisteredDateTime", (n) -> { this.setDomainRegisteredDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("name", (n) -> { this.setName(n.getStringValue()); });
        deserializerMap.put("registrant", (n) -> { this.setRegistrant(n.getObjectValue(DomainRegistrant::createFromDiscriminatorValue)); });
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
     * Gets the lastSeenDateTime property value. The lastSeenDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.BackingStore.get("lastSeenDateTime");
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
     * Gets the registrant property value. The registrant property
     * @return a DomainRegistrant
     */
    @jakarta.annotation.Nullable
    public DomainRegistrant getRegistrant() {
        return this.BackingStore.get("registrant");
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
        writer.writeStringValue("azureSubscriptionId", this.getAzureSubscriptionId());
        writer.writeStringValue("azureTenantId", this.getAzureTenantId());
        writer.writeIntegerValue("countHits", this.getCountHits());
        writer.writeIntegerValue("countInOrg", this.getCountInOrg());
        writer.writeCollectionOfObjectValues("domainCategories", this.getDomainCategories());
        writer.writeOffsetDateTimeValue("domainRegisteredDateTime", this.getDomainRegisteredDateTime());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeStringValue("name", this.getName());
        writer.writeObjectValue("registrant", this.getRegistrant());
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
     * Sets the countInOrg property value. The countInOrg property
     * @param value Value to set for the countInOrg property.
     */
    public void setCountInOrg(@jakarta.annotation.Nullable final Integer value) {
        this.BackingStore.set("countInOrg", value);
    }
    /**
     * Sets the domainCategories property value. The domainCategories property
     * @param value Value to set for the domainCategories property.
     */
    public void setDomainCategories(@jakarta.annotation.Nullable final java.util.List<ReputationCategory> value) {
        this.BackingStore.set("domainCategories", value);
    }
    /**
     * Sets the domainRegisteredDateTime property value. The domainRegisteredDateTime property
     * @param value Value to set for the domainRegisteredDateTime property.
     */
    public void setDomainRegisteredDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("domainRegisteredDateTime", value);
    }
    /**
     * Sets the firstSeenDateTime property value. The firstSeenDateTime property
     * @param value Value to set for the firstSeenDateTime property.
     */
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("firstSeenDateTime", value);
    }
    /**
     * Sets the lastSeenDateTime property value. The lastSeenDateTime property
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.BackingStore.set("lastSeenDateTime", value);
    }
    /**
     * Sets the name property value. The name property
     * @param value Value to set for the name property.
     */
    public void setName(@jakarta.annotation.Nullable final String value) {
        this.BackingStore.set("name", value);
    }
    /**
     * Sets the registrant property value. The registrant property
     * @param value Value to set for the registrant property.
     */
    public void setRegistrant(@jakarta.annotation.Nullable final DomainRegistrant value) {
        this.BackingStore.set("registrant", value);
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

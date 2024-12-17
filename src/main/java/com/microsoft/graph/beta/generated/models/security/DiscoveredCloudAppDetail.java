package com.microsoft.graph.beta.models.security;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class DiscoveredCloudAppDetail extends Entity implements Parsable {
    /**
     * Instantiates a new {@link DiscoveredCloudAppDetail} and sets the default values.
     */
    public DiscoveredCloudAppDetail() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link DiscoveredCloudAppDetail}
     */
    @jakarta.annotation.Nonnull
    public static DiscoveredCloudAppDetail createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.security.endpointDiscoveredCloudAppDetail": return new EndpointDiscoveredCloudAppDetail();
            }
        }
        return new DiscoveredCloudAppDetail();
    }
    /**
     * Gets the appInfo property value. The application information.
     * @return a {@link DiscoveredCloudAppInfo}
     */
    @jakarta.annotation.Nullable
    public DiscoveredCloudAppInfo getAppInfo() {
        return this.backingStore.get("appInfo");
    }
    /**
     * Gets the category property value. The category property
     * @return a {@link AppCategory}
     */
    @jakarta.annotation.Nullable
    public AppCategory getCategory() {
        return this.backingStore.get("category");
    }
    /**
     * Gets the description property value. The description property
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDescription() {
        return this.backingStore.get("description");
    }
    /**
     * Gets the displayName property value. The app name.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * Gets the domains property value. The domain.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getDomains() {
        return this.backingStore.get("domains");
    }
    /**
     * Gets the downloadNetworkTrafficInBytes property value. The download traffic size.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getDownloadNetworkTrafficInBytes() {
        return this.backingStore.get("downloadNetworkTrafficInBytes");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("appInfo", (n) -> { this.setAppInfo(n.getObjectValue(DiscoveredCloudAppInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("category", (n) -> { this.setCategory(n.getEnumValue(AppCategory::forValue)); });
        deserializerMap.put("description", (n) -> { this.setDescription(n.getStringValue()); });
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("domains", (n) -> { this.setDomains(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("downloadNetworkTrafficInBytes", (n) -> { this.setDownloadNetworkTrafficInBytes(n.getLongValue()); });
        deserializerMap.put("firstSeenDateTime", (n) -> { this.setFirstSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("ipAddressCount", (n) -> { this.setIpAddressCount(n.getLongValue()); });
        deserializerMap.put("ipAddresses", (n) -> { this.setIpAddresses(n.getCollectionOfObjectValues(DiscoveredCloudAppIPAddress::createFromDiscriminatorValue)); });
        deserializerMap.put("lastSeenDateTime", (n) -> { this.setLastSeenDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("riskScore", (n) -> { this.setRiskScore(n.getLongValue()); });
        deserializerMap.put("tags", (n) -> { this.setTags(n.getCollectionOfPrimitiveValues(String.class)); });
        deserializerMap.put("transactionCount", (n) -> { this.setTransactionCount(n.getLongValue()); });
        deserializerMap.put("uploadNetworkTrafficInBytes", (n) -> { this.setUploadNetworkTrafficInBytes(n.getLongValue()); });
        deserializerMap.put("userCount", (n) -> { this.setUserCount(n.getLongValue()); });
        deserializerMap.put("users", (n) -> { this.setUsers(n.getCollectionOfObjectValues(DiscoveredCloudAppUser::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the firstSeenDateTime property value. The firstSeenDateTime property
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getFirstSeenDateTime() {
        return this.backingStore.get("firstSeenDateTime");
    }
    /**
     * Gets the ipAddressCount property value. The IP address.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getIpAddressCount() {
        return this.backingStore.get("ipAddressCount");
    }
    /**
     * Gets the ipAddresses property value. The list of IP addresses accessed by the app.
     * @return a {@link java.util.List<DiscoveredCloudAppIPAddress>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DiscoveredCloudAppIPAddress> getIpAddresses() {
        return this.backingStore.get("ipAddresses");
    }
    /**
     * Gets the lastSeenDateTime property value. The last seen date of the discovered app. The Timestamp represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @return a {@link OffsetDateTime}
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastSeenDateTime() {
        return this.backingStore.get("lastSeenDateTime");
    }
    /**
     * Gets the riskScore property value. The risk score of the app.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getRiskScore() {
        return this.backingStore.get("riskScore");
    }
    /**
     * Gets the tags property value. The tags applied to an app. Possible values include Unsanctioned, Sanctioned, Monitored, or a custom value.
     * @return a {@link java.util.List<String>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<String> getTags() {
        return this.backingStore.get("tags");
    }
    /**
     * Gets the transactionCount property value. The app transaction count.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getTransactionCount() {
        return this.backingStore.get("transactionCount");
    }
    /**
     * Gets the uploadNetworkTrafficInBytes property value. The app upload traffic size, in bytes.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getUploadNetworkTrafficInBytes() {
        return this.backingStore.get("uploadNetworkTrafficInBytes");
    }
    /**
     * Gets the userCount property value. The count of users who use the app.
     * @return a {@link Long}
     */
    @jakarta.annotation.Nullable
    public Long getUserCount() {
        return this.backingStore.get("userCount");
    }
    /**
     * Gets the users property value. The list of users who access the app.
     * @return a {@link java.util.List<DiscoveredCloudAppUser>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DiscoveredCloudAppUser> getUsers() {
        return this.backingStore.get("users");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeObjectValue("appInfo", this.getAppInfo());
        writer.writeEnumValue("category", this.getCategory());
        writer.writeStringValue("description", this.getDescription());
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeCollectionOfPrimitiveValues("domains", this.getDomains());
        writer.writeLongValue("downloadNetworkTrafficInBytes", this.getDownloadNetworkTrafficInBytes());
        writer.writeOffsetDateTimeValue("firstSeenDateTime", this.getFirstSeenDateTime());
        writer.writeLongValue("ipAddressCount", this.getIpAddressCount());
        writer.writeCollectionOfObjectValues("ipAddresses", this.getIpAddresses());
        writer.writeOffsetDateTimeValue("lastSeenDateTime", this.getLastSeenDateTime());
        writer.writeLongValue("riskScore", this.getRiskScore());
        writer.writeCollectionOfPrimitiveValues("tags", this.getTags());
        writer.writeLongValue("transactionCount", this.getTransactionCount());
        writer.writeLongValue("uploadNetworkTrafficInBytes", this.getUploadNetworkTrafficInBytes());
        writer.writeLongValue("userCount", this.getUserCount());
        writer.writeCollectionOfObjectValues("users", this.getUsers());
    }
    /**
     * Sets the appInfo property value. The application information.
     * @param value Value to set for the appInfo property.
     */
    public void setAppInfo(@jakarta.annotation.Nullable final DiscoveredCloudAppInfo value) {
        this.backingStore.set("appInfo", value);
    }
    /**
     * Sets the category property value. The category property
     * @param value Value to set for the category property.
     */
    public void setCategory(@jakarta.annotation.Nullable final AppCategory value) {
        this.backingStore.set("category", value);
    }
    /**
     * Sets the description property value. The description property
     * @param value Value to set for the description property.
     */
    public void setDescription(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("description", value);
    }
    /**
     * Sets the displayName property value. The app name.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the domains property value. The domain.
     * @param value Value to set for the domains property.
     */
    public void setDomains(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("domains", value);
    }
    /**
     * Sets the downloadNetworkTrafficInBytes property value. The download traffic size.
     * @param value Value to set for the downloadNetworkTrafficInBytes property.
     */
    public void setDownloadNetworkTrafficInBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("downloadNetworkTrafficInBytes", value);
    }
    /**
     * Sets the firstSeenDateTime property value. The firstSeenDateTime property
     * @param value Value to set for the firstSeenDateTime property.
     */
    public void setFirstSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("firstSeenDateTime", value);
    }
    /**
     * Sets the ipAddressCount property value. The IP address.
     * @param value Value to set for the ipAddressCount property.
     */
    public void setIpAddressCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("ipAddressCount", value);
    }
    /**
     * Sets the ipAddresses property value. The list of IP addresses accessed by the app.
     * @param value Value to set for the ipAddresses property.
     */
    public void setIpAddresses(@jakarta.annotation.Nullable final java.util.List<DiscoveredCloudAppIPAddress> value) {
        this.backingStore.set("ipAddresses", value);
    }
    /**
     * Sets the lastSeenDateTime property value. The last seen date of the discovered app. The Timestamp represents date and time information using ISO 8601 format and is always in UTC. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     * @param value Value to set for the lastSeenDateTime property.
     */
    public void setLastSeenDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.backingStore.set("lastSeenDateTime", value);
    }
    /**
     * Sets the riskScore property value. The risk score of the app.
     * @param value Value to set for the riskScore property.
     */
    public void setRiskScore(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("riskScore", value);
    }
    /**
     * Sets the tags property value. The tags applied to an app. Possible values include Unsanctioned, Sanctioned, Monitored, or a custom value.
     * @param value Value to set for the tags property.
     */
    public void setTags(@jakarta.annotation.Nullable final java.util.List<String> value) {
        this.backingStore.set("tags", value);
    }
    /**
     * Sets the transactionCount property value. The app transaction count.
     * @param value Value to set for the transactionCount property.
     */
    public void setTransactionCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("transactionCount", value);
    }
    /**
     * Sets the uploadNetworkTrafficInBytes property value. The app upload traffic size, in bytes.
     * @param value Value to set for the uploadNetworkTrafficInBytes property.
     */
    public void setUploadNetworkTrafficInBytes(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("uploadNetworkTrafficInBytes", value);
    }
    /**
     * Sets the userCount property value. The count of users who use the app.
     * @param value Value to set for the userCount property.
     */
    public void setUserCount(@jakarta.annotation.Nullable final Long value) {
        this.backingStore.set("userCount", value);
    }
    /**
     * Sets the users property value. The list of users who access the app.
     * @param value Value to set for the users property.
     */
    public void setUsers(@jakarta.annotation.Nullable final java.util.List<DiscoveredCloudAppUser> value) {
        this.backingStore.set("users", value);
    }
}

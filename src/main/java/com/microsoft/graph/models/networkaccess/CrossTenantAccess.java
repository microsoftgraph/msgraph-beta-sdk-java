package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CrossTenantAccess implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The deviceCount property
     */
    private Long deviceCount;
    /**
     * The lastAccessDateTime property
     */
    private OffsetDateTime lastAccessDateTime;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The resourceTenantId property
     */
    private String resourceTenantId;
    /**
     * The resourceTenantName property
     */
    private String resourceTenantName;
    /**
     * The resourceTenantPrimaryDomain property
     */
    private String resourceTenantPrimaryDomain;
    /**
     * The usageStatus property
     */
    private UsageStatus usageStatus;
    /**
     * The userCount property
     */
    private Long userCount;
    /**
     * Instantiates a new CrossTenantAccess and sets the default values.
     */
    public CrossTenantAccess() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CrossTenantAccess
     */
    @jakarta.annotation.Nonnull
    public static CrossTenantAccess createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantAccess();
    }
    /**
     * Gets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the deviceCount property value. The deviceCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getDeviceCount() {
        return this.deviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(8);
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getLongValue()); });
        deserializerMap.put("lastAccessDateTime", (n) -> { this.setLastAccessDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("resourceTenantId", (n) -> { this.setResourceTenantId(n.getStringValue()); });
        deserializerMap.put("resourceTenantName", (n) -> { this.setResourceTenantName(n.getStringValue()); });
        deserializerMap.put("resourceTenantPrimaryDomain", (n) -> { this.setResourceTenantPrimaryDomain(n.getStringValue()); });
        deserializerMap.put("usageStatus", (n) -> { this.setUsageStatus(n.getEnumValue(UsageStatus.class)); });
        deserializerMap.put("userCount", (n) -> { this.setUserCount(n.getLongValue()); });
        return deserializerMap;
    }
    /**
     * Gets the lastAccessDateTime property value. The lastAccessDateTime property
     * @return a OffsetDateTime
     */
    @jakarta.annotation.Nullable
    public OffsetDateTime getLastAccessDateTime() {
        return this.lastAccessDateTime;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the resourceTenantId property value. The resourceTenantId property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceTenantId() {
        return this.resourceTenantId;
    }
    /**
     * Gets the resourceTenantName property value. The resourceTenantName property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceTenantName() {
        return this.resourceTenantName;
    }
    /**
     * Gets the resourceTenantPrimaryDomain property value. The resourceTenantPrimaryDomain property
     * @return a String
     */
    @jakarta.annotation.Nullable
    public String getResourceTenantPrimaryDomain() {
        return this.resourceTenantPrimaryDomain;
    }
    /**
     * Gets the usageStatus property value. The usageStatus property
     * @return a UsageStatus
     */
    @jakarta.annotation.Nullable
    public UsageStatus getUsageStatus() {
        return this.usageStatus;
    }
    /**
     * Gets the userCount property value. The userCount property
     * @return a Long
     */
    @jakarta.annotation.Nullable
    public Long getUserCount() {
        return this.userCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeLongValue("deviceCount", this.getDeviceCount());
        writer.writeOffsetDateTimeValue("lastAccessDateTime", this.getLastAccessDateTime());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeStringValue("resourceTenantId", this.getResourceTenantId());
        writer.writeStringValue("resourceTenantName", this.getResourceTenantName());
        writer.writeStringValue("resourceTenantPrimaryDomain", this.getResourceTenantPrimaryDomain());
        writer.writeEnumValue("usageStatus", this.getUsageStatus());
        writer.writeLongValue("userCount", this.getUserCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the AdditionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     */
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the deviceCount property value. The deviceCount property
     * @param value Value to set for the deviceCount property.
     */
    public void setDeviceCount(@jakarta.annotation.Nullable final Long value) {
        this.deviceCount = value;
    }
    /**
     * Sets the lastAccessDateTime property value. The lastAccessDateTime property
     * @param value Value to set for the lastAccessDateTime property.
     */
    public void setLastAccessDateTime(@jakarta.annotation.Nullable final OffsetDateTime value) {
        this.lastAccessDateTime = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the resourceTenantId property value. The resourceTenantId property
     * @param value Value to set for the resourceTenantId property.
     */
    public void setResourceTenantId(@jakarta.annotation.Nullable final String value) {
        this.resourceTenantId = value;
    }
    /**
     * Sets the resourceTenantName property value. The resourceTenantName property
     * @param value Value to set for the resourceTenantName property.
     */
    public void setResourceTenantName(@jakarta.annotation.Nullable final String value) {
        this.resourceTenantName = value;
    }
    /**
     * Sets the resourceTenantPrimaryDomain property value. The resourceTenantPrimaryDomain property
     * @param value Value to set for the resourceTenantPrimaryDomain property.
     */
    public void setResourceTenantPrimaryDomain(@jakarta.annotation.Nullable final String value) {
        this.resourceTenantPrimaryDomain = value;
    }
    /**
     * Sets the usageStatus property value. The usageStatus property
     * @param value Value to set for the usageStatus property.
     */
    public void setUsageStatus(@jakarta.annotation.Nullable final UsageStatus value) {
        this.usageStatus = value;
    }
    /**
     * Sets the userCount property value. The userCount property
     * @param value Value to set for the userCount property.
     */
    public void setUserCount(@jakarta.annotation.Nullable final Long value) {
        this.userCount = value;
    }
}

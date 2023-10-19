package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CrossTenantSummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * Total numbers of authentication sessions in the time frame between startDateTime and endDateTime.
     */
    private Integer authTransactionCount;
    /**
     * Count of unique devices that performed cross-tenant access, in the time frame between startDateTime and endDateTime.
     */
    private Integer deviceCount;
    /**
     * Count of unique tenants that were accessed in the time frame between endDateTime to discoveryPivotDateTime, but haven't been accessed in the time frame between discoveryPivotDateTime to startDateTime.
     */
    private Integer newTenantCount;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The rarelyUsedTenantCount property
     */
    private Integer rarelyUsedTenantCount;
    /**
     * Count of unique tenants that were accessed, that are different from the device's home tenant, in the time frame between startDateTime and endDateTime.
     */
    private Integer tenantCount;
    /**
     * Count of unique users that performed cross-tenant access, in the time frame between startDateTime and endDateTime.
     */
    private Integer userCount;
    /**
     * Instantiates a new CrossTenantSummary and sets the default values.
     */
    public CrossTenantSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CrossTenantSummary
     */
    @jakarta.annotation.Nonnull
    public static CrossTenantSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantSummary();
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
     * Gets the authTransactionCount property value. Total numbers of authentication sessions in the time frame between startDateTime and endDateTime.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getAuthTransactionCount() {
        return this.authTransactionCount;
    }
    /**
     * Gets the deviceCount property value. Count of unique devices that performed cross-tenant access, in the time frame between startDateTime and endDateTime.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getDeviceCount() {
        return this.deviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("authTransactionCount", (n) -> { this.setAuthTransactionCount(n.getIntegerValue()); });
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("newTenantCount", (n) -> { this.setNewTenantCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("rarelyUsedTenantCount", (n) -> { this.setRarelyUsedTenantCount(n.getIntegerValue()); });
        deserializerMap.put("tenantCount", (n) -> { this.setTenantCount(n.getIntegerValue()); });
        deserializerMap.put("userCount", (n) -> { this.setUserCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the newTenantCount property value. Count of unique tenants that were accessed in the time frame between endDateTime to discoveryPivotDateTime, but haven't been accessed in the time frame between discoveryPivotDateTime to startDateTime.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getNewTenantCount() {
        return this.newTenantCount;
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
     * Gets the rarelyUsedTenantCount property value. The rarelyUsedTenantCount property
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getRarelyUsedTenantCount() {
        return this.rarelyUsedTenantCount;
    }
    /**
     * Gets the tenantCount property value. Count of unique tenants that were accessed, that are different from the device's home tenant, in the time frame between startDateTime and endDateTime.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getTenantCount() {
        return this.tenantCount;
    }
    /**
     * Gets the userCount property value. Count of unique users that performed cross-tenant access, in the time frame between startDateTime and endDateTime.
     * @return a Integer
     */
    @jakarta.annotation.Nullable
    public Integer getUserCount() {
        return this.userCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("authTransactionCount", this.getAuthTransactionCount());
        writer.writeIntegerValue("deviceCount", this.getDeviceCount());
        writer.writeIntegerValue("newTenantCount", this.getNewTenantCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("rarelyUsedTenantCount", this.getRarelyUsedTenantCount());
        writer.writeIntegerValue("tenantCount", this.getTenantCount());
        writer.writeIntegerValue("userCount", this.getUserCount());
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
     * Sets the authTransactionCount property value. Total numbers of authentication sessions in the time frame between startDateTime and endDateTime.
     * @param value Value to set for the authTransactionCount property.
     */
    public void setAuthTransactionCount(@jakarta.annotation.Nullable final Integer value) {
        this.authTransactionCount = value;
    }
    /**
     * Sets the deviceCount property value. Count of unique devices that performed cross-tenant access, in the time frame between startDateTime and endDateTime.
     * @param value Value to set for the deviceCount property.
     */
    public void setDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.deviceCount = value;
    }
    /**
     * Sets the newTenantCount property value. Count of unique tenants that were accessed in the time frame between endDateTime to discoveryPivotDateTime, but haven't been accessed in the time frame between discoveryPivotDateTime to startDateTime.
     * @param value Value to set for the newTenantCount property.
     */
    public void setNewTenantCount(@jakarta.annotation.Nullable final Integer value) {
        this.newTenantCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     */
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the rarelyUsedTenantCount property value. The rarelyUsedTenantCount property
     * @param value Value to set for the rarelyUsedTenantCount property.
     */
    public void setRarelyUsedTenantCount(@jakarta.annotation.Nullable final Integer value) {
        this.rarelyUsedTenantCount = value;
    }
    /**
     * Sets the tenantCount property value. Count of unique tenants that were accessed, that are different from the device's home tenant, in the time frame between startDateTime and endDateTime.
     * @param value Value to set for the tenantCount property.
     */
    public void setTenantCount(@jakarta.annotation.Nullable final Integer value) {
        this.tenantCount = value;
    }
    /**
     * Sets the userCount property value. Count of unique users that performed cross-tenant access, in the time frame between startDateTime and endDateTime.
     * @param value Value to set for the userCount property.
     */
    public void setUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.userCount = value;
    }
}

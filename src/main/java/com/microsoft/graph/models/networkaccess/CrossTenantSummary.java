package com.microsoft.graph.models.networkaccess;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
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
     * Count of unique tenants that were accessed, that are different from the device's home tenant, in the time frame between startDateTime and endDateTime.
     */
    private Integer tenantCount;
    /**
     * Count of unique users that performed cross-tenant access, in the time frame between startDateTime and endDateTime.
     */
    private Integer userCount;
    /**
     * Instantiates a new crossTenantSummary and sets the default values.
     * @return a void
     */
    @jakarta.annotation.Nullable
    public CrossTenantSummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a crossTenantSummary
     */
    @jakarta.annotation.Nonnull
    public static CrossTenantSummary createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CrossTenantSummary();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @jakarta.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the authTransactionCount property value. Total numbers of authentication sessions in the time frame between startDateTime and endDateTime.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getAuthTransactionCount() {
        return this.authTransactionCount;
    }
    /**
     * Gets the deviceCount property value. Count of unique devices that performed cross-tenant access, in the time frame between startDateTime and endDateTime.
     * @return a integer
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
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(6);
        deserializerMap.put("authTransactionCount", (n) -> { this.setAuthTransactionCount(n.getIntegerValue()); });
        deserializerMap.put("deviceCount", (n) -> { this.setDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("newTenantCount", (n) -> { this.setNewTenantCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("tenantCount", (n) -> { this.setTenantCount(n.getIntegerValue()); });
        deserializerMap.put("userCount", (n) -> { this.setUserCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the newTenantCount property value. Count of unique tenants that were accessed in the time frame between endDateTime to discoveryPivotDateTime, but haven't been accessed in the time frame between discoveryPivotDateTime to startDateTime.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getNewTenantCount() {
        return this.newTenantCount;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the tenantCount property value. Count of unique tenants that were accessed, that are different from the device's home tenant, in the time frame between startDateTime and endDateTime.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getTenantCount() {
        return this.tenantCount;
    }
    /**
     * Gets the userCount property value. Count of unique users that performed cross-tenant access, in the time frame between startDateTime and endDateTime.
     * @return a integer
     */
    @jakarta.annotation.Nullable
    public Integer getUserCount() {
        return this.userCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("authTransactionCount", this.getAuthTransactionCount());
        writer.writeIntegerValue("deviceCount", this.getDeviceCount());
        writer.writeIntegerValue("newTenantCount", this.getNewTenantCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("tenantCount", this.getTenantCount());
        writer.writeIntegerValue("userCount", this.getUserCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAdditionalData(@jakarta.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the authTransactionCount property value. Total numbers of authentication sessions in the time frame between startDateTime and endDateTime.
     * @param value Value to set for the authTransactionCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setAuthTransactionCount(@jakarta.annotation.Nullable final Integer value) {
        this.authTransactionCount = value;
    }
    /**
     * Sets the deviceCount property value. Count of unique devices that performed cross-tenant access, in the time frame between startDateTime and endDateTime.
     * @param value Value to set for the deviceCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setDeviceCount(@jakarta.annotation.Nullable final Integer value) {
        this.deviceCount = value;
    }
    /**
     * Sets the newTenantCount property value. Count of unique tenants that were accessed in the time frame between endDateTime to discoveryPivotDateTime, but haven't been accessed in the time frame between discoveryPivotDateTime to startDateTime.
     * @param value Value to set for the newTenantCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setNewTenantCount(@jakarta.annotation.Nullable final Integer value) {
        this.newTenantCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setOdataType(@jakarta.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the tenantCount property value. Count of unique tenants that were accessed, that are different from the device's home tenant, in the time frame between startDateTime and endDateTime.
     * @param value Value to set for the tenantCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setTenantCount(@jakarta.annotation.Nullable final Integer value) {
        this.tenantCount = value;
    }
    /**
     * Sets the userCount property value. Count of unique users that performed cross-tenant access, in the time frame between startDateTime and endDateTime.
     * @param value Value to set for the userCount property.
     * @return a void
     */
    @jakarta.annotation.Nonnull
    public void setUserCount(@jakarta.annotation.Nullable final Integer value) {
        this.userCount = value;
    }
}

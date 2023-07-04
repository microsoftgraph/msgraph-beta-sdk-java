package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CompanySubscription extends Entity implements Parsable {
    /**
     * The createdDateTime property
     */
    private OffsetDateTime createdDateTime;
    /**
     * The isTrial property
     */
    private Boolean isTrial;
    /**
     * The nextLifecycleDateTime property
     */
    private OffsetDateTime nextLifecycleDateTime;
    /**
     * The ocpSubscriptionId property
     */
    private String ocpSubscriptionId;
    /**
     * The serviceStatus property
     */
    private java.util.List<ServicePlanInfo> serviceStatus;
    /**
     * The skuId property
     */
    private String skuId;
    /**
     * The skuPartNumber property
     */
    private String skuPartNumber;
    /**
     * The status property
     */
    private String status;
    /**
     * The totalLicenses property
     */
    private Integer totalLicenses;
    /**
     * Instantiates a new companySubscription and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CompanySubscription() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a companySubscription
     */
    @javax.annotation.Nonnull
    public static CompanySubscription createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CompanySubscription();
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
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("createdDateTime", (n) -> { this.setCreatedDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("isTrial", (n) -> { this.setIsTrial(n.getBooleanValue()); });
        deserializerMap.put("nextLifecycleDateTime", (n) -> { this.setNextLifecycleDateTime(n.getOffsetDateTimeValue()); });
        deserializerMap.put("ocpSubscriptionId", (n) -> { this.setOcpSubscriptionId(n.getStringValue()); });
        deserializerMap.put("serviceStatus", (n) -> { this.setServiceStatus(n.getCollectionOfObjectValues(ServicePlanInfo::createFromDiscriminatorValue)); });
        deserializerMap.put("skuId", (n) -> { this.setSkuId(n.getStringValue()); });
        deserializerMap.put("skuPartNumber", (n) -> { this.setSkuPartNumber(n.getStringValue()); });
        deserializerMap.put("status", (n) -> { this.setStatus(n.getStringValue()); });
        deserializerMap.put("totalLicenses", (n) -> { this.setTotalLicenses(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the isTrial property value. The isTrial property
     * @return a boolean
     */
    @javax.annotation.Nullable
    public Boolean getIsTrial() {
        return this.isTrial;
    }
    /**
     * Gets the nextLifecycleDateTime property value. The nextLifecycleDateTime property
     * @return a OffsetDateTime
     */
    @javax.annotation.Nullable
    public OffsetDateTime getNextLifecycleDateTime() {
        return this.nextLifecycleDateTime;
    }
    /**
     * Gets the ocpSubscriptionId property value. The ocpSubscriptionId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOcpSubscriptionId() {
        return this.ocpSubscriptionId;
    }
    /**
     * Gets the serviceStatus property value. The serviceStatus property
     * @return a ServicePlanInfo
     */
    @javax.annotation.Nullable
    public java.util.List<ServicePlanInfo> getServiceStatus() {
        return this.serviceStatus;
    }
    /**
     * Gets the skuId property value. The skuId property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSkuId() {
        return this.skuId;
    }
    /**
     * Gets the skuPartNumber property value. The skuPartNumber property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getSkuPartNumber() {
        return this.skuPartNumber;
    }
    /**
     * Gets the status property value. The status property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getStatus() {
        return this.status;
    }
    /**
     * Gets the totalLicenses property value. The totalLicenses property
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTotalLicenses() {
        return this.totalLicenses;
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
        writer.writeOffsetDateTimeValue("createdDateTime", this.getCreatedDateTime());
        writer.writeBooleanValue("isTrial", this.getIsTrial());
        writer.writeOffsetDateTimeValue("nextLifecycleDateTime", this.getNextLifecycleDateTime());
        writer.writeStringValue("ocpSubscriptionId", this.getOcpSubscriptionId());
        writer.writeCollectionOfObjectValues("serviceStatus", this.getServiceStatus());
        writer.writeStringValue("skuId", this.getSkuId());
        writer.writeStringValue("skuPartNumber", this.getSkuPartNumber());
        writer.writeStringValue("status", this.getStatus());
        writer.writeIntegerValue("totalLicenses", this.getTotalLicenses());
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
     * Sets the isTrial property value. The isTrial property
     * @param value Value to set for the isTrial property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setIsTrial(@javax.annotation.Nullable final Boolean value) {
        this.isTrial = value;
    }
    /**
     * Sets the nextLifecycleDateTime property value. The nextLifecycleDateTime property
     * @param value Value to set for the nextLifecycleDateTime property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNextLifecycleDateTime(@javax.annotation.Nullable final OffsetDateTime value) {
        this.nextLifecycleDateTime = value;
    }
    /**
     * Sets the ocpSubscriptionId property value. The ocpSubscriptionId property
     * @param value Value to set for the ocpSubscriptionId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOcpSubscriptionId(@javax.annotation.Nullable final String value) {
        this.ocpSubscriptionId = value;
    }
    /**
     * Sets the serviceStatus property value. The serviceStatus property
     * @param value Value to set for the serviceStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setServiceStatus(@javax.annotation.Nullable final java.util.List<ServicePlanInfo> value) {
        this.serviceStatus = value;
    }
    /**
     * Sets the skuId property value. The skuId property
     * @param value Value to set for the skuId property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkuId(@javax.annotation.Nullable final String value) {
        this.skuId = value;
    }
    /**
     * Sets the skuPartNumber property value. The skuPartNumber property
     * @param value Value to set for the skuPartNumber property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSkuPartNumber(@javax.annotation.Nullable final String value) {
        this.skuPartNumber = value;
    }
    /**
     * Sets the status property value. The status property
     * @param value Value to set for the status property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setStatus(@javax.annotation.Nullable final String value) {
        this.status = value;
    }
    /**
     * Sets the totalLicenses property value. The totalLicenses property
     * @param value Value to set for the totalLicenses property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTotalLicenses(@javax.annotation.Nullable final Integer value) {
        this.totalLicenses = value;
    }
}

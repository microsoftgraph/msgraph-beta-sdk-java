package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * The Copilot Cost Management usage reporting root.
 */
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CostManagementUsageReportRoot extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CostManagementUsageReportRoot} and sets the default values.
     */
    public CostManagementUsageReportRoot() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CostManagementUsageReportRoot}
     */
    @jakarta.annotation.Nonnull
    public static CostManagementUsageReportRoot createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CostManagementUsageReportRoot();
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("fundingUsageRecords", (n) -> { this.setFundingUsageRecords(n.getCollectionOfObjectValues(CostManagementFundingUsageRecord::createFromDiscriminatorValue)); });
        deserializerMap.put("groupUsageRecords", (n) -> { this.setGroupUsageRecords(n.getCollectionOfObjectValues(CostManagementGroupUsageRecord::createFromDiscriminatorValue)); });
        deserializerMap.put("serviceUsageRecords", (n) -> { this.setServiceUsageRecords(n.getCollectionOfObjectValues(CostManagementServiceUsageRecord::createFromDiscriminatorValue)); });
        deserializerMap.put("userUsageDetails", (n) -> { this.setUserUsageDetails(n.getCollectionOfObjectValues(CostManagementUserUsageDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("userUsageRecords", (n) -> { this.setUserUsageRecords(n.getCollectionOfObjectValues(CostManagementUserUsageRecord::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the fundingUsageRecords property value. Reported consumption per funding class for a calendar month.
     * @return a {@link java.util.List<CostManagementFundingUsageRecord>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CostManagementFundingUsageRecord> getFundingUsageRecords() {
        return this.backingStore.get("fundingUsageRecords");
    }
    /**
     * Gets the groupUsageRecords property value. Reported consumption per security group for one completed UTC day.
     * @return a {@link java.util.List<CostManagementGroupUsageRecord>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CostManagementGroupUsageRecord> getGroupUsageRecords() {
        return this.backingStore.get("groupUsageRecords");
    }
    /**
     * Gets the serviceUsageRecords property value. Reported consumption per governed service for one completed UTC day.
     * @return a {@link java.util.List<CostManagementServiceUsageRecord>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CostManagementServiceUsageRecord> getServiceUsageRecords() {
        return this.backingStore.get("serviceUsageRecords");
    }
    /**
     * Gets the userUsageDetails property value. Raw per-user usage detail, read one user at a time.
     * @return a {@link java.util.List<CostManagementUserUsageDetail>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CostManagementUserUsageDetail> getUserUsageDetails() {
        return this.backingStore.get("userUsageDetails");
    }
    /**
     * Gets the userUsageRecords property value. Reported consumption per user for one completed UTC day, ranked by consumption.
     * @return a {@link java.util.List<CostManagementUserUsageRecord>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<CostManagementUserUsageRecord> getUserUsageRecords() {
        return this.backingStore.get("userUsageRecords");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("fundingUsageRecords", this.getFundingUsageRecords());
        writer.writeCollectionOfObjectValues("groupUsageRecords", this.getGroupUsageRecords());
        writer.writeCollectionOfObjectValues("serviceUsageRecords", this.getServiceUsageRecords());
        writer.writeCollectionOfObjectValues("userUsageDetails", this.getUserUsageDetails());
        writer.writeCollectionOfObjectValues("userUsageRecords", this.getUserUsageRecords());
    }
    /**
     * Sets the fundingUsageRecords property value. Reported consumption per funding class for a calendar month.
     * @param value Value to set for the fundingUsageRecords property.
     */
    public void setFundingUsageRecords(@jakarta.annotation.Nullable final java.util.List<CostManagementFundingUsageRecord> value) {
        this.backingStore.set("fundingUsageRecords", value);
    }
    /**
     * Sets the groupUsageRecords property value. Reported consumption per security group for one completed UTC day.
     * @param value Value to set for the groupUsageRecords property.
     */
    public void setGroupUsageRecords(@jakarta.annotation.Nullable final java.util.List<CostManagementGroupUsageRecord> value) {
        this.backingStore.set("groupUsageRecords", value);
    }
    /**
     * Sets the serviceUsageRecords property value. Reported consumption per governed service for one completed UTC day.
     * @param value Value to set for the serviceUsageRecords property.
     */
    public void setServiceUsageRecords(@jakarta.annotation.Nullable final java.util.List<CostManagementServiceUsageRecord> value) {
        this.backingStore.set("serviceUsageRecords", value);
    }
    /**
     * Sets the userUsageDetails property value. Raw per-user usage detail, read one user at a time.
     * @param value Value to set for the userUsageDetails property.
     */
    public void setUserUsageDetails(@jakarta.annotation.Nullable final java.util.List<CostManagementUserUsageDetail> value) {
        this.backingStore.set("userUsageDetails", value);
    }
    /**
     * Sets the userUsageRecords property value. Reported consumption per user for one completed UTC day, ranked by consumption.
     * @param value Value to set for the userUsageRecords property.
     */
    public void setUserUsageRecords(@jakarta.annotation.Nullable final java.util.List<CostManagementUserUsageRecord> value) {
        this.backingStore.set("userUsageRecords", value);
    }
}

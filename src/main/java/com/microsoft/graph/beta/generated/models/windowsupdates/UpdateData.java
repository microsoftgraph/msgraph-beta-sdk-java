package com.microsoft.graph.beta.models.windowsupdates;

import com.microsoft.graph.beta.models.Entity;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class UpdateData extends Entity implements Parsable {
    /**
     * Instantiates a new {@link UpdateData} and sets the default values.
     */
    public UpdateData() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link UpdateData}
     */
    @jakarta.annotation.Nonnull
    public static UpdateData createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new UpdateData();
    }
    /**
     * Gets the applicableCatalogSummaries property value. Catalog applicability aggregated across Autopatch policies. Read-only.
     * @return a {@link java.util.List<ApplicableCatalogSummary>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<ApplicableCatalogSummary> getApplicableCatalogSummaries() {
        return this.backingStore.get("applicableCatalogSummaries");
    }
    /**
     * Gets the deviceProfiles property value. Device profile and Windows servicing information. Read-only.
     * @return a {@link java.util.List<DeviceProfile>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DeviceProfile> getDeviceProfiles() {
        return this.backingStore.get("deviceProfiles");
    }
    /**
     * Gets the drivers property value. Driver updates available in the tenant and their per-device rollout status. Read-only.
     * @return a {@link java.util.List<DriverUpdateReport>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<DriverUpdateReport> getDrivers() {
        return this.backingStore.get("drivers");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("applicableCatalogSummaries", (n) -> { this.setApplicableCatalogSummaries(n.getCollectionOfObjectValues(ApplicableCatalogSummary::createFromDiscriminatorValue)); });
        deserializerMap.put("deviceProfiles", (n) -> { this.setDeviceProfiles(n.getCollectionOfObjectValues(DeviceProfile::createFromDiscriminatorValue)); });
        deserializerMap.put("drivers", (n) -> { this.setDrivers(n.getCollectionOfObjectValues(DriverUpdateReport::createFromDiscriminatorValue)); });
        deserializerMap.put("policyAssignments", (n) -> { this.setPolicyAssignments(n.getCollectionOfObjectValues(PolicyAssignment::createFromDiscriminatorValue)); });
        return deserializerMap;
    }
    /**
     * Gets the policyAssignments property value. Assignments that associate Autopatch policies with devices. Read-only.
     * @return a {@link java.util.List<PolicyAssignment>}
     */
    @jakarta.annotation.Nullable
    public java.util.List<PolicyAssignment> getPolicyAssignments() {
        return this.backingStore.get("policyAssignments");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("applicableCatalogSummaries", this.getApplicableCatalogSummaries());
        writer.writeCollectionOfObjectValues("deviceProfiles", this.getDeviceProfiles());
        writer.writeCollectionOfObjectValues("drivers", this.getDrivers());
        writer.writeCollectionOfObjectValues("policyAssignments", this.getPolicyAssignments());
    }
    /**
     * Sets the applicableCatalogSummaries property value. Catalog applicability aggregated across Autopatch policies. Read-only.
     * @param value Value to set for the applicableCatalogSummaries property.
     */
    public void setApplicableCatalogSummaries(@jakarta.annotation.Nullable final java.util.List<ApplicableCatalogSummary> value) {
        this.backingStore.set("applicableCatalogSummaries", value);
    }
    /**
     * Sets the deviceProfiles property value. Device profile and Windows servicing information. Read-only.
     * @param value Value to set for the deviceProfiles property.
     */
    public void setDeviceProfiles(@jakarta.annotation.Nullable final java.util.List<DeviceProfile> value) {
        this.backingStore.set("deviceProfiles", value);
    }
    /**
     * Sets the drivers property value. Driver updates available in the tenant and their per-device rollout status. Read-only.
     * @param value Value to set for the drivers property.
     */
    public void setDrivers(@jakarta.annotation.Nullable final java.util.List<DriverUpdateReport> value) {
        this.backingStore.set("drivers", value);
    }
    /**
     * Sets the policyAssignments property value. Assignments that associate Autopatch policies with devices. Read-only.
     * @param value Value to set for the policyAssignments property.
     */
    public void setPolicyAssignments(@jakarta.annotation.Nullable final java.util.List<PolicyAssignment> value) {
        this.backingStore.set("policyAssignments", value);
    }
}

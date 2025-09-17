package com.microsoft.graph.beta.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
@jakarta.annotation.Generated("com.microsoft.kiota")
public class CloudPcSupportedRegion extends Entity implements Parsable {
    /**
     * Instantiates a new {@link CloudPcSupportedRegion} and sets the default values.
     */
    public CloudPcSupportedRegion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a {@link CloudPcSupportedRegion}
     */
    @jakarta.annotation.Nonnull
    public static CloudPcSupportedRegion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcSupportedRegion();
    }
    /**
     * Gets the displayName property value. The name for the supported region. Read-only.
     * @return a {@link String}
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.backingStore.get("displayName");
    }
    /**
     * The deserialization information for the current model
     * @return a {@link Map<String, java.util.function.Consumer<ParseNode>>}
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("geographicLocationType", (n) -> { this.setGeographicLocationType(n.getEnumValue(CloudPcGeographicLocationType::forValue)); });
        deserializerMap.put("regionGroup", (n) -> { this.setRegionGroup(n.getEnumValue(CloudPcRegionGroup::forValue)); });
        deserializerMap.put("regionRestrictionDetail", (n) -> { this.setRegionRestrictionDetail(n.getObjectValue(CloudPcSupportedRegionRestrictionDetail::createFromDiscriminatorValue)); });
        deserializerMap.put("regionStatus", (n) -> { this.setRegionStatus(n.getEnumValue(CloudPcSupportedRegionStatus::forValue)); });
        deserializerMap.put("supportedSolution", (n) -> { this.setSupportedSolution(n.getEnumSetValue(CloudPcManagementService::forValue)); });
        return deserializerMap;
    }
    /**
     * Gets the geographicLocationType property value. The geographic location where the region is located. Possible values are: default, asia, australasia, canada, europe, india, africa, usCentral, usEast, usWest, southAmerica, middleEast, centralAmerica, usGovernment, unknownFutureValue. Default value is default. Read-only.
     * @return a {@link CloudPcGeographicLocationType}
     */
    @jakarta.annotation.Nullable
    public CloudPcGeographicLocationType getGeographicLocationType() {
        return this.backingStore.get("geographicLocationType");
    }
    /**
     * Gets the regionGroup property value. The regionGroup property
     * @return a {@link CloudPcRegionGroup}
     */
    @jakarta.annotation.Nullable
    public CloudPcRegionGroup getRegionGroup() {
        return this.backingStore.get("regionGroup");
    }
    /**
     * Gets the regionRestrictionDetail property value. When the region isn&apos;t available, all region restrictions are set to true. These restrictions apply to three properties: cPURestricted, gPURestricted, and nestedVirtualizationRestricted. cPURestricted indicates whether the region is available for CPU, gPURestricted indicates whether the region is available for GPU, and nestedVirtualizationRestricted indicates whether the region is available for nested virtualization. Read-only.
     * @return a {@link CloudPcSupportedRegionRestrictionDetail}
     */
    @jakarta.annotation.Nullable
    public CloudPcSupportedRegionRestrictionDetail getRegionRestrictionDetail() {
        return this.backingStore.get("regionRestrictionDetail");
    }
    /**
     * Gets the regionStatus property value. The status of the supported region. Possible values are: available, restricted, unavailable, unknownFutureValue. Read-only.
     * @return a {@link CloudPcSupportedRegionStatus}
     */
    @jakarta.annotation.Nullable
    public CloudPcSupportedRegionStatus getRegionStatus() {
        return this.backingStore.get("regionStatus");
    }
    /**
     * Gets the supportedSolution property value. The supportedSolution property
     * @return a {@link EnumSet<CloudPcManagementService>}
     */
    @jakarta.annotation.Nullable
    public EnumSet<CloudPcManagementService> getSupportedSolution() {
        return this.backingStore.get("supportedSolution");
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("geographicLocationType", this.getGeographicLocationType());
        writer.writeEnumValue("regionGroup", this.getRegionGroup());
        writer.writeObjectValue("regionRestrictionDetail", this.getRegionRestrictionDetail());
        writer.writeEnumValue("regionStatus", this.getRegionStatus());
        writer.writeEnumSetValue("supportedSolution", this.getSupportedSolution());
    }
    /**
     * Sets the displayName property value. The name for the supported region. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.backingStore.set("displayName", value);
    }
    /**
     * Sets the geographicLocationType property value. The geographic location where the region is located. Possible values are: default, asia, australasia, canada, europe, india, africa, usCentral, usEast, usWest, southAmerica, middleEast, centralAmerica, usGovernment, unknownFutureValue. Default value is default. Read-only.
     * @param value Value to set for the geographicLocationType property.
     */
    public void setGeographicLocationType(@jakarta.annotation.Nullable final CloudPcGeographicLocationType value) {
        this.backingStore.set("geographicLocationType", value);
    }
    /**
     * Sets the regionGroup property value. The regionGroup property
     * @param value Value to set for the regionGroup property.
     */
    public void setRegionGroup(@jakarta.annotation.Nullable final CloudPcRegionGroup value) {
        this.backingStore.set("regionGroup", value);
    }
    /**
     * Sets the regionRestrictionDetail property value. When the region isn&apos;t available, all region restrictions are set to true. These restrictions apply to three properties: cPURestricted, gPURestricted, and nestedVirtualizationRestricted. cPURestricted indicates whether the region is available for CPU, gPURestricted indicates whether the region is available for GPU, and nestedVirtualizationRestricted indicates whether the region is available for nested virtualization. Read-only.
     * @param value Value to set for the regionRestrictionDetail property.
     */
    public void setRegionRestrictionDetail(@jakarta.annotation.Nullable final CloudPcSupportedRegionRestrictionDetail value) {
        this.backingStore.set("regionRestrictionDetail", value);
    }
    /**
     * Sets the regionStatus property value. The status of the supported region. Possible values are: available, restricted, unavailable, unknownFutureValue. Read-only.
     * @param value Value to set for the regionStatus property.
     */
    public void setRegionStatus(@jakarta.annotation.Nullable final CloudPcSupportedRegionStatus value) {
        this.backingStore.set("regionStatus", value);
    }
    /**
     * Sets the supportedSolution property value. The supportedSolution property
     * @param value Value to set for the supportedSolution property.
     */
    public void setSupportedSolution(@jakarta.annotation.Nullable final EnumSet<CloudPcManagementService> value) {
        this.backingStore.set("supportedSolution", value);
    }
}

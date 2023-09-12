package com.microsoft.graph.models;

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
     * The name for the supported region. Read-only.
     */
    private String displayName;
    /**
     * The regionGroup property
     */
    private CloudPcRegionGroup regionGroup;
    /**
     * The status of the supported region. Possible values are: available, restricted, unavailable, unknownFutureValue. Read-only.
     */
    private CloudPcSupportedRegionStatus regionStatus;
    /**
     * The supportedSolution property
     */
    private EnumSet<CloudPcManagementService> supportedSolution;
    /**
     * Instantiates a new cloudPcSupportedRegion and sets the default values.
     */
    public CloudPcSupportedRegion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a cloudPcSupportedRegion
     */
    @jakarta.annotation.Nonnull
    public static CloudPcSupportedRegion createFromDiscriminatorValue(@jakarta.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcSupportedRegion();
    }
    /**
     * Gets the displayName property value. The name for the supported region. Read-only.
     * @return a string
     */
    @jakarta.annotation.Nullable
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @jakarta.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("regionGroup", (n) -> { this.setRegionGroup(n.getEnumValue(CloudPcRegionGroup.class)); });
        deserializerMap.put("regionStatus", (n) -> { this.setRegionStatus(n.getEnumValue(CloudPcSupportedRegionStatus.class)); });
        deserializerMap.put("supportedSolution", (n) -> { this.setSupportedSolution(n.getEnumSetValue(CloudPcManagementService.class)); });
        return deserializerMap;
    }
    /**
     * Gets the regionGroup property value. The regionGroup property
     * @return a cloudPcRegionGroup
     */
    @jakarta.annotation.Nullable
    public CloudPcRegionGroup getRegionGroup() {
        return this.regionGroup;
    }
    /**
     * Gets the regionStatus property value. The status of the supported region. Possible values are: available, restricted, unavailable, unknownFutureValue. Read-only.
     * @return a cloudPcSupportedRegionStatus
     */
    @jakarta.annotation.Nullable
    public CloudPcSupportedRegionStatus getRegionStatus() {
        return this.regionStatus;
    }
    /**
     * Gets the supportedSolution property value. The supportedSolution property
     * @return a cloudPcManagementService
     */
    @jakarta.annotation.Nullable
    public EnumSet<CloudPcManagementService> getSupportedSolution() {
        return this.supportedSolution;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     */
    public void serialize(@jakarta.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("regionGroup", this.getRegionGroup());
        writer.writeEnumValue("regionStatus", this.getRegionStatus());
        writer.writeEnumSetValue("supportedSolution", this.getSupportedSolution());
    }
    /**
     * Sets the displayName property value. The name for the supported region. Read-only.
     * @param value Value to set for the displayName property.
     */
    public void setDisplayName(@jakarta.annotation.Nullable final String value) {
        this.displayName = value;
    }
    /**
     * Sets the regionGroup property value. The regionGroup property
     * @param value Value to set for the regionGroup property.
     */
    public void setRegionGroup(@jakarta.annotation.Nullable final CloudPcRegionGroup value) {
        this.regionGroup = value;
    }
    /**
     * Sets the regionStatus property value. The status of the supported region. Possible values are: available, restricted, unavailable, unknownFutureValue. Read-only.
     * @param value Value to set for the regionStatus property.
     */
    public void setRegionStatus(@jakarta.annotation.Nullable final CloudPcSupportedRegionStatus value) {
        this.regionStatus = value;
    }
    /**
     * Sets the supportedSolution property value. The supportedSolution property
     * @param value Value to set for the supportedSolution property.
     */
    public void setSupportedSolution(@jakarta.annotation.Nullable final EnumSet<CloudPcManagementService> value) {
        this.supportedSolution = value;
    }
}

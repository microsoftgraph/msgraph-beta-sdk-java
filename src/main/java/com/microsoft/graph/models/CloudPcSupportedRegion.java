package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class CloudPcSupportedRegion extends Entity implements Parsable {
    /** The name for the supported region. Read-only. */
    private String _displayName;
    /** The regionGroup property */
    private CloudPcRegionGroup _regionGroup;
    /** The status of the supported region. Possible values are: available, restricted, unavailable, unknownFutureValue. Read-only. */
    private CloudPcSupportedRegionStatus _regionStatus;
    /** The supportedSolution property */
    private CloudPcManagementService _supportedSolution;
    /**
     * Instantiates a new CloudPcSupportedRegion and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public CloudPcSupportedRegion() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a CloudPcSupportedRegion
     */
    @javax.annotation.Nonnull
    public static CloudPcSupportedRegion createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new CloudPcSupportedRegion();
    }
    /**
     * Gets the displayName property value. The name for the supported region. Read-only.
     * @return a string
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return this._displayName;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, Consumer<ParseNode>> deserializerMap = new HashMap<String, Consumer<ParseNode>>(super.getFieldDeserializers());
        deserializerMap.put("displayName", (n) -> { this.setDisplayName(n.getStringValue()); });
        deserializerMap.put("regionGroup", (n) -> { this.setRegionGroup(n.getEnumValue(CloudPcRegionGroup.class)); });
        deserializerMap.put("regionStatus", (n) -> { this.setRegionStatus(n.getEnumValue(CloudPcSupportedRegionStatus.class)); });
        deserializerMap.put("supportedSolution", (n) -> { this.setSupportedSolution(n.getEnumValue(CloudPcManagementService.class)); });
        return deserializerMap;
    }
    /**
     * Gets the regionGroup property value. The regionGroup property
     * @return a cloudPcRegionGroup
     */
    @javax.annotation.Nullable
    public CloudPcRegionGroup getRegionGroup() {
        return this._regionGroup;
    }
    /**
     * Gets the regionStatus property value. The status of the supported region. Possible values are: available, restricted, unavailable, unknownFutureValue. Read-only.
     * @return a cloudPcSupportedRegionStatus
     */
    @javax.annotation.Nullable
    public CloudPcSupportedRegionStatus getRegionStatus() {
        return this._regionStatus;
    }
    /**
     * Gets the supportedSolution property value. The supportedSolution property
     * @return a cloudPcManagementService
     */
    @javax.annotation.Nullable
    public CloudPcManagementService getSupportedSolution() {
        return this._supportedSolution;
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
        writer.writeStringValue("displayName", this.getDisplayName());
        writer.writeEnumValue("regionGroup", this.getRegionGroup());
        writer.writeEnumValue("regionStatus", this.getRegionStatus());
        writer.writeEnumValue("supportedSolution", this.getSupportedSolution());
    }
    /**
     * Sets the displayName property value. The name for the supported region. Read-only.
     * @param value Value to set for the displayName property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setDisplayName(@javax.annotation.Nullable final String value) {
        this._displayName = value;
    }
    /**
     * Sets the regionGroup property value. The regionGroup property
     * @param value Value to set for the regionGroup property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegionGroup(@javax.annotation.Nullable final CloudPcRegionGroup value) {
        this._regionGroup = value;
    }
    /**
     * Sets the regionStatus property value. The status of the supported region. Possible values are: available, restricted, unavailable, unknownFutureValue. Read-only.
     * @param value Value to set for the regionStatus property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setRegionStatus(@javax.annotation.Nullable final CloudPcSupportedRegionStatus value) {
        this._regionStatus = value;
    }
    /**
     * Sets the supportedSolution property value. The supportedSolution property
     * @param value Value to set for the supportedSolution property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setSupportedSolution(@javax.annotation.Nullable final CloudPcManagementService value) {
        this._supportedSolution = value;
    }
}

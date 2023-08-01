package com.microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * A ConfigManager policy summary.
 */
public class ConfigManagerPolicySummary implements AdditionalDataHolder, Parsable {
    /**
     * Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     */
    private Map<String, Object> additionalData;
    /**
     * The number of devices evaluated to be compliant by the policy.
     */
    private Integer compliantDeviceCount;
    /**
     * The number of devices that have have been remediated by the policy.
     */
    private Integer enforcedDeviceCount;
    /**
     * The number of devices that failed to be evaluated by the policy.
     */
    private Integer failedDeviceCount;
    /**
     * The number of devices evaluated to be noncompliant by the policy.
     */
    private Integer nonCompliantDeviceCount;
    /**
     * The OdataType property
     */
    private String odataType;
    /**
     * The number of devices that have acknowledged the policy but are pending evaluation.
     */
    private Integer pendingDeviceCount;
    /**
     * The number of devices targeted by the policy.
     */
    private Integer targetedDeviceCount;
    /**
     * Instantiates a new configManagerPolicySummary and sets the default values.
     * @return a void
     */
    @javax.annotation.Nullable
    public ConfigManagerPolicySummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a configManagerPolicySummary
     */
    @javax.annotation.Nonnull
    public static ConfigManagerPolicySummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new ConfigManagerPolicySummary();
    }
    /**
     * Gets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @return a Map<String, Object>
     */
    @javax.annotation.Nonnull
    public Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }
    /**
     * Gets the compliantDeviceCount property value. The number of devices evaluated to be compliant by the policy.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCompliantDeviceCount() {
        return this.compliantDeviceCount;
    }
    /**
     * Gets the enforcedDeviceCount property value. The number of devices that have have been remediated by the policy.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEnforcedDeviceCount() {
        return this.enforcedDeviceCount;
    }
    /**
     * Gets the failedDeviceCount property value. The number of devices that failed to be evaluated by the policy.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedDeviceCount() {
        return this.failedDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, java.util.function.Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, java.util.function.Consumer<ParseNode>> getFieldDeserializers() {
        final HashMap<String, java.util.function.Consumer<ParseNode>> deserializerMap = new HashMap<String, java.util.function.Consumer<ParseNode>>(7);
        deserializerMap.put("compliantDeviceCount", (n) -> { this.setCompliantDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("enforcedDeviceCount", (n) -> { this.setEnforcedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("failedDeviceCount", (n) -> { this.setFailedDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("nonCompliantDeviceCount", (n) -> { this.setNonCompliantDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("@odata.type", (n) -> { this.setOdataType(n.getStringValue()); });
        deserializerMap.put("pendingDeviceCount", (n) -> { this.setPendingDeviceCount(n.getIntegerValue()); });
        deserializerMap.put("targetedDeviceCount", (n) -> { this.setTargetedDeviceCount(n.getIntegerValue()); });
        return deserializerMap;
    }
    /**
     * Gets the nonCompliantDeviceCount property value. The number of devices evaluated to be noncompliant by the policy.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNonCompliantDeviceCount() {
        return this.nonCompliantDeviceCount;
    }
    /**
     * Gets the @odata.type property value. The OdataType property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * Gets the pendingDeviceCount property value. The number of devices that have acknowledged the policy but are pending evaluation.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPendingDeviceCount() {
        return this.pendingDeviceCount;
    }
    /**
     * Gets the targetedDeviceCount property value. The number of devices targeted by the policy.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTargetedDeviceCount() {
        return this.targetedDeviceCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    @javax.annotation.Nonnull
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("compliantDeviceCount", this.getCompliantDeviceCount());
        writer.writeIntegerValue("enforcedDeviceCount", this.getEnforcedDeviceCount());
        writer.writeIntegerValue("failedDeviceCount", this.getFailedDeviceCount());
        writer.writeIntegerValue("nonCompliantDeviceCount", this.getNonCompliantDeviceCount());
        writer.writeStringValue("@odata.type", this.getOdataType());
        writer.writeIntegerValue("pendingDeviceCount", this.getPendingDeviceCount());
        writer.writeIntegerValue("targetedDeviceCount", this.getTargetedDeviceCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the additionalData property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this.additionalData = value;
    }
    /**
     * Sets the compliantDeviceCount property value. The number of devices evaluated to be compliant by the policy.
     * @param value Value to set for the compliantDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setCompliantDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.compliantDeviceCount = value;
    }
    /**
     * Sets the enforcedDeviceCount property value. The number of devices that have have been remediated by the policy.
     * @param value Value to set for the enforcedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setEnforcedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.enforcedDeviceCount = value;
    }
    /**
     * Sets the failedDeviceCount property value. The number of devices that failed to be evaluated by the policy.
     * @param value Value to set for the failedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setFailedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.failedDeviceCount = value;
    }
    /**
     * Sets the nonCompliantDeviceCount property value. The number of devices evaluated to be noncompliant by the policy.
     * @param value Value to set for the nonCompliantDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setNonCompliantDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.nonCompliantDeviceCount = value;
    }
    /**
     * Sets the @odata.type property value. The OdataType property
     * @param value Value to set for the @odata.type property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setOdataType(@javax.annotation.Nullable final String value) {
        this.odataType = value;
    }
    /**
     * Sets the pendingDeviceCount property value. The number of devices that have acknowledged the policy but are pending evaluation.
     * @param value Value to set for the pendingDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setPendingDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.pendingDeviceCount = value;
    }
    /**
     * Sets the targetedDeviceCount property value. The number of devices targeted by the policy.
     * @param value Value to set for the targetedDeviceCount property.
     * @return a void
     */
    @javax.annotation.Nonnull
    public void setTargetedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this.targetedDeviceCount = value;
    }
}

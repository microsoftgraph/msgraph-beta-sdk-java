package microsoft.graph.models;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/** A ConfigManager policy summary. */
public class ConfigManagerPolicySummary implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** The number of devices evaluated to be compliant by the policy. */
    private Integer _compliantDeviceCount;
    /** The number of devices that have have been remediated by the policy. */
    private Integer _enforcedDeviceCount;
    /** The number of devices that failed to be evaluated by the policy. */
    private Integer _failedDeviceCount;
    /** The number of devices evaluated to be noncompliant by the policy. */
    private Integer _nonCompliantDeviceCount;
    /** The number of devices that have acknowledged the policy but are pending evaluation. */
    private Integer _pendingDeviceCount;
    /** The number of devices targeted by the policy. */
    private Integer _targetedDeviceCount;
    /**
     * Instantiates a new ConfigManagerPolicySummary and sets the default values.
     * @return a void
     */
    public ConfigManagerPolicySummary() {
        this.setAdditionalData(new HashMap<>());
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a ConfigManagerPolicySummary
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
        return this._additionalData;
    }
    /**
     * Gets the compliantDeviceCount property value. The number of devices evaluated to be compliant by the policy.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getCompliantDeviceCount() {
        return this._compliantDeviceCount;
    }
    /**
     * Gets the enforcedDeviceCount property value. The number of devices that have have been remediated by the policy.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getEnforcedDeviceCount() {
        return this._enforcedDeviceCount;
    }
    /**
     * Gets the failedDeviceCount property value. The number of devices that failed to be evaluated by the policy.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getFailedDeviceCount() {
        return this._failedDeviceCount;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final ConfigManagerPolicySummary currentObject = this;
        return new HashMap<>(6) {{
            this.put("compliantDeviceCount", (n) -> { currentObject.setCompliantDeviceCount(n.getIntegerValue()); });
            this.put("enforcedDeviceCount", (n) -> { currentObject.setEnforcedDeviceCount(n.getIntegerValue()); });
            this.put("failedDeviceCount", (n) -> { currentObject.setFailedDeviceCount(n.getIntegerValue()); });
            this.put("nonCompliantDeviceCount", (n) -> { currentObject.setNonCompliantDeviceCount(n.getIntegerValue()); });
            this.put("pendingDeviceCount", (n) -> { currentObject.setPendingDeviceCount(n.getIntegerValue()); });
            this.put("targetedDeviceCount", (n) -> { currentObject.setTargetedDeviceCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Gets the nonCompliantDeviceCount property value. The number of devices evaluated to be noncompliant by the policy.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getNonCompliantDeviceCount() {
        return this._nonCompliantDeviceCount;
    }
    /**
     * Gets the pendingDeviceCount property value. The number of devices that have acknowledged the policy but are pending evaluation.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getPendingDeviceCount() {
        return this._pendingDeviceCount;
    }
    /**
     * Gets the targetedDeviceCount property value. The number of devices targeted by the policy.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getTargetedDeviceCount() {
        return this._targetedDeviceCount;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeIntegerValue("compliantDeviceCount", this.getCompliantDeviceCount());
        writer.writeIntegerValue("enforcedDeviceCount", this.getEnforcedDeviceCount());
        writer.writeIntegerValue("failedDeviceCount", this.getFailedDeviceCount());
        writer.writeIntegerValue("nonCompliantDeviceCount", this.getNonCompliantDeviceCount());
        writer.writeIntegerValue("pendingDeviceCount", this.getPendingDeviceCount());
        writer.writeIntegerValue("targetedDeviceCount", this.getTargetedDeviceCount());
        writer.writeAdditionalData(this.getAdditionalData());
    }
    /**
     * Sets the additionalData property value. Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well.
     * @param value Value to set for the AdditionalData property.
     * @return a void
     */
    public void setAdditionalData(@javax.annotation.Nullable final Map<String, Object> value) {
        this._additionalData = value;
    }
    /**
     * Sets the compliantDeviceCount property value. The number of devices evaluated to be compliant by the policy.
     * @param value Value to set for the compliantDeviceCount property.
     * @return a void
     */
    public void setCompliantDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._compliantDeviceCount = value;
    }
    /**
     * Sets the enforcedDeviceCount property value. The number of devices that have have been remediated by the policy.
     * @param value Value to set for the enforcedDeviceCount property.
     * @return a void
     */
    public void setEnforcedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._enforcedDeviceCount = value;
    }
    /**
     * Sets the failedDeviceCount property value. The number of devices that failed to be evaluated by the policy.
     * @param value Value to set for the failedDeviceCount property.
     * @return a void
     */
    public void setFailedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._failedDeviceCount = value;
    }
    /**
     * Sets the nonCompliantDeviceCount property value. The number of devices evaluated to be noncompliant by the policy.
     * @param value Value to set for the nonCompliantDeviceCount property.
     * @return a void
     */
    public void setNonCompliantDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._nonCompliantDeviceCount = value;
    }
    /**
     * Sets the pendingDeviceCount property value. The number of devices that have acknowledged the policy but are pending evaluation.
     * @param value Value to set for the pendingDeviceCount property.
     * @return a void
     */
    public void setPendingDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._pendingDeviceCount = value;
    }
    /**
     * Sets the targetedDeviceCount property value. The number of devices targeted by the policy.
     * @param value Value to set for the targetedDeviceCount property.
     * @return a void
     */
    public void setTargetedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._targetedDeviceCount = value;
    }
}

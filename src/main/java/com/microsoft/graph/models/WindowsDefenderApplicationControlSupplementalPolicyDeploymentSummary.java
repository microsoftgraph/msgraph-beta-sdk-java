package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummary extends Entity implements Parsable {
    /** Number of Devices that have successfully deployed this WindowsDefenderApplicationControl supplemental policy.  */
    private Integer _deployedDeviceCount;
    /** Number of Devices that have failed to deploy this WindowsDefenderApplicationControl supplemental policy.  */
    private Integer _failedDeviceCount;
    /**
     * Instantiates a new windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary and sets the default values.
     * @return a void
     */
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummary() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a windowsDefenderApplicationControlSupplementalPolicyDeploymentSummary
     */
    @javax.annotation.Nonnull
    public static WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummary createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummary();
    }
    /**
     * Gets the deployedDeviceCount property value. Number of Devices that have successfully deployed this WindowsDefenderApplicationControl supplemental policy.
     * @return a integer
     */
    @javax.annotation.Nullable
    public Integer getDeployedDeviceCount() {
        return this._deployedDeviceCount;
    }
    /**
     * Gets the failedDeviceCount property value. Number of Devices that have failed to deploy this WindowsDefenderApplicationControl supplemental policy.
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
        final WindowsDefenderApplicationControlSupplementalPolicyDeploymentSummary currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("deployedDeviceCount", (n) -> { currentObject.setDeployedDeviceCount(n.getIntegerValue()); });
            this.put("failedDeviceCount", (n) -> { currentObject.setFailedDeviceCount(n.getIntegerValue()); });
        }};
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeIntegerValue("deployedDeviceCount", this.getDeployedDeviceCount());
        writer.writeIntegerValue("failedDeviceCount", this.getFailedDeviceCount());
    }
    /**
     * Sets the deployedDeviceCount property value. Number of Devices that have successfully deployed this WindowsDefenderApplicationControl supplemental policy.
     * @param value Value to set for the deployedDeviceCount property.
     * @return a void
     */
    public void setDeployedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._deployedDeviceCount = value;
    }
    /**
     * Sets the failedDeviceCount property value. Number of Devices that have failed to deploy this WindowsDefenderApplicationControl supplemental policy.
     * @param value Value to set for the failedDeviceCount property.
     * @return a void
     */
    public void setFailedDeviceCount(@javax.annotation.Nullable final Integer value) {
        this._failedDeviceCount = value;
    }
}

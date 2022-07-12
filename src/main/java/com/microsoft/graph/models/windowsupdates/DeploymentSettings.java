package microsoft.graph.models.windowsupdates;

import com.microsoft.kiota.serialization.AdditionalDataHolder;
import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class DeploymentSettings implements AdditionalDataHolder, Parsable {
    /** Stores additional data not described in the OpenAPI description found when deserializing. Can be used for serialization as well. */
    private Map<String, Object> _additionalData;
    /** Settings governing conditions to monitor and automated actions to take. */
    private MonitoringSettings _monitoring;
    /** Settings governing how the content is rolled out. */
    private RolloutSettings _rollout;
    /** Settings governing safeguard holds on offering content. */
    private SafeguardSettings _safeguard;
    /** The type property */
    private String _type;
    /**
     * Instantiates a new deploymentSettings and sets the default values.
     * @return a void
     */
    public DeploymentSettings() {
        this.setAdditionalData(new HashMap<>());
        this.setOdatatype("#microsoft.graph.windowsUpdates.deploymentSettings");
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a deploymentSettings
     */
    @javax.annotation.Nonnull
    public static DeploymentSettings createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        final ParseNode mappingValueNode = parseNode.getChildNode("@odata.type");
        if (mappingValueNode != null) {
            final String mappingValue = mappingValueNode.getStringValue();
            switch (mappingValue) {
                case "#microsoft.graph.windowsUpdates.windowsDeploymentSettings": return new WindowsDeploymentSettings();
            }
        }
        return new DeploymentSettings();
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
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final DeploymentSettings currentObject = this;
        return new HashMap<>(4) {{
            this.put("monitoring", (n) -> { currentObject.setMonitoring(n.getObjectValue(MonitoringSettings::createFromDiscriminatorValue)); });
            this.put("rollout", (n) -> { currentObject.setRollout(n.getObjectValue(RolloutSettings::createFromDiscriminatorValue)); });
            this.put("safeguard", (n) -> { currentObject.setSafeguard(n.getObjectValue(SafeguardSettings::createFromDiscriminatorValue)); });
            this.put("@odata.type", (n) -> { currentObject.setOdatatype(n.getStringValue()); });
        }};
    }
    /**
     * Gets the monitoring property value. Settings governing conditions to monitor and automated actions to take.
     * @return a monitoringSettings
     */
    @javax.annotation.Nullable
    public MonitoringSettings getMonitoring() {
        return this._monitoring;
    }
    /**
     * Gets the @odata.type property value. The type property
     * @return a string
     */
    @javax.annotation.Nullable
    public String getOdatatype() {
        return this._type;
    }
    /**
     * Gets the rollout property value. Settings governing how the content is rolled out.
     * @return a rolloutSettings
     */
    @javax.annotation.Nullable
    public RolloutSettings getRollout() {
        return this._rollout;
    }
    /**
     * Gets the safeguard property value. Settings governing safeguard holds on offering content.
     * @return a safeguardSettings
     */
    @javax.annotation.Nullable
    public SafeguardSettings getSafeguard() {
        return this._safeguard;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        writer.writeObjectValue("monitoring", this.getMonitoring());
        writer.writeObjectValue("rollout", this.getRollout());
        writer.writeObjectValue("safeguard", this.getSafeguard());
        writer.writeStringValue("@odata.type", this.getOdatatype());
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
     * Sets the monitoring property value. Settings governing conditions to monitor and automated actions to take.
     * @param value Value to set for the monitoring property.
     * @return a void
     */
    public void setMonitoring(@javax.annotation.Nullable final MonitoringSettings value) {
        this._monitoring = value;
    }
    /**
     * Sets the @odata.type property value. The type property
     * @param value Value to set for the type property.
     * @return a void
     */
    public void setOdatatype(@javax.annotation.Nullable final String value) {
        this._type = value;
    }
    /**
     * Sets the rollout property value. Settings governing how the content is rolled out.
     * @param value Value to set for the rollout property.
     * @return a void
     */
    public void setRollout(@javax.annotation.Nullable final RolloutSettings value) {
        this._rollout = value;
    }
    /**
     * Sets the safeguard property value. Settings governing safeguard holds on offering content.
     * @param value Value to set for the safeguard property.
     * @return a void
     */
    public void setSafeguard(@javax.annotation.Nullable final SafeguardSettings value) {
        this._safeguard = value;
    }
}

package microsoft.graph.models;

import com.microsoft.kiota.serialization.Parsable;
import com.microsoft.kiota.serialization.ParseNode;
import com.microsoft.kiota.serialization.SerializationWriter;
import java.util.function.Consumer;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
public class OnPremisesAgent extends Entity implements Parsable {
    /** List of onPremisesAgentGroups that an onPremisesAgent is assigned to. Read-only. Nullable.  */
    private java.util.List<OnPremisesAgentGroup> _agentGroups;
    /** The external IP address as detected by the service for the agent machine. Read-only  */
    private String _externalIp;
    /** The name of the machine that the aggent is running on. Read-only  */
    private String _machineName;
    /** Possible values are: active, inactive.  */
    private AgentStatus _status;
    /** The supportedPublishingTypes property  */
    private java.util.List<OnPremisesPublishingType> _supportedPublishingTypes;
    /**
     * Instantiates a new onPremisesAgent and sets the default values.
     * @return a void
     */
    public OnPremisesAgent() {
        super();
    }
    /**
     * Creates a new instance of the appropriate class based on discriminator value
     * @param parseNode The parse node to use to read the discriminator value and create the object
     * @return a onPremisesAgent
     */
    @javax.annotation.Nonnull
    public static OnPremisesAgent createFromDiscriminatorValue(@javax.annotation.Nonnull final ParseNode parseNode) {
        Objects.requireNonNull(parseNode);
        return new OnPremisesAgent();
    }
    /**
     * Gets the agentGroups property value. List of onPremisesAgentGroups that an onPremisesAgent is assigned to. Read-only. Nullable.
     * @return a onPremisesAgentGroup
     */
    @javax.annotation.Nullable
    public java.util.List<OnPremisesAgentGroup> getAgentGroups() {
        return this._agentGroups;
    }
    /**
     * Gets the externalIp property value. The external IP address as detected by the service for the agent machine. Read-only
     * @return a string
     */
    @javax.annotation.Nullable
    public String getExternalIp() {
        return this._externalIp;
    }
    /**
     * The deserialization information for the current model
     * @return a Map<String, Consumer<ParseNode>>
     */
    @javax.annotation.Nonnull
    public Map<String, Consumer<ParseNode>> getFieldDeserializers() {
        final OnPremisesAgent currentObject = this;
        return new HashMap<>(super.getFieldDeserializers()) {{
            this.put("agentGroups", (n) -> { currentObject.setAgentGroups(n.getCollectionOfObjectValues(OnPremisesAgentGroup::createFromDiscriminatorValue)); });
            this.put("externalIp", (n) -> { currentObject.setExternalIp(n.getStringValue()); });
            this.put("machineName", (n) -> { currentObject.setMachineName(n.getStringValue()); });
            this.put("status", (n) -> { currentObject.setStatus(n.getEnumValue(AgentStatus.class)); });
            this.put("supportedPublishingTypes", (n) -> { currentObject.setSupportedPublishingTypes(n.getCollectionOfEnumValues(OnPremisesPublishingType.class)); });
        }};
    }
    /**
     * Gets the machineName property value. The name of the machine that the aggent is running on. Read-only
     * @return a string
     */
    @javax.annotation.Nullable
    public String getMachineName() {
        return this._machineName;
    }
    /**
     * Gets the status property value. Possible values are: active, inactive.
     * @return a agentStatus
     */
    @javax.annotation.Nullable
    public AgentStatus getStatus() {
        return this._status;
    }
    /**
     * Gets the supportedPublishingTypes property value. The supportedPublishingTypes property
     * @return a onPremisesPublishingType
     */
    @javax.annotation.Nullable
    public java.util.List<OnPremisesPublishingType> getSupportedPublishingTypes() {
        return this._supportedPublishingTypes;
    }
    /**
     * Serializes information the current object
     * @param writer Serialization writer to use to serialize this model
     * @return a void
     */
    public void serialize(@javax.annotation.Nonnull final SerializationWriter writer) {
        Objects.requireNonNull(writer);
        super.serialize(writer);
        writer.writeCollectionOfObjectValues("agentGroups", this.getAgentGroups());
        writer.writeStringValue("externalIp", this.getExternalIp());
        writer.writeStringValue("machineName", this.getMachineName());
        writer.writeEnumValue("status", this.getStatus());
        writer.writeCollectionOfEnumValues("supportedPublishingTypes", this.getSupportedPublishingTypes());
    }
    /**
     * Sets the agentGroups property value. List of onPremisesAgentGroups that an onPremisesAgent is assigned to. Read-only. Nullable.
     * @param value Value to set for the agentGroups property.
     * @return a void
     */
    public void setAgentGroups(@javax.annotation.Nullable final java.util.List<OnPremisesAgentGroup> value) {
        this._agentGroups = value;
    }
    /**
     * Sets the externalIp property value. The external IP address as detected by the service for the agent machine. Read-only
     * @param value Value to set for the externalIp property.
     * @return a void
     */
    public void setExternalIp(@javax.annotation.Nullable final String value) {
        this._externalIp = value;
    }
    /**
     * Sets the machineName property value. The name of the machine that the aggent is running on. Read-only
     * @param value Value to set for the machineName property.
     * @return a void
     */
    public void setMachineName(@javax.annotation.Nullable final String value) {
        this._machineName = value;
    }
    /**
     * Sets the status property value. Possible values are: active, inactive.
     * @param value Value to set for the status property.
     * @return a void
     */
    public void setStatus(@javax.annotation.Nullable final AgentStatus value) {
        this._status = value;
    }
    /**
     * Sets the supportedPublishingTypes property value. The supportedPublishingTypes property
     * @param value Value to set for the supportedPublishingTypes property.
     * @return a void
     */
    public void setSupportedPublishingTypes(@javax.annotation.Nullable final java.util.List<OnPremisesPublishingType> value) {
        this._supportedPublishingTypes = value;
    }
}
